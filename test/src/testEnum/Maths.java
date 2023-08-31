package testEnum;

public interface Maths {
    double calculate(int a);
    default double sqrt(int a){
        return Math.sqrt(a);
    }
}
