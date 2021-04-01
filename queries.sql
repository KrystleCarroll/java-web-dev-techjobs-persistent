## Part 1: Test it with SQL
SELECT *
FROM techjobs.job

## Part 2: Test it with SQL
SELECT name
FROM techjobs.employer
WHERE location = "St. Louis City";

## Part 3: Test it with SQL
DROP TABLE job;

## Part 4: Test it with SQL
SELECT skill.name, skill.description
FROM skill
INNER JOIN job_skill
ON skill.Id = job_skill.skill_Id
INNER JOIN job
ON job.Id = job_skill.jobs_Id
WHERE job_skill.jobs_Id IS NOT NULL;