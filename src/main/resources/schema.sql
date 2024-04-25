CREATE TABLE team
(
id IDENTITY NOT NULL PRIMARY KEY,
name VARCHAR(200),
slogan VARCHAR(500)
);

CREATE TABLE player
(
    id IDENTITY NOT NULL PRIMARY KEY,
    name VARCHAR(200),
    numero INT,
    position VARCHAR(100),
    team_id BIGINT,
    FOREIGN KEY (team_id) REFERENCES team(id)
);
