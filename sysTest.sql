Create TABLE questions
(
    question_id SERIAL PRIMARY KEY,
    question_text VARCHAR(300) NOT NULL UNIQUE
);

Create TABLE answers
(
    answer_id SERIAL PRIMARY KEY,
	question_id Integer REFERENCES questions (question_id) ,
    answer_text VARCHAR(300) NOT NULL,
	correct_answer BOOLEAN	 NOT NULL
);

Create TABLE test_results
(
    question_id Integer REFERENCES questions (question_id) ,
	answer_id Integer REFERENCES answers (answer_id) ,
    full_name VARCHAR(100) NOT NULL
);

INSERT INTO questions (question_text) VALUES ('How many primitive data types are in java?');
INSERT INTO questions (question_text) VALUES ('What is the range of an int?');
INSERT INTO questions (question_text) VALUES ('Variable / constant names writing style');

INSERT INTO answers (question_id, answer_text, correct_answer) VALUES (1,'A)8',true);
INSERT INTO answers (question_id, answer_text, correct_answer) VALUES (1,'B)9',false);
INSERT INTO answers (question_id, answer_text, correct_answer) VALUES (1,'C)6',false);

INSERT INTO answers (question_id, answer_text, correct_answer) VALUES (2,'A)32,768 - 32,767',false);
INSERT INTO answers (question_id, answer_text, correct_answer) VALUES (2,'B)true and false',false);
INSERT INTO answers (question_id, answer_text, correct_answer) VALUES (2,'C)-2,147,483,647 - 2,147,483,647',true);

INSERT INTO answers (question_id, answer_text, correct_answer) VALUES (3,'A)camelCase',false);
INSERT INTO answers (question_id, answer_text, correct_answer) VALUES (3,'B)UPPER_SNAKE_CASE',true);
INSERT INTO answers (question_id, answer_text, correct_answer) VALUES (3,'C)lowerCamelCase',false);

INSERT INTO test_results (question_id, answer_id, full_name) VALUES (1,1,'Ryndina A');
INSERT INTO test_results (question_id, answer_id, full_name) VALUES (2,3,'Ryndina A');


SELECT q.question_id,
		q.question_text,
	a.answer_id,
	a.answer_text
FROM questions q
JOIN answers a ON a.question_id = q.question_id


SELECT q.question_id,
	q.question_text,
	r.full_name,
	a.correct_answer
FROM questions q
JOIN test_results r ON r.question_id = q.question_id
JOIN answers A ON a.answer_id = r.answer_id

