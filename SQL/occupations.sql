/* SETUP Database */
CREATE DATABASE IF NOT EXISTS hackerrank;
USE hackerrank;

DROP TABLE IF EXISTS OCCUPATIONS;
CREATE TABLE OCCUPATIONS (
                             Name VARCHAR(20),
                             Occupation VARCHAR(20)
);

INSERT INTO OCCUPATIONS (Name,Occupation)
VALUES
('Aamina','Doctor'),
('Ashley','Professor'),
('Belvet', 'Professor'),
('Britney', 'Professor'),
('Christeen', 'Singer'),
('Eve', 'Actor'),
('Jane', 'Singer'),
('Jennifer', 'Actor'),
('Jenny', 'Singer'),
('Julia', 'Doctor'),
('Ketty', 'Actor'),
('Kristeen', 'Singer'),
('Maria', 'Professor'),
('Meera', 'Professor'),
('Naomi', 'Professor'),
('Priya', 'Doctor'),
('Priyanka', 'Professor'),
('Samantha', 'Actor');

/* https://www.hackerrank.com/challenges/occupations/problem
 Pivot the Occupation column in OCCUPATIONS so each Name is sorted alphabetically
 and displayed underneath its corresponding Occupation. The output column
 headers should be Doctor, Professor, Singer, and Actor, respectively.
 Note: Print NULL when there are no more names corresponding to an occupation.
 */

SET @r1=0, @r2 = 0, @r3 = 0, @r4 = 0;

SELECT t1.name, t2.name, t3.name, t4.name
FROM
    (SELECT
         (@r1:=@r1 + 1) AS num1,
         Name
     FROM
         Occupations
     WHERE Occupation = 'Doctor'
     ORDER BY Name) as t1
        RIGHT JOIN
    (SELECT
         (@r2:=@r2 + 1) AS num2,
         Name
     FROM
         Occupations
     WHERE Occupation = 'Professor'
     ORDER BY Name) as t2
    ON t1.num1 = t2.num2
        LEFT JOIN
    (SELECT
         (@r3:=@r3 + 1) AS num3,
         Name
     FROM
         Occupations
     WHERE Occupation = 'Singer'
     ORDER BY Name) as t3
    ON t2.num2 = t3.num3
        LEFT JOIN
    (SELECT
         (@r4:=@r4 + 1) AS num4,
         Name
     FROM
         Occupations
     WHERE Occupation = 'Actor'
     ORDER BY Name) as t4
    ON t2.num2 = t4.num4;

/* Expected result:
Aamina Ashley Christeen Eve
Julia Belvet Jane Jennifer
Priya Britney Jenny Ketty
NULL Maria Kristeen Samantha
NULL Meera NULL NULL
NULL Naomi NULL NULL
NULL Priyanka NULL NULL
 */