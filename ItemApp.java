import java.util.Scanner;

public class ItemApp {
    public static void main(String[] args) {
        int n;
        String name,category;
        double price=0;
        double gst=0;
        boolean isTaxable;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter No of Items: ");
        n=scanner.nextInt();
        ItemClass[] items=new ItemClass[n];

        getInputs(n, gst, scanner, items);
        printDetails(n, items);

        double totalPrice=0,totalGST=0;
        for (int i=0;i<items.length;i++){
            totalGST = totalGST + items[i].getGST();
            totalPrice = totalPrice + items[i].getPrice();
        }

        System.out.println("Total GST: "+totalGST);
        System.out.println("Total Price: "+totalPrice);
        System.out.println("Grand Total: "+(totalPrice+totalGST));
    }

    private static void printDetails(int n, ItemClass[] items) {
        for (int i=0;i<n;i++){
            System.out.println("Item "+(i+1)+" Name: "+items[i].name);
            System.out.println("Item "+(i+1)+" Category: "+items[i].category);
            System.out.println("Item "+(i+1)+" Price: "+items[i].price);
            System.out.println("Item "+(i+1)+" is Taxable? : "+items[i].isTaxable);
            System.out.println("Item "+(i+1)+" GST: "+items[i].gst);
        }

    }

    private static void getInputs(int n, double gst, Scanner scanner, ItemClass[] items) {
        String name;
        String category;
        double price;
        boolean isTaxable;
        for (int i = 0; i< n; i++){
            System.out.println("Enter Item "+(i+1)+" Name: ");
            name=scanner.next();
            System.out.println("Enter Item "+(i+1)+" Category: ");
            category=scanner.next();
            System.out.println("Enter Item "+(i+1)+" Price: ");
            price=scanner.nextDouble();
            System.out.println("Enter Item "+(i+1)+" is Taxable? : ");
            isTaxable=scanner.nextBoolean();
            if (isTaxable==true) {
                System.out.println("Enter Item " + (i + 1) + " GST: ");
                gst = scanner.nextDouble();
            }
            System.out.println("Select One Of the Constructor Type: ");
            System.out.println("1. Item()");
            System.out.println("2. Item(name,category,price)");
            System.out.println("3. Item(name,category,price,isTaxable,gst)");
            int constructor = scanner.nextInt();
            switch (constructor){
                case 1: items[i]=new ItemClass();
                break;
                case 2: items[i]=new ItemClass(name,category,price);
                break;
                case 3: items[i]=new ItemClass(name,category,price,isTaxable,gst);
                break;
            }

        }
    }
}
