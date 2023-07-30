package CreationalPatterns.BuilderPattern;

public class Demo
{
    public static void main(String[] args)
    {
        URLBuilder.Builder urlBuilder = new URLBuilder.Builder();
        urlBuilder.protocol("https").host("kunal.com").port("8080").pathParam("holding").queryParam("x=2");

        URL url = urlBuilder.build();

        System.out.print(url.getProtocol() + "//");
        System.out.print(url.getHost() + ":");
        System.out.print(url.getPort() + "/");
        System.out.print(url.getPathParam() + "/");
        System.out.print(url.getQueryParam());
    }
}
