public class StringConversion {
    public static void main(String[] args) {
        // Преобразование String в StringBuffer
        String str = "Hello, StringBuffer!";
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println("String to StringBuffer: " + stringBuffer);

        // Преобразование String в StringBuilder
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println("String to StringBuilder: " + stringBuilder);
    }
}
public class StringBufferStringBuilderConversion {
    public static void main(String[] args) {
        // Преобразование StringBuffer в String
        StringBuffer stringBuffer = new StringBuffer("Hello, StringBuffer!");
        String strFromBuffer = stringBuffer.toString();
        System.out.println("StringBuffer to String: " + strFromBuffer);

        // Преобразование StringBuilder в String
        StringBuilder stringBuilder = new StringBuilder("Hello, StringBuilder!");
        String strFromBuilder = stringBuilder.toString();
        System.out.println("StringBuilder to String: " + strFromBuilder);
    }
}

public class StringBufferStringBuilderConversion {
    public static void main(String[] args) {
        // Преобразование из StringBuffer в StringBuilder
        StringBuffer stringBuffer = new StringBuffer("Hello, StringBuffer!");
        StringBuilder stringBuilderFromBuffer = new StringBuilder(stringBuffer);
        System.out.println("StringBuffer to StringBuilder: " + stringBuilderFromBuffer);

        // Преобразование из StringBuilder в StringBuffer
        StringBuilder stringBuilder = new StringBuilder("Hello, StringBuilder!");
        StringBuffer stringBufferFromBuilder = new StringBuffer(stringBuilder);
        System.out.println("StringBuilder to StringBuffer: " + stringBufferFromBuilder);
    }
}
