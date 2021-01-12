INSERT INTO users(id, email, enabled, password, roles, username)
values ('5a2349c2-2dc5-11eb-adc1-0242ac120001', 'admin@example.org', 1,
        '$2y$12$eaEnwkl1mx2SwFWBd/FrQOOwW0LlpKQ70LVcT5eeOslp.tengvQIu', 'ROLE_ADMINISTRATOR', 'admin');
INSERT INTO users(id, email, enabled, password, roles, username)
values ('5a2349c2-2dc5-11eb-adc1-0242ac120002', 'user@example.org', 1,
        '$2y$12$e.AFTgPPWXSOQ2rfwukgseWv8QnNUGzdm.FOxmHArbszHhK5boNq6 ', 'ROLE_USER', 'user');
INSERT INTO users(id, email, enabled, password, roles, username)
values ('5a2349c2-2dc5-11eb-adc1-0242ac120003', 'moderator@example.org', 1,
        '$2y$12$dAS5OlcDjCvCzFvF9YL0Te5FHldCbxl.47g4L6LLNmWS6.AW9Wrea ', 'ROLE_MODERATOR', 'moderator');

INSERT INTO categories(id, name)
VALUES ('5a2349c2-2dc5-11eb-adc1-0242ac120002', 'Fantasy'),
       ('60a2c00c-2dc5-11eb-adc1-0242ac120002', 'Adventure'),
       ('65e1cb1c-2dc5-11eb-adc1-0242ac120002', 'Romance'),
       ('6a9e5062-2dc5-11eb-adc1-0242ac120002', 'Contemporary'),
       ('70418a02-2dc5-11eb-adc1-0242ac120002', 'Dystopian'),
       ('74ad07e2-2dc5-11eb-adc1-0242ac120002', 'Mystery'),
       ('794c28d2-2dc5-11eb-adc1-0242ac120002', 'Horror'),
       ('7e5196c8-2dc5-11eb-adc1-0242ac120002', 'Thriller');


INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1636885145679', 'Theresa Reichert',
        'Quaerat architecto magni molestiae soluta ut a sint itaque fugiat occaecati quia dignissimos molestias voluptas dolorum illum pariatur quos impedit et libero consequatur facere non commodi nobis qui aut eveniet tempore consequatur ea hic nemo et cumque veritatis voluptatibus temporibus rerum pariatur sit et et dolor omnis ut labore enim',
        'Ashlee', 'Consequuntur', '794c28d2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1740944665624', 'Dion King',
        'Corrupti architecto dolorem voluptatibus et magnam nam expedita sed accusantium ut vero et animi corrupti consequatur sapiente doloremque et ratione repellendus dolores architecto vero dolores tempora ad quibusdam rem aliquid beatae explicabo nemo ea dolorum unde tempora aut quidem sunt architecto dignissimos facere ex qui accusamus aut hic labore in',
        'Americo', 'Consequatur', '65e1cb1c-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1470137014519', 'Shyann Wunsch',
        'Et esse harum ad non rerum aut voluptatem voluptatem qui ea excepturi repellendus repellendus incidunt tempora non sapiente aut ea consequatur accusamus animi asperiores molestiae molestias pariatur quibusdam harum ea iusto sequi est maiores vero aut optio dolor beatae unde eos est incidunt cum esse labore dolores est a esse',
        'Stephen', 'Id', '5a2349c2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1795654008165', 'Garnett Lockman',
        'Autem culpa vero non suscipit possimus reprehenderit et at dolor aut sunt ut quae adipisci non autem eos eum id voluptatibus debitis nulla voluptatem qui omnis ipsam quo quae non dolorem eaque doloremque atque expedita rerum aliquam impedit quisquam deserunt cumque pariatur qui culpa aliquid accusamus dignissimos saepe omnis placeat',
        'Sophia', 'Asperiores', '5a2349c2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1750167136081', 'Brionna Simonis',
        'Qui ullam nulla cum officia voluptatibus voluptatum tempore odio autem sit iusto est in qui exercitationem aut consequuntur unde odit beatae ut repellat harum impedit error voluptate aut sunt aut soluta qui odio cum laborum inventore impedit placeat ad odit accusantium ipsum distinctio natus adipisci sed unde quae est rerum',
        'Bartholome', 'Eos', '6a9e5062-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1806824302301', 'Juliana Christiansen',
        'Eaque est facere quis et ex perspiciatis non nihil similique iusto sint aliquid non ut similique non fugit doloribus et perspiciatis necessitatibus ipsam minima commodi totam tempore consequatur et ducimus minus et est praesentium reiciendis ut itaque ipsa et iusto aut voluptas reiciendis quae dolorem suscipit perspiciatis aliquam quod optio',
        'Bernita', 'Sequi', '65e1cb1c-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1280439030612', 'Colin Hoppe',
        'Quam adipisci voluptatibus illum quia sint blanditiis distinctio voluptatem quisquam mollitia voluptatem quam eos molestias itaque illum repellendus omnis magnam earum esse ut dolorem natus reiciendis velit quis facere quod aut et sit sint praesentium dolorum voluptate aut autem ut perspiciatis ut nulla nesciunt autem placeat sint a optio voluptatem',
        'Deshawn', 'Doloribus', '5a2349c2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1727319642203', 'Chaz Kub',
        'Nisi ipsa doloribus molestiae nihil natus quis sint beatae fugit esse eligendi commodi dicta nihil laudantium repellendus vel molestiae deserunt qui aut doloribus voluptatem tenetur quo error quisquam quibusdam aliquam voluptas nulla et eveniet nulla pariatur voluptate et est alias iure illo eos ducimus et est rerum repellat est sed',
        'Darion', 'Harum', '794c28d2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1390609559370', 'Kenna Harvey',
        'Sapiente quod quo repellat eveniet quisquam velit laborum mollitia quia sit et fuga qui dignissimos omnis fugiat vitae ratione sed vel quibusdam voluptas voluptatem delectus consequatur aut est molestias nostrum quasi fugiat maiores aut velit veritatis est sint eum tempora rem facilis beatae harum tempore ducimus consequuntur vel reprehenderit distinctio',
        'Seamus', 'Est', '5a2349c2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1621298572049', 'Rhiannon Yost',
        'Incidunt accusantium qui esse aperiam itaque quia aut inventore maxime minus cumque vel molestiae quasi eum tempora et porro itaque illo sed alias soluta doloribus cupiditate numquam nihil magnam soluta eveniet recusandae distinctio expedita repellendus doloremque enim molestias est velit qui tenetur laboriosam quasi officiis sapiente doloribus adipisci porro amet',
        'Francesca', 'Soluta', '74ad07e2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1066558650229', 'Jeanne Turner',
        'Accusantium est cupiditate reiciendis accusamus qui sit debitis distinctio magnam vitae et in corrupti ullam sed itaque dicta sed quis quas voluptatem et rerum ea maxime dolorum blanditiis dolorum et et voluptatem consequatur aliquam repellendus ut ex eligendi et quisquam dolorem nam distinctio laboriosam ex et earum dolor vel blanditiis',
        'Jacky', 'Distinctio', '70418a02-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1416532974923', 'Nellie Lakin',
        'Pariatur aspernatur ad enim dolores voluptas non quia sapiente dolores labore quos eos eligendi neque id dolore maiores commodi optio sint voluptatem at eum ut quaerat qui ad quos ipsum repudiandae aut accusantium quo rerum autem nesciunt officia consectetur tempora tempora et illum quod quo sit soluta nesciunt sunt inventore',
        'Zakary', 'Natus', '794c28d2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1721879883670', 'Dawson Tromp',
        'Culpa aliquid nihil et molestiae beatae sapiente et nulla reprehenderit repellat dolores sed voluptatem debitis non est fuga temporibus in ut quia qui quia asperiores harum dicta tempora reiciendis inventore ex cupiditate facere excepturi voluptatem dolor laboriosam est at ratione laboriosam unde laborum dolor eius ut fuga ea nemo fugit',
        'Arnaldo', 'Molestiae', '6a9e5062-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1211871131789', 'Marcellus Stanton',
        'Debitis voluptatem rerum dolor quae est facilis nihil voluptas ipsam excepturi molestias ab dolores nesciunt possimus non ut voluptatem suscipit culpa amet placeat similique non et eos qui qui cumque deleniti ut mollitia recusandae sapiente qui et soluta numquam odio autem officiis non voluptas reprehenderit eos in aut dolore occaecati',
        'Carley', 'In', '5a2349c2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1047718927497', 'Alisha Marvin',
        'Modi veniam et hic voluptatem odit qui ut neque in incidunt voluptatibus velit eum asperiores aut voluptas aperiam necessitatibus ratione maiores reprehenderit ea ipsam facere atque enim autem pariatur nemo dicta ut beatae ut sunt cumque voluptas quia eum fuga aliquid rerum ab eveniet voluptatem deleniti ut explicabo non asperiores',
        'Stephan', 'Excepturi', '74ad07e2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1933067882667', 'Isac Rogahn',
        'Est ipsa in neque omnis vel dignissimos quo saepe omnis consequatur aut sint ipsa provident rerum veritatis atque odio praesentium cum quaerat in vel dolorem voluptas molestias quas delectus ab ea consequatur deleniti officiis et quo ipsa deleniti odio vitae officia dolor sed et facere optio consequatur eum eligendi ratione',
        'Sheridan', 'Sunt', '794c28d2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1205436133314', 'Reinhold Bahringer',
        'Amet expedita dolor voluptatum dolores qui ut fugiat quibusdam exercitationem quia rerum iste iusto adipisci quae sunt ex eum numquam tempore non in commodi necessitatibus consequuntur quo quia perspiciatis qui explicabo error a aut vero est autem nulla quam libero aut rerum et mollitia sit eveniet consequatur in quos ea',
        'Gerard', 'Animi', '5a2349c2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1888801118127', 'Evans Corwin',
        'Rerum dicta eos quisquam natus ut est quaerat hic aut accusamus repudiandae nisi ad dolor sapiente magnam qui velit sint harum aut occaecati rerum magni saepe ipsam voluptas qui repellendus assumenda ducimus accusamus aut voluptatem corporis ipsum quia ex laborum accusantium aliquam ea blanditiis qui tempora consequatur maxime id neque',
        'Craig', 'Doloremque', '7e5196c8-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1155284076463', 'Salma Harris',
        'Voluptas quia autem ipsam ipsam sit et quia distinctio adipisci et odio odit alias culpa consectetur voluptates quos delectus dolor fuga voluptatem nesciunt iure eos quidem unde similique sit maiores sit numquam ducimus quam optio quo corrupti rerum et facere deleniti adipisci reprehenderit reiciendis est repellat quas nostrum cupiditate debitis',
        'Ward', 'Necessitatibus', '5a2349c2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1967675952008', 'Dorothy Kassulke',
        'Voluptas est ipsa ea reprehenderit quidem impedit dignissimos fugit laudantium quia quisquam voluptatem qui laudantium ullam omnis est voluptatem sint molestiae voluptatum non cumque dolores dolorum facere et non saepe dicta reiciendis rerum ad quibusdam at molestias enim voluptas aliquid reprehenderit voluptas et minus ea aspernatur iure voluptas commodi consequuntur',
        'Jamil', 'Quae', '6a9e5062-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1548997067614', 'Zackary Brown',
        'Qui dolores saepe atque et magnam facere et tenetur minus qui laborum magni iure vel quia quisquam dolores aperiam nihil aut enim quia commodi nemo molestias aspernatur reprehenderit quia minus nobis id aut sapiente dolorem at dolores ducimus nulla aperiam officia sunt neque et non culpa ut aut error dolor',
        'Ines', 'Dicta', '65e1cb1c-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1955417094753', 'Aniya Mosciski',
        'Qui ut voluptatem fuga dolores voluptatem nulla dolorem est repellat commodi est voluptates alias minus eligendi aperiam assumenda qui voluptas est modi accusantium quidem ea quos cum est exercitationem consequatur laboriosam in autem in dicta eos vitae ut aliquam atque nulla corrupti ea et earum non neque perferendis et amet',
        'Bradley', 'Et', '65e1cb1c-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1651516983519', 'Kiera Hilll',
        'Illo libero est quis consequatur debitis nesciunt molestiae iste quod sit inventore hic sunt molestiae error quidem non aut reprehenderit eos impedit perspiciatis iste quaerat est adipisci veritatis voluptatem veniam beatae minima exercitationem aperiam rerum occaecati saepe ut laboriosam consequatur ad ut et ut eius excepturi cupiditate architecto distinctio aperiam',
        'Jerald', 'Voluptatem', '60a2c00c-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1156564842444', 'Amber Huels',
        'Fugit eum similique sint minus libero alias sit ut laborum natus dolor laudantium sequi quo dolores voluptatem molestiae reiciendis repudiandae nam odio reprehenderit nulla quidem et non quo quia aut nemo laboriosam quidem molestiae ratione ducimus enim eos porro temporibus vel velit porro et nesciunt non qui beatae ea accusamus',
        'Adriana', 'Qui', '794c28d2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1307398719247', 'Edison Ortiz',
        'Similique inventore sunt fugit repellendus et qui rerum totam nobis accusantium nam quas officiis quia recusandae rerum vitae repudiandae aliquam quo magni dolores similique aut ut cupiditate voluptate dolores vero cupiditate inventore suscipit voluptate aut veniam quisquam sunt ut neque aliquid et est est ex cupiditate veritatis ratione sed et',
        'Keaton', 'Suscipit', '7e5196c8-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1945223512128', 'Flossie Jacobson',
        'Beatae ut eos perspiciatis nostrum et provident doloribus eligendi delectus sit quisquam commodi voluptas rerum dolor delectus provident veniam cumque sequi dolores ex soluta magni quos quos maxime labore architecto vero quam voluptatem id animi recusandae rerum id optio quas consequatur saepe iusto eveniet molestiae porro ut nisi mollitia sunt',
        'Lee', 'Harum', '5a2349c2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1451473254943', 'Mackenzie Schoen',
        'Magni impedit soluta deleniti qui consequatur sed fuga voluptates et quam dolores asperiores illo et nisi optio et voluptatem omnis tempora architecto molestiae aut voluptates similique est et maiores fuga ut dicta soluta suscipit non qui ut tenetur dolorem corporis blanditiis consequatur necessitatibus vitae voluptate reprehenderit sed nostrum excepturi repellat',
        'Justus', 'Aut', '60a2c00c-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1606659659417', 'Alaina Nicolas',
        'Et repellat fuga consectetur quia dolor consectetur nostrum est quam voluptatem totam eaque adipisci voluptate non id iure officiis vero rerum sit fugiat tenetur et et nemo veritatis reiciendis recusandae porro odit est non quam sed iste eveniet modi sed necessitatibus mollitia sed assumenda distinctio non reiciendis numquam omnis nihil',
        'Elisha', 'Neque', '65e1cb1c-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1706560289953', 'Helen Murazik',
        'Similique eos corrupti quidem rerum et et accusamus eum repellat ea rerum mollitia harum pariatur doloremque dignissimos similique magni velit provident quo nemo omnis blanditiis cum ut vero aliquid ipsa neque impedit ea temporibus maxime a ut ipsam a cupiditate fugit sunt tenetur occaecati accusamus cum consectetur voluptas laborum quasi',
        'Amina', 'Accusamus', '7e5196c8-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1558173272060', 'Trisha Russel',
        'Sit eos sed in quisquam quidem libero fugit nihil fuga sit excepturi non ut labore corrupti voluptatem nostrum eveniet eos quo ex consectetur possimus fugit cupiditate delectus quos mollitia suscipit iure aut aliquam minus voluptas porro architecto et dolorem adipisci vero quisquam impedit provident qui itaque ducimus enim aliquam reiciendis',
        'Chadd', 'Facere', '6a9e5062-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1108072480885', 'Kelly Hegmann',
        'Deleniti officia et et doloremque provident amet dolorem corporis voluptate neque aut quasi est consequatur asperiores possimus nihil enim architecto optio sunt dicta voluptatem sint illo in et in eaque voluptas pariatur repellendus non ad eligendi nobis eos architecto dolores et beatae reiciendis eum qui non in dolore odit nihil',
        'Frieda', 'Sit', '7e5196c8-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1682953776559', 'Ulises Buckridge',
        'Rem qui sit repellat ut qui error nulla animi velit qui blanditiis modi velit molestiae id adipisci dicta dicta facilis modi adipisci voluptatum saepe est unde dicta quam a vitae eius autem praesentium in ducimus quia quis dolorum nesciunt nihil et ab nemo deserunt consectetur alias voluptatem non perspiciatis asperiores',
        'Emmitt', 'Similique', '794c28d2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1956324064406', 'Maymie Koch',
        'Et error aut dolorem voluptas possimus itaque aut nostrum dolores temporibus libero minus sed aperiam aut dolor et iusto ducimus cum molestiae molestiae eum sapiente ut et et soluta maxime qui aut minus ratione ad neque incidunt porro dolorum incidunt id saepe molestiae nobis saepe quis sunt rem perspiciatis sequi',
        'Geovany', 'Impedit', '794c28d2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1559486928396', 'Jarrett Wyman',
        'Beatae quia et et officia sint ipsa impedit nobis consequatur repellat voluptas nostrum ea sit non assumenda quos et ex dolores rerum molestiae qui eius vel veritatis ut eum sed veritatis officiis distinctio doloremque vel omnis aut omnis consequatur et hic consequatur autem et sunt omnis et officiis numquam aliquid',
        'Otilia', 'Dolores', '794c28d2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1333002884872', 'Alice Funk',
        'Aspernatur id non ratione qui eum odio esse officia et quis dolore minima voluptatum est numquam commodi qui incidunt qui consequatur sit quia consequatur laudantium minus eos et facilis consequatur natus corrupti quas sapiente natus sunt neque facere qui quo modi id quo et voluptas est id nisi eligendi dicta',
        'Isadore', 'Maxime', '7e5196c8-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1505797296297', 'Celestine Zieme',
        'Laborum ullam porro quibusdam deserunt tenetur facilis doloremque aliquam temporibus officiis facere quidem perferendis culpa mollitia nemo nemo est odio vel est qui sit aperiam sint molestiae dolorem repudiandae dolorem aliquid possimus optio est aliquid occaecati consequatur qui magni ea velit ipsa dolorem aut voluptatum ad et voluptatem autem possimus',
        'Kole', 'Inventore', '794c28d2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1091893979115', 'Reanna Feeney',
        'Numquam sunt recusandae laborum aut voluptatibus qui eos est voluptas et aperiam eos delectus est tempore laborum odio minima dolore nisi temporibus qui in excepturi distinctio tempora ex eos eum delectus sit exercitationem aut dolorem quae libero et voluptatem quos facere et quis fugiat dignissimos assumenda qui possimus ad fugiat',
        'Rodolfo', 'Et', '65e1cb1c-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1865857676370', 'Carlie Lubowitz',
        'Aut sint vel vel optio blanditiis voluptas sit quo voluptatem minus rem voluptas repudiandae ea esse cupiditate ut ut consequuntur dolor quibusdam qui placeat corporis corrupti voluptatem ea quaerat eos dolorem similique illo quia sequi numquam eos vitae qui nobis ut saepe qui corrupti vitae reprehenderit quasi ut laboriosam quo',
        'Mozell', 'Quasi', '74ad07e2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1494554546662', 'Anibal Kuhn',
        'Ut et alias voluptate sint excepturi eum aspernatur qui ut unde possimus recusandae nulla sit quo perferendis et labore dolores porro consequuntur quas dignissimos dolore ipsum debitis aliquam quia optio vitae ut sapiente dolores consequatur repudiandae recusandae dolorem mollitia distinctio quas dolor minus non numquam qui fuga corporis a non',
        'Don', 'Voluptatem', '7e5196c8-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1210862516891', 'Manuel Mayert',
        'Est accusantium nobis id ut qui dolore facere quos voluptates tempora id eaque et excepturi tempore sequi tempora sit quasi enim eligendi ut officiis culpa sit eos impedit facere nobis aliquid illo adipisci odit aliquid veniam enim rerum est accusamus et autem et aut suscipit est eligendi veritatis quas iste',
        'Jovani', 'At', '794c28d2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1445518408436', 'Nyasia Grant',
        'Ea itaque corporis provident accusantium sit dolor vitae doloremque consequatur accusantium soluta odit nulla et temporibus autem optio ipsam est quia dolorem reiciendis ea et deleniti perferendis recusandae velit exercitationem sapiente dolorem totam nobis ut quia voluptatibus nesciunt quam eum dignissimos molestiae quo sint ipsa occaecati eum iusto odit temporibus',
        'Monique', 'Ea', '5a2349c2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1165974548086', 'Elise Crist',
        'Animi sunt ut tenetur quod perspiciatis eos debitis ipsa illum sed reprehenderit quibusdam delectus velit quaerat ea ad sunt repellendus eos et nisi molestiae quia aliquid fugiat ab impedit labore quia vel aliquam et qui qui beatae facilis praesentium facere earum suscipit et deleniti corrupti quisquam iste non soluta ut',
        'Jeremy', 'Doloribus', '794c28d2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1399201892549', 'Hershel Marks',
        'Reprehenderit et voluptas cupiditate eos non sit consequatur dolores expedita iure illo rerum est amet quos et repellat aspernatur qui ullam cupiditate autem quas qui quaerat molestiae occaecati eum velit dolores optio quae excepturi molestiae eius iste est omnis nihil ullam optio quae enim eos vel voluptates doloribus voluptas voluptas',
        'Isaiah', 'Perspiciatis', '70418a02-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1505637349794', 'Shemar Fahey',
        'Quae voluptatem impedit totam non est dignissimos quis dignissimos dolorum sed iusto nobis molestiae corrupti excepturi qui laudantium odio non mollitia voluptate dignissimos rerum deleniti autem sit incidunt praesentium dignissimos inventore qui occaecati natus et sed accusantium pariatur soluta dolor qui ut tempore porro dolor sed neque quae consequatur unde',
        'Yolanda', 'Ad', '5a2349c2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1287855073577', 'Cydney Ebert',
        'Odit nihil a enim eum sint velit ipsam voluptatem reprehenderit et ipsum modi vero accusantium nam repellat similique provident nemo recusandae et ratione corporis labore nam molestiae aut nam laborum porro mollitia laborum blanditiis eum est ut et rerum in nihil sit et enim odit placeat animi vero tenetur quia',
        'Toby', 'Incidunt', '7e5196c8-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1252172738546', 'Bernice Wiza',
        'Voluptate ut sed dolores ut neque voluptas voluptates nihil dolores nostrum quis culpa a omnis sed at qui dolorum eum nihil molestiae est quidem molestiae id velit ipsam et quia iure nisi animi culpa aut nisi et dolorem ut id ipsum et porro aut eos voluptate consequatur et nobis similique',
        'Vernice', 'Quidem', '7e5196c8-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1089718393515', 'Emmett Zemlak',
        'Dicta sed et ratione et vel quibusdam velit quaerat commodi dignissimos magnam aut temporibus sit nihil repellat nesciunt nihil dolorum non voluptas et animi omnis ratione recusandae harum suscipit amet sapiente ullam pariatur et similique eos enim corrupti ut et aut provident aspernatur quia in nostrum unde sunt labore voluptatibus',
        'Jamarcus', 'Nobis', '794c28d2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1896483633668', 'Curtis Witting',
        'Qui illo dolores quis tempora aut qui atque hic eum velit a repudiandae nisi eius quisquam nesciunt consectetur voluptatem corrupti quae suscipit a eum labore qui consequuntur in atque quo consectetur a voluptas odio dolores qui debitis qui aliquam culpa voluptatem id placeat eveniet voluptatem quisquam iure itaque veniam sed',
        'Luz', 'Est', '74ad07e2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1356188556179', 'Lucio Kozey',
        'Consequuntur voluptatum culpa et blanditiis quod repudiandae qui placeat rerum nihil magni magnam laboriosam mollitia iusto libero culpa quo aut assumenda natus inventore ipsa nam amet qui quis optio neque earum id fugiat quia quisquam esse debitis quibusdam provident impedit ratione qui quibusdam cupiditate ut omnis sunt dolores accusantium quasi',
        'Taya', 'Sed', '70418a02-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1176778475055', 'Tomasa Lindgren',
        'Aut culpa id et at optio ipsum delectus id error enim et quia qui aut est est consequatur dolores est similique laboriosam quasi dolorem maiores accusamus consequuntur adipisci porro aut illo quidem id beatae est fugiat harum et sed quis nesciunt eius minima ratione asperiores fuga sunt fuga itaque velit',
        'Nicholas', 'Nisi', '65e1cb1c-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1922622088809', 'Sterling Klein',
        'Mollitia molestias eum qui in dignissimos explicabo consequuntur ea laudantium quasi est sed et maxime dolorem eos neque quae sed qui ut earum eaque modi incidunt tempore dolorum nisi eum id iure praesentium error asperiores veritatis debitis expedita minima et repellat et recusandae sed quia accusantium voluptas et molestias voluptas',
        'Ray', 'Laboriosam', '6a9e5062-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1966787622311', 'Sean Fisher',
        'At consequuntur adipisci molestiae accusantium alias dolorum quia deserunt nulla architecto saepe impedit aut totam corrupti hic odio dolorem esse quasi et voluptates eligendi voluptas accusamus et ipsa nam dolorem voluptas distinctio nihil ex qui voluptatem pariatur voluptatem sequi officia dolorem voluptates id et eius blanditiis dolorum quia non et',
        'Wava', 'Nihil', '794c28d2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1660177429207', 'Clemens Ruecker',
        'Ea maxime hic asperiores delectus unde soluta quis et aperiam dicta blanditiis sapiente dolores velit harum fugiat excepturi consequatur qui dolore laudantium sequi eum sint voluptas commodi aut natus ducimus et eum quia reprehenderit quae non qui dolorem autem nisi animi dicta perspiciatis enim vero corporis est iure facilis qui',
        'Frankie', 'Dolor', '65e1cb1c-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1802916275803', 'Jules Herzog',
        'Quia accusamus aspernatur dolorem consequatur accusantium et ea reprehenderit delectus et dolor fuga suscipit ducimus in commodi et cupiditate qui dolores inventore aspernatur dolorem nam enim soluta et neque distinctio voluptatem ea animi eos deserunt error eum consequatur magnam cupiditate tempora fugit voluptates enim inventore similique delectus et quasi aliquid',
        'Alene', 'Maiores', '6a9e5062-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1995163968532', 'Adolphus Bashirian',
        'Nihil expedita non amet qui explicabo dolor soluta molestias minus non dignissimos velit quasi qui tempora quis aut temporibus enim qui reprehenderit ab quas quis corporis veniam voluptatem non asperiores et eligendi illum est quia voluptatem sed non illum culpa nam repellendus amet est unde eos repellat rerum ab aliquid',
        'Jon', 'Magnam', '794c28d2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1017501717433', 'Frida Hudson',
        'Sit alias nemo natus repellat doloribus illo rerum quidem neque est dolorem perferendis ad veritatis omnis temporibus eligendi commodi harum et omnis ut mollitia sapiente quis eligendi officia quaerat ea doloremque et modi voluptatem et aut quo molestias libero aut laudantium molestiae ducimus nam molestias sint omnis et praesentium est',
        'Margie', 'Ipsa', '70418a02-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1940237835749', 'Joyce Smitham',
        'Quasi quisquam nulla sed sint porro fugit porro voluptatem ex officia omnis sed dolorem distinctio harum quia nesciunt nihil molestias aut repudiandae delectus quis ratione porro ex deleniti sit omnis eum et molestiae temporibus incidunt ad nostrum exercitationem et odit quo aut et reprehenderit quia est deserunt in repellendus illo',
        'Heaven', 'Amet', '7e5196c8-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1806337904185', 'Santino Koss',
        'Est aut veritatis qui sed rerum qui consequatur architecto praesentium dolores sit magnam rerum vel facere enim quibusdam quo unde sapiente neque est dolores quibusdam nobis aliquam nostrum magnam iure fuga necessitatibus sit voluptas rerum ducimus eligendi exercitationem nisi voluptatum possimus recusandae ratione enim inventore velit mollitia voluptatem possimus occaecati',
        'Antonietta', 'Dolore', '70418a02-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1297329144086', 'Narciso Sanford',
        'Voluptate deleniti occaecati animi qui sit similique beatae omnis amet qui laborum sunt ut blanditiis aut aut sit commodi dolorem similique est laudantium sint incidunt quae maxime dolor commodi magnam est incidunt recusandae ad sunt dicta ut molestiae illum voluptas commodi illo quibusdam aliquam officia excepturi veritatis ea exercitationem odio',
        'Helene', 'Veritatis', '7e5196c8-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1167985749663', 'Augustus Schmeler',
        'Est rerum ut omnis odio dignissimos consectetur dolores libero dignissimos ipsam cum maiores voluptatum repudiandae suscipit placeat autem incidunt odio illum nemo aliquid maiores omnis est expedita velit eum rerum pariatur ducimus assumenda cum et cupiditate autem sed harum dolor et porro voluptate est enim aut rerum dolore id qui',
        'Carlee', 'Similique', '60a2c00c-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1962777072099', 'Jensen Hirthe',
        'Dolorem voluptatem itaque possimus illo perferendis cumque fugiat at sunt reprehenderit magnam inventore omnis hic mollitia qui sit sunt ab ducimus beatae ut illo et veniam assumenda est expedita voluptas est ipsum deserunt qui deleniti ullam et corporis officia consequatur est ipsa voluptatibus veritatis est dolor doloremque id fugit corporis',
        'Delphine', 'Nesciunt', '60a2c00c-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1340267508756', 'Nasir Weimann',
        'Odit molestiae dolor labore suscipit cumque delectus voluptatem deleniti ut est tempore earum vero quaerat soluta provident incidunt iusto tempore illum eum voluptates veniam similique occaecati autem quis dolor officia nisi libero in reprehenderit dolores doloremque culpa est temporibus delectus magnam consequatur ab esse eius soluta consequatur accusantium consequatur quis',
        'Austin', 'Et', '5a2349c2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1605391311459', 'Jonatan Grant',
        'Rerum quia modi facere impedit sapiente reprehenderit suscipit incidunt atque doloremque ut consequatur eveniet nostrum vel corrupti quia qui vel voluptatem ea porro aut officia deleniti voluptatem corporis blanditiis est itaque eligendi aperiam quidem dolor aut dolorem expedita aut reprehenderit dolorem est ut quidem omnis molestiae animi delectus vero ea',
        'Zoila', 'Rerum', '6a9e5062-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1661421594676', 'Arvid Rau',
        'Sed repellendus culpa ut mollitia et omnis explicabo impedit minus voluptatem qui delectus vel dolor quaerat fugit dolorem occaecati officiis odit ut omnis vel id et consequatur ab possimus quos voluptatem sit ipsam deserunt quidem omnis corporis eligendi voluptatem voluptatem ducimus aperiam distinctio enim neque velit ipsa soluta animi sint',
        'Lane', 'Perspiciatis', '5a2349c2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1060256068594', 'Margie Reichert',
        'Ipsum et et iste similique ipsa quaerat in consequatur est doloremque numquam omnis omnis est iure enim aliquam est sint consequatur perspiciatis saepe optio excepturi delectus consequatur dolorem ipsam possimus est veniam voluptatem deleniti facere sunt quo dolor et mollitia iure veritatis numquam sunt qui ratione expedita nam ut illo',
        'Davin', 'Quae', '6a9e5062-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1243622706970', 'Haleigh Sporer',
        'Dolores est expedita quia impedit accusamus odio ullam consectetur aspernatur molestias nobis quidem recusandae praesentium cumque enim qui voluptatem eum voluptate rem velit quas sed libero tempore sed sed consequuntur blanditiis officiis natus consequuntur eveniet eos sunt assumenda velit dolores autem ipsam libero hic laudantium dolores deserunt illo minus et',
        'Keagan', 'Aut', '7e5196c8-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1711549571250', 'Bessie Waters',
        'Odio iste ducimus consequatur nemo et consequatur aspernatur et sapiente nulla similique explicabo sit a quam et et cum quos eos rerum soluta natus et molestias iure dolores porro eveniet quo quis optio sit corrupti impedit voluptates minus aut accusantium impedit deserunt totam dicta culpa ab qui tenetur esse aut',
        'Forrest', 'Commodi', '5a2349c2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1646483927965', 'Nora Pfannerstill',
        'Ducimus tempore esse provident ut numquam magnam vitae quibusdam quaerat minima ut odio et ducimus repudiandae odit dolore iste corporis nostrum ipsam incidunt suscipit sed cum facere quia non modi veniam sed architecto sint ducimus velit necessitatibus fugit soluta sapiente voluptatem quibusdam alias atque omnis maxime est delectus aut aut',
        'Phoebe', 'Sit', '65e1cb1c-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1400256077992', 'Danyka Greenholt',
        'Nisi non aliquid consequatur quidem dignissimos esse eius temporibus dignissimos molestiae ad aut ipsam rem sunt sint tenetur beatae ullam quo ut tempore quia non veniam quia quas ipsum qui amet quia perspiciatis est ipsam modi aut explicabo aperiam maxime deserunt nihil sit laudantium ea occaecati fugit eveniet rerum veritatis',
        'Hertha', 'Quibusdam', '6a9e5062-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1532871153438', 'Isabella Crona',
        'Sunt ut ex rerum distinctio est commodi sint est debitis saepe ab laborum voluptatem et quae atque unde iusto beatae rerum possimus et amet non vel velit animi sunt eligendi error amet maxime animi velit natus nemo est assumenda qui doloremque autem commodi adipisci ut ut expedita ullam tempora occaecati',
        'Carissa', 'Aut', '7e5196c8-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1737951125717', 'Annie Dibbert',
        'Nulla dolore voluptatum id est sit aliquam voluptate labore et vitae rerum et optio tempora et dolorem iure excepturi accusantium illum nam velit qui quam atque deserunt est quia eveniet voluptas neque vel atque vero et aut inventore veritatis perspiciatis tempore tenetur pariatur molestias magnam id corrupti provident similique mollitia',
        'Jaden', 'Ullam', '70418a02-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1754674907308', 'Chelsie Rutherford',
        'Voluptatibus praesentium delectus aut quo fugit aut cupiditate numquam amet voluptatem soluta excepturi tenetur ut quibusdam quo laboriosam saepe et quis porro assumenda voluptatibus id necessitatibus necessitatibus et et rem doloribus voluptas omnis quod fugit cum inventore ducimus sunt sed nobis dicta quas autem consequatur omnis ut totam sed ducimus',
        'Adele', 'Sit', '60a2c00c-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1211735965917', 'Emmalee Steuber',
        'Et aliquam labore sed et reiciendis quo dolore maxime facere quo odio veniam perferendis suscipit cupiditate numquam eum et nobis sit non sed aspernatur dolorem illum veniam nesciunt dolores sint eveniet deserunt quibusdam rerum animi cupiditate dolorum consequatur porro cupiditate expedita deserunt nulla ut est veritatis hic eum reiciendis rem',
        'Jeanne', 'Asperiores', '794c28d2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1465332637541', 'Jimmie Toy',
        'Dicta non sunt sit voluptatem ad commodi dolores earum ut quo rerum facere consequatur omnis est quis consequatur officiis accusamus aut illum asperiores omnis excepturi ex est neque fuga dolores et incidunt ipsa quos assumenda et perferendis quos non quod illo est molestias voluptatum sint sed odio voluptatem aliquid minima',
        'Filiberto', 'Ad', '70418a02-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1448482324602', 'Emilia Yost',
        'Atque et iste et laborum nemo dicta deserunt maxime aut sapiente architecto voluptatibus incidunt explicabo odio et ea et ut voluptatem occaecati possimus enim eos accusamus ratione repellendus optio tempore hic quod placeat qui aperiam vitae nemo sit et dicta ut cupiditate est ut quis quia autem voluptas est distinctio',
        'Bill', 'Ipsam', '5a2349c2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1773526832229', 'Amara Keeling',
        'Et doloremque quidem voluptatem quam qui aspernatur unde cumque adipisci voluptas magni omnis sed eos reiciendis et nemo magnam non animi velit animi excepturi aut quam blanditiis veritatis maxime voluptates ea adipisci est asperiores animi quasi modi quasi quia soluta sed excepturi cumque illo recusandae deleniti quibusdam porro quae sit',
        'Aleen', 'Vel', '70418a02-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1631522821495', 'Khalil Reilly',
        'Velit officia tempore dolore enim non odio ratione et odio enim repudiandae quis temporibus vel quae et sunt facilis dolor ipsa architecto consequatur accusamus autem enim dignissimos modi delectus magnam exercitationem quod amet dolore ipsum recusandae unde eum ducimus in excepturi enim ut itaque deleniti ut eos nobis sed a',
        'Marvin', 'Facilis', '60a2c00c-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1901064649690', 'Hettie Crooks',
        'Aspernatur deleniti iusto recusandae tempora dolores iste id quo quidem est explicabo voluptate molestiae consectetur dolorem architecto nihil at sit ratione consequatur eaque aut tempore qui esse natus excepturi qui qui non repellat ut totam et minus facere eligendi eius iure rerum laborum officia veniam rem placeat qui laborum beatae',
        'Dixie', 'Quae', '5a2349c2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1129203479038', 'Ethelyn OKeefe',
        'Corporis sapiente delectus recusandae architecto expedita voluptates quis eveniet sed aut est error vero est praesentium sit ut voluptates et aut est qui qui aspernatur eaque vitae soluta id porro numquam eos voluptatum autem est omnis ipsa minima enim vitae quis eius perspiciatis enim similique inventore nihil esse non est',
        'Gene', 'Cum', '60a2c00c-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1303745022509', 'Nyah Gislason',
        'Porro explicabo iusto voluptatem totam temporibus fugit possimus officia blanditiis corrupti corrupti nostrum amet non ipsam vero necessitatibus rerum ut error quas non aut modi nulla harum qui dolores dolorem veniam illum aut nostrum facere laudantium nostrum et quod ipsam nihil consequatur quibusdam explicabo neque rerum qui voluptas aut dolorum',
        'Keyon', 'Quia', '70418a02-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1437216260470', 'Kadin Reinger',
        'Autem voluptatibus minus omnis corporis dolorem architecto vero dolorem rerum ipsum fuga rerum eligendi ipsa est error nihil et commodi ut adipisci iusto accusamus omnis repudiandae totam sint itaque pariatur veniam vitae dolorem maiores in eos omnis nihil hic sed eos delectus qui aut mollitia ut ut iusto quidem illum',
        'Rigoberto', 'Est', '5a2349c2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1533226859290', 'Selmer Hammes',
        'Nihil et dolores aliquam quo vel rerum voluptatem fugiat quaerat et in blanditiis sint quia in nulla molestias et vel consectetur vel ullam nihil laborum corporis alias et quibusdam molestiae est occaecati labore voluptatum doloribus reprehenderit dolorem quidem saepe enim error consequatur assumenda voluptas qui placeat ipsam fuga sed maiores',
        'Eva', 'Debitis', '6a9e5062-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1175699140643', 'Cordell Hauck',
        'Sunt ut amet quaerat libero non optio quia nihil aut libero ea fuga ea tenetur ab distinctio dolor sed fuga qui perferendis autem facere vel et unde quam maxime saepe expedita esse nulla delectus cupiditate nam facere facere vel est inventore veritatis dolorem distinctio non impedit ipsum voluptates est et',
        'Abdul', 'Quis', '794c28d2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1570676836418', 'Blanche Hamill',
        'Quidem occaecati voluptatem ut voluptas voluptas facere a rerum recusandae id et dolorem illo quam voluptas velit enim qui voluptas et sunt vel aut assumenda consequatur saepe et sit atque quae ab nostrum quia consequatur reiciendis itaque sapiente vero quo nemo sunt expedita eligendi quis ex tempore qui animi fugit',
        'Garrett', 'Maxime', '70418a02-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1501651206287', 'Harry Brakus',
        'Quia consectetur aut porro voluptate omnis repudiandae et ratione quo delectus qui accusamus veniam voluptatem aperiam minus ut inventore doloremque rerum voluptatem est magnam itaque numquam in consequatur nihil doloribus repellat rerum repudiandae sint alias laboriosam sunt aliquid dolorem fuga voluptatibus reprehenderit ut mollitia sint nihil non consequatur qui provident',
        'Guadalupe', 'Et', '65e1cb1c-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1016190168214', 'Julien Daniel',
        'Velit et sit ut ipsum quia voluptatem cupiditate distinctio distinctio aut ex quo saepe sapiente officiis dolorem illo qui iusto dolor necessitatibus illo sint nostrum consequuntur voluptatem omnis illo aut est qui fuga ut omnis quis quisquam molestiae nostrum voluptatem cumque tenetur qui non optio sed ex nostrum culpa eos',
        'Lavina', 'Eveniet', '74ad07e2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1516559804091', 'Shanon Schuster',
        'Assumenda consectetur quasi tenetur ullam voluptatem qui minima voluptatum nam dolorum pariatur necessitatibus non hic et velit voluptatem corrupti ut cum voluptatem dolore sapiente dicta et quam a sit eius suscipit beatae alias ratione harum velit quis sint cupiditate reiciendis minima impedit quia minima est est quisquam maiores vero blanditiis',
        'Vilma', 'Rerum', '7e5196c8-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1356581554049', 'Clemens Renner',
        'Autem ut itaque quia nihil ipsam minus eaque cumque illo quaerat sint rem architecto laborum dolores quia officia quam consequatur magni ab ut autem accusamus nemo sequi beatae exercitationem quis delectus necessitatibus debitis a eos incidunt ad illo ea numquam deleniti explicabo fuga tempore repudiandae voluptas quisquam qui qui voluptate',
        'Jerrold', 'Quis', '60a2c00c-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1263936133357', 'Caesar Littel',
        'Ut doloribus eum ratione eligendi eaque adipisci maxime rerum alias a corporis quae itaque excepturi qui cupiditate nam quasi sunt sint maiores accusamus aut in distinctio aut deleniti fugiat praesentium et dolor reiciendis reprehenderit quidem aliquid ratione autem blanditiis et aut officiis repellat accusantium debitis non minus ea animi cum',
        'Bessie', 'Mollitia', '65e1cb1c-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1056702588917', 'Tabitha Hoeger',
        'Rem ipsam aut id nihil officia non eos voluptatem eligendi laborum sunt sunt eligendi fugiat eveniet fugit fuga inventore est mollitia ab fuga reiciendis nam et et recusandae repudiandae sapiente dolorem sunt eveniet in occaecati ducimus iure fuga ducimus et vel voluptates iure omnis voluptate odit eveniet libero non magnam',
        'Scot', 'Veniam', '7e5196c8-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1624678025255', 'Marcelle Kemmer',
        'Vel maxime est in qui voluptate voluptas velit iusto consequuntur quia nisi et atque voluptatem sed et minima voluptas quo quos facilis aut quod impedit iusto consequatur recusandae et error eaque ex dolorem id dicta quis perspiciatis molestiae dicta et enim occaecati voluptatem laborum aspernatur aut dicta veniam aut et',
        'Susanna', 'Ipsum', '794c28d2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1246252898359', 'Theron Weber',
        'Sed corporis sint dolorem est ab esse cumque tempore dolorum nulla voluptatum quia quae nostrum nihil quisquam laborum suscipit quia facilis voluptatibus officiis qui voluptate deserunt quia vel ab dolorem laudantium quae et sequi repellendus eius corporis tenetur voluptatum ipsa occaecati consequatur eligendi ut aut quo iste ab ipsa dignissimos',
        'Paolo', 'Aut', '5a2349c2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1699247329496', 'Alessandro Lockman',
        'Architecto cupiditate saepe adipisci sit alias vel inventore dolorum qui at est maiores modi porro ut in voluptas veritatis excepturi quaerat iste enim alias qui aut ut ut sed et et nihil ut quis eos eveniet consequuntur molestiae totam quidem quod nisi vel veniam sint nihil laudantium ullam id itaque',
        'Delbert', 'Cupiditate', '65e1cb1c-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1589732283028', 'Wendell Wolff',
        'Soluta consequatur ab dicta est eos omnis veritatis quidem dolorem incidunt asperiores non voluptate sint quos qui quasi repellat corporis sit veritatis culpa veniam est nulla distinctio ipsa voluptatum aut dolor aperiam aut mollitia nihil quidem omnis et ratione vel aperiam est ducimus qui qui ut omnis minus quia nobis',
        'Ewell', 'Laboriosam', '7e5196c8-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1915115825832', 'Elvera Bogan',
        'Enim necessitatibus iste illo qui est culpa eum nobis nihil minus quisquam quos cupiditate sit occaecati nobis voluptas consequuntur esse voluptatibus blanditiis consequuntur ipsum saepe architecto repudiandae hic labore doloribus ut qui sed quia voluptatum tempore aut debitis et ut facere nihil possimus et et ut doloribus est dolor sed',
        'Alek', 'Totam', '70418a02-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1186842418741', 'Eva Upton',
        'Nam quae suscipit ex magni tempora libero consequuntur omnis impedit a consequatur magni deleniti enim dolorem distinctio et aliquam molestiae dolorum impedit accusamus sapiente suscipit repellat atque quia quidem quia hic non modi est qui ut perferendis et natus vitae voluptatibus est sunt autem quis ea quaerat saepe aut velit',
        'Owen', 'Iste', '794c28d2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1132203170564', 'Cassidy Ward',
        'Et nihil non illo molestiae nulla velit repellat id minus facere et aliquam sapiente consectetur excepturi itaque harum nemo praesentium et exercitationem incidunt explicabo libero iste facere tempora provident odit est quia quidem minima dolor quae dicta porro ipsa qui fugiat voluptate saepe doloremque adipisci hic in sint ut eaque',
        'Neva', 'Iusto', '6a9e5062-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1040172848850', 'Cleta Schroeder',
        'Iure maiores numquam rem atque deleniti doloribus sed et et qui corporis sed et qui magni iste et tenetur molestiae non velit minima est harum dolor assumenda sit quisquam voluptas omnis sint deleniti dolores est autem expedita et aut ea itaque eum perferendis optio aperiam in dolor quod ut iste',
        'Berta', 'Iste', '794c28d2-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1324608570197', 'Michel Mosciski',
        'Consectetur deleniti quo numquam totam at illo voluptas voluptatem eligendi illum eum hic sapiente nulla ut nobis unde voluptate totam dolorum eos quibusdam vero facere voluptatem quisquam eos quo asperiores delectus quia voluptatem dolores deserunt et placeat et molestias vel iusto impedit laborum incidunt aliquid est perferendis doloremque voluptates labore',
        'Harmony', 'Quia', '65e1cb1c-2dc5-11eb-adc1-0242ac120002', 15.50, 2);
INSERT INTO books (isbn, author, description, published_by, title, category_id, price, quantity)
VALUES ('1562767665368', 'Madonna Stanton',
        'Earum similique qui perspiciatis recusandae rerum quis velit nulla animi hic modi est similique aliquam magni qui tempore quas accusamus quia enim dolorem perspiciatis molestiae aspernatur quibusdam perferendis eligendi explicabo natus eligendi qui suscipit libero perferendis optio at est sed optio rem accusantium qui consequuntur voluptate incidunt doloremque tempora voluptatum',
        'Cordie', 'Error', '60a2c00c-2dc5-11eb-adc1-0242ac120002', 15.50, 2);

INSERT INTO shipping_methods(id, name, price)
VALUES ('5a2349c2-2dc5-11eb-adc1-0242ac120002', 'Courier', 9.99),
       ('60a2c00c-2dc5-11eb-adc1-0242ac120002', 'Post', 5.99);

