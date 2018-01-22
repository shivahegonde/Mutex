import java.util.*;
class InfoUsingArray{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n,i;
	
	    System.out.println("Enter No of student: ");

	n=s.nextInt();
	int rollNo[]=new int[n];
    float percentage[]=new float[n];
    String name[]=new String[n];
	inputData(s, n, rollNo, percentage, name);
	printData(n, rollNo, percentage, name);
}

	private static void inputData(Scanner s, int n, int[] rollNo, float[] percentage, String[] name) {
		int i;
		for(i=0; i<n; i++)
        {
                System.out.println("Enter Roll No: ");
            rollNo[i]=s.nextInt();
             System.out.println("Enter Name: ");
            name[i]=s.next();
                System.out.println("Enter Percentage: ");
                  percentage[i]=s.nextFloat();


        }
	}

	private static void printData(int n, int[] rollNo, float[] percentage, String[] name) {
		int i;
		for(i=0; i<n; i++)
        {
        System.out.println("Roll No: "+rollNo[i]);
            System.out.println("Name: "+name[i]);
            System.out.println("Percentage: "+percentage[i]);

         }
	}
}
