--Part 1
JobID int,
JobName varchar(225),
Employer varchar (225),
Skills varchar (225)

--Part 2
SELECT name FROM employer WHERE location = "St. Louis City";

--Part 3
DROP TABLE job;

--Part 4
SELECT * FROM skill
LEFT JOIN job_skills ON skill.id = job_skills.skills_id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;