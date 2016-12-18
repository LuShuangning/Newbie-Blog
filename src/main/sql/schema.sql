--初始化数据库脚本

--创建数据库
create database shuanghome;
--使用数据库
use shuanghome;

--创建文件信息表
create or replace table my_file(
	file_id bigint NOT NULL AUTO_INCREMENT COMMENT '文件id',
	file_name varchar(120) NOT NULL COMMENT '文件名',
	file_type tinyint NOT NULL COMMENT '文件类型，0为文本，1为图片，2为音乐，3为其他',
	file_loc varchar(256) NOT NULL COMMENT '文件路径',
	file_create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	file_changed_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
	
	PRIMARY KEY(file_id),/*主键*/
	KEY index_create_time(file_create_time)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='文件路径表';

--创建图书信息表
create or replace table books(
	book_id bigint NOT NULL COMMENT '图书id',
	book_name varchar(120) NOT NULL COMMENT '书名',
	author_name varchar(30) COMMENT '作者',
	press varchar(100) COMMENT '出版社',
	category varchar(20) NOT NULL COMMENT '类别',
	
	PRIMARY KEY(book_id),
	FOREIGN KEY(book_id) REFERENCES my_file(file_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='图书信息表';

--创建软件表
create or replace table software(
	software_id bigint NOT NULL COMMENT '软件id',
	software_name varchar(120) NOT NULL COMMENT '软件名',
	download_link varchar(512) NOT NULL COMMENT '下载链接',
	remark varchar(256) COMMENT '软件说明',

	PRIMARY KEY(software_id),
	FOREIGN KEY(software_id) REFERENCES my_file(file_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='软件信息表';


--增加一条测试数据
insert into my_file(file_name,file_type,file_loc) values(
	'me',0,'src/main/webapp/static/text/me.txt'
);

insert into my_file(file_name,file_type,file_loc) values(
	'春风十里',2,'src/main/webapp/static/music/index/春风十里.mp3'
);





--创建用户信息表
create table uinfo(
	user_id bigint NOT NULL AUTO_INCREMENT COMMENT '用户id',
	user_nack_name varchar(20) NOT NULL COMMENT UNIQUE '用户昵称',
	user_sex tinyint NOT NULL COMMENT '性别，0为男，1为女',
	user_email varchar(30) NOT NULL COMMENT '用户email',
	user_create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAME COMMENT '用户创建时间',
	
	PRIMARY KEY(user_id,user_email) /*联合主键*/
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表';






