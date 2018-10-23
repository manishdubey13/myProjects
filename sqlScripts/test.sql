USE mani;
/*CREATE TABLE test(
date DATE NOT NULL,
  type ENUM('T', 'Q') NOT NULL,
  class_id INT UNSIGNED NOT NULL,
  test_id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY);

CREATE TABLE score(
  student_id INT UNSIGNED NOT NULL,
  event_id INT UNSIGNED NOT NULL,
  score INT NOT NULL,
PRIMARY KEY(event_id, student_id));

CREATE TABLE absence(
  student_id INT UNSIGNED NOT NULL,
date DATE NOT NULL,
PRIMARY KEY(student_id, date));
*/

/*use MANI;
ALTER TABLE test ADD maxscore INT NOT NULL AFTER type;

ALTER TABLE score CHANGE event_id test_id
INT UNSIGNED NOT NULL;
*/


INSERT INTO test VALUES
('2014-8-25', 'Q', 15, 1, NULL),
('2014-8-27', 'Q', 15, 1, NULL),
('2014-8-29', 'T', 30, 1, NULL),
('2014-8-29', 'T', 30, 2, NULL),
('2014-8-27', 'Q', 15, 4, NULL),
('2014-8-29', 'T', 30, 4, NULL);


INSERT INTO score VALUES
(1, 1, 15),
(1, 2, 14),
(1, 3, 28),
(1, 4, 29),
(1, 5, 15),
(1, 6, 27),
(2, 1, 15),
(2, 2, 14),
(2, 3, 26),
(2, 4, 28),
(2, 5, 14),
(2, 6, 26),
(3, 1, 14),
(3, 2, 14),
(3, 3, 26),
(3, 4, 26),
(3, 5, 13),
(3, 6, 26),
(4, 1, 15),
(4, 2, 14),
(4, 3, 27),
(4, 4, 27),
(4, 5, 15),
(4, 6, 27),
(5, 1, 14),
(5, 2, 13),
(5, 3, 26),
(5, 4, 27),
(5, 5, 13),
(5, 6, 27),
(6, 1, 13),
(6, 2, 13),
# Missed this day (6, 3, 24),
(6, 4, 26),
(6, 5, 13),
(6, 6, 26),
(7, 1, 13),
(7, 2, 13),
(7, 3, 25),
(7, 4, 27),
(7, 5, 13),
# Missed this day (7, 6, 27),
(8, 1, 14),
# Missed this day (8, 2, 13),
(8, 3, 26),
(8, 4, 23),
(8, 5, 12),
(8, 6, 24),
(9, 1, 15),
(9, 2, 13),
(9, 3, 28),
(9, 4, 27),
(9, 5, 14),
 (9, 6, 27),
(10, 1, 15),
(10, 2, 13),
(10, 3, 26),
(10, 4, 27),
(10, 5, 12),
(10, 6, 22);

COMMIT ;

INSERT INTO absence VALUES
(6, '2014-08-29'),
(7, '2014-08-29'),
(8, '2014-08-27');

commit;