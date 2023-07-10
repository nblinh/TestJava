import java.io.PrintStream;
import java.util.Scanner;

class Temperature {

    public static int computeClosestToZero(int[] ts) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
        if(ts.length==0){
            return 0;
        }

        int plusProche = Integer.MAX_VALUE;
        for(int i=0;i<ts.length;i++){
            if(Math.abs(ts[i])<Math.abs(plusProche)){
                plusProche = ts[i];
            }
            if(Math.abs(ts[i])==Math.abs(plusProche)){
                plusProche = Math.max(ts[i], plusProche);
            }
        }

        return plusProche;
    }

    /* Ignore and do not change the code below */
    // #region main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ts = new int[n];
        for (int i = 0; i < n; i++) {
            ts[i] = in.nextInt();
        }
        PrintStream outStream = System.out;
        System.setOut(System.err);
        int solution = computeClosestToZero(ts);
        System.setOut(outStream);
        System.out.println(solution);
    }
    // #endregion
}