public enum Day {
    MONDAY("Понедельник"), 
    TUESDAY("Вторник"), 
    WEDNESDAY("Среда"), 
    THURSDAY("Четверг"), 
    FRIDAY("Пятница"), 
    SATURDAY("Суббота"), 
    SUNDAY("Воскресенье");

    private String dayName;  

    
    Day(String dayName) {
        this.dayName = dayName;
    }


    public String getDayName() {
        return dayName;
    }
}

class Main {
    public static void main(String[] args) {
        Day day = Day.MONDAY;

        System.out.println(day.getDayName());

     
        switch (day) {
            case MONDAY:
                System.out.println("Сегодня понедельник!");
                break;
            case FRIDAY:
                System.out.println("Сегодня пятница!");
                break;
            default:
                System.out.println("Будний день!");
        }
    }
}
