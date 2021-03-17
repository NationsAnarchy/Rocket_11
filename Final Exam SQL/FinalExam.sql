-- Tạo một database mới

DROP DATABASE IF EXISTS ThucTap;
CREATE DATABASE IF NOT EXISTS ThucTap;
USE ThucTap;

-- Q1: Tạo table với các ràng buộc và kiểu dữ liệu phù hợp 

DROP TABLE IF EXISTS Country;
CREATE TABLE Country (
    country_id TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    country_name VARCHAR(20) NOT NULL
);

DROP TABLE IF EXISTS Location;
CREATE TABLE Location (
    location_id TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    street_address VARCHAR(100) NOT NULL,
    postal_code CHAR(6) NOT NULL,
    country_id TINYINT UNSIGNED,
    FOREIGN KEY (country_id)
        REFERENCES country (country_id)
);

DROP TABLE IF EXISTS Employee;
CREATE TABLE Employee (
    employee_id TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    full_name VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    location_id TINYINT UNSIGNED,
    FOREIGN KEY (location_id)
        REFERENCES location (location_id)
);

-- Q1: Chèn ít nhất 3 bản ghi vào từng table đã tạo

INSERT INTO Country (country_name) VALUES 	('Viet Nam'),
											('America'), 
											('England');

INSERT INTO Location (street_address, postal_code, country_id) 
			VALUES	('Ha Noi','100000', 1),
					('Da Nang', '110000', 1),
                    ('Portland', '200000', 2),
                    ('Boston', '220000', 2),
                    ('London', '300000', 3),
                    ('Manchester', '330000', 3);
                    
INSERT INTO Employee (full_name, email, location_id)
			VALUES 	('Nguyen The Phuc', 'nn03@gmail.com', 1),
					('Nguyen Van An', 'nn02@gmail.com', 2),
					('Do Lan Huong', 'nn01@gmail.com', 2),
					('Tran Thu Huyen', 'nn04@gmail.com', 1),
					('Charles Leclerc', 'aa03@gmail.com', 3),
					('Max Verstappen', 'aa02@gmail.com', 4),
					('Lando Norris', 'aa01@gmail.com', 3),
					('George Russell', 'bb03@gmail.com', 5),
					('Pierre Gasly', 'bb02@gmail.com', 6),
					('Carlos Sainz', 'bb01@gmail.com', 6);
                
-- Q2a: Lấy tất cả các nhân viên thuộc Việt Nam:

SELECT 
    full_name, email
FROM
    Employee
WHERE
    location_id IN (SELECT 
            Location.location_id
        FROM
            location
                JOIN
            country ON location.country_id = country.country_id
        WHERE
            country.country_name = 'Viet Nam');

-- Q2b: Lấy ra tên quốc gia của employee có email là nn03@gmail.com

SELECT
    country_name
FROM
    Country
WHERE
    country_id = (SELECT 
            country_id
        FROM
            Location l
                JOIN
            Employee e ON l.location_id = e.location_id
        WHERE
            e.email = 'nn03@gmail.com');

-- Q2c: Thống kê mỗi country, mỗi location có bao nhiêu employee đang làm việc

SELECT 
    COUNT(e.employee_id) AS location_count, l.street_address, c.country_name
FROM
    Employee e
        JOIN
    Location l ON e.location_id = l.location_id
		JOIN
	Country c ON c.country_id = l.country_id
GROUP BY e.location_id;

SELECT 
    COUNT(l.country_id) AS country_count, c.country_name
FROM
    Location l
        JOIN
    Employee e ON l.location_id = e.location_id
        JOIN
    Country c ON c.country_id = l.country_id
GROUP BY l.country_id;

-- Q3: Tạo trigger

DROP TRIGGER IF EXISTS InsertLimit;
DELIMITER $$
CREATE 
    TRIGGER  InsertLimit
 BEFORE INSERT ON Employee FOR EACH ROW 
    BEGIN
		DECLARE in_country_id TINYINT;
        DECLARE employee_amount TINYINT;
        
SELECT 
    country_id
INTO in_country_id FROM
    Location
WHERE
    location_id = NEW.location_id;
        
        WITH LocationCTE AS (
			SELECT 
    *
FROM
    Location
WHERE
    country_id = in_country_id
        )
        
SELECT 
    COUNT(1) INTO employee_amount
FROM
    Employee
WHERE
    location_id IN (SELECT 
            location_id
        FROM
            LocationCTE);
	IF employee_amount >= 10 THEN
		SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT = 'Can not insert more than 10 employees for each country';
    END IF;
    END$$
DELIMITER ;

-- Q4: Cấu hình bảng