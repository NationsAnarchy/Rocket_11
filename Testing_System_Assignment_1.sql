-- Tạo mới một CSDL

DROP DATABASE IF EXISTS TestSystem1;
CREATE DATABASE IF NOT EXISTS TestSystem1;
USE TestSystem1;

-- Question 1 + 2, tạo bảng và thêm các ràng buộc

DROP TABLE IF EXISTS Department;
CREATE TABLE Department (
    DepartmentID INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    DepartmentName VARCHAR(30) UNIQUE NOT NULL
);

DROP TABLE IF EXISTS `Position`;
CREATE TABLE `Position` (
    PositionID INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    PositionName ENUM('Dev', 'Test', 'Scrum Master', 'PM') UNIQUE NOT NULL
);

DROP TABLE IF EXISTS `Account`;
CREATE TABLE `Account` (
    AccountID INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Email VARCHAR(75) UNIQUE NOT NULL,
    Username VARCHAR(75) UNIQUE NOT NULL,
    FullName NVARCHAR(75),
    DepartmentID INT UNSIGNED UNIQUE,
    PositionID INT UNSIGNED UNIQUE,
    CreateDate DATE,
    FOREIGN KEY (DepartmentID)
        REFERENCES Department (DepartmentID),
    FOREIGN KEY (PositionID)
        REFERENCES `Position` (PositionID)
);

DROP TABLE IF EXISTS `Group`;
CREATE TABLE `Group` (
    GroupID INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    GroupName VARCHAR(50),
    CreatorID INT UNSIGNED UNIQUE REFERENCES `Account`(AccountID),
    CreateDate DATE
);

DROP TABLE IF EXISTS GroupAccount;
CREATE TABLE GroupAccount (
    GroupID INT UNSIGNED,
    AccountID INT UNSIGNED UNIQUE,
    JoinDate DATE,
    FOREIGN KEY (GroupID)
        REFERENCES `Group` (GroupID),
    FOREIGN KEY (AccountID)
        REFERENCES `Account` (AccountID)
);

DROP TABLE IF EXISTS TypeQuestion;
CREATE TABLE TypeQuestion (
    TypeID INT AUTO_INCREMENT PRIMARY KEY,
    TypeName ENUM('Essay', 'Multiple-Choice')
);

DROP TABLE IF EXISTS CategoryQuestion;
CREATE TABLE CategoryQuestion (
    CategoryID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    CategoryName VARCHAR(15)
);

DROP TABLE IF EXISTS Question;
CREATE TABLE Question (
    QuestionID INT AUTO_INCREMENT PRIMARY KEY,
    Content VARCHAR(255),
    CategoryID INT,
    TypeID INT,
    CreatorID INT,
    CreateDate DATE,
    FOREIGN KEY (CategoryID)
        REFERENCES CategoryQuestion (CategoryID),
    FOREIGN KEY (TypeID)
        REFERENCES TypeQuestion (TypeID) 
);

DROP TABLE IF EXISTS Answer;
CREATE TABLE Answer (
    AnswerID INT AUTO_INCREMENT PRIMARY KEY,
    Content VARCHAR(255),
    QuestionID INT,
    isCorrect BOOLEAN,
    FOREIGN KEY (QuestionID)
        REFERENCES Question (QuestionID)
);

DROP TABLE IF EXISTS Exam;
CREATE TABLE Exam (
    ExamID INT AUTO_INCREMENT PRIMARY KEY,
    `Code` VARCHAR(15),
    Title VARCHAR(50),
    CategoryID INT,
    Duration ENUM ('60', '90', '120', '180'),
    CreatorID INT,
    CreateDate DATE,
    FOREIGN KEY (CategoryID)
        REFERENCES CategoryQuestion (CategoryID)	
);

DROP TABLE IF EXISTS ExamQuestion;
CREATE TABLE ExamQuestion (
    ExamID INT PRIMARY KEY,
    QuestionID INT,
    FOREIGN KEY (ExamID)
        REFERENCES Exam (ExamID),
    FOREIGN KEY (QuestionID)
        REFERENCES Question (QuestionID)
);

-- Q3: Chuẩn bị dữ liệu cho bài tiếp theo

INSERT INTO Department (DepartmentName) VALUES  ('Sales'),
												('Marketing'),
												('Human Resources'),
												('Design'),
												('Finance');

