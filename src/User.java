import java.util.Date;

public class User {

    int UserId;
    int Name;
    int noOfWins;
    int noOfGames;
    Date dateJoined;

    public User(int userId, int name, int noOfWins, int noOfGames, Date dateJoined) {
        UserId = userId;
        Name = name;
        this.noOfWins = noOfWins;
        this.noOfGames = noOfGames;
        this.dateJoined = dateJoined;
    }

    public Date getDateJoined() {
        return dateJoined;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public int getName() {
        return Name;
    }

    public void setName(int name) {
        Name = name;
    }

    public int getNoOfWins() {
        return noOfWins;
    }

    public void setNoOfWins(int noOfWins) {
        this.noOfWins = noOfWins;
    }

    public int getNoOfGames() {
        return noOfGames;
    }

    public void setNoOfGames(int noOfGames) {
        this.noOfGames = noOfGames;
    }
}
