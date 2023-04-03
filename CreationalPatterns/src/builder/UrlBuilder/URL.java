package builder.UrlBuilder;

public class URL {
    private String protocol;
    private String hostName;
    private String port;
    private String pathParam;
    private String queryParam;

    public URL() {

    }

    public URL(String protocol) {
        this.protocol = protocol;
    }

    public URL(String protocol, String hostName) {
        this.protocol = protocol;
        this.hostName = hostName;
    }

    public URL(String protocol, String hostName, String port) {
        this.protocol = protocol;
        this.hostName = hostName;
        this.port = port;
    }

    public URL(String protocol, String hostName, String port, String pathParam) {
        this.protocol = protocol;
        this.hostName = hostName;
        this.port = port;
        this.pathParam = pathParam;
    }

    public URL(String protocol, String hostName, String port, String pathParam, String queryParam) {
        this.protocol = protocol;
        this.hostName = hostName;
        this.port = port;
        this.pathParam = pathParam;
        this.queryParam = queryParam;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPathParam() {
        return pathParam;
    }

    public void setPathParam(String pathParam) {
        this.pathParam = pathParam;
    }

    public String getQueryParam() {
        return queryParam;
    }

    public void setQueryParam(String queryParam) {
        this.queryParam = queryParam;
    }
}
