public class ConstructionEngineer {
    private HouseBuilder builder;

    public ConstructionEngineer(HouseBuilder builder) {
        this.builder = builder;
    }

    public House constructHouse() {
        return this.builder.withFoundation().withStructure().withRoof().withPaint().withFurniture().build();
    }
}
