import java.util.HashMap;
public class StudentGradesApp {
    public static void main(String[] args) {
        HashMap<String, Double> grades = new HashMap<>();

        grades.put("Salma", 15.0);
        grades.put("Ayoub", 18.0);
        grades.put("Mehdi", 12.5);
        grades.put("Meriem", 19.0);

        System.out.println("After inserting grades:");
        displayGrades(grades);

        grades.computeIfPresent("Salma", (k, v) -> v + 2);
        System.out.println("\nAfter increasing Salma's grade:");
        displayGrades(grades);

        grades.computeIfPresent("Mehdi", (k, v) -> v + 3);
        System.out.println("\nAfter increasing Mehdi's grade:");
        displayGrades(grades);

        grades.remove("Ayoub");
        System.out.println("\nAfter deleting Ayoub's grade:");
        displayGrades(grades);

        System.out.println("\nSize of the map: " + grades.size());

        double sum = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        for (double v : grades.values()) {
            sum += v;
            if (v > max) max = v;
            if (v < min) min = v;
        }
        double average = sum / grades.size();
        System.out.println("Average grade: " + average);
        System.out.println("Maximum grade: " + max);
        System.out.println("Minimum grade: " + min);

        boolean has20 = grades.containsValue(20.0);
        System.out.println("Is there a grade equal to 20? " + (has20 ? "Yes" : "No"));
    }

    public static void displayGrades(HashMap<String, Double> grades) {
        grades.forEach((student, grade) -> System.out.println(student + " : " + grade));
    }
}
