public class StringBufferStringBuilderExample {
    public static void main(String[] args) {
        // 1. Создание объекта StringBuffer и добавление текста
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World!"); // добавление строки в конец
        System.out.println("After append: " + sb); // "Hello World!"
        
        // 2. Создание объекта StringBuilder и вставка текста
        StringBuilder sbld = new StringBuilder("Java");
        sbld.insert(4, " Programming"); // вставка строки на 4-й позиции
        System.out.println("After insert: " + sbld); // "Java Programming"

        // 3. Удаление части строки в StringBuffer
        sb.delete(5, 11); // удаление символов с 5 по 10 индекс (не включая 11)
        System.out.println("After delete: " + sb); // "Hello"

        // 4. Замена части строки в StringBuilder
        sbld.replace(0, 4, "Python"); // замена от индекса 0 до 4 на строку "Python"
        System.out.println("After replace: " + sbld); // "Python Programming"

        // 5. Обратный порядок символов в StringBuffer
        sb.reverse(); // переворачивает строку
        System.out.println("After reverse: " + sb); // "olleH"

        // 6. Преобразование StringBuffer в строку
        String str = sb.toString(); // преобразование в строку
        System.out.println("StringBuffer to String: " + str); // "olleH"

        // 7. Проверка длины StringBuilder
        System.out.println("Length of StringBuilder: " + sbld.length()); // 18

        // 8. Проверка емкости StringBuffer
        System.out.println("Capacity of StringBuffer: " + sb.capacity()); // 32 (по умолчанию)

        // 9. Извлечение подстроки из StringBuilder
        String substring = sbld.substring(0, 6); // извлечение подстроки с 0 по 6 индекс
        System.out.println("Substring: " + substring); // "Python"

        // 10. Сравнение StringBuffer и StringBuilder
        StringBuffer sb1 = new StringBuffer("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        System.out.println("Are StringBuffer and StringBuilder equal? " + sb1.toString().equals(sb2.toString())); // true
    }
}
