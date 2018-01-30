package arrayAssignments;

public class ArrayAssignment6 {
    public static void main(String[] args) {
        int a[] = {1, 2, 2};

        int b[] = {1, 2, 2, 6, 99, 9, 7};
        int c[] = {1, 1, 6, 7, 2};
        sum67(a);
        sum67(c);

    }

    private static void sum67(int[] a) {
        int result=0;
        boolean flag=false;
        for(int i = 0; i < a.length; i++)
        {

            if(flag==true)
            {
                if(a[i] == 7)
                    flag=false;
            }
            else if(a[i] == 6)
                flag=true;
            else
                result=result+a[i];
        }
        System.out.println("Sum is: "+result);
    }
}