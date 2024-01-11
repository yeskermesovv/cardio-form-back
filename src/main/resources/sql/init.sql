CREATE TABLE Doctor (
                                 id BIGSERIAL PRIMARY KEY,
                                 fio VARCHAR(200),
                                 birthdate DATE,
                                 qualification VARCHAR,
                                 job_experience VARCHAR,
                                 passed_years_since_graduation INT,
                                 weekly_echocardiogram_count INT
);
