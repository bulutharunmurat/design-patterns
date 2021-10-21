package composite;

import java.util.ArrayList;

public class Housing implements IStructure{

    // housing can have recursive housings
    private ArrayList<IStructure> structures;
    private String address;
    public Housing (String address) {
        this.structures = new ArrayList<IStructure>();
        this.address = address;
    }
    public int addStructure(IStructure component) {
        this.structures.add(component);
        return this.structures.size() - 1;
    }


    @Override
    public String getName() {
        return this.address;
    }

    public IStructure getStructure(int componentNumber) {
        return this.structures.get(componentNumber);
    }
    public void location() {
        System.out.println("You are currently in " + this.getName() + ". It has ");
        for (IStructure struct : this.structures)
            System.out.println(struct.getName());
    }
    /* Print out when you enter and exit the building */
    @Override
    public void enter() {
        System.out.println("You have entered the " + this.address);

    }

    @Override
    public void exit() {

    }

}
