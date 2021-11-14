package command;

public interface Command {

    void execute();
    void unExecute();
    Boolean isReversible();

}
