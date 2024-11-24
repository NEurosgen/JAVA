public class Main {
    public static void main(String[] args) {
        int a = 10;        // Прямое присваивание
        a += 5;            // a = a + 5; результат: 15
        a -= 3;            // a = a - 3; результат: 12
        a *= 2;            // a = a * 2; результат: 24
        a /= 4;            // a = a / 4; результат: 6
        a %= 5;            // a = a % 5; результат: 1

        String str = "Hello";
        str += " World!";  
        int x = 10, y = 20;
        int max = (x > y) ? x : y;  
        System.out.println(max);   

        String result = (x % 2 == 0) ? "Even" : "Odd";  
        System.out.println(result);  
        boolean b1 = true, b2 = false;
        System.out.println(b1 || b2);  
        System.out.println(b2 || b2); 
        int bitwiseXor = 5 ^ 3; // 5 (0101) ^ 3 (0011) = 6 (0110)
        System.out.println(bitwiseXor); 
        System.out.println(x == y);  
        System.out.println(x != y); 
        System.out.println(x > y);   
        System.out.println(x >= 10); 
        System.out.println(x < y);   
        System.out.println(x <= 15); 
        int value = 8;      
        System.out.println(value >> 1);  
        System.out.println(value >>> 1); 
        System.out.println(value << 2);  
        int num = 5;
        System.out.println(num++);  // Постфикс: сначала возвращает 5, потом num = 6
        System.out.println(++num);  // Префикс: сначала num = 7, потом возвращает 7
        System.out.println(num--);  // Постфикс: возвращает 7, потом num = 6
        System.out.println(--num);  // Префикс: сначала num = 5, потом возвращает 5
        int[] arr = {10, 20, 30};
        System.out.println(arr[1]);  

        String substring = "Hello".substring(1, 3);  
        System.out.println(substring);  




    }
}
