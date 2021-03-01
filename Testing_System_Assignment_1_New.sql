-- Tạo cơ sở dữ liệu mới và sử dụng

DROP DATABASE IF EXISTS TestSystem;
CREATE DATABASE IF NOT EXISTS TestSystem;
USE TestSystem;

-- Tạo bảng Department

DROP TABLE IF EXISTS Department;
CREATE TABLE Department (
    DepartmentID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    DepartmentName VARCHAR(50)
);

-- Tạo bảng Position

DROP TABLE IF EXISTS `Position`;
CREATE TABLE `Position` (
    PositionID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    PositionName ENUM('Dev', 'Test', 'Scrum Master', 'PM')
);

-- Tạo bảng Account

DROP TABLE IF EXISTS `Account`;
CREATE TABLE `Account` (
    AccountID INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Email VARCHAR(75),
    Username VARCHAR(75) UNIQUE,
    FullName NVARCHAR(50),
    DepartmentID INT,
    PositionID INT,
    CreateDate DATE,
    FOREIGN KEY (DepartmentID)
        REFERENCES Department (DepartmentID) ON DELETE CASCADE,
    FOREIGN KEY (PositionID)
        REFERENCES `Position` (PositionID) ON DELETE CASCADE
);

-- Tạo bảng Group

DROP TABLE IF EXISTS `Group`;
CREATE TABLE `Group` (
    GroupID INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    GroupName VARCHAR(50),
    CreatorID INT UNSIGNED,
    CreateDate DATE,
    FOREIGN KEY (CreatorID) REFERENCES `Account` (AccountID) ON DELETE CASCADE
);

-- Tạo bảng Group Account

DROP TABLE IF EXISTS GroupAccount;
CREATE TABLE GroupAccount (
    GroupID INT UNSIGNED,
    AccountID INT,
    JoinDate DATE,
    PRIMARY KEY (GroupID, AccountID),
    FOREIGN KEY (GroupID)
        REFERENCES `Group` (GroupID) ON DELETE CASCADE,
    FOREIGN KEY (AccountID)
        REFERENCES `Account` (AccountID) ON DELETE CASCADE
);