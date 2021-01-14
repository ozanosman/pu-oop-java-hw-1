package piece;

import java.awt.*;

/**
 * Клас съдържащ конструктор и методи за визуализиране на елементи "Frog Leader".
 *
 * @author Озан Осман
 */
public class FrogLeader
{
    private int row;
    private int col;
    private int frogLeaderSizeWidth;
    private int frogLeaderSizeHeight;

    /**
     * Конструктор на елемента "Frog Leader".
     *
     * @param row   ред на елемента
     * @param col   колона на елемента
     */
    public FrogLeader(int row, int col)
    {
        this.row = row;
        this.col = col;
        this.frogLeaderSizeWidth = 50;
        this.frogLeaderSizeHeight = 50;
    }

    /**
     * Метод съдържащ координати и цвят на елемент "Yellow Frog Leader".
     *
     * @param g     обект на супер класа за всички графични контексти
     */
    public void renderYellowFrogLeader(Graphics g)
    {
        g.setColor(new Color(255, 242,0));
        g.fillRect(425, 25, this.frogLeaderSizeWidth, this.frogLeaderSizeHeight);
    }

    /**
     * Метод съдържащ координати и цвят на елемент "Green Frog Leader".
     *
     * @param g     обект на супер класа за всички графични контексти
     */
    public void renderGreenFrogLeader(Graphics g)
    {
        g.setColor(new Color(34, 177,76));
        g.fillRect(25, 425, this.frogLeaderSizeWidth, this.frogLeaderSizeHeight);
    }
}
