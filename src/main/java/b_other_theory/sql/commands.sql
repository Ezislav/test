Работа с запросом:

--SELECT: Выбирает данные из базы данных.
SELECT name, age FROM Employees;


--WHERE: Фильтрует записи, которые соответствуют указанному условию.
SELECT name FROM Employees WHERE age > 30;


--AS: Alias (с англ. — «псевдоним»)
SELECT Teachers.name AS TeacherName, Teachers.surname AS TeacherSurname,
FROM Teachers


--LIKE: Используется для поиска в столбце строк, соответствующих заданному шаблону.
--Ключевое слово LIKE позволяет осуществлять фильтрацию строк с помощью шаблонов. Шаблоны могут включать следующие символы:

--% - заменяет ноль или более символов.
--_ - заменяет ровно один символ.
SELECT name
FROM Employees
WHERE name LIKE 'A%';


--UNION: Объединяет результаты двух или более SELECT-запросов.
SELECT name FROM Employees
UNION
SELECT name FROM Clients;


--DISTINCT: Возвращает уникальные значения.
SELECT DISTINCT department_id FROM Employees;


--JOIN: Объединяет строки из двух или более таблиц на основе связанного столбца.
SELECT Employees.name, Departments.department_name
FROM Employees
JOIN Departments ON Employees.department_id = Departments.id;


--INNER JOIN: Возвращает записи, которые имеют совпадающие значения в обеих таблицах.
SELECT Employees.name, Departments.department_name
FROM Employees
INNER JOIN Departments ON Employees.department_id = Departments.id;


--LEFT JOIN (или LEFT OUTER JOIN): Возвращает все записи из левой таблицы и совпадающие записи из правой таблицы.
SELECT Employees.name, Departments.department_name
FROM Employees
LEFT JOIN Departments ON Employees.department_id = Departments.id;


SELECT Employees.name, Departments.department_name
FROM Employees
RIGHT JOIN Departments ON Employees.department_id = Departments.id;


--FULL JOIN (или FULL OUTER JOIN): Возвращает все записи, когда есть совпадение в одной из таблиц.
SELECT Employees.name, Departments.department_name
FROM Employees
FULL OUTER JOIN Departments ON Employees.department_id = Departments.id;


--ORDER BY: Сортирует результат запроса по одному или нескольким столбцам.
SELECT name, age FROM Employees ORDER BY age DESC;


--GROUP BY: Группирует записи с одинаковыми значениями в указанных столбцах.
SELECT department_id, COUNT(*)
FROM Employees
GROUP BY department_id;


--HAVING: Фильтрует записи после группировки.
SELECT department_id, COUNT(*)
FROM Employees
GROUP BY department_id
HAVING COUNT(*) > 5;



Работа с таблицей:

--INSERT INTO: Вставляет новые записи в таблицу.
INSERT INTO Employees (name, age, department_id)
VALUES ('John Doe', 28, 3);


--UPDATE: Обновляет существующие записи в таблице.
UPDATE Employees
SET age = 29
WHERE name = 'John Doe';


--DELETE: Удаляет записи из таблицы.
DELETE FROM Employees
WHERE name = 'John Doe';


--CREATE TABLE: Создает новую таблицу в базе данных.
CREATE TABLE Employees (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    department_id INT
);


--ALTER TABLE: Изменяет структуру существующей таблицы.
ALTER TABLE Employees
ADD COLUMN email VARCHAR(100);


--DROP TABLE: Удаляет таблицу из базы данных.
DROP TABLE Employees;


--CREATE DATABASE: Создает новую базу данных.
CREATE DATABASE CompanyDB;


--DROP DATABASE: Удаляет базу данных.
DROP DATABASE CompanyDB;

--LIMIT (или TOP): Ограничивает количество возвращаемых записей.
SELECT name FROM Employees
LIMIT 10;


--CASE: Создает условия и возвращает значения на основе этих условий.
SELECT name,
       CASE
           WHEN age < 18 THEN 'Minor'
           WHEN age >= 18 AND age < 60 THEN 'Adult'
           ELSE 'Senior'
       END AS age_group
FROM Employees;