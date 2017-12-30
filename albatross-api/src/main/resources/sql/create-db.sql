create schema if not EXISTS albatross;
use albatross;
CREATE  table if not exists company (
company_id int(11) not null primary key auto_increment,
company_name VARCHAR (100) not null
) ENGINE = Innodb;

INSERT  into company values(null, 'Test Company');