INSERT INTO Position (PositionName) VALUES ('Dev');
INSERT INTO Position (PositionName) VALUES ('Test');
INSERT INTO Position (PositionName) VALUES ('Scrum Master');
INSERT INTO Position (PositionName) VALUES ('PM');

INSERT INTO `Account` (Email, Username, FullName, DepartmentID, PositionID, CreateDate) 
	VALUES ('phucnguyen@gmail.com', 'phuc.nguyenthe', N'Nguyễn Thế Phúc', 1, 1, '2021-02-15');
INSERT INTO `Account` (Email, Username, FullName, DepartmentID, PositionID, CreateDate) 
	VALUES ('georgerussell@gmail.com', 'russell.george', N'George Russell', 2, 2, '2020-09-25');
INSERT INTO `Account` (Email, Username, FullName, DepartmentID, PositionID, CreateDate) 
	VALUES ('alexalbon@gmail.com', 'albon.alex', N'Alexander Albon', 3, 3, '2021-01-28');
INSERT INTO `Account` (Email, Username, FullName, DepartmentID, PositionID, CreateDate) 
	VALUES ('landonorris@gmail.com', 'norris.lando', N'Lando Norris', 4, 4, '2020-12-30');
INSERT INTO `Account` (Email, Username, FullName, DepartmentID, PositionID, CreateDate) 
	VALUES ('charlesleclerc@gmail.com', 'leclerc.charles', N'Charles Leclerc', 5, 1, '2020-09-13');
INSERT INTO `Account` (Email, Username, FullName, DepartmentID, PositionID, CreateDate) 
	VALUES ('sebastianvettel@gmail.com', 'vettel.sebastian', N'Sebastian Vettel', 5, 2, '2021-01-01');
INSERT INTO `Account` (Email, Username, FullName, DepartmentID, PositionID, CreateDate) 
	VALUES ('lewishamilton@gmail.com', 'hamilton.lewis', N'Lewis Hamilton', 2, 1, '2020-08-17');
INSERT INTO `Account` (Email, Username, FullName, DepartmentID, PositionID, CreateDate) 
	VALUES ('valterribottas@gmail.com', 'bottas.valterri', N'Valterri Bottas', 3, 3, '2021-01-20');
INSERT INTO `Account` (Email, Username, FullName, DepartmentID, PositionID, CreateDate) 
	VALUES ('maxverstappen@gmail.com', 'verstappen.max', N'Max Verstappen', 4, 1, '2021-01-02');
INSERT INTO `Account` (Email, Username, FullName, DepartmentID, PositionID, CreateDate) 
	VALUES ('lancestroll@gmail.com', 'stroll.lance', N'Lance Stroll', 4, 2, '2020-11-22');
INSERT INTO `Account` (Email, Username, FullName, DepartmentID, PositionID, CreateDate) 
	VALUES ('danielricciardo@gmail.com', 'ricciardo.daniel', N'Daniel Ricciardo', 1, 1, '2020-10-26');
INSERT INTO `Account` (Email, Username, FullName, DepartmentID, PositionID, CreateDate) 
	VALUES ('sergioperez@gmail.com', 'sergio.perez', N'Sergio Perez', 3, 2, '2020-06-05');
INSERT INTO `Account` (Email, Username, FullName, DepartmentID, PositionID, CreateDate) 
	VALUES ('estebanocon@gmail.com', 'ocon.esteban', N'Esteban Ocon', 2, 2, '2020-08-08');
INSERT INTO `Account` (Email, Username, FullName, DepartmentID, PositionID, CreateDate) 
	VALUES ('pierregasly@gmail.com', 'gasly.pierre', N'Pierre Gasly', 5, 2, '2020-04-13');
    
INSERT INTO `Group` (GroupName, CreatorID, CreateDate) VALUES ('First Group', 3, '2020-10-01');
INSERT INTO `Group` (GroupName, CreatorID, CreateDate) VALUES ('Second Group', 4, '2021-01-28');
INSERT INTO `Group` (GroupName, CreatorID, CreateDate) VALUES ('Third Group',2, '2021-02-03');
INSERT INTO `Group` (GroupName, CreatorID, CreateDate) VALUES ('Fourth Group', 1, '2020-09-10');
INSERT INTO `Group` (GroupName, CreatorID, CreateDate) VALUES ('Fifth Group', 5, '2020-12-12');

