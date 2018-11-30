package generics;

public class Main {
    public static < T extends Number > double addStaticMethod(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
    public static float add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {

        System.out.println( addStaticMethod(3, 4));
        System.out.println(addStaticMethod(3, 4.3));

        System.out.println(add(1,3));

    }
}