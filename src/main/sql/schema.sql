--初始化数据库脚本

--创建数据库
create database shuanghome;
--使用数据库
use shuanghome;

--创建文件信息表
create table file(
	file_id bigint NOT NULL AUTO_INCREMENT COMMENT '文件id',
	file_name varchar(120) NOT NULL COMMENT '文件名',
	file_type tinyint NOT NULL COMMENT '文件类型，0为文本，1为图片，2为音乐',
	file_loc varchar(256) NOT NULL COMMENT '文件路径',
	file_create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	file_changed_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
	
	PRIMARY KEY(file_id),/*主键*/
	KEY index_create_time(file_create_time)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='文件路径表';

--增加一条测试数据
insert into file(file_name,file_type,file_loc) values(
	'me',0,'static/text/me.txt'
);

insert into file(file_name,file_type,file_loc) values(
	'春风十里',2,'static/music/index/春风十里.mp3'
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






