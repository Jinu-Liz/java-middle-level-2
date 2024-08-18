package generic.test.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {
  public static void main(String[] args) {
    Box<Object> objBox = new Box<>();
    Box<Animal> animalBox = new Box<>();
    Box<Dog> dogBox = new Box<>();
    Box<Cat> catBox = new Box<>();

    // Animal 포함 상위 타입 전달 가능
    writeBox(objBox);
    writeBox(animalBox);
//    writeBox(dogBox); // 하한이 Animal이므로 하위 타입인 Dog는 들어갈 수 없다.
//    writeBox(catBox); // 하한이 Animal이므로 하위 타입인 Cat은 들어갈 수 없다.

    Animal animal = animalBox.get();
    System.out.println("animal = " + animal);
  }

  // 와일드카드는 super을 사용하여 하한을 지정할 수 있다.
  static void writeBox(Box<? super Animal> box) {
    box.set(new Dog("멍멍이", 100));
  }
}
