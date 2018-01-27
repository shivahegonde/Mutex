package Item;

import static java.lang.Boolean.TRUE;
public class ItemAss {
    String name;
    String category;
    double newPrice;
    boolean isTaxable;
    static int gstRate=6;
    ItemAss(){
        name="";
        category="";
        newPrice=0;
        isTaxable=TRUE;
        gstRate=6;
    }
    ItemAss(String name, String category, double oldPrice) {
        this.name = name;
        this.category = category;
        //isTaxable = true;
        //gstRate = 6;
        newPrice=newPrice+oldPrice;
        System.out.println(newPrice);
    }
    ItemAss(String name, String category, double oldPrice, boolean isTaxable, int gstRate){
        this.name=name;
        this.category=category;
        this.newPrice=newPrice;
        this.isTaxable=isTaxable;
        //this.gstRate=gstRate;
    }
    ItemAss(String name, String category, double newPrice, boolean isTaxable){
        this.name=name;
        this.category=category;
        this.newPrice=newPrice;
        this.isTaxable=isTaxable;
        //gstRate=6;
    }
    /* public void total(double item_1_price,double item_2_price,double item_3_price,double item_4_price){
         double totalPrice=item_1_price+item_2_price+item_3_price+item_4_price;
         System.out.println("Total Price: "+totalPrice);
         //return total;
         double totalTax=totalPrice *(gstRate/100);
         System.out.println("Total Tax: "+totalTax);
         int grandTotal= (int) (totalPrice+totalTax);
         System.out.println("Grand Total is: "+grandTotal);
     }
     /*   public int totalTax(double totalPriceOfItems, int taxRate){
            double totalTax=totalPriceOfItems *(taxRate /100);
            System.out.println("Total Tax is: "+totalTax);


            return (int) totalTax;
        }*/
    public static void main(String args[]){


       // }
        ItemAss item=new ItemAss();

        // int tax= item1.totalTax(item1.totalPrice(item1.price,item2.price,item3.price,item4.price),6);
        //item1.grandTotal(price,tax);
    }

}
