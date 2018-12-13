public class ConcreteHouseBuilder implements HouseBuilder {
    private House house;

    public ConcreteHouseBuilder() {
        this.house = new House();
    }

    @Override
    public HouseBuilder withFoundation() {
        house.setFoundation("Concrete");
        return this;
    }

    @Override
    public HouseBuilder withStructure() {
        house.setStructure("Steel");
        return this;
    }

    @Override
    public HouseBuilder withRoof() {
        house.setRoof("Concrete & Steel");
        return this;
    }

    @Override
    public HouseBuilder withPaint() {
        house.setPainted(true);
        return this;
    }

    @Override
    public HouseBuilder withFurniture() {
        house.setFurnished(true);
        return this;
    }

    @Override
    public House build() {
        return this.house;
    }
}
