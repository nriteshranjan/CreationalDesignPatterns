package factory;

public class FactoryDemo {
    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        assert site != null;
        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        assert site != null;
        System.out.println(site.getPages());
    }
}
