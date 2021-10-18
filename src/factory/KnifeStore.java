package factory;

public class KnifeStore {

    public KnifeFactory knifeFactory;

    public KnifeStore(KnifeFactory knifeFactory){
        this.knifeFactory = knifeFactory;
    }

    public Knife orderKnife(String knifeType){
        Knife knife;

        knife = knifeFactory.createKnife(knifeType);

        knife.sharpen();
        knife.polish();
        knife.packaged();

        return knife;
    }
}
