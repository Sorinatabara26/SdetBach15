package class29HomeWork;
/*Create a Set of cities in which
    you want to make sure that insertion order is maintained. Then remove any city that starts with “A”;*/
import java.util.LinkedHashSet;

public class Task1 {

    public static void main(String[] args) {
        LinkedHashSet<String>cities=new LinkedHashSet<>();
        cities.add("Chisinau");
        cities.add("Madrid");
        cities.add("Athena");
        cities.add("Kiev");

        System.out.println(cities);

        cities.removeIf(i->i.startsWith ("A"));//remove Athena
        System.out.println(cities);

    }
}