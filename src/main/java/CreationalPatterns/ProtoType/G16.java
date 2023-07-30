package CreationalPatterns.ProtoType;

public class G16 implements IAAirCraftCreate {
    G16Engine engine = new G16Engine();
    @Override
    public void fly() {
        this.fly();
    }

    @Override
    public void setEngine(G16Engine g16Engine) {
      this.engine = g16Engine;
    }

    @Override
    public IAAirCraftCreate Clone() {
        return new G16();
    }
}
