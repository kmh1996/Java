-- alt + x , alt + c
CREATE USER smart@'%' IDENTIFIED BY '12345';

DROP USER smart@'%';

GRANT ALL PRIVILEGES ON *.* TO smart@'%' 
WITH GRANT OPTION;

REVOKE ALL PRIVILEGES ON *.* FROM smart@'%';

SHOW GRANTS FOR smart@'%';

flush PRIVILEGES;






