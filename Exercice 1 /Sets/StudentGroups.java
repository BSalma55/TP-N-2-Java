import java.util.HashSet;
import java.util.Set;

public class StudentGroups {
    public static void main(String[] args) {

        Set<String> groupA = new HashSet<>();
        Set<String> groupB = new HashSet<>();

        groupA.add("Ali");
        groupA.add("Sara");
        groupA.add("Salma");
        groupA.add("Youssef");

        groupB.add("Sara");
        groupB.add("Houda");
        groupB.add("Salma");
        groupB.add("Rachid");

        System.out.println("Group A: " + groupA);
        System.out.println("Group B: " + groupB);
        System.out.println("\n");

        Set<String> intersection = new HashSet<>(groupA);
        intersection.retainAll(groupB);
        System.out.println("Intersection (A ∩ B): " + intersection);

        Set<String> union = new HashSet<>(groupA);
        union.addAll(groupB);
        System.out.println("Union (A ∪ B): " + union);
    }
}
