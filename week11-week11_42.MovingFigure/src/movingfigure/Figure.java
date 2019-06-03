package movingfigure;

import java.awt.*;

public abstract class Figure {

    private int x;
    private int y;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(int dx, int xy) {
        this.x += dx;
        this.y += xy;
    }

    public abstract void draw(Graphics graphics);
}
