package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {
  public static void main(String[] args) {
    Animal animal = new Animal("동물", 0);
    Dog dog = new Dog("멍멍이", 100);
    Cat cat = new Cat("냐옹이", 50);

    // Animal이 부모이기 때문에 전부 넣을 수 있다.
    Box<Animal> animalBox = new Box<>();
    animalBox.set(animal);
    animalBox.set(dog);
    animalBox.set(cat);
  }
}
