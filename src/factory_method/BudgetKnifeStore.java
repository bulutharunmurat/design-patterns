package factory_method;

public class BudgetKnifeStore extends KnifeStore{

    @Override
    Knife createKnife(String knifeType) {
        if (knifeType.equals("steak")) {
            return new BudgetSteakKnife();
        } else if (knifeType.equals("chefs")) {
            return new BudgetChefsKnife();
        }
        //.. more types
        else return null;
    }
}
