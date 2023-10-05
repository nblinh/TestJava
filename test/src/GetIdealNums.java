public class GetIdealNums {
    static int log(int base, long n) {
        return (int) (Math.log(n) / Math.log(base));
    }

    static long getIdealNums(long low, long high) {

        int maxExp3 = log(3, high);
        int maxExp5 = log(5, high);


        System.out.println("max exp of 3:"+maxExp3+ "max exp of 5" +maxExp5);

        int idealCount = 0;

        long n3 = 1L;
        for (int i3 = 0; i3 <= maxExp3; ++i3) {
            long n5 = 1;
            for (int i5 = 0; i5 <= maxExp5; ++i5) {
                long num = n3 * n5;
                System.out.println("max exp of 3:"+i3 + "max exp of 5"+i5+" "+num);
                if (num > high) {
                    break;
                }
                if (low <= num) {
                    System.out.println("---> " + num);
                    ++idealCount;
                }
                n5 *= 5;
            }
            n3 *= 3;
        }
        return idealCount;
    }



    public static void main(String[] args){

        int maxExp3= 200,  maxExp5= 405;

        System.out.println (getIdealNums(maxExp3,maxExp5));
    }
}
