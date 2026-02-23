package entities;

public class People {
    String name;
    int age;
    float height;

    public People(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public float getHeight() {
        return height;
    }
}
