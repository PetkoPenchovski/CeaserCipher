import java.util.Scanner;

public class CaeserCipher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("               \u0086 CAESER CIPHER \u0086");
        System.out.println("Insert encrypted text to see the decrypted results:");
        String text = input.nextLine();
        String otherOptions;


        for (int i = 1; i <= 3; i++) {
            System.out.println(decrypt(text, i));

        }
        System.out.println("If you can`t find the word, write \"next\" to see the other options: ");

        otherOptions = input.nextLine();

        if (otherOptions.equalsIgnoreCase("NEXT")) {
            for (int i = 4; i <= 26; i++) {
                System.out.println(decrypt(text, i));

            }

        }
    }

    public static String decrypt(String text, int key) {
        String decrypted = "";
        for (int i = 0; i < text.length(); i++) {
            int c = text.charAt(i);
            if (Character.isUpperCase(c)) {
                c += (key % 26);
                if (c > 'Z')
                    c -= 26;
            } else if (Character.isLowerCase(c)) {
                c += (key % 26);
                if (c > 'z')
                    c -= 26;
            }
            decrypted += (char) c;
        }
        return decrypted;
    }
}
