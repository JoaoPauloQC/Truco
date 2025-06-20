package Table;

import Cards.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Table {





    List<Card> tablecards = new ArrayList<>();

    public void addCardOnTable(Card card){
        tablecards.add(card);
    }

    public void showTable(){
        System.out.println(tablecards);
    }

    public List<Card> getTablecards() {
        System.out.println(tablecards.stream().map(c -> c.getName()).collect(Collectors.toList()));
        return tablecards;
    }
}
