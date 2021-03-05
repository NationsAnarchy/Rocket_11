USE TestSystem1;

-- Q1:

SELECT * FROM Account;

DROP VIEW IF EXISTS dsnhanvienphongsale;
CREATE VIEW DSNhanVienPhongSale AS
    SELECT 
        `Account`.Email,
        `Account`.Username,
        `Account`.FullName,
        Department.DepartmentName
    FROM
        `Account`
            JOIN
        Department ON `Account`.DepartmentID = Department.DepartmentID
    WHERE
        DepartmentName = 'Sales';
    
-- Q2: 

-- B1: Thống kê ra mỗi account tham gia vào bao nhiêu group
-- B2: Lấy max số lượng group
-- B3: In ra kết quả, lấy ra thông tin

DROP VIEW IF EXISTS AccountThamGiaNhieuGroupNhat;
CREATE VIEW AccountThamGiaNhieuGroupNhat AS
    SELECT 
        AccountID, COUNT(GroupID) AS NoOfGroups
    FROM
        GroupAccount
    GROUP BY AccountID
    HAVING NoOfGroups = (SELECT 
            COUNT(groupID) AS NoOfGroups
        FROM
            GroupAccount
        GROUP BY AccountID
        ORDER BY NoOfGroups DESC
        LIMIT 1);

-- Dùng CTE: 

WITH AccountNhieuGroup AS (SELECT 
        AccountID, COUNT(GroupID) AS NoOfGroups
    FROM
        GroupAccount
    GROUP BY AccountID)
SELECT 
    *
FROM
    AccountNhieuGroup
WHERE
    NoOfGroups = (SELECT 
            MAX(NoOfGroups)
        FROM
            AccountNhieuGroup);

-- Q3: 

CREATE OR REPLACE VIEW CauHoiQuaDai AS
    SELECT 
        QuestionID, Content
    FROM
        Question
    WHERE char_length(Content) > 300;
        
DROP VIEW CauHoiQuaDai;

-- Q4: 

CREATE OR REPLACE VIEW DSPhongBanNhieuNhanVienNhat AS
    SELECT 
        department.DepartmentName,
        account.AccountID
    FROM
        `Account`
            INNER JOIN
        Department ON `Account`.DepartmentID = Department.DepartmentID
    ORDER BY (department.departmentname);

-- Q5: 