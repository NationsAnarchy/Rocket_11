USE TestSystem2;

-- Q1: Chèn 10 bản ghi vào trong bảng Trainee đã tạo từ Assignment 1

INSERT INTO Trainee (Full_Name, Birth_Date, Gender, ET_IQ, ET_Gmath, ET_English, Training_Class) 
			VALUES();

INSERT INTO Trainee (Full_Name, Birth_Date, Gender, ET_IQ, ET_Gmath, ET_English, Training_Class) 
			VALUES();

INSERT INTO Trainee (Full_Name, Birth_Date, Gender, ET_IQ, ET_Gmath, ET_English, Training_Class) 
			VALUES();

INSERT INTO Trainee (Full_Name, Birth_Date, Gender, ET_IQ, ET_Gmath, ET_English, Training_Class) 
			VALUES();

INSERT INTO Trainee (Full_Name, Birth_Date, Gender, ET_IQ, ET_Gmath, ET_English, Training_Class) 
			VALUES();

INSERT INTO Trainee (Full_Name, Birth_Date, Gender, ET_IQ, ET_Gmath, ET_English, Training_Class) 
			VALUES();

INSERT INTO Trainee (Full_Name, Birth_Date, Gender, ET_IQ, ET_Gmath, ET_English, Training_Class) 
			VALUES();

INSERT INTO Trainee (Full_Name, Birth_Date, Gender, ET_IQ, ET_Gmath, ET_English, Training_Class) 
			VALUES();

INSERT INTO Trainee (Full_Name, Birth_Date, Gender, ET_IQ, ET_Gmath, ET_English, Training_Class) 
			VALUES();

INSERT INTO Trainee (Full_Name, Birth_Date, Gender, ET_IQ, ET_Gmath, ET_English, Training_Class) 
			VALUES();
            
-- Q4: Lựa chọn những người đã vượt qua bài Entry Test

SELECT 
    Full_Name, Birth_Date, Training_Class
FROM
    Trainee
WHERE
    (ET_IQ + ET_Gmath >= 20 AND ET_IQ >= 8
        AND ET_Gmath >= 8
        AND ET_English >= 18);
    
-- Q5: Xoá đi Trainee có TraineeID = 3

DELETE FROM Trainee 
WHERE
    TraineeID = 3; 

-- Q6: Cập nhật lớp học của Trainee có TraineeID = 5 lên 2 lớp 

UPDATE Trainee 
SET 
    Training_Class = ''
WHERE
    TraineeID = 5;

-- Q2: Lựa chọn những người đã vượt qua Entry Test và sắp xếp theo tháng sinh của họ

SELECT 
    Full_Name, Training_Class, MONTH(Birth_Date) AS Birth_Month
FROM
    Trainee
WHERE
    (ET_IQ + ET_Gmath >= 20 AND ET_IQ >= 8
        AND ET_Gmath >= 8
        AND ET_English >= 18)
ORDER BY MONTH(Birth_Date) ASC;
    
-- Q3: Lựa chọn Trainee có tên dài nhất, hiển thị tuổi cùng thông tin cơ bản của người đó

SELECT 
    Full_Name,
    Birth_Date,
    TIMESTAMPDIFF(YEAR,
        CURRENT_DATE(),
        Birth_Date) AS Age,
    Gender,
    Training_Class
FROM
    Trainee
ORDER BY CHAR_LENGTH(Full_Name) DESC
LIMIT 1;