package Structual.Proxy;

public class DBCacheProxy implements DBCache{

    public static DBCache dbCache;
    @Override
    public void getData()
    {
        if(dbCache == null)
        {
            dbCache = new DBCacheImpl();
        }
        dbCache.getData();
    }
}
