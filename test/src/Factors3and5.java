public class Factors3and5 {
    public static void main(String args[]){

        long idealNumber=getIdealNums(200, 405);
        System.out.println(idealNumber);

    }

    public static long getIdealNums(long low, long high){
        int num = 0;
        int powerOf3 = 1;


        int power3=0;
        while(powerOf3 < high){

            int power5 = 0;
            int powerOf5 = 1;
            while(powerOf5 <high){
                //System.out.println("3*"+power3+ "+5*"+power5+"="+powerOf3+"+"+powerOf5+"="+(powerOf3*powerOf5) );
                if(isIdealNumber(powerOf3, powerOf5, low, high)){
                    System.out.println("Ideal number: "+(powerOf3*powerOf5));
                    num++;
                }
                power5++;
                powerOf5 = (int) Math.pow(5, power5);
            }
            power3++;
            powerOf3 = (int) Math.pow(3, power3);
        }

        return num;
    }

    public static boolean isIdealNumber(int powerOf3, int powerOf5, long low, long high){

        return (powerOf3*powerOf5)>=low && (powerOf3*powerOf5)<=high;
    }
}
