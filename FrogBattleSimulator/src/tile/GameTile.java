package tile;

import java.awt.*;

/**
 * Клас съдържащ конструктор и методи за визуализиране на елементи "Tile".
 *
 * @author Озан Осман
 */
public class GameTile
{
    private int row;
    private int col;
    private int tileWidth;
    private int tileHeight;

    /**
     * Конструктор на елемента "Tile".
     *
     * @param row   ред на елемента
     * @param col   колона на елемента
     */
    public GameTile(int row, int col)
    {
        this.row = row;
        this.col = col;
        this.tileWidth = 100;
        this.tileHeight = 100;
    }

    /**
     * Метод съдържащ координати и цвят на елементи "Orange Tile".
     *
     * @param g     обект на супер класа за всички графични контексти
     */
    public void renderOrangeTile(Graphics g)
    {
        int tileX = this.col * this.tileWidth;
        int tileY = this.row * this.tileHeight;

        if ((tileY == 0 && tileX == 0) || (tileY == 0 && tileX == 400) || (tileY == 400 && tileX == 100) || (tileY == 400 && tileX == 300))
        {
            g.setColor(new Color(255, 99, 71));
            g.fillRect(tileX, tileY, this.tileWidth, this.tileHeight);
            g.setColor(Color.BLACK);
            g.drawRect(tileX, tileY, this.tileWidth, this.tileHeight);
        }
    }

    /**
     * Метод съдържащ координати и цвят на елементи "Grey Tile".
     *
     * @param g     обект на супер класа за всички графични контексти
     */
    public void renderGreyTile(Graphics g)
    {
        int tileX = this.col * this.tileWidth;
        int tileY = this.row * this.tileHeight;

        if ((tileY == 0 && tileX == 100) || (tileY == 0 && tileX == 300) || (tileY == 400 && tileX == 0) || (tileY == 400 && tileX == 400))
        {
            g.setColor(new Color(68, 68, 68));
            g.fillRect(tileX, tileY, this.tileWidth, this.tileHeight);
            g.setColor(Color.BLACK);
            g.drawRect(tileX, tileY, this.tileWidth, this.tileHeight);
        }
    }

    /**
     * Метод съдържащ координати и цвят на елементи "Silver Tile".
     *
     * @param g     обект на супер класа за всички графични контексти
     */
    public void renderSilverTile(Graphics g)
    {
        int tileX = this.col * this.tileWidth;
        int tileY = this.row * this.tileHeight;

        if ((tileY == 100 && tileX == 0) || (tileY == 100 && tileX == 100) || (tileY == 100 && tileX == 300) || (tileY == 100 && tileX == 400) ||
            (tileY == 300 && tileX == 0) || (tileY == 300 && tileX == 100) || (tileY == 300 && tileX == 300) || (tileY == 300 && tileX == 400))
        {
            g.setColor(new Color(170, 170, 170));
            g.fillRect(tileX, tileY, this.tileWidth, this.tileHeight);
            g.setColor(Color.BLACK);
            g.drawRect(tileX, tileY, this.tileWidth, this.tileHeight);
        }
    }

    /**
     * Метод съдържащ координати и цвят на елементи "White Tile".
     *
     * @param g     обект на супер класа за всички графични контексти
     */
    public void renderWhiteTile(Graphics g)
    {
        int tileX = this.col * this.tileWidth;
        int tileY = this.row * this.tileHeight;

        if ((tileY == 0 && tileX == 200) ||
            (tileY == 100 && tileX == 200) ||
            (tileY == 200 && tileX == 0) || (tileY == 200 && tileX == 100) || (tileY == 200 && tileX == 200) || (tileY == 200 && tileX == 300) || (tileY == 200 && tileX == 400) ||
            (tileY == 300 && tileX == 200) ||
            (tileY == 400 && tileX == 200))
        {
            g.setColor(Color.WHITE);
            g.fillRect(tileX, tileY, this.tileWidth, this.tileHeight);
            g.setColor(Color.BLACK);
            g.drawRect(tileX, tileY, this.tileWidth, this.tileHeight);
        }
    }

    /**
     * Метод съдържащ координати и цвят на елементи "Grey Oval Tile".
     *
     * @param g     обект на супер класа за всички графични контексти
     */
    public void renderGreyOvalTile(Graphics g)
    {
        g.setColor(new Color(119, 119, 119));
        g.fillOval(225, 225, this.tileWidth - 50, this.tileHeight - 50);
        g.setColor(Color.BLACK);
        g.drawOval(225, 225, this.tileWidth - 50, this.tileHeight - 50);
    }
}
