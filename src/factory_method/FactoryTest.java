package factory_method;

public class FactoryTest {
    public static void main(String[] args) {

    BudgetKnifeStore budgetKnifeStore = new BudgetKnifeStore();
    budgetKnifeStore.orderKnife("BudgetSteakKnife");
    }
}
