class Calculator {

  // Перегруженные методы для сложения чисел
  public int add(int a, int b) {
      return a + b;
  }

  public double add(double a, double b) {
      return a + b;
  }

  public int add(int a, int b, int c) {
      return a + b + c;
  }
}

public class MainCalc {
  public static void main(String[] args) {
      Calculator calc = new Calculator();

      // Вызов разных перегруженных методов
      System.out.println(calc.add(5, 3));          // Вызов метода add(int, int)
      System.out.println(calc.add(5.5, 3.3));      // Вызов метода add(double, double)
      System.out.println(calc.add(1, 2, 3));       // Вызов метода add(int, int, int)
  }
}