INSERT INTO GroupAccount VALUES(1, 3, '2021-02-06');
INSERT INTO GroupAccount VALUES(1, 4, '2021-02-06');
INSERT INTO GroupAccount VALUES(2, 5, '2021-02-06');
INSERT INTO GroupAccount VALUES(2, 5, '2021-02-06');
INSERT INTO GroupAccount VALUES(3, 2, '2021-02-06');
INSERT INTO GroupAccount VALUES(4, 5, '2021-02-06');
INSERT INTO GroupAccount VALUES(5, 6, '2021-02-06');
INSERT INTO GroupAccount VALUES(5, 1, '2021-02-06');
INSERT INTO GroupAccount VALUES(1, 6, '2021-02-06');
INSERT INTO GroupAccount VALUES(6, 4, '2021-02-06');

INSERT INTO TypeQuestion (TypeName) VALUES ('Essay');
INSERT INTO TypeQuestion (TypeName) VALUES ('Multiple-Choice');

INSERT INTO CategoryQuestion (CategoryName) VALUES ('SQL');
INSERT INTO CategoryQuestion (CategoryName) VALUES ('Java');
INSERT INTO CategoryQuestion (CategoryName) VALUES ('Csharp');
INSERT INTO CategoryQuestion (CategoryName) VALUES ('Python');
INSERT INTO CategoryQuestion (CategoryName) VALUES ('Front-end');
INSERT INTO CategoryQuestion (CategoryName) VALUES ('ReactJS');

INSERT INTO Question (Content, CategoryID, TypeID, CreatorID, CreateDate)
	VALUES (N'Sự khác nhau giữa câu lệnh Delete và Truncate trong Database là gì?', 1, 1, 4, '2021-01-01');
INSERT INTO Question (Content, CategoryID, TypeID, CreatorID, CreateDate)
	VALUES (N'Một bảng có thể có nhiều hơn một khóa ngoại không?', 1, 2, 4, '2021-01-01');
INSERT INTO Question (Content, CategoryID, TypeID, CreatorID, CreateDate)
	VALUES (N'Subquery là gì?', 1, 1, 4, '2021-01-01');
INSERT INTO Question (Content, CategoryID, TypeID, CreatorID, CreateDate)
	VALUES (N'Có phải tất cả các thẻ HTML đều có thẻ đóng?', 5, 2, 3, '2021-01-01');
INSERT INTO Question (Content, CategoryID, TypeID, CreatorID, CreateDate)
	VALUES (N'HTML là gì?', 5, 1, 4, '2021-01-01');
    
INSERT INTO Answer (Content, QuestionID, isCorrect)
	VALUES (N'Có', 2, TRUE);
INSERT INTO Answer (Content, QuestionID, isCorrect)
	VALUES (N'Không', 2, FALSE);
INSERT INTO Answer (Content, QuestionID, isCorrect)
	VALUES (N'Có', 4, FALSE);
INSERT INTO Answer (Content, QuestionID, isCorrect)
	VALUES (N'Không', 4, TRUE);
INSERT INTO Answer (Content, QuestionID, isCorrect)
	VALUES (N'Câu đúng', 1, TRUE);
INSERT INTO Answer (Content, QuestionID, isCorrect)
	VALUES (N'Câu đúng', 3, TRUE);
INSERT INTO Answer (Content, QuestionID, isCorrect)
	VALUES (N'Câu đúng', 5, TRUE);

INSERT INTO Exam (`Code`, Title, CategoryID, Duration, CreatorID, CreateDate) VALUES ('EXAM0001', 'Exam 1', 1, 60, 3, '2021-01-22');
INSERT INTO Exam (`Code`, Title, CategoryID, Duration, CreatorID, CreateDate) VALUES ('EXAM0002', 'Exam 2', 5, 60, 3, '2021-01-22');
INSERT INTO Exam (`Code`, Title, CategoryID, Duration, CreatorID, CreateDate) VALUES ('EXAM0003', 'Exam 3', 1, 60, 3, '2021-01-22');
INSERT INTO Exam (`Code`, Title, CategoryID, Duration, CreatorID, CreateDate) VALUES ('EXAM0004', 'Exam 4', 5, 60, 3, '2021-01-22');
INSERT INTO Exam (`Code`, Title, CategoryID, Duration, CreatorID, CreateDate) VALUES ('EXAM0005', 'Exam 5', 1, 60, 3, '2021-01-22');

INSERT INTO ExamQuestion VALUES (1,3);
INSERT INTO ExamQuestion VALUES (2,4);
INSERT INTO ExamQuestion VALUES (3,5);
INSERT INTO ExamQuestion VALUES (4,2);
INSERT INTO ExamQuestion VALUES (5,4);
