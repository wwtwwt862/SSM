package com.itguigu.pojo;

public class Student {
    private String name;
    private Integer age;
    private Integer id;
    private String gender;
    private String classes;

    public Student(String name, Integer age, Integer id, String gender, String classes) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.gender = gender;
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", gender='" + gender + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
