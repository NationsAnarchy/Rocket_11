USE TestSystem1;

-- Q1: 

DELIMITER $$
CREATE PROCEDURE GetAccountFromDepartment (IN search NVARCHAR(50))
	BEGIN
		SELECT 	Username, FullName, Email
        FROM 	`Account` a
        JOIN 	Department d 
        ON 		a.DepartmentID = d.DepartmentID
        WHERE 	d.DepartmentName 
        LIKE 	CONCAT ('%', search, '%');
    END $$
DELIMITER ;

-- Q2:

DELIMITER $$
CREATE PROCEDURE CountAccount ()
	BEGIN
		SELECT 		g.GroupID, 
					COUNT(AccountID) AS AccountCount
        FROM 		GroupAccount ga
        JOIN 		`Group` g 
        ON 			ga.GroupID = g.GroupID
        GROUP BY 	g.GroupID;
    END $$
DELIMITER ;

-- Q3: 

DELIMITER $$
CREATE PROCEDURE QuestionQuery ()
	BEGIN
		SELECT 		q.TypeID, tq.TypeName, 
					COUNT(q.QuestionID) AS QuestionCount,
                    q.CreateDate
        FROM 		Question q
        JOIN 		TypeQuestion tq 
		ON 			tq.TypeID = q.TypeID
        GROUP BY 	q.TypeID
        HAVING 		q.CreateDate = month(now());
	END $$
DELIMITER ;

-- Q4:

DROP PROCEDURE IF EXISTS MostNumberOfQuestion;
DELIMITER $$ 
CREATE PROCEDURE MostNumberOfQuestion (OUT out_TypeID TINYINT)
	BEGIN
		SELECT 		TypeID INTO out_TypeID
        FROM 		Question
        GROUP BY 	TypeID
        HAVING 		COUNT(QuestionID) = (	SELECT COUNT(QuestionID) 
										AS NoOfQuestions
										FROM Question
										GROUP BY TypeID
										ORDER BY COUNT(QuestionID) DESC
										LIMIT 1);                                    
    END $$
DELIMITER ;

SET @v_typeID = -1;
CALL MostNumberOfQuestion (@v_typeID);
SELECT @v_typeID;

-- Q5: 

DELIMITER $$
CREATE PROCEDURE TypeQuestionName ()
	BEGIN
		SELECT 		q.TypeID, 
					COUNT(q.QuestionID) AS NoOfQuestions,
                    tq.TypeName
        FROM 		Question q
        JOIN		TypeQuestion tq 
        ON 			q.TypeID = tq.TypeID
        GROUP BY 	TypeID
        HAVING 		NoOfQuestions = (	SELECT COUNT(QuestionID) 
										AS NoOfQuestions
										FROM Question
										GROUP BY TypeID
										ORDER BY NoOfQuestions DESC
										LIMIT 1);
    END $$
DELIMITER ;

-- Câu hỏi làm về function: Viết ra, nhập vào id phòng ban và trả ra tên phòng ban đó
SET GLOBAL log_bin_trust_function_creators = 1;

DROP FUNCTION IF EXISTS GetDepartmentNameByID;
DELIMITER $$
CREATE FUNCTION GetDepartmentNameByID (in_dept_id INT) RETURNS VARCHAR(50)
BEGIN
	DECLARE out_dept_name VARCHAR(50);
    
SELECT 
    DepartmentName
INTO out_dept_name FROM
    Department
WHERE
    DepartmentID = in_dept_id;
    
    RETURN out_dept_name;
END $$
DELIMITER ;