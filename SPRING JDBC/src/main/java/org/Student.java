package org;

public class Student
{
    private int id;
    private String name;
    private int rollNo;
    private String course;

    // Constructor
    public Student() {
    }

    public Student(int id, String name, int rollNo, String course) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    // Getter Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // To String
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", course='" + course + '\'' +
                '}';
    }
}
