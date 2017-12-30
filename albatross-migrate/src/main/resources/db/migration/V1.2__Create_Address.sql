create table address(
  id int(11) not null PRIMARY KEY AUTO_INCREMENT,
  line_one VARCHAR(100),
  line_two VARCHAR(100),
  city VARCHAR(100),
  state VARCHAR(100),
  postal_code VARCHAR(100)
)ENGINE InnoDB;


ALTER  table company add COLUMN address_id int(11) AFTER company_name,
  add CONSTRAINT FOREIGN KEY (address_id) REFERENCES address(id);

ALTER TABLE employee ADD COLUMN address_id int(11) AFTER company_id,
  add CONSTRAINT FOREIGN KEY (address_id) REFERENCES address(id);

