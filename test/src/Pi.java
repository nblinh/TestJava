public class Pi {
    public static void main(String args[]){
        double[][] rands = new double[100000000][2];
        for (int i=0;i<rands.length;i++){
            rands[i][0]=Math.random();
            rands[i][1]=Math.random();
        }
        System.out.println(approx(rands));

    }
    static double approx(double[][] pts){
        int totalInside = 0;
        for(int i=0;i< pts.length;i++){
            if(pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1]<=1){
                totalInside++;
            }
        }
        return (double)totalInside*4/pts.length;
    }
}
