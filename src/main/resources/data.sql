INSERT INTO employee(id,name,age)
 VALUES('1','Tom',30);
 
 /*ユーサーマスタ*/
 INSERT INTO m_user(password, user_name, email, birthday, age, gender, department_id, role
) VALUES
 ('password', 'システム管理者', 'system@co.jp', '2000-01-01', 21, 1, 1, 'ROLE_ADMIN')
 ,('password', 'ユーザ1', 'user@co.jp', '2000-01-01', 21, 2, 2, 'ROLE_GENERAL')
;
 
 /*部署マスタ*/
 INSERT INTO m_department(department_id, department_name
) VALUES
 (1,'システム管理部')
 ,(2,'営業部')
;
 
 /*給料テーブル*/
 INSERT INTO t_salary(email, year_month, salary
) VALUES
 ('user@co.jp','2020/11',280000)
 ,('user@co.jp','2020/12',290000)
 ,('user@co.jp','2021/01',300000)
;
 