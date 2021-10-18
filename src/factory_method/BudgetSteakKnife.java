package factory_method;

public class BudgetSteakKnife extends Knife{

    public void sharpen(){
        System.out.println("sharpen method called for budget");
    }
    public void polish(){
        System.out.println("polish method called for budget");
    }
    public void packaged(){
        System.out.println("packaged method called for budget");
    }
}
