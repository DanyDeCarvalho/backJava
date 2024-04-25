INSERT INTO team (name, slogan) VALUES ('PSG', 'Revons plus grand');
INSERT INTO team (name, slogan) VALUES ('Real Madrid', 'Les galactiques');
INSERT INTO team (name, slogan) VALUES ('Barcelone', 'La Macia');
INSERT INTO team (name, slogan) VALUES ('Bayern', 'Les puissants en
Allemagne');
INSERT INTO team (name, slogan) VALUES ('Manchester United', 'Les red
devils');
-- Insérer des joueurs pour l'équipe PSG
INSERT INTO player (name, numero, position, team_id) VALUES ('Neymar Jr', 10, 'Attaquant', 1);
INSERT INTO player (name, numero, position, team_id) VALUES ('Kylian Mbappé', 7, 'Attaquant', 1);
INSERT INTO player (name, numero, position, team_id) VALUES ('Marco Verratti', 6, 'Milieu de terrain', 1);

-- Insérer des joueurs pour l'équipe Real Madrid
INSERT INTO player (name, numero, position, team_id) VALUES ('Karim Benzema', 9, 'Attaquant', 2);
INSERT INTO player (name, numero, position, team_id) VALUES ('Sergio Ramos', 4, 'Défenseur', 2);
INSERT INTO player (name, numero, position, team_id) VALUES ('Luka Modric', 10, 'Milieu de terrain', 2);

-- Insérer des joueurs pour l'équipe Barcelone
INSERT INTO player (name, numero, position, team_id) VALUES ('Lionel Messi', 10, 'Attaquant', 3);
INSERT INTO player (name, numero, position, team_id) VALUES ('Gerard Piqué', 3, 'Défenseur', 3);
INSERT INTO player (name, numero, position, team_id) VALUES ('Frenkie de Jong', 21, 'Milieu de terrain', 3);

-- Insérer des joueurs pour l'équipe Bayern
INSERT INTO player (name, numero, position, team_id) VALUES ('Robert Lewandowski', 9, 'Attaquant', 4);
INSERT INTO player (name, numero, position, team_id) VALUES ('Manuel Neuer', 1, 'Gardien de but', 4);
INSERT INTO player (name, numero, position, team_id) VALUES ('Joshua Kimmich', 6, 'Milieu de terrain', 4);

-- Insérer des joueurs pour l'équipe Manchester United
INSERT INTO player (name, numero, position, team_id) VALUES ('Bruno Fernandes', 18, 'Milieu de terrain', 5);
INSERT INTO player (name, numero, position, team_id) VALUES ('Harry Maguire', 5, 'Défenseur', 5);
INSERT INTO player (name, numero, position, team_id) VALUES ('Marcus Rashford', 10, 'Attaquant', 5);
