package Sets;

import java.util.HashSet;
import java.util.Set;

public class StudentGroups {

    public static void main(String[] args) {

        // 1️⃣ Créer deux HashSet
        Set<String> groupA = new HashSet<>();
        Set<String> groupB = new HashSet<>();

        // Ajouter les étudiants à chaque groupe
        groupA.add("Ali");
        groupA.add("Sara");
        groupA.add("Salma");
        groupA.add("Youssef");

        groupB.add("Sara");
        groupB.add("Houda");
        groupB.add("Salma");
        groupB.add("Rachid");

        // Afficher les groupes
        System.out.println("Group A: " + groupA);
        System.out.println("Group B: " + groupB);
        System.out.println("\n");

        // 2️⃣ Intersection : étudiants présents dans les deux groupes
        Set<String> intersection = new HashSet<>(groupA);
        intersection.retainAll(groupB);
        System.out.println("Intersection (A ∩ B): " + intersection);

        // 3️⃣ Union : tous les étudiants des deux groupes sans doublons
        Set<String> union = new HashSet<>(groupA);
        union.addAll(groupB);
        System.out.println("Union (A ∪ B): " + union);
    }
}

