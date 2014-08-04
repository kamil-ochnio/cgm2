CREATE TABLE IF NOT EXISTS EodDictionaries (
  id INT NOT NULL,
  name varchar(255) NOT NULL,
  slug varchar(255) NOT NULL,
  rwaFlag INT
);

CREATE TABLE IF NOT EXISTS EodDictionary (
  id INT NOT NULL,
  idEodDictionaries INT NOT NULL,
  name varchar(255) NOT NULL,
  slug varchar(255) NOT NULL,
  description varchar(255),
  rwa varchar(255)
);