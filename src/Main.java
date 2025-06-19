import Hand.MyHand;
import Hand.MyHandServices;
import User.User;

public class Main {

    public static void main(String args[]){

        User joao = new User("Joao");



        MyHand myHand = new MyHand(joao);



        myHand.addcards();

        myHand.printHand();
    }

}
