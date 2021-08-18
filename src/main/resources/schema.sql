CREATE TABLE IF NOT EXISTS employee (
  id VARCHAR(50) PRIMARY KEY,
  name VARCHAR(50),
  age INT
);


CREATE TABLE  users  (
   id  int(11) NOT NULL AUTO_INCREMENT,
   username  varchar(255) NOT NULL,
   password  varchar(255) NOT NULL,
   msg  text NOT NULL,
   user_img  varchar(255) NOT NULL,
   delete_flg  tinyint(1) NOT NULL DEFAULT '0',
   login_time  datetime NOT NULL,
   created_date  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE  post  (
   id  int(11) NOT NULL AUTO_INCREMENT,
   contents  text NOT NULL,
   post_img  varchar(255) NOT NULL,
   user_id  int(11) NOT NULL,
  category_id int(11) NOT NULL,
   delete_flg  tinyint(1) NOT NULL DEFAULT '0',
   created_date  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE  comment  (
   id  int(11) NOT NULL AUTO_INCREMENT,
   post_id  int(11) NOT NULL,
   user_id  int(11) NOT NULL,
   comment  text NOT NULL,
   delete_flg  tinyint(1) NOT NULL DEFAULT '0',
   created_date  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE  category  (
   id  int(11) NOT NULL AUTO_INCREMENT,
   category_name  varchar(255) NOT NULL
);


CREATE TABLE  good  (
   id  int(11) NOT NULL AUTO_INCREMENT,
   post_id  int(11) NOT NULL,
   user_id  int(11) NOT NULL,
   delete_flg  tinyint(1) NOT NULL DEFAULT '0',
   created_date  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE  favarite  (
   id  int(11) NOT NULL AUTO_INCREMENT,
   post_id  int(11) NOT NULL,
   user_id  int(11) NOT NULL,
   delete_flg  tinyint(1) NOT NULL DEFAULT '0',
   created_date  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
);


