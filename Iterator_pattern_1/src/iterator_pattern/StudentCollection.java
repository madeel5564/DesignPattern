/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fa20-bse-163
 */
class StudentCollection {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public StudentIterator getIterator() {
        return new StudentIterator(students);
    }
}