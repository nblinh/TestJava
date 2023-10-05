package testEnum;

import java.math.BigInteger;
import java.util.function.Consumer;


public class Context {
    public static void main(String args[]){
        System.out.println(Planet.MERCURY.equals(Planet.MERCURY));
        BigInteger bi = new BigInteger("1");
        BigInteger bi2 = bi.add(new BigInteger("1"));
        System.out.println(bi2);
        Maths maths = (a) -> Math.sqrt(a*100);
    }
}
