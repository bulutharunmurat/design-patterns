package templatemethod;

public abstract class PastaDish {
    final void makeRecipe() {
        boilWater();
        addPasta();
        cookPasta();
        drainAndPlate();
        addSauce();
        addProtein();
        addGarnish();
    }
    // these methods implementation would be differ but in general structure is same
    abstract void addPasta();
    abstract void addSauce();
    abstract void addProtein();
    abstract void addGarnish();

    private void boilWater() {
        System.out.println("Boiling water");
    }
    private void cookPasta() {
        System.out.println("Cook pasta");
    }
    private void drainAndPlate() {
        System.out.println("Drain and Plate");
    }

}
