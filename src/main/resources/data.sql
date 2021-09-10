INSERT INTO USERS (EMAIL, FIRST_NAME, LAST_NAME, PASSWORD)
VALUES ('User', 'user@yandex.ru', '{noop}password', '2021-01-10'),
       ('User2', 'user2@yandex.ru', '{noop}password', '2021-01-10'),
       ('User3', 'user3@yandex.ru', '{noop}password', '2021-01-10'),
       ('User4', 'user4@yandex.ru', '{noop}password', '2021-01-10'),
       ('Admin', 'admin@gmail.com', '{noop}admin', '2021-01-10');

INSERT INTO RESTAURANTS (NAME, REGISTERED)
VALUES ('Astoria', '2015-01-01'),
       ('Legend', '2015-02-01'),
       ('France', '2015-03-01');

INSERT INTO DISHES (NAME, PRICE, DATE, RESTAURANT_ID)
VALUES ('Red soup', 200, '2021-01-10', 1),
       ('Greek salad', 150, '2021-01-10', 1),
       ('Lemon tea', 100, '2021-01-10', 1),
       ('Green soup', 200, '2021-01-10', 2),
       ('Fresh salad', 150, '2021-01-10', 2),
       ('Black coffee', 150, '2021-01-10', 2),
       ('Chicken soup', 200, '2021-01-10', 3),
       ('Carrot salad', 100, '2021-01-10', 3),
       ('Black tea', 100, '2021-01-10', 3),
       ('Red soup', 200, DATEADD('d', -1, NOW()), 1),
       ('Greek salad', 150, DATEADD('d', -1, NOW()), 1),
       ('Lemon tea', 100, DATEADD('d', -1, NOW()), 1),
       ('Green soup', 200, DATEADD('d', -1, NOW()), 2),
       ('Fresh salad', 150, DATEADD('d', -1, NOW()), 2),
       ('Black coffee', 150, DATEADD('d', -1, NOW()), 2),
       ('Chicken soup', 200, DATEADD('d', -1, NOW()), 3),
       ('Carrot salad', 100, DATEADD('d', -1, NOW()), 3),
       ('Black tea', 100, DATEADD('d', -1, NOW()), 3),
       ('Red soup', 200, now(), 1),
       ('Greek salad', 150, now(), 1),
       ('Lemon tea', 100, now(), 1),
       ('Green soup', 200, now(), 2),
       ('Fresh salad', 150, now(), 2),
       ('Black coffee', 150, now(), 2),
       ('Chicken soup', 200, now(), 3),
       ('Carrot salad', 100, now(), 3),
       ('Black tea', 100, now(), 3);

INSERT INTO VOTES (USER_ID, RESTAURANT_ID, DATE)
VALUES (1, 1, '2021-01-10'),
       (2, 1, '2021-01-10'),
       (3, 2, '2021-01-10'),
       (4, 3, '2021-01-10'),
       (2, 1, now()),
       (3, 2, now()),
       (4, 3, now());

INSERT INTO USER_ROLE (role, user_id)
VALUES ('USER', 1),
       ('USER', 2),
       ('USER', 3),
       ('USER', 4),
       ('ADMIN', 5);