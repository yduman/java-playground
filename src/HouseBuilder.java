public interface HouseBuilder {
    HouseBuilder withFoundation();
    HouseBuilder withStructure();
    HouseBuilder withRoof();
    HouseBuilder withPaint();
    HouseBuilder withFurniture();
    House build();
}
