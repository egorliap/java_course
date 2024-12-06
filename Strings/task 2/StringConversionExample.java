public class StringConversionExample {
    public static void main(String[] args) {
        // Преобразование из String в StringBuffer и StringBuilder
        String str = "Hello, Java!";
        StringBuffer stringBuffer = new StringBuffer(str);
        StringBuilder stringBuilder = new StringBuilder(str);

        System.out.println("String to StringBuffer: " + stringBuffer);
        System.out.println("String to StringBuilder: " + stringBuilder);

        // Преобразование из StringBuffer и StringBuilder в String
        String strFromBuffer = stringBuffer.toString();
        String strFromBuilder = stringBuilder.toString();

        System.out.println("StringBuffer to String: " + strFromBuffer);
        System.out.println("StringBuilder to String: " + strFromBuilder);

        // Преобразование из StringBuffer в StringBuilder и наоборот
        StringBuilder newStringBuilder = new StringBuilder(stringBuffer.toString());
        StringBuffer newStringBuffer = new StringBuffer(stringBuilder.toString());

        System.out.println("StringBuffer to StringBuilder: " + newStringBuilder);
        System.out.println("StringBuilder to StringBuffer: " + newStringBuffer);
    }
}
