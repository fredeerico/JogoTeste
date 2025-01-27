package dungeonCrawlerSimples;

public class Player {
    private int x, y;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Métodos para mover o jogador, desenhar, etc.
    public void moveUp() {
        y -= speed;
    
        if (!map.isWall(x, y - speed)) {
            y -= speed;
        }}

    // ... outros métodos de movimento
}
}
