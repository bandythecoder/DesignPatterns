package BuilderPattern;

public class URL {
    private String protocol;
    private String host;
    private String port;
    private String pathParam;
    private String queryParam;

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
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

    public URL(URLBuilder.Builder urlBuilder)
    {
        this.protocol = urlBuilder.getProtocol();
        this.host = urlBuilder.getHost();
        this.port = urlBuilder.getPort();
        this.pathParam = urlBuilder.getPathParam();
        this.queryParam = urlBuilder.getQueryParam();

    }
}
