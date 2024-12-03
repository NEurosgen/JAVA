import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {
    public static void main(String[] args) {
        // Путь к файлу, в который будем записывать данные
        String filePath = "output.txt";
        
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            String data = "Hello, OutputStream!";
            
            // Запись данных по одному байту
            for (int i = 0; i < data.length(); i++) {
                fos.write(data.charAt(i));  // Преобразуем символ в байт и записываем
            }
            
            System.out.println("Данные успешно записаны в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
