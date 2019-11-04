DROP TABLE IF EXISTS pianos;
 
CREATE TABLE pianos (
  pianoId INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  text VARCHAR(100) NOT NULL,
  model VARCHAR(25) DEFAULT NULL
);
 
INSERT INTO pianos (name, text, model) VALUES
  ('Steingraeber & Söhne', 'German mellow tune', '138 K'),
  ('Steingraeber & Söhne', 'German mellow tune', '130 T'),
  ('Steingraeber & Söhne', 'German mellow tune', '122 T'),
  ('Steinway & Sons', 'German mellow tune', 'K-52'),
  ('Steinway & Sons', 'German mellow tune', 'Model 1098'),
  ('Bösendorfer', 'Austrian mellow tune', 'Grand Upright 120'),
  ('Bösendorfer', 'Austrian mellow tune', 'Grand Upright 130')
  ;