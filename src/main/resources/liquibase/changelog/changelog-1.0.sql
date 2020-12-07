--liquibase formatted sql
--changeset vladegipti:1

CREATE TABLE cities (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(120) NOT NULL,
    latitude DECIMAL(8,6) NOT NULL,
    longitude DECIMAL(9,6) NOT NULL
);
--rollback DROP TABLE cities;

--changeset vladegipti:2

CREATE TABLE distances (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_city_id INT NOT NULL,
    second_city_id INT NOT NULL,
    distance INT NOT NULL,
    FOREIGN KEY (first_city_id) REFERENCES cities(id) ON UPDATE RESTRICT ON DELETE CASCADE,
    FOREIGN KEY (second_city_id) REFERENCES cities(id) ON UPDATE RESTRICT ON DELETE CASCADE
);
--rollback DROP TABLE distances;
