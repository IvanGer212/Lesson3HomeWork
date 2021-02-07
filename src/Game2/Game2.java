package Game2;

import java.util.Random;
import java.util.Scanner;

public class Game2 {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        boolean a;
        String compWord = chooseTheWord(words);
        System.out.println("Было задуманно слово. Вам нужно его угадать");
       checkTheWord(compWord, readUserWord());

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

    public static void checkTheWord (String randWord, String putWord){
        int min = Math.min(randWord.length()-1,putWord.length()-1);
        if (randWord.equals(putWord)){
            System.out.println("Вы угадали слово!");
            System.out.println("Было загадано слово: "+randWord);
            return;
        }
        else {
            System.out.println("Задумано другое слово");
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
        checkTheWord(randWord, readUserWord());

    }
}
