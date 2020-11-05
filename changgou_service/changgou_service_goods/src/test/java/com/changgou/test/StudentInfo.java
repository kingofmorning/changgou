package com.changgou.test;

import javax.persistence.Id;
import java.util.Map;

public class StudentInfo {

    @Id
    private String id;
    private Map<String,Object> classes;
    private String name;


    public StudentInfo(String id, Map<String, Object> classes, String name) {
        this.id = id;
        this.classes = classes;
        this.name = name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, Object> getClasses() {
        return classes;
    }

    public void setClasses(Map<String, Object> classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "StudentInfo{" +
                "id='" + id + '\'' +
                ", classes=" + classes +
                ", name='" + name + '\'' +
                '}';
    }
}
