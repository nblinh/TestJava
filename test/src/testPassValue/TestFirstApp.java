package testPassValue;

public class TestFirstApp {
    static void doIt(int x, int y, int m){
        if (x==5)
            m=y;
        else
            m=x;
    }

    public static void main(String args[]){
        int i=6, j=4, k=9;
        TestFirstApp.doIt(i, j, k);
        System.out.println(k);
    }
}
