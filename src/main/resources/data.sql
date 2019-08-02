insert into user (id, username, password, enabled)
values (1, 'user1', '$2a$10$SP0DnkydqMZsG/pj6W8HOutUzokeLMY7b1ey7AZKgD8fCl2PoTmlG' /* 123456 */, true);
insert into user (id, username, password, enabled)
values (2, 'user2', '$2a$10$SP0DnkydqMZsG/pj6W8HOutUzokeLMY7b1ey7AZKgD8fCl2PoTmlG' /* 123456 */, true);

insert into roles(id, username, role)
values (1, 'user1', 'role_user');
insert into roles(id, username, role)
values (2, 'user1', 'role_admin');
insert into roles(id, username, role)
values (3, 'user2', 'role_admin');