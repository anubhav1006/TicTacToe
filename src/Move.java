public class Move {

    int i;
    int j;
    Player player;

    public Move(int i, int j, int currentPlayer) {
        this.i = i;
        this.j =j;
        this.player.player = currentPlayer;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
