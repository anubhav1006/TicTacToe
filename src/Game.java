import java.util.ArrayList;
import java.util.List;

public class Game {
    int GameID;
    User user1;
    User user2;
    List<Move> moves;

    public Winner getWinner() {
        return winner;
    }

    public void setWinner(Winner winner) {
        this.winner = winner;
    }

    Winner winner;


    public Game(User user1, User user2) {
        GameID = TotalGames.TotalGame;
        this.user1 = user1;
        this.user2 = user2;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public int getGameID() {
        return GameID;
    }

    public void setGameID(int gameID) {
        GameID = gameID;
    }

    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }

    public User getUser2() {
        return user2;
    }

    public void setUser2(User user2) {
        this.user2 = user2;
    }

    void addMoves(Move move){
        moves = new ArrayList<>();
        moves.add(move);
    }
}
