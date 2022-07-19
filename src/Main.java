import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String a = "I like Java!!!";
        strings(a);
        String b = "aka fdsfs baab afasf tttttttt";
        System.out.println("Написать метод, который находит и выводит все слова палиндромы в тексте. ");
        isPalindrome(b);
        System.out.println("Написать метод, который находит и выводит все слова, длина которых от 3 до 5 включительно.");
        searchThreeFive(a);
        System.out.println("Написать метод, который возвращает самое маленькое слово в тексте. ");
        searchTheSmallest(a);
        System.out.println("Написать метод, который возвращает самое большое слово в тексте.");
        searchTheBeggest(a);
        System.out.println("Используя StringBuilder сделайте выражения ");
        example(3, 56);
        System.out.println("Получить слово состоящее из первой половины первого слова и второй половины второго слова ");
        replace("aaaasa", "bbbbsa");


    }

    public static void strings(String a) {

//      System.out.println(a.length());
        System.out.println("Распечатать последний символ строки");
        System.out.println(a.charAt(a.length() - 1));
        System.out.println("Проверить, заканчивается ли ваша строка подстрокой "!!!"");
        System.out.println(a.endsWith("!!!"));
        System.out.println("Проверить, начинается ли ваша строка подстрокой "I like"");
        System.out.println(a.startsWith("I like"));
        System.out.println("Проверить, содержит ли ваша строка подстроку "Java"");
        System.out.println(a.contains("Java"));
        System.out.println("Найти позицию подстроки "Java" в строке "I like Java!!!"");
        System.out.println(a.indexOf("Java"));
        System.out.println("Заменить все символы "a" на "o"");
        System.out.println(a.replace("a", "o"));
        System.out.println("Преобразуйте строку к верхнему регистру");
        System.out.println(a.toUpperCase());
        System.out.println("Преобразуйте строку к нижнему регистру");
        System.out.println(a.toLowerCase());
        System.out.println("Вырезать строку Java c помощью метода "String.substring()"");
        System.out.println(a.substring(0, 6) + a.substring(11, 14));
    }

    public static void isPalindrome(String a) {
        String[] words = a.split(" ");

        for (int i = 0; i < words.length; i++) {
            int n = words[i].length();
            for (int j = 0; j < (n / 2); ++j) {
                if (words[i].charAt(j) != words[i].charAt(n - j - 1)) {
                    System.out.println("Слово " + words[i] + " не  палиндром");
                    break;
                } else System.out.println("Слово " + words[i] + " палиндром");
                break;
            }

        }
    }


    public static void searchThreeFive(String a) {
        String[] words = a.split(" ");
        for (int i = 0; i < words.length; i++) {

            if (words[i].length() >= 3 && words[i].length() <= 5) {
                System.out.println(words[i]);
            }
        }
    }

    public static void searchTheSmallest(String a) {
        String[] words = a.split(" ");
        String small = words[0];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < small.length()) {
                small = words[i];
            }
        }
        System.out.println(small);
    }

    public static void searchTheBeggest(String a) {
        String[] words = a.split(" ");
        String big = words[0];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= big.length()) {
                big = words[i];
            }
        }
        System.out.println(big);
    }

    public static void example(int a, int b) {
        int c = a + b;
        int d = a - b;
        int e = a * b;
        StringBuilder stringBuilder1 = new StringBuilder();
        System.out.println(stringBuilder1.append(a).append("+").append(b).append("=").append(c).append("\n").
                append(a).append("-").append(b).append("=").append(d).append("\n").
                append(a).append("*").append(b).append("=").append(e));

    }

    public static void replace(String firsttWord, String secondWord) {
        StringBuilder stringBuilder1 = new StringBuilder(firsttWord);
        StringBuilder stringBuilder2 = new StringBuilder(secondWord);
        int a = stringBuilder1.length() / 2;
        int b = stringBuilder2.length() / 2;
        stringBuilder1.delete(a, stringBuilder1.length());
        stringBuilder2.delete(0, b);
        System.out.println(stringBuilder1 + stringBuilder2.toString());
    }

}


