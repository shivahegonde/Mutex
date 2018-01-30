package arrayAssignments;

public class ArrayAssignment4 {
    public static void main(String[] args) {
        int arr1[] = {1, 2};
        int arr2[] = {3, 4};
        int arr3[] = {4, 4};
        int arr4[] = {2, 2};
        int arr5[] = {9, 2};
        int arr6[] = {3, 4};
        combineArray(arr1, arr2);
        System.out.println();
        combineArray(arr3, arr4);
        System.out.println();
        combineArray(arr5, arr6);
    }

    private static void combineArray(int[] arr, int[] arr2) {
        int combinedArray[] = new int[4];
        for (int i = 0; i < 2; i++) {
            combinedArray[i] = arr[i];
        }
        for (int i=0;i<2;i++){
                    combinedArray[i+2]=arr2[i];
        }
        for (int i = 0; i < combinedArray.length; i++) {
                    System.out.print("\t" + combinedArray[i]);
        }
    }
}

