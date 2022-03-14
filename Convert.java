/*
 * Assignment <Project 6>
 * Description: <This program converts uppercase to lowercase and vice-versa. It also converts numbers by doubling
 * >
 * Name: <Damien Hosea>
 * ID: <921395901>
 */
import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String original, converted;
        while (true) {
            System.out.print("Original String (input):");
            original = input.nextLine();
            if(original.equals("q") || original.equals("Q"))
                break;
            char[] chars = original.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char ch = chars[i];
                if (Character.isDigit(ch)) {
                    int d = (int) (ch - '0');
                    d = d * 2;
                    if (d > 9) {
                        //If d is larger than 9 then we need to add the numbers in the double digit together.
                        int Reminder = d % 10;
                        d = d+= Reminder;
                        d = d / 10;
                        d = d += Reminder;
                        chars[i] = (char)(d);
                    }
                    chars[i] = (char) ('0' + d);
                } else if (Character.isLetter(ch)) {

                    // please fill in this case

                    if (chars[i] >= 'A' && chars[i] <= 'Z'){
                        ch = Character.toLowerCase(chars[i] += 32);
                        /*If the character in index i is an uppercase then
                        change is lower case
                        */
                    }
                    else if (chars[i] >= 'a' && chars[i] <= 'z') {
                        ch = Character.toUpperCase(chars[i] -= 32);
                        /*If the character in index i is an lowercase then
                        change is upper case
                        */
                    }
                }
            }
            converted = new String(chars);
            System.out.println("Converted String (output):" + converted);
        }
        System.out.println("Terminating upon user's request!");
    }
}