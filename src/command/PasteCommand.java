package command;

public class PasteCommand implements Command{

    private Document document;
    private Integer position;
    private String text;

    public PasteCommand(Document document, Integer position, String text) {
        this.document = document;
        this.position = position;
        this.text = text;
    }

    @Override
    public void execute() {
        document.insertText(position,text);
        position = position + text.length();
        System.out.println("New position is: " + position);
    }

    @Override
    public void unExecute() {
        position = position - text.length();
        document.deleteText(position,text.length());
    }

    @Override
    public Boolean isReversible() {
        return true;
    }
}
