public class ToHopChap {
    public static void main(String args[]) {
        System.out.println(count(10000));
    }

    // Cnk = n!/(n-k)!k!
    //k=2 => Cn2 = n*(n-1)/2
    static int count(int n) {
        return n*(n-1)/2;
    }
}
