import java.util.*;
class InfoMain{
    public static void main(String args[]){
	Scanner s=new Scanner(System.in);
        Info info=new Info();
	System.out.println("Enter Roll: ");
        info.rollNo=s.nextInt();
	System.out.println("Enter Name: ");
        info.name=s.next();
		System.out.println("Enter Percentage: ");
       	info.percentage=s.nextFloat();
        info.printData();
    }
}