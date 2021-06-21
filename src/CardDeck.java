import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CardDeck {
    private LinkedList<Card> cards;
    private static final String[] PATTERNS={"spade","heart","diamond","club"};
    private static final int CARD_COUNT=13;

    public CardDeck(){
        this.cards=this.generateCards();

    }
    private LinkedList<Card> generateCards(){
        LinkedList<Card> cards = new LinkedList<>();

        for(String pattern: PATTERNS){
            for(int i=1;i<=CARD_COUNT;i++){
                String denomination=this.numberToDenomination(i);
                Card card=new Card(pattern,denomination);
                cards.add(card);
            }
        }
        return cards;
    }
    public Card getCard(){
        return null;
    }
    private String numberToDenomination(int number){
        if(number==1){
            return "A";
        }else  if(number==11){
            return "J";
        }else if(number==12){
            return "Q";
        } else if (number == 13) {
            return "K";
        }
        return  String.valueOf(number);
    }

    @Override
    public String toString() {
            StringBuilder sb= new StringBuilder();

            for(Card card : cards){
                sb.append(card.toString());
                sb.append("\n");
            }
            return sb.toString();
        }
    public Card draw(){
        Card selectedCard=getRandomCard();
        cards.remove(selectedCard);
        return selectedCard;
    }

    private Card getRandomCard() {
        int size=cards.size();
        int select=(int)(Math.random()*size);
        return cards.get(select);
    }
}
