CREATE TABLE Doctor (
                                 id BIGSERIAL PRIMARY KEY,
                                 fio VARCHAR(200),
                                 birthdate DATE,
                                 qualification VARCHAR,
                                 job_experience VARCHAR,
                                 passed_years_since_graduation INT,
                                 weekly_echocardiogram_count INT
);

CREATE TABLE Question (
                          id BIGSERIAL PRIMARY KEY,
                          mark DECIMAL,
                          doctor_id INT,
                          file_name VARCHAR(255),
                          image_id VARCHAR(255),
                          epoch VARCHAR(255),
                          image_type VARCHAR(50)
);

CREATE TABLE Tag (
                     id BIGSERIAL PRIMARY KEY,
                     name VARCHAR(255)
);

CREATE TABLE Question_Tag (
                              question_id INT,
                              tag_id INT,
                              PRIMARY KEY (question_id, tag_id),
                              FOREIGN KEY (question_id) REFERENCES Question(id),
                              FOREIGN KEY (tag_id) REFERENCES Tag(id)
);
