package Game2;

import java.util.Random;

public class Game2 {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        chooseTheWord(words);
        System.out.println(chooseTheWord(words));

    }
    public static String chooseTheWord (String[] words){
        int max = words.length-1;
        Random random = new Random();
        return words[random.nextInt(max)];
    }
}
