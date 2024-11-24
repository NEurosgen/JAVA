public enum Difficulty {
    EASY(10), 
    MEDIUM(20), 
    HARD(30);

    private int timeLimit;  


    Difficulty(int timeLimit) {
        this.timeLimit = timeLimit;
    }


    public int getTimeLimit() {
        return timeLimit;
    }

   
    public String getMessage() {
        switch (this) {
            case EASY:
                return "Простой уровень, времени мало!";
            case MEDIUM:
                return "Средний уровень, у вас есть время!";
            case HARD:
                return "Сложный уровень, времени совсем мало!";
            default:
                return "Неизвестный уровень";
        }
    }
}

class Game {
    public static void main(String[] args) {
        Difficulty level = Difficulty.MEDIUM;

        System.out.println("Время на выполнение: " + level.getTimeLimit() + " минут.");
        System.out.println(level.getMessage());
    }
}
