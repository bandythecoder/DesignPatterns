package Structual.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class BallFactory {
    private static Map<String, Ball> ballMap = new HashMap<>();

    public static Ball createBall(String color, String url)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(color);
        sb.append(url);
        String key = sb.toString();

        if(ballMap.containsKey(key))
        {
            return ballMap.get(key);
        }
        Ball ball = new Ball(color, url);
        ballMap.put(key, ball);
        return ball;
    }

}
