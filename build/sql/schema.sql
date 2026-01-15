DROP DATABASE IF EXISTS srb;

CREATE DATABASE srb;

USE srb;

CREATE TABLE point_levels (
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    point_start INT,
    point_end INT,
    borrow_amount DECIMAL(10, 2),
    create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    is_deleted TINYINT NOT NULL DEFAULT 0
);

INSERT INTO point_levels (point_start, point_end, borrow_amount)
VALUES (10, 50, 10000),
       (51, 100, 30000),
       (101, 1000, 100000);