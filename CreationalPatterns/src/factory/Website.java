package factory;

import factory.PageType.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
    protected List<Page> pages = new ArrayList<>();

    // default no-args constructor
    public Website() {
        this.createWebsite();
    }

    public List<Page> getPages() {
        return pages;
    }

    public abstract void createWebsite(); // crux of the factory method pattern - All the concrete classes
    // that implement this base class are going to go through and override this method to generate those
}
