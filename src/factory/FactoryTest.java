package factory;

public class FactoryTest {
    public static void main(String[] args) {

        KnifeFactory knifeFactory = new KnifeFactory();
        KnifeStore knifeStore = new KnifeStore(knifeFactory);

        // deals with generilazation -> coding to an interface, not an implementation
        knifeStore.orderKnife("chefs");
    }
}
