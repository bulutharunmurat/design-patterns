package decorator;

public class DecoratorDemo {
    public static void main(String args[]) {
        WebPage myPage = new BasicWebPage();
        myPage = new AuthorizedWebPage(myPage);
        myPage = new AuthenticatedWebPage(myPage);
        myPage.display();
    }
}
