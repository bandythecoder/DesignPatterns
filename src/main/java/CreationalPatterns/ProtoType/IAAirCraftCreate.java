package CreationalPatterns.ProtoType;

public interface IAAirCraftCreate {
    void fly();

    void setEngine(G16Engine g16Engine);

    IAAirCraftCreate Clone();

}
