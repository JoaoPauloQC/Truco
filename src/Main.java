import Hand.MyHand;
import Hand.MyHandServices;
import Match.Match;
import User.User;

public class Main {

    public static void main(String args[]){

        User joao = new User("Joao");
        User pedro = new User("Pedro");
        Match match = new Match(joao, pedro );
        match.Start();


    }

}
