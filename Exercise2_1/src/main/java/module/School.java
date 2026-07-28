package module;

import java.util.*;

public class School {

    public List<String> getFirstNames(String[] firstNames, String[] lastNames, int[] grades) {
        return new ArrayList<>(Arrays.asList(firstNames));
    }

    public HashSet<String> getDistinctFirstNames(String[] firstNames, String[] lastNames, int[] grades) {
        return new HashSet<>(Arrays.asList(firstNames));
    }

    public Set<String> getDistinctFirstNamesInAlphabeticalOrder(String[] firstNames, String[] lastNames, int[] grades) {
        return new TreeSet<>(Arrays.asList(firstNames));
    }

    public Map<String, Integer> getLastNameToGrade(String[] firstNames, String[] lastNames, int[] grades) {
        Map<String, Integer> lastNameToGrade = new HashMap<>();
        for (int i = 0; i < lastNames.length; i++) {
            lastNameToGrade.put(lastNames[i], grades[i]);
        }
        return lastNameToGrade;
    }

    public Map<Student, Integer> getStudentToGrade(String[] firstNames, String[] lastNames, int[] grades) {
        Map<Student, Integer> studentToGrade = new HashMap<>();
        for (int i=0; i < firstNames.length; i++) {
            studentToGrade.put(new Student(firstNames[i], lastNames[i]), grades[i]);
        }
        return studentToGrade;
    }

}