package command;

public class Document {


    public void insertText(Integer position, String item) {
        System.out.println("New " + item + " inserted to position: " + position);
    }

    public void deleteText(Integer position, Integer textLength) {
        System.out.println("Position change by " + textLength + " New position is " + position);
    }

}
