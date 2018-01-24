import java.util.Scanner;

public class CaeserCipher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("               \u0086 CAESER CIPHER \u0086");
        System.out.println("Insert encrypted text to see the decrypted results:");
        String text = input.nextLine();
        String otherOptions;

        int keyOne = 1;
        int keyTwo = 2;
        int keyThree = 3;

        System.out.println(decrypt(text, keyOne));
        System.out.println(decrypt(text, keyTwo));
        System.out.println(decrypt(text, keyThree));
        System.out.println();

        System.out.println("If you can`t find the word, write \"next\" to see the other options: ");

        otherOptions = input.nextLine();

        if (otherOptions.equalsIgnoreCase("NEXT")) {

            int keyFour = 4;
            int keyFive = 5;
            int keySix = 6;
            int keySeven = 7;
            int keyEight = 8;
            int keyNine = 9;
            int keyTen = 10;
            int keyEleven = 11;
            int keyTwelve = 12;
            int keyThirteen = 13;
            int keyFourteen = 14;
            int keyFifteen = 15;
            int keySixteen = 16;
            int keySeventeen = 17;
            int keyEighteen = 18;
            int keyNineteen = 19;
            int keyTwenty = 20;
            int keyTwentyOne = 21;
            int keyTwentyTwo = 22;
            int keyTwentyThree = 23;
            int keyTwentyFour = 24;
            int keyTwentyFive = 25;
            int keyTwentySix = 26;

            System.out.println(decrypt(text, keyFour));
            System.out.println(decrypt(text, keyFive));
            System.out.println(decrypt(text, keySix));
            System.out.println(decrypt(text, keySeven));
            System.out.println(decrypt(text, keyEight));
            System.out.println(decrypt(text, keyNine));
            System.out.println(decrypt(text, keyTen));
            System.out.println(decrypt(text, keyEleven));
            System.out.println(decrypt(text, keyTwelve));
            System.out.println(decrypt(text, keyThirteen));
            System.out.println(decrypt(text, keyFourteen));
            System.out.println(decrypt(text, keyFifteen));
            System.out.println(decrypt(text, keySixteen));
            System.out.println(decrypt(text, keySeventeen));
            System.out.println(decrypt(text, keyEighteen));
            System.out.println(decrypt(text, keyNineteen));
            System.out.println(decrypt(text, keyTwenty));
            System.out.println(decrypt(text, keyTwentyOne));
            System.out.println(decrypt(text, keyTwentyTwo));
            System.out.println(decrypt(text, keyTwentyThree));
            System.out.println(decrypt(text, keyTwentyFour));
            System.out.println(decrypt(text, keyTwentyFive));
            System.out.println(decrypt(text, keyTwentySix));
        }
    }

    public static String decrypt(String text, int key) {
        String decrypted = "";
        for (int i = 0; i < text.length(); i++) {
            int c = text.charAt(i);
            if(Character.isUpperCase(c)){
                c += (key % 26);
                if(c > 'Z')
                    c -= 26;
            }else if(Character.isLowerCase(c)){
                c += (key % 26);
                if(c > 'z')
                    c -= 26;
            }
            decrypted += (char) c;
        }
        return decrypted;
    }
}
