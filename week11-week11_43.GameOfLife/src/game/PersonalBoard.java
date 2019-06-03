package game;

import gameoflife.GameOfLifeBoard;

import java.awt.*;
import java.util.Random;

public class PersonalBoard extends GameOfLifeBoard {


    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double v) {

        for (int i = 0; i < super.getWidth(); i++) {
            for (int j = 0; j < super.getHeight(); j++) {

                if (getLifeStatus(v)) {
                    getBoard()[i][j] = true;
                } else {
                    getBoard()[i][j] = false;
                }

            }

        }
    }

    private boolean getLifeStatus(double v) {
        if (new Random().nextDouble() <= v) {
            return true;
        }
        return false;

    }

    @Override
    public boolean isAlive(int x, int y) {
        try {
            if (getBoard()[x][y]) {
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }

    }

    @Override
    public void turnToLiving(int x, int y) {
        if (isWithinBounds(x, y)) {
            getBoard()[x][y] = true;
        }

    }

    private boolean isWithinBounds(int x, int y) {
        try {
            boolean test = getBoard()[x][y];
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    @Override
    public void turnToDead(int x, int y) {
        if (isWithinBounds(x, y)) {
            getBoard()[x][y] = false;
        }

    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int aliveNeighbours = 0;

        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (isAlive(i, j)) {
                    aliveNeighbours++;
                }
            }
        }

        // remove middle cell if alive
        if (getBoard()[x][y] == true) {
            aliveNeighbours--;
        }

        return aliveNeighbours;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {
        // if dead
        if (getBoard()[x][y] == false) {
            if (livingNeighbours == 3) {
                getBoard()[x][y] = true;
            }
        }

        if (livingNeighbours < 2) {
            getBoard()[x][y] = false;
        } else if (isAlive(x,y) && (livingNeighbours == 2 || livingNeighbours == 3)) {
            getBoard()[x][y] = true;
        } else if (livingNeighbours > 3) {
            getBoard()[x][y] = false;
        }
    }
}
