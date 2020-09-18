CREATE DATABASE Jaegers;

\c Jaegers

CREATE TABLE Jaegers (
    id SERIAL PRIMARY KEY,
    modelName TEXT,
    mark CHAR(6),
    height DECIMAL,
    weight INTEGER,
    status TEXT,
    origin TEXT,
    launch DATE,
    kaijuKill INTEGER
);