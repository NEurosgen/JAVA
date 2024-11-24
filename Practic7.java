public class Practic7 {
    public static void main(String[] args){
    int value = 2;
    switch (value) {
        case 1: System.out.println("Case 1"); break;
        case 2: System.out.println("Case 2"); break;
        default: System.out.println("Default case");
    }
    char value1 = 'A';
    switch (value1) {
        case 'A': System.out.println("Case A"); break;
        case 'B': System.out.println("Case B"); break;
        default: System.out.println("Default case");
    }
    String value2 = "Hello";
    switch (value2) {
    case "Hello": System.out.println("Case Hello"); break;
    case "World": System.out.println("Case World"); break;
    default: System.out.println("Default case");
    }
    enum Color { RED, GREEN, BLUE }
    Color value3 = Color.RED;
    switch (value3) {
        case RED: System.out.println("Red"); break;
        case GREEN: System.out.println("Green"); break;
        case BLUE: System.out.println("Blue"); break;
    }
    Integer value4 = 1;
    switch (value4) {
        case 1: System.out.println("Case 1"); break;
        case 2: System.out.println("Case 2"); break;
        default: System.out.println("Default case");
    }



    }

}
