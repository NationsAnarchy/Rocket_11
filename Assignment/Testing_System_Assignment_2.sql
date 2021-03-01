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

SELECT 
    AccountID,
    Email,
    Username,
    FullName,
    DepartmentID,
    PositionID
FROM
    Account
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
    QuestionID
FROM
    Answer
WHERE
    COUNT(AnswerID) >= 4;

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
    `Account`.AccountID,
    `Account`.Email,
    `Account`.Username,
    `Account`.FullName
FROM
    Account
        INNER JOIN
    Position ON `Account`.PositionID = Position.PositionID
GROUP BY `Account`.FullName
HAVING Position.PositionName = 'Dev';

-- Q12: Viết lệnh để lấy ra danh sách các phòng ban có nhiều hơn 3 nhân viên

SELECT 
    Department.DepartmentName,
    COUNT(`Account`.AccountID) AS NumberOfStaff
FROM
    `Account`
        INNER JOIN
    Department ON `Account`.DepartmentID = Department.DepartmentID
GROUP BY `Account`.AccountID
HAVING
    COUNT(`Account`.AccountID) > 3;

-- Q13: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất

SELECT 
    Question.QuestionID, Question.Content, Question.CategoryID
FROM
    Question
        INNER JOIN
    ExamQuestion ON Question.QuestionID = ExamQuestion.QuestionID
ORDER BY MAX(COUNT(Question.QuestionID));

-- Q14: 

SELECT DISTINCT
    (CategoryID), COUNT(QuestionID) AS QuestionCount
FROM
    Question;

-- Q15: 

SELECT 
    Question.QuestionID, Question.Content
FROM
    Question
        INNER JOIN
    Answer ON Question.QuestionID = Answer.QuestionID
ORDER BY MAX(COUNT(Answer.AnswerID));

-- Q16: 

SELECT 
    `Position`.PositionName, COUNT(`Account`.AccountID) AS NumberOfStaff
FROM
    Position
        INNER JOIN
    Account ON `Position`.PositionID = `Account`.PositionID
ORDER BY MIN(COUNT(`Account`.AccountID));