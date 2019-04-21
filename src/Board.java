public class Board {

    static final int n = 3;
    int[][] gameBoard;
    int noOfMoves;
    Move move;
    boolean gameOver;
    Game game;
    User user1;
    User user2;
    Winner winner;
    SaveGame saveGame;


    public Board(User user1, User user2){
        game = new Game(user1, user2);
        gameBoard = new int[n][n];
        noOfMoves =0;
        gameOver=false;
        this.user1 = user1;
        this.user2 = user2;
    }


    void initMove(int i, int j){
        move = new Move(i,j,getCurrentPlayer());
        makeMove(move);
    }

    int[][] getBoard(){
        return gameBoard;
    }
    void setWinner(int player){
        winner = new Winner(player == 1 ? user1:user2);
        game.setWinner(winner);
    }

    int getCurrentPlayer(){
        if(noOfMoves==0){
            return 1;
        }else
            return (getNoOfMoves()%2 == 0)?  2 : 1;
    }

    void updateNoOfMoves(){
        noOfMoves++;
    }
    int getNoOfMoves(){
        return noOfMoves;
    }

    void makeMove(Move move){

        gameBoard[move.i][move.j] = move.player.player;
        game.addMoves(move);
        updateNoOfMoves();
        gameOver = true;

        for(int i=0; i<n;i++){
            if(gameBoard[i][move.j]!=move.player.player){
                gameOver = false;
                break;
            }
            if(gameBoard[move.i][i] !=move.player.player){
                gameOver = false;
                break;
            }
            if (move.i==move.j) {
                if (gameBoard[i][i] != move.player.player) {
                    gameOver = false;
                    break;
                }
            }
            if(move.i+move.j == n-1){
                if (gameBoard[i][n-1-i] == move.player.player) {
                    gameOver = false;
                    break;
                }
            }

        }
        if(gameOver==true){
            setWinner(move.player.player);
        }else{

        }
    }
    void saveGame(){
        saveGame = new SaveGame();
        saveGame.saveCurrentGame(this);
    }

}
