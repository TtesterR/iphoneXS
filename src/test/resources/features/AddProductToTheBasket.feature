Feature: Add iphoneXS to the basket
  In order to look cooler
  I want to buy iphoneXS

  Scenario: Add 'iphoneXS' to the basket
    Given the user is on the Rozetka home page
    When the user looks up product "iphone XS"
    And the user click on the button search
    And the user changes the color of the phone to Space gray
    And The user adds the phone to the basket
    Then  they should see product to the basket


  Scenario: Check for directory listing
    Given the user is on the Rozetka home page
    Then logo in header is displayed
    When the user click on the "Каталог товаров"
    Then user should see ad categories
    |Ноутбуки и компьютеры|
    |Смартфоны, ТВ и электроника|
    |Бытовая техника|
    |Товары для дома|
    |Инструменты и автотовары|
    |Сантехника и ремонт|
    |Дача, сад и огород|
    |Спорт и увлечения|
    |Одежда, обувь и украшения|
    |Красота и здоровье|
    |Детские товары|
    |Канцтовары и книги|
    |Алкогольные напитки и продукты|
    |Товары для бизнеса|
    |Услуги и онлайн-сервисы|
    |Ко Дню студента до -55%|
    |Туры и отдых|
    |Все категории|
