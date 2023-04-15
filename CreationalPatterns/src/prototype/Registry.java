package prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;

        try {
            item = (items.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems() { // create basic items on first call and put them in the registry
        Movie movie = new Movie();
        movie.setTitle("Avengers 3");
        movie.setPrice(24.99);
        movie.setRuntime("2 hours");
        items.put("Movie", movie); // adding the items to our registry

        Book book = new Book();
        book.setTitle("Final Fantasy");
        book.setPrice(19.99);
        book.setNumberOfPages(500);
        items.put("Book", book); // adding the items to our registry
    }
}
