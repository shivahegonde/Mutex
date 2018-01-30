package arrayAssignments;

public class ArrayAssignment2 {
    int temp;
    void revereseArray(int arr[])
    {
        int temp;
        int start=0;
        int end=2;
        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        ArrayAssignment2 a=new ArrayAssignment2();
        int arr[] = {1, 2, 3};
        int arr2[]={5,11,9};
        int arr3[]={7,0,0};
        a.revereseArray(arr);
        a.revereseArray(arr2);
        a.revereseArray(arr3);
        System.out.println("Reversed array is \n");
        a.printArray(arr);
        a.printArray(arr2);
        a.printArray(arr3);
    }
}
