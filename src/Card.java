public class Card {
    private String pattern;
    private String denomination;
    private  int point;

    public Card(String pattern,int index) {
        this.pattern = pattern;
        this.denomination = this.numberToDenomination(index);
        this.point=this.numberT0Point(index);
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
    private int numberT0Point(int number){
        if(number>=11){
            return 10;
        }

        return number;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    @Override
    public String toString() {
        return "Card{"+"pattern='"+pattern+"', denomination='"+ denomination+"'}";
    }

    public int getPoint() {
        return point;
    }
}
