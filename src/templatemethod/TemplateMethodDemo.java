package templatemethod;

public class TemplateMethodDemo {

    public static void main(String[] args) {

        System.out.println("-------------PenneAlfredo-------------");
        PenneAlfredo penneAlfredo = new PenneAlfredo();
        penneAlfredo.makeRecipe();
        System.out.println("-------------SpaghettiMeatballs-------------");
        SpaghettiMeatballs spaghettiMeatballs = new SpaghettiMeatballs();
        spaghettiMeatballs.makeRecipe();
    }

}
