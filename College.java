import static javax.swing.text.html.HTML.Tag.S;

public class College {
    static int count = 0;

    College() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            College mech = new College();
            College it = new College();
            College cse = new College();
        }

    }
}