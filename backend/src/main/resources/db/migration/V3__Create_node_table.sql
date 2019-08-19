create table T_TREE
(
  t_id      VARCHAR2(10) primary key,
  text      NVARCHAR2(10),
  leaf      CHAR(1),
  parent_id VARCHAR2(10)
)