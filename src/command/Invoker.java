package command;

public class Invoker {

    public static void main(String[] args) {
        Document document = new Document();

        String text = "Murat";
        Command pasteCommand = new PasteCommand(document, 0, text);
        pasteCommand.execute();
        System.out.println();
        if(pasteCommand.isReversible()){
            pasteCommand.unExecute();
        }
        Command pasteCommand2 = new PasteCommand(document, 0, "bulutharun");
        pasteCommand2.execute();

    }
}
