import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva aljuma coisa: ");
        String normalString = scanner.nextLine();
        String reverseString = functionReverseStringWithAPI(normalString);
        System.out.println("A string invertida é: " + reverseString);
        scanner.close();
    }

    private static String functionReverseStringWithAPI(String str) {
        var stringBuffer = new StringBuffer(str);
        return stringBuffer.reverse().toString();
    }

}