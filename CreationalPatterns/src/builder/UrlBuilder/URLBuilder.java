package builder.UrlBuilder;

public class URLBuilder {

    public static class Builder {

        // Same fields as base class
        private String protocol;
        private String hostName;
        private String port;
        private String pathParam;
        private String queryParam;

        public URLBuilder build() {
            return new URLBuilder(this);
        }

        public Builder protocol(String protocol) { // return the instance of the builder class
            this.protocol = protocol;
            return this;
        }

        public Builder hostName(String hostName) { // return the instance of the builder class
            this.hostName = hostName;
            return this;
        }

        public Builder port(String port) {
            this.port = port;
            return this;
        }

        public Builder pathParam(String pathParam) {
            this.pathParam = pathParam;
            return this;
        }

        public Builder queryParam(String queryParam) {
            this.queryParam = queryParam;
            return this;
        }
    }

    public final String protocol;
    public final  String hostName;
    public final String port;
    public final String pathParam;
    public final String queryParam;

    public URLBuilder(Builder builder) {
        this.protocol = builder.protocol;
        this.hostName = builder.hostName;
        this.port = builder.port;
        this.pathParam = builder.pathParam;
        this.queryParam = builder.queryParam;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getHostName() {
        return hostName;
    }

    public String getPort() {
        return port;
    }

    public String getPathParam() {
        return pathParam;
    }

    public String getQueryParam() {
        return queryParam;
    }
}
