USE TestSystem1;

-- Q1:

SELECT * FROM Account;

CREATE VIEW DSNhanVienPhongSale AS
    SELECT 
        `Account`.Email, `Account`.Username, `Account`.FullName
    FROM
        `Account`
            INNER JOIN
        Department ON `Account`.DepartmentID = Department.DepartmentID
    WHERE DepartmentName = 'Sales';
    
-- Q2: 

CREATE VIEW AccountThamGiaNhieuGroupNhat AS
    SELECT 
        `Account`.Username, `Account`.FullName
    FROM
        `Account`
            INNER JOIN
        GroupAccount ON `Account`.AccountID = GroupAccount.AccountID
    ORDER BY (GroupAccount.GroupID);
    
-- Q3: 

CREATE VIEW CauHoiQuaDai AS
    SELECT 
        QuestionID
    FROM
        Question
    GROUP BY Content
    HAVING
        CHAR_LENGTH(Content) > 300;
        
DROP VIEW CauHoiQuaDai;

-- Q4: 

CREATE VIEW DSPhongBanNhieuNhanVienNhat AS
    SELECT 
        Department.DepartmentName,
        COUNT(`Account`.AccountID) AS NumberOfStaff
    FROM
        `Account`
            INNER JOIN
        Department ON `Account`.DepartmentID = Department.DepartmentID
    ORDER BY MAX(COUNT(`Account`.AccountID));

-- Q5: 