package arrayAssignments;

public class ArrayAssignment1 {
    boolean b1;
    //boolean b2;

    public boolean commonEnd(int a[], int b[]) {
        for (int i=0;i<a.length;i++){
                if (a[0]==b[0]||a[a.length-1]==b[b.length-1]){
                    b1=true;
                }

              /*  if (a[a.length]==b[b.length]){
                    b2=true;
                }
                return b2;*/

        }return b1;

    }


    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={7,3};
        int[] c={1,2,3};
        int[] d={7,3,2};
        int[] e={1,2,3};
        int[] f={1,3};
        ArrayAssignment1 a1=new ArrayAssignment1();
        boolean result = a1.commonEnd(a,b);
        boolean result2 = a1.commonEnd(c,d);
        boolean result3 = a1.commonEnd(e,f);
       // commonEnd([1, 2, 3], [7, 3]) → true
        //commonEnd([1, 2, 3], [7, 3, 2]) → false
        //commonEnd([1, 2, 3], [1, 3]) → true
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);



    }
}