package User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UserService {

    public List<User> matchusers = new ArrayList<>();

    public List<User> users = new ArrayList<>();

    public void addUser( User user){
        users.add(user);
    }

    public void getmatchusers(){
        Scanner scan =  new Scanner(System.in);
        User user1 = new User(scan.nextLine());
        User user2 = new User(scan.nextLine());
        matchusers.add(user1);
        matchusers.add(user2);

    }

    public List<User> getMatchusers() {
        return matchusers;
    }
}
