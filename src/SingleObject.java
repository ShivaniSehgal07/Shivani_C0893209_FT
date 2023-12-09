public class SingleObject extends Item {
    private String name; // Item Name
    public SingleObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Items getType() {
        return Items.SINGLE_OBJECT;
    }
}
