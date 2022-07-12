package org.springcore;

public class Student
{
    private String name;
    private int studentId;
    private String address;


    public Student() {
    }

    public Student(String name, int studentId, String address) {
        this.name = name;
        this.studentId = studentId;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", address='" + address + '\'' +
                '}';
    }

}
