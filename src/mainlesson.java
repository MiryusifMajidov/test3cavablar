import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class mainlesson {
    public static void main(String[] args) {
       /* Consumer<String> pr = System.out::println;

        pr.accept("salam");*/


        /*Predicate<Integer> isEven = n -> n % 2 == 0;

        isEven.test(22);
        isEven.test(21);
*/

        List<Person> p =  new ArrayList<>();
        p.add(new Person("ali", 22));
        p.add(new Person("semed", 12));
        p.add(new Person("yusif", 21));
        p.add(new Person("ibrahim", 19));

        Collections.sort(p);

        // Nəticə
        for (Person pe : p) {
            System.out.println(pe);
        }
    }
}

