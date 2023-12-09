import java.util.ArrayList;

public class Box extends Item implements Container {
    private int nbItems; // No. of items in box
    private int boxNb; // Box number
    private ArrayList<Item> items; // List of items in the box: Can be SingleObject or Box

    public Box(int nbItems, int boxNb) {
        this.nbItems = nbItems;
        this.boxNb = boxNb;
        this.items = new ArrayList(nbItems);
    }

    public int getNbItems() {
        return nbItems;
    }

    public void setNbItems(int nbItems) {
        this.nbItems = nbItems;
    }

    public int getBoxNb() {
        return boxNb;
    }

    public void setBoxNb(int boxNb) {
        this.boxNb = boxNb;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList items) {
        this.items = items;
    }

    public Items getType() {
        return Items.BOX;
    }

    // Returns true if box has capacity to fit more items, else false
    public boolean hasSpace() {
        return (this.items.size() != this.nbItems);
    }

    // Checks if box has space and Adds item received in argument to the box, else prints error
    public void addItem(Item item) {
        if (this.hasSpace()) {
            this.items.add(item);
        } else {
            System.out.println("Box Full! Can't add more items");
        }
    }
}
