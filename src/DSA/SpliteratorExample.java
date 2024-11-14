package DSA;
import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Jack");
        names.add("Jill");

        // Get a Spliterator from the list
        Spliterator<String> spliterator = names.spliterator();

        // Estimate the size of the Spliterator
        System.out.println("Estimated size: " + spliterator.estimateSize());

        // Check the characteristics of the Spliterator
        System.out.println("Characteristics: " + spliterator.characteristics());

        // Use tryAdvance to iterate through elements
        System.out.println("Using tryAdvance:");
        spliterator.tryAdvance(System.out::println);

        // Split the Spliterator and iterate over each part
        Spliterator<String> secondHalf = spliterator.trySplit();
        System.out.println("\nElements in first part:");
        spliterator.forEachRemaining(System.out::println);

        System.out.println("\nElements in second part:");
        if (secondHalf != null) {
            secondHalf.forEachRemaining(System.out::println);
        }
    }
}
