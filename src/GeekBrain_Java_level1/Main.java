package GeekBrain_Java_level1;

import java.security.PublicKey;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**1 Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3
        попытки угадать это число. При каждой попытке компьютер должен сообщить, больше ли
        указанное пользователем число, чем загаданное, или меньше. После победы или проигрыша
        выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
        2 * Создать массив из слов
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
                При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
                сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь. Если
        слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
        apple – загаданное
        apricot - ответ игрока
        ap############# (1 5 символов, чтобы пользователь не мог узнать длину слова)
        Угаданные в прошлые ответы буквы запоминать не надо. То есть при следующем ответе:
        carpet (ковер, не фрукт, но это всего лишь пример), будет выведено:
####e##########
         */
        int min = 0, max = 10;
        int putNum = getNumFromConsole(min,max);
        int randomNum = generateRandomNum(min,max);


    }
    public static int generateRandomNum (int min, int max){
        Random rand = new Random();
        return rand.nextInt(max-min + min);

    }
    public static int getNumFromConsole(int min, int max){
        int putNum;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.printf("Угадайте число от %d до %d", min, max);
            putNum = scanner.nextInt(max);
        }
        while (putNum<min || putNum>max);
        return putNum;

    }
}
