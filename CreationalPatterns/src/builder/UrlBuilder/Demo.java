package builder.UrlBuilder;

public class Demo {
    public static void main(String[] args) {
//        URL url = new URL();
//        url.setProtocol("https://");
//        url.setHostName("localhost");
//        url.setPort(":6109/");
//        url.setPathParam("homepage");
//        url.setPathParam("random");
//
//        System.out.print(url.getProtocol());
//        System.out.print(url.getHostName());
//        System.out.print(url.getPort());
//        System.out.print(url.getPathParam());

        URLBuilder.Builder builder =  new URLBuilder.Builder();
        builder.protocol("https://").hostName("newsite:").port("443");
        URLBuilder urlBuilder = builder.build();

        System.out.print(urlBuilder.protocol);
        System.out.print(urlBuilder.hostName);
        System.out.print(urlBuilder.port);
    }
}
