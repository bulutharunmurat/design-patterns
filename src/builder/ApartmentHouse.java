package builder;

public class ApartmentHouse implements HouseBuilder{

    private House house;

    public ApartmentHouse(House house) {
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement("apartment basement");
    }

    @Override
    public void buildStructure() {
        house.setStructure("apartment structure");
    }

    @Override
    public void buildRoof() {
        house.setRoof("apartment roof");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
