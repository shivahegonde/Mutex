public class ItemClass {
    double gst,price;
    String name,category;
    boolean isTaxable;
    public ItemClass(String name, String category, double price, boolean isTaxable, double gst) {
        this.name=name;
        this.category=category;
        this.price=price;
        this.isTaxable=isTaxable;
        this.gst=gst;
    }

    public ItemClass(String name, String category, double price) {
        this.name=name;
        this.category=category;
        this.price=price;
    }

    public ItemClass() {
        this.name="Iphone";
        this.category="Mobile";
        this.price=50000;
        this.isTaxable=true;
        this.gst=10;
    }

    public double getGST() {
        return price*(gst/100);
    }

    public double getPrice() {
        return price;
    }
}
