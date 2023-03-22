package meinVersuch.Krankenhaus;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private char gender;

    private String eyeColor;

    public Person(String name, int age, char gender, String eyeColor) {
        this.name = name;
        this.age = age;
        switch (gender){
            case 'f':
            case 'w':
            case 'm':
            case 'd':
                this.gender = gender;
                break;
            default:
                System.out.println("Dieses Geschlecht gibt es nicht");
                break;
        }
        setEyeColor(eyeColor);

    }

    public abstract void doSomehting();

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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        switch (eyeColor){
            case "blue":
            case "brown":
            case "green":
            case "grey":
                this.eyeColor = eyeColor;
                break;
            case "red":
                System.out.println("Bitte einen Drogentest machen");
                this.eyeColor = eyeColor;
                break;
            default:
                System.out.println("Diese Augenfarbe ist unzulässig");
                break;

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && gender == person.gender && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
