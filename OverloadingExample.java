class Calculator {
    public int add(int a, int b) {
        return a + b;
    }


    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Вызов перегруженных методов
        System.out.println("Addition of 2 integers: " + calc.add(5, 10));           // 15
        System.out.println("Addition of 3 integers: " + calc.add(5, 10, 15));       // 30
        System.out.println("Addition of 2 doubles: " + calc.add(5.5, 10.5));        // 16.0
    }
}
