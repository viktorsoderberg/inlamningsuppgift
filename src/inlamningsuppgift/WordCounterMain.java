package inlamningsuppgift;

import java.util.Scanner;

public class WordCounterMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        WordCounter myCounter = new WordCounter();

        System.out.println("Skriv lite text, avsluta med stop");

        String inputText = scan.nextLine();
        myCounter.isStopped(inputText);

        while (!myCounter.isGetStop()) {

            myCounter.addCharacters(inputText);
            myCounter.addRows();

            inputText = scan.nextLine();

            myCounter.isStopped(inputText);

        }

        System.out.println("Du skrev " + myCounter.getCharacters() + " antal tecken");
        System.out.println("Du skrev " + myCounter.getRows() + " rader");
    }
}
