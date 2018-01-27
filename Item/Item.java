package Item;

public class Item {
    String name;
    String category;
    double price;
    boolean isTaxable;
    double gstRate;
    Item(){
        name="Apple";
        category="Food";
        price=500;
        isTaxable=true;
        gstRate=6;
    }
    Item(String name,String category,double price) {
        this.name = name;
        this.category = category;
        this.price = price;
        isTaxable = true;
        gstRate = 6;
    }
    Item(String name,String category,double price,boolean isTaxable,double gstRate){
        this.name=name;
        this.category=category;
        this.price=price;
        this.isTaxable=isTaxable;
        this.gstRate=gstRate;
    }
    Item(String name,String category,double price, boolean isTaxable){
        this.name=name;
        this.category=category;
        this.price=price;
        this.isTaxable=isTaxable;
        gstRate=6;
    }
    public void total(Item item1, Item item2, Item item3, Item item4) {
        double totalPrice = item1.price + item2.price + item3.price + item4.price;
        System.out.println("Total Price: " + totalPrice);
        //return total;
        if (item1.isTaxable == true) {
            double item1Tax = item1.price * (double) ((item1.gstRate / 100));
        } else {
            double item1Tax = item1.price;
        }
        if (item2.isTaxable == true) {
            double item2Tax = item2.price * (double) ((item2.gstRate / 100));
        } else {
            System.out.println("Nothing to apply: " + item2.price);
        }
        if (item3.isTaxable == true) {
            double item3Tax = item3.price * (double) ((item3.gstRate / 100));
        } else {
            //item3.price=
        }

        double item4Tax = item4.price * (double) ((item4.gstRate / 100));
       /* System.out.println("Total Tax: "+item1Tax);
        System.out.println("Total Tax: "+item2Tax);
        System.out.println("Total Tax: "+item3Tax);
        System.out.println("Total Tax: "+item4Tax);
        double item1Total=item1.price+item1Tax;
        double item2Total=item2.price+item2Tax;
        double item3Total=item3.price+item3Tax;
        double item4Total=item4.price+item4Tax;
        double grandTotal= item1Total+item2Total+item3Total+item4Total;
        System.out.println("Grand Total is: "+grandTotal);
    }*/
    /*   public int totalTax(double totalPriceOfItems, int taxRate){
           double totalTax=totalPriceOfItems *(taxRate /100);
           System.out.println("Total Tax is: "+totalTax);


           return (int) totalTax;
       }*/
    }

    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item("Computer", "IT", 30000);
        Item item3 = new Item("Television", "Electronics", 20000, true, 10);
        Item item4 = new Item("T-shirt", "Fashion", 3000, true);
        item1.total(item1, item2, item3, item4);
        // int tax= item1.totalTax(item1.totalPrice(item1.price,item2.price,item3.price,item4.price),6);
        //item1.grandTotal(price,tax);
    }

}


