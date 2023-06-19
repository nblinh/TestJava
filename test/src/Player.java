public class Player {
    public static boolean isEncombrant(int width, int height, int length){
        return (width*height*length>=1000000 || height>=150||width>=150||length>=150);
    }

    public static String solve(int width, int height, int length, int mass){
        if(isEncombrant(width, height, length)&&mass>=20){
            return "REJECTED";
        }else if(isEncombrant(width, height, length)||mass>=20){
            return "SPECIAL";
        }else {
            return "STANDARD";
        }
    }

    public static void main(String args[]){
        System.out.println(solve(150, 70, 70, 10));

    }
}
