package com.home.office;

public class Person {
    public static final String MALE = "male";
    public static final String FEMALE = "female";
    private String name;
    private int age;
    private String sex = FEMALE;
    private Address address;

    public Person(String name, int age, String sex, Address address) {
        this.name = name;
        this.age = age;
        if (MALE.equals(sex) || FEMALE.equals(sex)) {
            this.sex = sex;
        }
        this.address = address;
    }

    public static String getMALE() {
        return MALE;
    }

    public static String getFEMALE() {
        return FEMALE;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address=" + address +
                '}';
    }
}

