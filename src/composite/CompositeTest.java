package composite;

public class CompositeTest {
    public static void main(String[] args) {

        /*
        building
            floor1
                washroom1m, washroom1w, common1
         */
        Housing building = new Housing("123 Street");
        Housing floor1 = new Housing("123 Street - First Floor");
        int firstFloor = building.addStructure(floor1);

        Room washroom1m = new Room("1F Men's Washroom");
        Room washroom1w = new Room("1F Women's Washroom");
        Room common1 = new Room("1F Common Area");

        int firstMens = floor1.addStructure(washroom1m);
        int firstWomans = floor1.addStructure(washroom1w);
        int firstCommon = floor1.addStructure(common1);

        building.enter(); // Enter the building

        Housing currentfloor = (Housing) building.getStructure(firstFloor);
        currentfloor.enter(); // Walk into the first floor

        Room currentRoom = (Room) currentfloor.getStructure(firstMens);
        currentRoom.enter(); // Walk into the men's room

        currentRoom = (Room) currentfloor.getStructure(firstCommon);
        currentRoom.enter(); // Walk into the common area

    }
}
