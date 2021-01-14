package piece;

import java.awt.*;

/**
 * Клас съдържащ конструктор и методи за визуализиране на елементи "Frog Guard".
 *
 * @author Озан Осман
 */
public class FrogGuard
{
    private int row;
    private int col;
    private int frogGuardSizeWidth;
    private int frogGuardSizeHeight;

    /**
     * Конструктор на елемента "Frog Guard".
     *
     * @param row   ред на елемента
     * @param col   колона на елемента
     */
    public FrogGuard(int row, int col)
    {
        this.row = row;
        this.col = col;
        this.frogGuardSizeWidth = 50;
        this.frogGuardSizeHeight = 50;
    }

    /**
     * Метод съдържащ цикъл с координати за визуализиране и цвят на елементи "Yellow Frog Guard".
     *
     * @param g     обект на супер класа за всички графични контексти
     */
    public void renderYellowFrogGuard(Graphics g)
    {
        for (int row = 25; row <= 325; row += 100)
        {
            for (int col = 25; col <= 25; col += 100)
            {
                g.setColor(new Color(255, 242,0));
                g.fillOval(row, col, this.frogGuardSizeWidth, this.frogGuardSizeHeight);
                g.setColor(new Color(34, 177,76));
                g.drawOval(row, col, this.frogGuardSizeWidth, this.frogGuardSizeHeight);
            }
        }
    }

    /**
     * Метод съдържащ цикъл с координати за визуализиране и цвят на елементи "Green Frog Guard".
     *
     * @param g     обект на супер класа за всички графични контексти
     */
    public void renderGreenFrogGuard(Graphics g)
    {
        for (int row = 125; row <= 425; row += 100)
        {
            for (int col = 425; col <= 425; col += 100)
            {
                g.setColor(new Color(34, 177,76));
                g.fillOval(row, col, this.frogGuardSizeWidth, this.frogGuardSizeHeight);
                g.setColor(new Color(255, 242,0));
                g.drawOval(row, col, this.frogGuardSizeWidth, this.frogGuardSizeHeight);
            }
        }
    }
}
