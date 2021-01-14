package game;

import tile.GameTile;
import piece.FrogLeader;
import piece.FrogGuard;

import javax.swing.*;
import java.awt.*;

/**
 * Клас наследяващ JFrame, съдържащ конструктор и методи за визуализиране на приложението.
 *
 * @author Озан Осман
 */
public class GameBoard extends JFrame
{
    /**
     * Конструктор съдържащ характеристиките за създаване на прозореца, в която се визуализира игралната дъска и неговите елементи.
     */
    public GameBoard()
    {
        // Поради някаква странна причина горните плочки не се виждат изцяло.
        this.setTitle("Frog Battle Simulator");
        this.setSize(500,500);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     * Метод съдържащ цикъл за визуализиране на игралната дъска и неговите елементи.
     *
     * @param g     обект на супер класа за всички графични контексти
     */
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);

        // Неуспях да удебеля само жабите гардове, затова удебелих всички по-малко.
        ((Graphics2D) g).setStroke(new BasicStroke(2.5f));

        for (int row = 0; row < 5; row++)
        {
            for (int col = 0; col < 5; col++)
            {
                GameTile tile = new GameTile(row, col);
                tile.renderOrangeTile(g);
                tile.renderGreyTile(g);
                tile.renderSilverTile(g);
                tile.renderWhiteTile(g);
                tile.renderGreyOvalTile(g);

                FrogLeader leader = new FrogLeader(row, col);
                leader.renderYellowFrogLeader(g);
                leader.renderGreenFrogLeader(g);

                FrogGuard guard = new FrogGuard(row, col);
                guard.renderYellowFrogGuard(g);
                guard.renderGreenFrogGuard(g);
            }
        }
    }
}
