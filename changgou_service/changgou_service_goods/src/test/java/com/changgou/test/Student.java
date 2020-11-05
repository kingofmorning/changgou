package com.changgou.test;

public class Student {

    private String id;
    private String classId;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", classId='" + classId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String id, String classId, String name, int age) {
        this.id = id;
        this.classId = classId;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
