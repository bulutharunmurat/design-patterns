package command;



/*
    The command pattern encapsulates a request as an object of its own.
    An invoker is therefore an object that invokes the command objects to complete whatever task it is supposed to do
    A command manager can also be used which basically keeps track of the commands, manipulates them, and invokes them.

    Objectives:
    1. Store and schedule different req.
    2. They can also be placed onto a queue so that different commands can be scheduled to be completed at different times
 */
public interface Command {

    void execute();
    void unExecute();
    Boolean isReversible();

}
