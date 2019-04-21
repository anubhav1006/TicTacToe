import java.util.ArrayList;
import java.util.List;

public class SaveGame {
    List<Board> boards = new ArrayList<>();

    public List<Board> getBoards() {
        return boards;
    }

    public void setBoards(List<Board> boards) {
        this.boards = boards;
    }

    void saveCurrentGame(Board board){
        boards.add(board);
    }
}
