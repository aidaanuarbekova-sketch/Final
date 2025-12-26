INSERT INTO t_artist (t_name, t_genre)
VALUES
    ('Ninety one', 'Q Pop'),
    ('Dos Muqasan', 'Rock Pop'),
    ('Darkhan Juzz', 'Indi Pop');
INSERT INTO t_playlist (t_name, t_description)
VALUES
    ('GAP', 'Songs in different vibes'),
    ('Sagynysh', 'Sad and chill music'),
    ('TBRN', 'Collection of singles');
INSERT INTO t_song (t_title, t_year, artist_id)
VALUES
    ('Ottegi', '2023', 1),
    ('Toy zhyry', '1973', 2),
    ('Sheker', '2019', 3),
    ('Tartty', '2023', 1),
    ('Ahau Bikem', '1976', 2);
INSERT INTO t_song_playlists (song_id, playlist_id)
VALUES
    (1, 1),
    (4, 1),
    (2, 2),
    (5, 2),
    (3, 3),
    (1, 3),
    (2, 3);
INSERT INTO t_permission (t_name)
VALUES
    ('ROLE_ADMIN'),
    ('ROLE_USER');
