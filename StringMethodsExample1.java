public class StringMethodsExample1 {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // 1. length() - возвращает длину строки
        System.out.println("Length of str: " + str.length());  // 13

        // 2. toUpperCase() - преобразует строку в верхний регистр
        System.out.println("Uppercase: " + str.toUpperCase());  // "HELLO, WORLD!"

        // 3. toLowerCase() - преобразует строку в нижний регистр
        System.out.println("Lowercase: " + str.toLowerCase());  // "hello, world!"

        // 4. charAt(int index) - возвращает символ по указанному индексу
        System.out.println("Character at index 7: " + str.charAt(7));  // 'W'

        // 5. substring(int beginIndex) - извлекает подстроку с указанного индекса до конца строки
        System.out.println("Substring from index 7: " + str.substring(7));  // "World!"

        // 6. substring(int beginIndex, int endIndex) - извлекает подстроку между двумя индексами
        System.out.println("Substring from index 0 to 5: " + str.substring(0, 5));  // "Hello"

        // 7. contains(CharSequence sequence) - проверяет, содержится ли последовательность символов в строке
        System.out.println("Contains 'World': " + str.contains("World"));  // true

        // 8. startsWith(String prefix) - проверяет, начинается ли строка с указанного префикса
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));  // true

        // 9. endsWith(String suffix) - проверяет, заканчивается ли строка указанным суффиксом
        System.out.println("Ends with '!': " + str.endsWith("!"));  // true

        // 10. replace(CharSequence target, CharSequence replacement) - заменяет все вхождения target на replacement
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));  // "Hello, Java!"
    }
}
