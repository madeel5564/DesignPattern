/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator_pattern;

/**
 *
 * @author fa20-bse-163
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        StudentCollection studentCollection = new StudentCollection();

        // Add some students
        studentCollection.addStudent(new Student(1, "Muhammad Adeel", "Male", "11111111111"));
        studentCollection.addStudent(new Student(2, "Maria Johnson", "Female", "22222222222"));
        studentCollection.addStudent(new Student(3, "hozeha ", "Male", "33333333333"));

        // Print students whose names start with "Muhammad"
       System.out.println("Students whose names start with 'Muhammad':");
StudentIterator iterator = studentCollection.getIterator();
while (iterator.hasNext()) {
    Student student = iterator.next();
    if (student.getName().startsWith("Muhammad")) {
        System.out.println("Name: " + student.getName());
    }
}

// Print all student names separately
System.out.println("\nAll student names:");
iterator = studentCollection.getIterator();
while (iterator.hasNext()) {
    Student student = iterator.next();
    System.out.println(student.getName());
} } }