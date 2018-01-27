package Star;

public class StarPrint1 {
    public static void main(String[] args) {
        int i, j;

        for (j = 0; j < 4; j++) {
            System.out.print("     ");
            for (i = 0; i <=2*j-1; i++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}