
/*punto 1 sql  hacer tablas */
CREATE TABLE languages(
    id INT PRIMARY KEY IDENTITY (1, 1),
    name VARCHAR (50) NOT NULL

);

CREATE TABLE countries (
    id INT PRIMARY KEY IDENTITY (1, 1),
    name VARCHAR (50) NOT NULL,
    capital VARCHAR (50) NOT NULL,
    population INT NOT NULL,
    languagesID INT NOT NULL,
    FOREIGN KEY (   languagesID)  REFERENCES pruebas.languages (id)
);

/*punto 2  sql  insertar reg en las dos tablas */

INSERT INTO  dbo.countries 
(name,capital,population,languagesID)
values
('España',	'Madrid',	500000,	2),
('Mexico',	'CDMX',	260000,	2),
('United kindom',	'London',	800000,	2);


INSERT INTO dbo.languages
(name)
values
('ingles'),('español');


/*punto 3 sql  update a registro 1 */
UPDATE dbo.countries
SET population = 250000
WHERE id = 1

/*punto 4 sql  borrar registros con mas de 100000 */
delete from  dbo.countries where population > 100000

/*punto 5 sql  join de ambas tablas */
select con.name as contry, lan.name as language from  dbo.countries as con
left join dbo.languages as lan  on con.LanguagesID = lan.id


/*punto 6 sql   agrupar por lenguajes */
select  lan.name as language  , count(con.id ) as contries
from  dbo.countries as con
left join dbo.languages as lan  on con.LanguagesID = lan.id
group by lan.name


/*punto 7 sql  store procedures */
CREATE PROCEDURE InsCountries(@nam AS varchar(50),@cap as varchar(50),@pop as int,@idlang as int)
AS
BEGIN
   INSERT INTO 
    dbo.countries (name, capital, population, languagesID) 
    values
    (@nam,@cap,@pop,@idlang)
END;


CREATE PROCEDURE UpCountries(@id as int,@nam AS varchar(50),@cap as varchar(50),@pop as int,@idlang as int)
AS
BEGIN
  
UPDATE dbo.countries
SET 
    name = @nam,
    capital = @cap,
    population = @pop,
    languagesID = @idlang
WHERE 
    id = @id

END;

CREATE PROCEDURE DelCountries(@id as int)
AS
BEGIN
  
Delete from dbo.countries
WHERE id = @id
    
END;

CREATE PROCEDURE AllCountries
AS
BEGIN

select * from countries

END;



/* ejecucion de los anteriores store procedures */
exec dbo.InsCountries 'prueba','pruebacap',300000,1;

exec  AllCountries;

exec DelCountries 7;

exec UpCountries 8,'United kindom','London',800000,2;

