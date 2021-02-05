package Game2;

import java.util.Random;
import java.util.Scanner;

public class Game2 {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        chooseTheWord(words);
        String compWord = new String();
        compWord = chooseTheWord(words);
        System.out.println(compWord);
        checkTheWord(compWord,readUserWord());


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
        int n = randWord.length()-1;
        for (int i = 0; i<15; i++){
            if (i<n){
                if (putWord.charAt(i)==randWord.charAt(i)){
                    System.out.print(putWord.charAt(i));
                }else System.out.print("#");
            }
            else {
                System.out.print("#");
            }
            }
        System.out.println();
        System.out.println("Загадано слово: "+randWord);

    }
}
