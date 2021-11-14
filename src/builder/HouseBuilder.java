package builder;

public interface HouseBuilder {
    void buildBasement();
    void buildStructure();
    void buildRoof();
    House getHouse();
}
