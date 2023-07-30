package CreationalPatterns.ProtoType;

public class Demo {

    public static void main(String[] args)
    {
        IAAirCraftCreate g16 = new G16();

        var g16A = g16.Clone();
        g16A.setEngine(new G16Engine());

        System.out.println(g16);
        System.out.println(g16A);
    }
}
