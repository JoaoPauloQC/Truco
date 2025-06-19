package Round;

import Cards.Card;
import Cards.CardsService;
import Table.Table;

public class Round {

    private Card manilha;
    private Card startcard;

    public CardsService cardsService = new CardsService();

    public Round(Card startcard){
        this.startcard = startcard;
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
