import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva alguma coisa: ");
        String normalString = scanner.nextLine();
        String reverseString = functionReverseStringWithLoop(normalString);
        System.out.println("A string invertida é: " + reverseString);
        scanner.close();
    }

    private static String functionReverseStringWithAPI(String str) {
        var stringBuffer = new StringBuffer(str);
        return stringBuffer.reverse().toString();
    }

    private static String functionReverseStringWithLoop(String str) {
        StringBuilder reversedString = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--) {
            reversedString.append(str.charAt(i));
        }
        return reversedString.toString();
    }

}