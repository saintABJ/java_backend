import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 11;
        int c = a + b;
        System.out.println(c);

        var vehicle = new Vehicle();
        vehicle.speed();

        ArrayList<String> people = new ArrayList<String>();
        people.add("Ayo");
        people.add("Deji");
        people.add("Femi");

        int size = people.size();

        for (int i = 0; i < size; i++) {
            System.out.println(people.get(i));
        }

        // Assignment: iterate over a HashSet
        //Read up: Java Data (Structures)
        // Inherit two interfaces from a class
        // learn readme and use it to write your java class notes

        HashSet<String> currencies =  new HashSet<>();
        currencies.add("naira");
        currencies.add("dollar");
        currencies.add("pounds");
        currencies.add("yen");

        Iterator<String> iterator = currencies.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}


