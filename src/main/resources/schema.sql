CREATE TABLE IF NOT EXISTS employee(
 id INT AUTO_INCREMENT PRIMARY KEY,
 name VARCHAR(50),
 age INT
);

/*ユーザーマスタ*/
CREATE TABLE IF NOT EXISTS m_user(
user_id INT AUTO_INCREMENT PRIMARY KEY,
 password VARCHAR(100),
 user_name VARCHAR(50),
 email VARCHAR(50) UNIQUE NOT NULL,
 birthday DATE,
 age INT,
 gender INT,
 department_id INT,
 role VARCHAR(50)
);

/*部署マスタ*/
CREATE TABLE IF NOT EXISTS m_department(
department_id INT AUTO_INCREMENT PRIMARY KEY,
 department_name VARCHAR(50)
);

/*給料テーブル*/
CREATE TABLE IF NOT EXISTS t_salary(
email VARCHAR(50),
 year_month VARCHAR(50),
 salary INT,
 PRIMARY KEY(email, year_month)
); 
 

