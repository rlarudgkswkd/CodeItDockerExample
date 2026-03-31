CREATE TABLE IF NOT EXISTS tbl_menu (
        id BIGSERIAL PRIMARY KEY,
        name VARCHAR(100) NOT NULL,
        price INTEGER NOT NULL
        );

INSERT INTO tbl_menu (name, price) VALUES
        ('김치찌개', 8000),
        ('된장찌개', 7500),
        ('비빔밥', 9000),
        ('불고기', 12000);