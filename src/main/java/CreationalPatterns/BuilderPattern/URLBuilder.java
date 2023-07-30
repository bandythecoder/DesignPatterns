package CreationalPatterns.BuilderPattern;

public class URLBuilder
{
    public static class Builder {
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

        private String protocol;
        private String host;
        private String port;
        private String pathParam;
        private String queryParam;

        public Builder protocol(String value) {
            this.protocol = value;
            return this;
        }

        public Builder queryParam(String value) {
            this.queryParam = value;
            return this;
        }

        public Builder port(String value) {
            this.port = value;
            return this;
        }

        public Builder host(String value) {
            this.host = value;
            return this;
        }

        public Builder pathParam(String value) {
            this.pathParam = value;
            return this;
        }

        public URL build() {
            return new URL(this);
        }
    }
}
