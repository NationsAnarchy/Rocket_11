USE TestSystem1;

-- Q1: Lấy ra tất cả các phòng ban

SELECT 
    DepartmentName, DepartmentID
FROM
    Department;

-- Q2:

SELECT 
    DepartmentID
FROM
    Department
WHERE
    DepartmentName = 'Sales';

-- Q3: 

-- Thống kê mỗi tên có độ dài là bao nhiêu kí tự
-- Lấy max của tên 
-- In ra kết quả 

SELECT 
    FullName, CHAR_LENGTH(FullName) AS NameLength
FROM
    `Account`
WHERE
    CHAR_LENGTH(FullName) = (SELECT 
            MAX(CHAR_LENGTH(FullName))
        FROM
            `Account`)
ORDER BY CHAR_LENGTH(FullName) DESC
LIMIT 1;

-- Q4: Lấy ra tên group đã tham gia trước ngày 20/12/2019

SELECT
    GroupName
FROM
    `Group`
WHERE
    CreateDate <= '2019-12-20';

-- Q5: Lấy ra ID của question có nhiều hơn hoặc bằng 4 câu trả lời

SELECT 
    QuestionID, COUNT(QuestionID) AS NumberOfAnswer
FROM
    Answer
GROUP BY QuestionID
HAVING COUNT(QuestionID) >= 2;

-- Q6: Lấy ra 5 group được tạo gần đây nhất

SELECT 
    GroupID, GroupName
FROM
    `Group`
GROUP BY GroupName
ORDER BY CreateDate DESC
LIMIT 5;

-- Q8: 

DELETE FROM Exam 
WHERE
    CreateDate <= '2019-12-20';

-- Dùng subquery

DELETE FROM ExamQuestion 
WHERE
    ExamID IN (SELECT 
        ExamID
    FROM
        Exam    
    WHERE
        CreateDate <= '2019-12-20');

-- Q9: 

UPDATE `Account` 
SET 
    FullName = 'Nguyễn Bá Lộc',
    Email = 'loc.nguyenba@vti.com.vn'
WHERE
    AccountID = 5;
    
-- Q10: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của ho

SELECT 
    Department.DepartmentName,
    `Account`.AccountID,
    `Account`.Email,
    `Account`.Username,
    `Account`.FullName
FROM
    Account
        INNER JOIN
    Department ON `Account`.DepartmentID = Department.DepartmentID;

-- Q11: Viết lệnh để lấy ra tất cả các Developer

SELECT 
    Position.PositionName,
    `Account`.FullName
FROM
    Account
        INNER JOIN
    Position ON `Account`.PositionID = Position.PositionID
WHERE Position.PositionName = 'Dev';

-- Q12: Viết lệnh để lấy ra danh sách các phòng ban có nhiều hơn 3 nhân viên

SELECT
    Department.DepartmentName,
    Account.AccountID
FROM
    Department
        INNER JOIN
    `Account` ON `Account`.DepartmentID = Department.DepartmentID;

-- Q13: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất

SELECT 
    Question.QuestionID, Question.Content, Question.CategoryID
FROM
    Question
        INNER JOIN
    ExamQuestion ON Question.QuestionID = ExamQuestion.QuestionID
GROUP BY Question.QuestionID
HAVING COUNT(Question.QuestionID)
ORDER BY Question.QuestionID;

-- Q14: 

SELECT DISTINCT
    (CategoryID), COUNT(QuestionID) AS QuestionCount
FROM
    Question;

-- Q15: 

SELECT 
    COUNT(AnswerID) AS NoOfAnswers, QuestionID
FROM
    Answer
GROUP BY QuestionID
HAVING COUNT(AnswerID) = (SELECT 
        MAX(NoOfAnswers)
    FROM
        (SELECT 
            COUNT(AnswerID) AS NoOfAnswers, QuestionID
        FROM
            Answer
        GROUP BY QuestionID) AS AnotherResult);

-- Q16: 

SELECT 
    `Position`.PositionName,
    COUNT(`Account`.AccountID) AS NumberOfStaff
FROM
    Position
        INNER JOIN
    Account ON `Position`.PositionID = `Account`.PositionID
GROUP BY Account.AccountID
HAVING COUNT(Account.AccountID)
ORDER BY COUNT(`Account`.AccountID) ASC;

-- Q17:



-- Q19:

SELECT 
    TypeName, COUNT(QuestionID) AS CountQuestion
FROM
    Question q
        JOIN
    TypeQuestion t ON q.TypeID = t.TypeID
GROUP BY q.TypeID;