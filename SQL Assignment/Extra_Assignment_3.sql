USE adventureworks;

-- Exercise 1: 
-- Q3: 
WITH ProductSubTouringBike AS
							(SELECT productsubcategoryid 
							FROM productsubcategory 
							WHERE `Name` 
                            LIKE '%Touring Bike%'),

ProductTouringBike AS
							(SELECT * 
								FROM product 
                                WHERE ProductSubcategoryID 
                                IN 
									(SELECT ProductSubcategoryID 
                                    FROM ProductSubTouringBike))

SELECT * FROM 
	ProductTouringBike 
    WHERE ListPrice = 
    (SELECT
		MIN(ListPrice) FROM ProductTouringBike);

-- Excercise 2:
-- Q3: 

SELECT
    salesorderid,
    sp.salespersonID,
    sp.bonus,
    sp.salesytd,
    orderdate
FROM
    salesperson sp
        JOIN
    salesorderheader soh ON sp.salespersonid = soh.salespersonid
WHERE
    soh.onlineorderflag = 0;