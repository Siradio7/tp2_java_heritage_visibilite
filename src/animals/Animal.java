package animals;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("L'animal fait un bruit");
    }

    public void displayInfo() {
        System.out.println(name + " est un animal de " + age + " ans.");
    }
}
