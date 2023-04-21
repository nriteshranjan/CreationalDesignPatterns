package factory;

import factory.PageType.CartPage;
import factory.PageType.ItemPage;
import factory.PageType.SearchPage;

public class Shop extends Website { // the concrete implementation is concerned with how things get implemented

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
