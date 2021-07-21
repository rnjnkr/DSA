package streams;

import java.util.Arrays;
import java.util.List;

/**
 * Write a method to update the city attribute of Student object array list passed as an input parameter.
 * If the city is "Mumbai" then change it to "Delhi".
 * The method should return how many student records were updated.
 */
public class StudentCityChange {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student(1, "Pune"),
                new Student(2, "Mumbai"), new Student(3, "Jaipur"),
                new Student(4, "Mumbai"));
        System.out.println("Records updated: #" + updateStudentCity(list));
    }

    private static int updateStudentCity(List<Student> list) {
        return (int) list.stream().filter(student -> student.getCity().equalsIgnoreCase("Mumbai"))
                .map(student -> new Student(student.getId(), "Delhi")).count();
    }
}

class Student {
    private int id;
    private String city;

    public String getCity() {
        return city;
    }

    public int getId() {
        return id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Student(int id, String city) {
        this.id = id;
        this.city = city;
    }
}
