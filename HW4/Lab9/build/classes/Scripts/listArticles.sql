drop table if exists listArticles;
create table listArticles (
id integer auto_increment primary key,
title varchar(255),
excerpt varchar(8000),
category varchar(255),
timeSubmitted datetime default current_timestamp,
datepublished datetime,
content text
);

insert into listArticles (title, excerpt, category, content) values(
    "japan Declared War on floppy disk for government use ",
    "In Japan, 1,900 government procedures still require submission on floppy disk ", 
    "Biz&IT",
    "japan's newly appointed Minister of Digital Affairs, Taro Kono, had declared war on the floppy disk and other forms of obsolete media, which the government still requires as a submission medium for around 1,900 types of business application and other forms."
);

insert into listArticles (title, excerpt, category, content) values(
    "Android 13 review: Plans for the future, but not much to offer today",
    "Android 13 is a very small update but its also the second one this year", 
    "Tech", " "
);