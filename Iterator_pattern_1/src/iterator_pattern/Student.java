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

// Step 1: Student class
class Student {
    private int registrationNo;
    private String name;
    private String gender;
    private String phoneNumber;

    public Student(int registrationNo, String name, String gender, String phoneNumber) {
        this.registrationNo = registrationNo;
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public int getRegistrationNo() {
        return registrationNo;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}