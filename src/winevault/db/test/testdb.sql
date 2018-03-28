CREATE DATABASE winevaultdbtest CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE winevaultdbtest;
SET SQL_SAFE_UPDATES=0;

CREATE TABLE wines(
  id INT AUTO_INCREMENT PRIMARY KEY,
  variety VARCHAR(100) NOT NULL,
  country VARCHAR(50),
  avgrating DOUBLE(5,2),
  price_low DOUBLE(6,2),
  price_high DOUBLE(6,2)
) DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci;

INSERT INTO wines(variety,country,avgrating,price_low,price_high) VALUES ('White Blend', 'Italy', 87.00, 10.00, 12.00);
INSERT INTO wines(variety,country,avgrating,price_low,price_high) VALUES('Portuguese Red', 'Portugal', 87.00, 15.00, 15.00);
INSERT INTO wines(variety,country,avgrating,price_low,price_high) VALUES('Pinot Gris', 'US', 87.33, 14.00, 27.00);


