package org.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teacher
{
    private int id;
    private String name;
    private List<String> degree;
    private Set<String> collegeName;
    private Map<String,String> collegeCourse;

    public Teacher() {
    }

    public Teacher(int id, String name, List<String> degree, Set<String> collegeName, Map<String, String> collegeCourse) {
        this.id = id;
        this.name = name;
        this.degree = degree;
        this.collegeName = collegeName;
        this.collegeCourse = collegeCourse;
    }

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

    public List<String> getDegree() {
        return degree;
    }

    public void setDegree(List<String> degree) {
        this.degree = degree;
    }

    public Set<String> getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(Set<String> collegeName) {
        this.collegeName = collegeName;
    }

    public Map<String, String> getCollegeCourse() {
        return collegeCourse;
    }

    public void setCollegeCourse(Map<String, String> collegeCourse) {
        this.collegeCourse = collegeCourse;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", degree=" + degree +
                ", collegeName=" + collegeName +
                ", collegeCourse=" + collegeCourse +
                '}';
    }
}
