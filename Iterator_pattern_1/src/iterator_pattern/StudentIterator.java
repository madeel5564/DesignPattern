/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator_pattern;

import java.util.List;

/**
 *
 * @author fa20-bse-163
 */
class StudentIterator {
    private List<Student> students;
    private int current;

    public StudentIterator(List<Student> students) {
        this.students = students;
        current = students.size() - 1;
    }

    public boolean hasNext() {
        return current >= 0;
    }

    public Student next() {
        if (hasNext()) {
            return students.get(current--);
        }
        return null;
    }

    public Student previous() {
        if (current < students.size() - 1) {
            return students.get(++current);
        }
        return null;
    }

    public void moveToLast() {
        current = students.size() - 1;
    }

    public void moveFirst() {
        current = 0;
    }

    void moveToFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
