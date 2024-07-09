import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> listA = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            listA.add(scanner.nextLine());
        }
        System.out.println(listA);


        ArrayList<String > listB = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            listB.add(scanner.nextLine());
        }

        System.out.println(listB);

        ArrayList<String> listC = new ArrayList<>();

        Collections.reverse(listB);

        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
        }
        System.out.println(listC);

        listC.sort(Comparator.comparing(String::length));

        System.out.println(listC);
    }
}
