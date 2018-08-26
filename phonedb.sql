
drop table if exists `phoneinfo`;
create table `phoneinfo` (
	`id` int(11) NOT NULL ,
	`brand` varchar(16) ,
    `name` varchar(16) ,
    `price` int(11) ,
    `date` date ,
    `stock` int(11),
     primary key (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into `phoneInfo` values(1001,'小米','note 1',2499,'2017-01-12',23);
insert into `phoneInfo` values(1002,'小米','note 2',2699,'2017-07-18',45);
insert into `phoneInfo` values(1003,'小米','note 3',2799,'2018-01-12',26);
insert into `phoneInfo` values(1004,'小米','mix 1',3099,'2018-03-24',56);
insert into `phoneInfo` values(1005,'小米','mix 2',3299,'2018-08-12',19);
insert into `phoneInfo` values(1006,'oppo','find X',4799,'2018-07-01',45);
insert into `phoneInfo` values(1007,'vivo','nex',3899,'2018-05-01',45);
insert into `phoneInfo` values(1008,'vivo','x20',3099,'2018-01-01',50);
insert into `phoneInfo` values(1009,'vivo','x21',3099,'2018-03-01',50);
insert into `phoneInfo` values(1010,'oppo','r17',2799,'2017-12-12',34);
insert into `phoneInfo` values(1011,'魅族','pro7',2099,'2017-12-21',51);
insert into `phoneInfo` values(1012,'魅族','梦想16',3199,'2018-07-12',59);
insert into `phoneInfo` values(1013,'华为','p10',3399,'2018-07-12',50);
insert into `phoneInfo` values(1014,'华为','note10',3099,'2018-06-12',19);
insert into `phoneInfo` values(1015,'华为','nove10',2799,'2018-05-12',35);
insert into `phoneInfo` values(1016,'华为','V10',3099,'2018-04-12',59);
insert into `phoneInfo` values(1017,'三星','note9',5999,'2018-07-14',62);
insert into `phoneInfo` values(1018,'三星','S10',5299,'2018-06-12',45);
insert into `phoneInfo` values(1019,'苹果','iphoneX',8999,'2017-10-12',45);
insert into `phoneInfo` values(1020,'苹果','iphone*',7999,'2017-10-12',12);
