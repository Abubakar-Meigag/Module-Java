import module.School;
import module.Student;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String[] firstNames = {"Anuket", "Eryn", "Filip", "Raquel", "Eryn"};
        String[] lastNames  = {"Hassan", "Doe", "Pappas", "Clarke", "Jones"};
        int[]    grades     = {22, 45, 35, 22, 41};


        School school = new School();

        System.out.println(school.getStudentToGrade(firstNames, lastNames, grades));

        System.out.println(school.getFirstNames(firstNames, lastNames, grades));
        System.out.println(school.getDistinctFirstNames(firstNames, lastNames, grades));
        System.out.println(school.getLastNameToGrade(firstNames, lastNames, grades));
        System.out.println(school.getDistinctFirstNamesInAlphabeticalOrder(firstNames, lastNames, grades));

        // Exercise 2.3
        List<String> namesList          = school.getFirstNames(firstNames, lastNames, grades);
        Set<String> distinctNames       = school.getDistinctFirstNames(firstNames, lastNames, grades);
        Set<String> sortedNames         = school.getDistinctFirstNamesInAlphabeticalOrder(firstNames, lastNames, grades);
        Map<String, Integer> lastToGrade = school.getLastNameToGrade(firstNames, lastNames, grades);
        Map<Student, Integer> studentToGrade = school.getStudentToGrade(firstNames, lastNames, grades);

        Student newStudent = new Student("John", "Smith");
        namesList.add("John");
        distinctNames.add("John");
        sortedNames.add("John");
        lastToGrade.put("Smith", 78);
        studentToGrade.put(newStudent, 78);

        System.out.println("After adding John Smith:");
        System.out.println(namesList);
        System.out.println(distinctNames);
        System.out.println(sortedNames);
        System.out.println(lastToGrade);
        System.out.println(studentToGrade);

        Student removedStudent = new Student("Filip", "Pappas");
        namesList.remove("Filip");
        distinctNames.remove("Filip");
        sortedNames.remove("Filip");
        lastToGrade.remove("Pappas");
        studentToGrade.remove(removedStudent);

        System.out.println("\nAfter removing Filip Pappas:");
        System.out.println(namesList);
        System.out.println(distinctNames);
        System.out.println(sortedNames);
        System.out.println(lastToGrade);
        System.out.println(studentToGrade);

        Student cheater = new Student("Raquel", "Clarke");
        lastToGrade.put("Clarke", 0);
        studentToGrade.put(cheater, 0);

        System.out.println("\nAfter setting Raquel Clarke's grade to 0:");
        System.out.println(lastToGrade);
        System.out.println(studentToGrade);

        // Exercise 2.4
        int highest = Collections.max(studentToGrade.values());
        int lowest = Collections.min(studentToGrade.values());
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

        Student topStudent = studentToGrade.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
        System.out.println("Top student: " + topStudent);

        List<String> duplicateNames = namesList.stream()
                .filter(name -> Collections.frequency(namesList, name) > 1)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Shared first names: " + duplicateNames);



    }


}
