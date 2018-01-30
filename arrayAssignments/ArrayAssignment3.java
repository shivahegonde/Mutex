package arrayAssignments;

public class ArrayAssignment3 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int[] arr2={2,3,5};
        int[] arr3={1,2,1};
        arrayContentReplace(arr);
        arrayContentReplace(arr2);
        arrayContentReplace(arr3);
    }

    private static void arrayContentReplace(int[] arr) {
        for (int i=0;i< arr.length;i++){
            if(arr[i]==2&&arr[i+1]==3){
                arr[i+1]=0;
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print("\t"+arr[i]);
        }
        System.out.println("");
    }
}
