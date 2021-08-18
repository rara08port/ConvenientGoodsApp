INSERT INTO employee (id, name, age)
VALUES('1', 'Tom', 30);



INSERT INTO users (id,username,password,msg,user_img,delete_flg,login_time,created_date)
VALUES(1, 'dog','dogdog','test msg', 'uploads/puppy.jpg', 0, '2019-05-31 20:45:40', '2019-05-31 11:45:40');



INSERT INTO post (id, contents, post_img, user_id, category_id, delete_flg, created_date) 
VALUES(1, 'tanaka', 'uploads/puppy.jpg',1,1,0, '2019-06-17 02:21:20');

INSERT INTO post (id, contents, post_img, user_id, category_id, delete_flg, created_date) 
VALUES(1, 'tanaka', 'uploads/puppy.jpg',1,2,0, '2019-06-17 02:21:20');


INSERT INTO comment (id, post_id, user_id,comment, delete_flg, created_date) 
VALUES(1,1,1,'comment test',0, '2019-06-17 02:21:20');



INSERT INTO category (id, category_name) 
VALUES(1,'money');
INSERT INTO category (id, category_name) 
VALUES(2,'life');


INSERT INTO good (id, post_id, user_id,delete_flg, created_date) 
VALUES(1,1,1,0, '2019-06-17 02:21:20');



INSERT INTO favarite (id, post_id, user_id,delete_flg, created_date) 
VALUES(1,1,1,0, '2019-06-17 02:21:20');

