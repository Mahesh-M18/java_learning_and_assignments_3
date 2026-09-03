import wordfrequencycounter.WordFrequency;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text : ");

        String text = input.nextLine();

        String cleanedText = text.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "").trim();
        if (cleanedText.isEmpty()) {
            System.out.println("No valid words entered.");
            input.close();
            return;
        }

        String[] words = cleanedText.split("\\s+");

        WordFrequency frequencyCounter = new WordFrequency();

        frequencyCounter.getFrequency(words);

        input.close();
    }
}
