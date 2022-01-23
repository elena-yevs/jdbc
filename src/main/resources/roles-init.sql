INSERT INTO roles(role_id, roleName)
VALUES(1, 'user');

INSERT INTO users(id, role_id, login, password, email, firstName, lastName, birthday)
VALUES(1, 1, 'admin-ryan', 'qwerty6', 'adm@gmail.com', 'Ryan', 'Gosling', '19801112');