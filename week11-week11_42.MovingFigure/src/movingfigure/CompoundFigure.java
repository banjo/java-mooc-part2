package movingfigure;

import java.awt.*;
import java.util.ArrayList;

public class CompoundFigure extends Figure {

    private ArrayList<Figure> figures;

    public CompoundFigure() {
        super(0,0);
        this.figures = new ArrayList<Figure>();
    }

    public void add(Figure figure) {
        this.figures.add(figure);
    }

    @Override
    public void draw(Graphics graphics) {
        for (Figure figure : figures) {
            figure.draw(graphics);
        }

    }

    @Override
    public void move(int dx, int xy) {
        for (Figure figure : figures) {
            figure.move(dx, xy);
        }
    }
}
