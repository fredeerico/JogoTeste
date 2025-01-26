package dungeonCrawlerSimples;
import javax.swing.JFrame;
import java.awt.Graphics;
import javax.swing.Timer;

public class GameWindow extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GameWindow() {
        setTitle("Dungeon Crawler");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GameWindow();
    }

@Override
public void paint(Graphics g) {
    // Desenhar o mapa
    // Desenhar o jogador
}
}
