import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScannerExample {
    public static void main(String[] args) {
        // Путь к файлу
        File file = new File("example.txt");

        try {
            // Создаем объект Scanner для чтения из файла
            Scanner scanner = new Scanner(file);

            // Чтение данных из файла
            while (scanner.hasNext()) {
                // Чтение строки
                String line = scanner.nextLine();
                System.out.println(line);
            }

            // Закрываем Scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            // Обработка исключения, если файл не найден
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}
