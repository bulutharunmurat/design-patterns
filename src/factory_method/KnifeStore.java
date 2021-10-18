package factory_method;

public abstract class KnifeStore {

    public Knife orderKnife(String knifeType){
        Knife knife;

        knife = createKnife(knifeType);

        knife.sharpen();
        knife.polish();
        knife.packaged();

        return knife;
    }

    abstract Knife createKnife(String type);
}
