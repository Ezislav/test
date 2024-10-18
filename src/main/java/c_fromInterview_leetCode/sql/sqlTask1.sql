Teachers
|  ID  |  NAME     | SURNAME   |
--------------------------------
|   1  |  Иван     | Иванов    |
|   2  |  Иван     | Петров    |
|   3  |  Василий  | Васильев  |
|   4  |  Игорь    | Игорев    |
|   5  |  Елена    | Максимова |

Students
|  ID  |     NAME  |  SURNAME     |  TEACHER_ID  |
-----------------------------------------------
|   1  |  Катя     | Криворучкова | 1            |
|   2  |  Игорь    | Отличников   | 1            |
|   3  |  Семен    | Безымянный   | 2            |
|   4  |  Федор    | Конюхов      | 3            |

Для таблиц Teachers и Students напиши примеры запросов, которые выведут:

1. Имена учителей и их учеников (только тех, у которых есть ученики)
2. Имена учителей и их учеников (всех учителей, даже если учеников нет)
3. Только повторяющиеся имена учителей


Решение:
1.
SELECT Teachers.name AS TeacherName, Students.name AS StudentName
FROM Teachers
JOIN Students ON Teachers.id = Students.id

2.
SELECT Teachers.name AS teachers, Students.name AS students
FROM Teachers
LEFT JOIN Students ON Teachers.id = Students.id

3.
SELECT name, COUNT(*)
FROM Teachers
GROUP BY name
WHERE COUNT(*) > 1
