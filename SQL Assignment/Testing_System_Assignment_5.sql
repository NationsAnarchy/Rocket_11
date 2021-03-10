USE TestSystem1; 

-- Ví dụ

DROP TRIGGER IF EXISTS CreateDateCheck;
DELIMITER $$
CREATE TRIGGER CreateDateCheck -- Trigger name
BEFORE INSERT ON Question -- Table Name
FOR EACH ROW
BEGIN -- Logic
	IF NEW.CreateDate > now() THEN
		SET NEW.CreateDate = now();
	END IF;
END $$
DELIMITER ;

SELECT * FROM Question;
SELECT * FROM `groupaccount`;
SELECT
	GroupID,
    COUNT(AccountID) AS MemberCount
FROM
    GroupAccount
GROUP BY GroupID;

DELETE FROM Question 
WHERE
    QuestionID = 6;
    
DROP TRIGGER IF EXISTS DeleteAnswer;
DELIMITER $$
CREATE TRIGGER DeleteAnswer
BEFORE DELETE ON Question
FOR EACH ROW
BEGIN
	DELETE FROM Answer WHERE QuestionID = 6;
END $$
DELIMITER ;

-- Q3: 

INSERT INTO GroupAccount VALUES ();

DROP TRIGGER IF EXISTS GroupUserLimit;
DELIMITER $$
CREATE TRIGGER GroupUserLimit
BEFORE INSERT ON GroupAccount
FOR EACH ROW
BEGIN
	DECLARE MemberCount TINYINT UNSIGNED;
SELECT 
    COUNT(AccountID)
INTO MemberCount FROM
    GroupAccount
WHERE
    GroupID = New.GroupID;
    
    IF 	MemberCount >= 5 THEN
		SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT = 'Cannot insert more account to the group';    
    END IF;
END $$
DELIMITER ;

-- Q4: 

DROP TRIGGER IF EXISTS TestQuestionLimit;
DELIMITER $$
CREATE TRIGGER TestQuestionLimit
BEFORE INSERT ON ExamQuestion
FOR EACH ROW
BEGIN
	
END $$
DELIMITER ;