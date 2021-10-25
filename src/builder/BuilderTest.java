package builder;

public class BuilderTest {
    public static void main(String[] args) {
        House apartmenthouse = new House();
        HouseBuilder apartment = new ApartmentHouse(apartmenthouse);

        apartment.buildBasement();
        apartment.buildStructure();
        apartment.buildRoof();

        System.out.println(apartment.getHouse());
    }
}
