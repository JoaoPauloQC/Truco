package Match;

import Cards.CardsService;
import Hand.MyHand;
import Hand.MyHandServices;
import Round.Round;
import Table.Table;
import User.User;
import User.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Match {
    Scanner scan = new Scanner(System.in);
    private User user1;
    private User user2;
    public List<User> usersinmatch = new ArrayList<>();
    CardsService cardsService = new CardsService();
    MyHandServices myHandServices = new MyHandServices();
    UserService userService = new UserService();
    public int user1points;
    public int user2points;
    public int miniuser1points;
    public int miniuser2points;

    public Match( User user1, User user2){
        this.user1 = user1;
        this.user2 = user2;
        usersinmatch.add(user1);
        usersinmatch.add(user2);


    }

    public void Start(){
        int turn = 0;
        while((user1.getPoints() < 12) && (user2.getPoints() < 12)){
            showpoints();
            myHandServices.removeallhands();
            for (User user : usersinmatch){
                MyHand myHand = new MyHand(user);
                myHand.addcards();
                myHandServices.addhandlist(myHand);
            }
            Round round = new Round(cardsService.getRandomCard());
            Table table = new Table();
            round.setManilha();
            int time = 0;
            turn = 0;
            while(true){

                table.getTablecards();
                System.out.println( "User "  + (turn+1) + " Choose your option");
                System.out.println(myHandServices.handsList.get(turn).hand.stream().map(c -> c.getName()).collect(Collectors.toList()));
                int choice = scan.nextInt();

                dropcard(choice, table, turn);

                table.getTablecards();
                System.out.println("A manilha é" + round.getManilha());
                System.out.println("A Carta inicial é" + round.getStartcard());
                if (calculateminipoints(turn,table)){
                    System.out.println("Gonna break");
                    addPointsReset();
                    showMiniPoints();
                    break;
                }
                myHandServices.handsList.get(turn).printHand();
                if (turn ==1){
                    turn = 0;
                    time += 1;
                }
                else{
                    turn =1;
                }
            }
        }



    }
    public void dropcard(int number, Table table , int turn){
        System.out.println("On drop card");
        table.addCardOnTable(myHandServices.handsList.get(turn).hand.get(number));
        myHandServices.handsList.get(turn).dropcard(myHandServices.handsList.get(turn).hand.get(number));

    }


    public void options(int time, Round round, User user){
        if( time == 1) {
            System.out.println("------");
            System.out.println("1 - TRUCO!");
            System.out.println("2 - Continue");
            int choice = scan.nextInt();
            afterchoice(time, choice, round, user);
        }
        else if(time == 2){
            System.out.println("------");
            System.out.println("1 - 6");
            System.out.println("2 - Drop");
            System.out.println("3 - Surrender");

            int choice = scan.nextInt();
            afterchoice(time,choice, round, user);
        }
    }

    public void afterchoice(int time , int choice, Round round, User user){

        if(choice == 1 ){
            round.setValue(choice*time);
        }
        else if (choice == 3){
            round.setWinner(user);
        }



    }

    public boolean calculateminipoints(int turn, Table table ){
        System.out.println("On calculate");
        table.getTablecards();
        if(turn == 1){
            if(table.getTablecards().get(table.getTablecards().size()-2).getValue() > table.getTablecards().get(table.getTablecards().size()-1).getValue()){
                miniuser1points += 1;
            }
            else if(table.getTablecards().get(table.getTablecards().size()-1).getValue() > table.getTablecards().get(table.getTablecards().size()-2).getValue()){
                miniuser2points += 1;
            }
        }

        if(miniuser1points == 2 || miniuser2points == 2){

            return true;
        }
        return false;
    }

    public void showMiniPoints(){
        System.out.println("User 1 round points: "+ miniuser1points);
        System.out.println("User 2 round points: "+ miniuser2points);
    }
    
    
    public void addPointsReset(){
        if (miniuser1points == 2){
            user1points += 1;
        } else if (miniuser2points == 2) {
            user2points += 1;
        }
        miniuser1points = 0;
        miniuser2points =0;
    }
    
    public void showpoints(){
        System.out.println("User1 points: "+ user1points);
        System.out.println("User2 points: "+ user2points);
    }



}
