# # # # # # # # # # # #
#   此文件请不要整理  #
# # # # # # # # # # # #

# DROP DATABASE IF EXISTS demo;
# CREATE DATABASE IF NOT EXISTS demo DEFAULT CHARACTER SET utf8;
# CREATE USER demo@'localhost' IDENTIFIED BY 'user';
# GRANT ALL PRIVILEGES ON demo.* TO demo;

INSERT INTO user (username, password, enabled)
VALUES ('user1', '$2a$10$9uuTnBgg4Lrk/ipBctwQ1O0vI8ODOAzF6WsRc0UW4pf80e08CQCMq', TRUE);
INSERT INTO user (username, password, enabled)
VALUES ('user2', '$2a$10$7nvfgKN.tJtyYZ12Xv6bTO.TiYZx8IfQKOD1e0JikeibjPFNuyzb.', TRUE);

INSERT INTO roles (username, role) VALUES ('user1', 'ROLE_USER');
INSERT INTO roles (username, role) VALUES ('user1', 'ROLE_ADMIN');
INSERT INTO roles (username, role) VALUES ('user2', 'ROLE_ADMIN');