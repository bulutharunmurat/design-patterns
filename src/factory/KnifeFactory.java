package factory;

public class KnifeFactory {
    // can be add much more knife type without modifiying the client code
    public Knife createKnife(String knifeType){
        Knife knife = null;

        if(knifeType.equals("steak")){
            knife = new SteakKnife();
        }
        else if(knifeType.equals("chefs")){
            knife = new ChefsKnife();
        }

        return knife;
    }
}
