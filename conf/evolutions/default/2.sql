# --- Sample dataset

# --- !Ups

insert into users (email,password,first_name,last_name,address_1,address_2,city,state,zip_code,cell_phone,home_phone,role) values ('tonywdzyj@gmail.com','abcd','Tony','Zhang','8866 Glenwood CT','','Overland Park','KS','66212','315-413-1015','','8.0.0');

insert into users (email,password,first_name,last_name,address_1,address_2,city,state,zip_code,cell_phone,home_phone,role) values ('someone@gmail.com','123123','David','Jiang','143 Rickey Blvd','Apt 331','Bear','DE','19701','123-456-7890','','8.0.1');

insert into users (email,password,first_name,last_name,address_1,address_2,city,state,zip_code,cell_phone,home_phone,role) values ('yzhang21@stevens.edu','1234','Xi','Yan','900 Davidson Rd','Apt 87','Pittscattaway','NJ','08854','201-616-8828','','9.0.0');

insert into payment ( id, cc_name, cc_number, cc_address_1, cc_address_2, cc_city, cc_state, cc_zip_code, users_email) values (1, 'ER BI', '4888937020831501', 'BANK OF AMERICA', 'P.O. BOX 15019', 'WILMINGTON', 'DE', '19886-5019','tonywdzyj@gmail.com');

insert into orders (id, item_name, buy_dt, deliver_dt, unit_price, quantity, item_source, note, tracking_number, post_dt, users_email) values (1, 'Dell 5125slv', parsedatetime('03-05-2014', 'MM-dd-yyyy'), parsedatetime('03-05-2014', 'MM-dd-yyyy'), '500', 39, 'Ebay', '', '', parsedatetime('03-05-2014 18:47:52.69', 'MM-dd-yyyy hh:mm:ss.SS'), 'tonywdzyj@gmail.com');
insert into orders (id, item_name, buy_dt, deliver_dt, unit_price, quantity, item_source, note, tracking_number, post_dt, users_email) values (2, 'Dell 5098slv', parsedatetime('01-05-2014', 'MM-dd-yyyy'), parsedatetime('01-05-2014', 'MM-dd-yyyy'), '500', 8, 'TigerDirect', '', '', parsedatetime('01-05-2014 18:47:52.69', 'MM-dd-yyyy hh:mm:ss.SS'), 'tonywdzyj@gmail.com');
insert into orders (id, item_name, buy_dt, deliver_dt, unit_price, quantity, item_source, note, tracking_number, post_dt, users_email) values (3, 'Dell 5098slv', parsedatetime('01-04-2014', 'MM-dd-yyyy'), parsedatetime('01-04-2014', 'MM-dd-yyyy'), '500', 11, 'TigerDirect', '', '', parsedatetime('01-04-2014 15:47:52.69', 'MM-dd-yyyy hh:mm:ss.SS'), 'someone@gmail.com');
# --- !Downs


