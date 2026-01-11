package Maps;
import java.util.HashMap;
import java.util.Map;

public class StudentGrades {

    public static void display(Map<String, Double> map) {
        map.forEach((name, grade) ->
                System.out.println(name + " : " + grade)
        );
        System.out.println("\n");
    }

    public static void main(String[] args) {

        // 1. Create HashMap and insert student grades
        HashMap<String, Double> grades = new HashMap<>();
        grades.put("Ali", 14.5);
        grades.put("Sara", 17.0);
        grades.put("salma", 12.0);
        grades.put("houda", 19.0);

        System.out.println("Initial grades:");
        display(grades);

        // 2. Increase a student's grade
        grades.put("Ali", grades.get("Ali") + 1);
        System.out.println("After increasing Ali's grade:");
        display(grades);

        // 3. Increase another student's grade
        grades.put("Sara", grades.get("Sara") + 0.5);
        System.out.println("After increasing Sara's grade:");
        display(grades);

        // 4. Delete a student's grade
        grades.remove("salma");
        System.out.println("After deleting salma:");
        display(grades);

        // 5. Display the size of the map
        System.out.println("Number of students: " + grades.size());
        System.out.println("\n");

        // 6. Average, max, min grades
        double sum = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (double g : grades.values()) {
            sum += g;
            if (g > max) max = g;
            if (g < min) min = g;
        }

        double average = sum / grades.size();

        System.out.println("Average grade: " + average);
        System.out.println("Maximum grade: " + max);
        System.out.println("Minimum grade: " + min);
        System.out.println("\n");

        // 7. Check if there is a grade equal to 20
        boolean has20 = grades.containsValue(20.0);
        System.out.println("Is there a grade equal to 20? " + has20);
        System.out.println("\n");

        // 8. Display list using forEach + lambda
        System.out.println("Final list of students:");
        grades.forEach((name, grade) ->
                System.out.println(name + " => " + grade)
        );
    }
}
