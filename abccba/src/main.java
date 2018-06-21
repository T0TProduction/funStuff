import java.util.ArrayList;

public class main {


    public static void main(String[] args) {

        for (int[] l : losungen()
                ) {
            System.out.println("a: " + l[0] + "b: " + l[1] + "c: " + l[2] + "\n");
        }
    }

    private static ArrayList<int[]> losungen() {
        ArrayList<int[]> out = new ArrayList<>();
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 10; c++) {
                    if (((a * 100 + b * 10 + c) * 3 == c * 100 + b * 10 + a) && a != b && b != c && c != a) {
                        int[] add = {a, b, c};
                        out.add(add);
                    }
                }
            }
        }

        System.out.println("\nEs gibt " + out.size() + " Lösungen.");

        return out;
    }
}
