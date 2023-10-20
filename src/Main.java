import hw_07_02.MyDictionary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MyDictionary myDictionary = new MyDictionary();
        myDictionary.add("cat", "кіт");
        myDictionary.add("dog", "пес");
        myDictionary.add("frog", "жаба");

        Scanner input = new Scanner(System.in);
        System.out.println("Наберіть одне з слів: \"кіт\", \"пес\", \"жаба\":");
        String inputWord = input.nextLine();
        try {
            System.out.println( myDictionary.getEng(inputWord) );
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Переклад не знайдено, невідоме слово: \"" + inputWord + "\"");
            System.out.println("Відомо кількість слів: " + myDictionary.getTotalNumber() );
            System.out.println(myDictionary.engList);
        }
    }
}