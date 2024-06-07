-- CREATE SCHEMA IF NOT EXISTS sa;
-- SET SCHEMA sa;

-- CREATE TABLE IF NOT EXISTS sa.users (
--     username VARCHAR(50) NOT NULL PRIMARY KEY,
--     password VARCHAR(500) NOT NULL,
--     enabled BOOLEAN NOT NULL
-- );
--
-- CREATE TABLE IF NOT EXISTS sa.authorities (
--     username VARCHAR(50) NOT NULL,
--     authority VARCHAR(50) NOT NULL,
--     FOREIGN KEY (username) REFERENCES users (username)
-- );

-- CREATE UNIQUE INDEX IF NOT EXISTS sa.ix_auth_username ON sa.authorities (username, authority);
