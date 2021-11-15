package decorator;

public class BasicWebPage implements WebPage{

    public String html = "HTML scripts";
    public String styleSheet = "styleSheet";
    public String script = "script";

    @Override
    public void display() {
        System.out.println((html + "Basic web page displayed"));
    }
}
