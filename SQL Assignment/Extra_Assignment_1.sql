-- Tạo mới cơ sở dữ liệu

DROP DATABASE IF EXISTS TestSystem2;
CREATE DATABASE IF NOT EXISTS TestSystem2;
USE TestSystem2;

-- Q1: Tạo bảng Trainee

DROP TABLE IF EXISTS Trainee;
CREATE TABLE Trainee (
    TraineeID INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Full_Name VARCHAR(50),
    Birth_Date DATE,
    Gender ENUM('male', 'female', 'unknown'),
    ET_IQ TINYINT UNSIGNED,
    ET_Gmath TINYINT UNSIGNED,
    ET_English TINYINT UNSIGNED,
    Training_Class VARCHAR(15),
    Evaluation_Notes TEXT CHECK (ET_IQ >= 0 AND ET_IQ <= 20),
    CHECK (ET_Gmath >= 0 AND ET_Gmath <= 20),
    CHECK (ET_English >= 0 AND ET_English <= 50)
);

-- Q2: Thêm vào trường VTI_Account (không rỗng, duy nhất)

ALTER TABLE Trainee ADD VTI_Account VARCHAR(75) NOT NULL UNIQUE;

-- Exercise 2: 

DROP TABLE IF EXISTS Exercise2;
CREATE TABLE Exercise2 (
    ID INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `Name` VARCHAR(50) NOT NULL,
    `Code` CHAR(5) NOT NULL,
    ModifiedDate DATE DEFAULT NOW()
);

-- Exercise 3

DROP TABLE IF EXISTS Exercise3;
CREATE TABLE Exercise3(
	ID INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `Name` VARCHAR(50) NOT NULL,
    BirthDate DATE NOT NULL,
    Gender BIT NOT NULL DEFAULT 'Unknown',
    isDeleted BIT NOT NULL
);