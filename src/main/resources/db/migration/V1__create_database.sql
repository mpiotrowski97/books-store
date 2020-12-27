create table books
(
    isbn         varchar(13)    not null
        primary key,
    author       varchar(255)   null,
    description  text           null,
    published_by varchar(255)   null,
    title        varchar(255)   null,
    category_id  varchar(36)    not null,
    price        decimal(19, 2) null,
    quantity     int            null
)
    engine = MyISAM;

create index FKleqa3hhc0uhfvurq6mil47xk0
    on books (category_id);

create table cart_items
(
    id        varchar(36)  not null
        primary key,
    book_isbn varchar(255) null,
    quantity  int          null,
    user_id   varchar(36)  null
)
    engine = MyISAM;

create table categories
(
    id   varchar(36)  not null
        primary key,
    name varchar(255) null
)
    engine = MyISAM;

create table forbidden_tokens
(
    code    varchar(36) not null
        primary key,
    user_id varchar(36) null
)
    engine = MyISAM;

create table shipping_methods
(
    id    varchar(36)    not null
        primary key,
    name  varchar(255)   null,
    price decimal(19, 2) null
)
    engine = MyISAM;

create table users
(
    id           varchar(36)  not null
        primary key,
    email        varchar(255) not null,
    enabled      bit          null,
    password     varchar(255) not null,
    roles        varchar(255) not null,
    username     varchar(255) not null,
    city         varchar(255) null,
    country      varchar(255) null,
    first_name   varchar(255) null,
    last_name    varchar(255) null,
    phone_number varchar(255) null,
    postcode     varchar(255) null,
    province     varchar(255) null,
    street       varchar(255) null,
    house_number varchar(255) null,
    constraint UK_6dotkott2kjsp8vw4d0m25fb7
        unique (email) using hash
)
    engine = MyISAM;

create table verifications
(
    code    varchar(36) not null
        primary key,
    user_id varchar(36) null
)
    engine = MyISAM;


create table order_items
(
    id        varchar(36)    not null
        primary key,
    book_isbn varchar(255)   null,
    order_id  varchar(36)    null,
    price     decimal(19, 2) null,
    quantity  int            null,
    title     varchar(255)   null,
    value     decimal(19, 2) null
)
    engine = MyISAM;

create table orders
(
    id              varchar(36)    not null
        primary key,
    city            varchar(255)   null,
    country         varchar(255)   null,
    first_name      varchar(255)   null,
    house_number    varchar(255)   null,
    last_name       varchar(255)   null,
    phone_number    varchar(255)   null,
    postcode        varchar(255)   null,
    products_cost   decimal(19, 2) null,
    province        varchar(255)   null,
    shipping_cost   decimal(19, 2) null,
    shipping_method varchar(255)   null,
    street          varchar(255)   null,
    user_id         varchar(36)    null,
    value           decimal(19, 2) null
)
    engine = MyISAM;


