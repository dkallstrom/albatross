


create table company(
  id int(11) not null PRIMARY KEY AUTO_INCREMENT,
  company_name VARCHAR(200) not NULL
)ENGINE InnoDB;


create table employee(
  id int(11) not null PRIMARY KEY AUTO_INCREMENT,
  first_name VARCHAR(30) not null,
  last_name VARCHAR(30) not null,
  company_id int(11),
  CONSTRAINT FOREIGN KEY (company_id) REFERENCES `company`(`id`)
);

INSERT into company values(null, 'My First Company');
insert into employee values(null, 'First Name', 'Last Name', LAST_INSERT_ID());