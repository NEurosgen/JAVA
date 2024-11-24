public class OverloadExample {
    
    public static void printNumbers(int... numbers) {
        System.out.println("Printing numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public static void printNumbers(double... numbers) {
        System.out.println("Printing doubles:");
        for (double num : numbers) {
            System.out.println(num);
        }
    }

 
    public static void printNumbers(String... strings) {
        System.out.println("Printing strings:");
        for (String str : strings) {
            System.out.println(str);
        }
    }


    public static void main(String[] args) {
        printNumbers(1, 2, 3, 4, 5); 
        printNumbers(1.1, 2.2, 3.3);  
        printNumbers("apple", "banana", "cherry"); 
    }
}
