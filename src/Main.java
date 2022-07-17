import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String a = "I like Java!!!";
        strings(a);
        String b = "aka";
        System.out.println(isPalindrom(b));
        searchThreeFive(a);
        searchTheSmallest(a);
        searchTheBeggest(a);

//        Main main1 = new Main();
//
//        String a = "Hello world";// Интернирование
//        String b = new String("Hello world");
//
//        //ctrl + P посмотреть варианты в скобках
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(a == b);
//        System.out.println(a.equals(b));
//        System.out.println("Приведение к верхнему регистру " + a.toUpperCase());
//        System.out.println("Приведение к нижнему регистру " + a.toLowerCase());
//        System.out.println("Вырезание подстроки из строки " + a.substring(2));
//        System.out.println("Получение массива байтов строки " + Arrays.toString(a.getBytes()));
//        System.out.println("Пустая строка или нет (не учитывает крайние пробелы) " + a.isBlank());
//        String c = "";
//        String d = " a ";
//        System.out.println("Получение длинны строки " + c.length());
//        System.out.println(d.trim() + "trim обрезает крайние пробелы справа и слева " + a.length());//нужный метод!
//        System.out.println("Пустая строка или нет (!!!учитывает крайние пробелы!!!) " + a.isEmpty());
//        System.out.println("Замена элементов строки " + a.replace("l", "x"));
//        System.out.println("Проверка начинается ли строка с переданного литерала "+ a.startsWith("Hello"));
//        System.out.println("Проверка заканчивается ли строка переданным литералом " + a.endsWith("world"));
//        System.out.println("Объедение строк "+ a.concat("123"));
//        System.out.println("Объединение строк - " + a + "123");
//        System.out.println("Целочисленное сравнение строк " + a.compareTo("Hello world45sdf"));
//        System.out.println("Получение символа по индексу " + a.charAt(5));
//        System.out.println("Есть ли в строке переданная строка " + a.contains("Hello"));
//        System.out.println("Индекс вхождения первого символа " + a.indexOf("world"));
//        System.out.println("Разбиение строки на массив строк по разделителю " + Arrays.toString(a.split(" ")));
//        StringBuilder st = new StringBuilder("Hello World");
//        System.out.println(st.append("1234").append("dafaf").append("sdfsdf"));
    }
    public static void strings(String a){

//      System.out.println(a.length());
        System.out.println(a.charAt(a.length()-1));
        System.out.println(a.endsWith("!!!"));
        System.out.println(a.startsWith("I like"));
        System.out.println(a.contains("Java"));
        System.out.println(a.indexOf("Java"));
        System.out.println(a.replace("a", "o"));
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.substring(0, 6) + a.substring(11, 14));
    }


    public static boolean isPalindrom(String a) {
        int n = a.length();
        for (int i = 0; i < (n/2); ++i) {
            if (a.charAt(i) != a.charAt(n - i - 1)) {
            return false;
            }
        }
        return true;
    }
    public static void searchThreeFive(String a){
        String [] words = a.split(" ");
        for (int i = 0; i < words.length; i++) {

            if(words[i].length()>=3 && words[i].length() <=5){
                System.out.println(words[i]);
           }
        }
    }
    public static void searchTheSmallest(String a){
        String [] words = a.split(" ");
        String small = words[0];
        for (int i = 0; i < words.length; i++)
        {
            if(words[i].length() < small.length() ){
                small = words[i];
            }
        }
        System.out.println(small);
    }

    public static void searchTheBeggest(String a){
        String [] words = a.split(" ");
        String big = words[0];
        for (int i = 0; i < words.length; i++)
        {
            if(words[i].length() >= big.length()){
                big = words[i];
            }
        }
        System.out.println(big);
         }




    }

