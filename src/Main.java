import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    }
}

class Passengers {
    String name;
    int age;
    double weight;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Passengers(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Passedgers " +
                "name=" + name +
                ", age=" + age +
                ", weight=" + weight;
    }


}

class Bus {
    String color;
    int nums;
    int capacity;

    @Override
    public String toString() {
        return "Bus{" +
                "color='" + color + '\'' +
                ", nums=" + nums +
                ", capacity=" + capacity +
                '}';
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Bus(String color, int nums, int capacity) {
        this.color = color;
        this.nums = nums;
        this.capacity = capacity;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }

    public static void exBus() {

    }public static void exPers() {
        Passengers[] skolko = {new Passengers("Чук", 19, 65),
                new Passengers("Гек", 29, 75),
                new Passengers("Мук", 9, 34),};
        Passengers[] skolko1 = {new Passengers("Як",7,22),
                new Passengers("Мия",17,55),
                new Passengers("Гея",42,65),};
        Passengers[] skolko2 = {
                new Passengers("Кага",15,44),
                new Passengers("Кери",14,46),
                new Passengers("Марта",30,165)};
        ArrayList<Passengers> spisok = new ArrayList<>(List.of(skolko));
        System.out.println(spisok);
    }
}