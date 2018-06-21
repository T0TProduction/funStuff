import java.util.ArrayList;

public class main {


    public static void main(String[] args) {
        //print all solutions
        for (int[] l : losungen()
                ) {
            System.out.println("a: " + l[0] + "b: " + l[1] + "c: " + l[2] + "\n");
        }
    }

    private static ArrayList<int[]> losungen() {
        //create a list we want to save the solutions in
        ArrayList<int[]> out = new ArrayList<>();
        //loop through all possible inputs
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 10; c++) {
                    //check if the formula is satisfied by the input
                    if (((a * 100 + b * 10 + c) * 3 == c * 100 + b * 10 + a) && a != b && b != c && c != a) {
                        //if yes, add the values to the solution
                        int[] add = {a, b, c};
                        out.add(add);
                    }
                }
            }
        }
        System.out.println("\nThere are " + out.size() + " Solutions.");
        return out;
    }
}
