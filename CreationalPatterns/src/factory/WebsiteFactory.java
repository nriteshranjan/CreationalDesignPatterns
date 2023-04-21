package factory;

public class WebsiteFactory {

    // this is where the factory method really steps into play here
    // because we have those concrete implementations, we want those
    // to be concerned with how they're created not this base class,
    // but we don't want clients to access those concrete classes on their own
    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG  -> {
                return new Blog();
            }
            case SHOP -> {
                return new Shop();
            }
            default -> {
                return null;
            }
        }
    }
}
