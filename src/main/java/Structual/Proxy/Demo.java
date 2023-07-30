package Structual.Proxy;

public class Demo
{

    public static void main(String[] args)
    {
        DBCache db = new DBCacheProxy();
        db.getData();
    }
}

