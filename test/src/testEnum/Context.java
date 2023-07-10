package testEnum;

public class Context {
    public static void main(String args[]){
        System.out.println(Planet.MERCURY.equals(Planet.MERCURY));
        System.out.println(Planet.MERCURY==Planet.VENUS);
    }
}
