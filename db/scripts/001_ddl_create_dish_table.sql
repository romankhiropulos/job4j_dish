CREATE TABLE IF NOT EXISTS dish
(
    id          SERIAL PRIMARY KEY NOT NULL,
    name        VARCHAR(2000)      NOT NULL,
    description VARCHAR(2000)      NOT NULL
);