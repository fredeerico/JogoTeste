package dungeonCrawlerSimples;


public class Map {
    private int[][] tiles; // Matriz para representar as tiles do mapa

    public Map() {
        // Inicializa a matriz com os tipos de tiles (parede, chão, etc.)
    }

 
    // Métodos para desenhar o mapa, verificar colisões, etc.
    
        public boolean isWall(int x, int y) {
            // Verifica se a posição (x, y) corresponde a uma parede
            return tiles[x][y] == TILE_WALL;
        }
    
}