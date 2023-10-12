import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Metin giriniz : ");
        String sentence = input.nextLine();

        String[] words = sentence.split(" ");
        HashMap<String, Integer> hMap = new HashMap<>();

        for (String word : words) {
            if (hMap.containsKey(word)) {
                int count = hMap.get(word);
                hMap.put(word, count + 1);
            } else {
                hMap.put(word, 1);
            }
        }

        int maxCount = 0;
        String target = "";

        for (String word : hMap.keySet()){
            int count = hMap.get(word);
            if (count > maxCount){
                maxCount = count;
                target = word;
            }
        }
        System.out.println("En çok tekrar eden kelime : " + target +
                "\n " + maxCount +  " kez tekrar etti");


    }
}