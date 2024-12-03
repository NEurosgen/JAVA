import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamExample {
    public static void main(String[] args) {
        // Путь к файлу, который будем читать
        String filePath = "example.txt";
        
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int byteRead;
            
            // Чтение файла байт за байтом
            while ((byteRead = fis.read()) != -1) {
                System.out.print((char) byteRead);  // Выводим прочитанный байт как символ
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
