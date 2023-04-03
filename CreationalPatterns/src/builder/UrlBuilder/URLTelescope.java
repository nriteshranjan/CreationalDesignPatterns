package builder.URLTelescopeBuilder;

public class URLTelescope {
    private String protocol;
    private String hostName;
    private String port;
    private String pathParam;
    private String queryParam;

    public URLTelescope() {

    }

    public URLTelescope(String protocol) {
        this.protocol = protocol;
    }

    public URLTelescope(String protocol, String hostName) {
        this(protocol);
        this.hostName = hostName;
    }

    public URLTelescope(String protocol, String hostName, String port) {
        this(protocol, hostName);
        this.port = port;
    }

    public URLTelescope(String protocol, String hostName, String port, String pathParam) {
        this(protocol, hostName, port);
        this.pathParam = pathParam;
    }

    public URLTelescope(String protocol, String hostName, String port, String pathParam, String queryParam) {
        this(protocol, hostName, port, pathParam);
        this.queryParam = queryParam;
    }
}
