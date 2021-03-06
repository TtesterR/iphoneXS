package ua.rozetka;

public interface ILocators {

    String SEARCH_FIELD = "//*[contains (text(), '')]/following::input[@type = 'text']";
    String SEARCH_CLICK = "//button[@class='button button_color_green button_size_medium search-form__submit']";
    String CLICK_ON_SPACE_GRAY = "//div[@id='image_item139623122']";
    String CLICK_ON_BASKET = "//span[@class='btn-link btn-link-green detail-buy-btn']";
    String CLICK_ON_CATEGORIES = "//button[@class='menu-toggler']";
    String CHECK_CATEGORIES = "//a[contains(@class,'menu-categories__link js-menu-categories__link')]";
}
