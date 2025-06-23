package Round;

import Cards.Card;
import Cards.CardsService;
import Table.Table;
import User.User;

public class Round {

    private Card manilha;
    private Card startcard;
    private int value = 1;
    public User trucado;
    public User winner;

    public User getWinner() {
        return winner;
    }

    public void setWinner(User winner) {
        this.winner = winner;
    }

    public User getTrucado() {
        return trucado;
    }

    public void setTrucado(User trucado) {
        this.trucado = trucado;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public CardsService cardsService = new CardsService();

    public Round(Card startcard){
        this.startcard = startcard;
    }

    public Card getManilha() {
        return manilha;
    }

    public Card getStartcard() {
        return startcard;
    }

    public void setManilha() {
        this.manilha = cardsService.cards.stream().filter( c -> c.getValue() == (startcard.getValue()+1) ).findFirst().get();
    }

    public void bestCard(Table table){
        Card bestcard = table.getTablecards().get(0);
        table.showTable();
        if (table.getTablecards().contains(manilha)){
            System.out.println("On progress!");
        }
        else{
            for (Card card : table.getTablecards()){
                if (card.getValue() > bestcard.getValue()){
                    bestcard = card;
                }
            }

        }

        System.out.println("The best card is:" + bestcard.getName());


    }



}
