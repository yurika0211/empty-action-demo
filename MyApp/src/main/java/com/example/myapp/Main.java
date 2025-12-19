package java.com.example.myapp;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, GitHub Actions!");
        int result = add(3, 5);
        System.out.println("3 + 5 = " + result);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
