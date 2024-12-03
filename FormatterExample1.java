import java.util.Formatter;
import java.util.Calendar;

public class FormatterExample1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        
        // Создаём объект Formatter
        Formatter formatter = new Formatter();
        
        // Пример использования различных спецификаторов формата
        formatter.format("Текущее время: %tH:%tM:%tS\n", calendar, calendar, calendar);  // Час:Минуты:Секунды
        formatter.format("Миллисекунды: %tL\n", calendar);  // Миллисекунды
        formatter.format("Год: %tY\n", calendar);  // Год в 4-значном формате
        formatter.format("Месяц: %tB\n", calendar);  // Полное название месяца
        formatter.format("День недели: %tA\n", calendar);  // Полное название дня недели
        
        // Вывод результата
        System.out.println(formatter.toString());
        
        // Закрытие объекта Formatter
        formatter.close();
    }
}
