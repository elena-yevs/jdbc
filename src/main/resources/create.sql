CREATE TABLE roles
(
    role_id  INT          NOT NULL PRIMARY KEY,
    roleName VARCHAR(256) NOT NULL
);

CREATE TABLE users
(
    id        INT          NOT NULL PRIMARY KEY,
    role_id   INT          NOT NULL,
    login     VARCHAR(256) NOT NULL,
    password  VARCHAR(256) NOT NULL,
    email     VARCHAR(256) NOT NULL,
    firstName VARCHAR(256) NOT NULL,
    lastName  VARCHAR(256) NOT NULL,
    birthday  DATE         NOT NULL,
    FOREIGN KEY (role_id) REFERENCES roles (role_id)
);

