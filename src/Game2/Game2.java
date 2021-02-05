package Game2;

import java.util.Random;
import java.util.Scanner;

public class Game2 {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        boolean a=false;
        // chooseTheWord(words);
        String compWord = new String();
        compWord = chooseTheWord(words);
        System.out.println(compWord);
        do  {
            a = checkTheWord(compWord, readUserWord());
        } while (a == false);

    }
    public static String chooseTheWord (String[] words){
        int max = words.length-1;
        Random random = new Random();
        return words[random.nextInt(max)];
    }

    public static String readUserWord(){
        System.out.println("Введите слово ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static boolean checkTheWord (String randWord, String putWord){
        int min = Math.min(randWord.length()-1,putWord.length()-1);
        if (randWord.equals(putWord)){
            System.out.println("Вы угадали слово!");
            System.out.println("Было загадано слово: "+randWord);
            return true;
        } else {
            System.out.println("Задумано другое число");
            for (int i = 0; i < 15; i++) {
                if (i < min) {
                    if (putWord.charAt(i) == randWord.charAt(i)) {
                        System.out.print(putWord.charAt(i));
                    } else System.out.print("#");
                } else {
                    System.out.print("#");
                }
            }
        }
        System.out.println();
        System.out.println("Попробуйте ещё раз!");
        return false;

    }
}
