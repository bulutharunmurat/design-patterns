package factory_method;

public class BudgetKnifeStore extends KnifeStore{

    @Override
    Knife createKnife(String knifeType) {
        if (knifeType.equals("BudgetSteakKnife")) {
            return new BudgetSteakKnife();
        } else if (knifeType.equals("BudgetChefsKnife")) {
            return new BudgetChefsKnife();
        }
        //.. more types
        else return null;
    }
}
