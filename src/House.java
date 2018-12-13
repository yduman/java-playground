public class House {
    private String foundation;
    private String structure;
    private String roof;
    private boolean isFurnished;
    private boolean isPainted;

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setFurnished(boolean furnished) {
        isFurnished = furnished;
    }

    public void setPainted(boolean painted) {
        isPainted = painted;
    }

    @Override
    public String toString() {
        return "Foundattion: " + foundation + " - Structure: " + structure + " - Roof: " + roof + " - isFurnished?: " + isFurnished + " - isPainted?: " + isPainted;
    }
}
