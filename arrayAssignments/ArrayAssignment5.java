package arrayAssignments;

public class ArrayAssignment5 {
    public static void main(String[] args) {
        int a[]={1,3,5};
        int b[]={6,8,4};
        alterMerge(new int[]{5, 7, 8}, new int[]{1, 3, 7});
        System.out.println("Another Ex: ");
        alterMerge(a, b);

    }

    private static void alterMerge(int[] a, int[] b) {
        int n=a.length+b.length;
        int c[]=new int[n];
        int k=0,i=0,j=0;
        for(i=0;i<c.length;i=i+2)
        {
            c[i]=a[k];
            k++;
        }
        j=0;
        for(i=1;i<c.length;i=i+2)
        {
            c[i]=b[j];
            j++;
        }
        for(i=0;i<10;i++)
        {
            System.out.print(" "+c[i]);
        }
    }
}
