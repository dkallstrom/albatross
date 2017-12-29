create SCHEMA albatross;
use albatross;

create table company(
  company_id int(11) not null PRIMARY KEY,
  company_name VARCHAR(200) not NULL
)ENGINE InnoDB;


create table employee(
  employee_id int(11) not null PRIMARY KEY ,
  first_name VARCHAR(30) not null,
  last_name VARCHAR(30) not null,
  company_id int(11) ,
  CONSTRAINT FOREIGN KEY (company_id) REFERENCES `company`(`company_id`)
)