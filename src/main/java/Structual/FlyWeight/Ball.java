package Structual.FlyWeight;

public class Ball
{
    private String color;
    private String image;
    private int cordX;

    public Ball(String color, String image) {
        this.color = color;
        this.image = image;
    }

    private int cordY;

    public void setCordX(int cordX) {
        this.cordX = cordX;
    }

    public void setCordY(int cordY) {
        this.cordY = cordY;
    }

    public void draw()
    {

    }
}
