package decorator;

public class BasicWebPage implements WebPage{

    String HTML = "HTML scripts";

    @Override
    public String display() {
        return (HTML + "Basic web page displayed");
    }
}
