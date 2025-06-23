import Hand.MyHand;
import Hand.MyHandServices;
import Match.Match;
import User.User;
import User.UserService;

public class Main {

    public static void main(String args[]){

        UserService userService = new UserService();
        userService.getmatchusers();
        Match match = new Match(userService.getMatchusers().get(0), userService.getMatchusers().get(1) );
        match.Start();


    }

}
