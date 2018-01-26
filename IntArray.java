public class IntArray {
    public static void main(String[] args) {
        int i, j, n = 1;
        int[][] array = new int[10][10];
        do {
            for (j = 0; j < array.length; j++) {
                for (i = 0; i < array[j].length; i++) {
                    array[i][j] = n;
                    n++;
                    //System.out.print(" "+array[i][j]);
                }
                System.out.println("");
            }
        }while (n<=100);
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                System.out.print("\t"+array[i][j]);
            }
            System.out.println("");
        }
    }
}