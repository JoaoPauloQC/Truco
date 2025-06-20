package User;

public class User {

    private String name;
    private int points;

    public User(String name){
        this.name = name;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}
