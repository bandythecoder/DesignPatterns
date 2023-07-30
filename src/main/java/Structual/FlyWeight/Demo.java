package Structual.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class Demo
{
    private static Map<String,String> map = new HashMap<>();
    private static String[] colors = new String[]{"green","yellow","blue"};
    static
    {
        map.put("yellow", "abc");
        map.put("green", "xyz");
        map.put("blue","a1b1c1");
    }

    public static void main(String[] args)
    {
        for(int i =0 ; i < 10 ; i++)
        {
            String color = getColor();
            Ball ball = BallFactory.createBall(color, map.get(color));

            System.out.println(ball.hashCode());
        }
    }

    public static String getColor()
    {
        return colors[(int) (Math.random() * colors.length)];
    }
}
