## Part 1: Test it with SQL
id int
name varchar(100)
employer_id int
job_id int

## Part 2: Test it with SQL
SELECT name FROM techjobs.employer WHERE location = "St Louis City";

## Part 3: Test it with SQL
DROP TABLE 'techjobs'.'job';

## Part 4: Test it with SQL
SELECT name, description
FROM techjobs.skills
INNER JOIN techjobs.job_skills
ON techjobs.skills.id = techjobs.job_skills.skills_id
WHERE techjobs.job_skills.job_id IS NOT NULL
ORDER BY name ASC;
