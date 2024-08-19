package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
  public static void main(String[] args) {
    Box<Object> objBox = new Box<>();
    Box<Dog> dogBox = new Box<>();
    Box<Cat> catBox = new Box<>();

    dogBox.set(new Dog("멍멍이", 100));

    WildcardEx.printGenericV1(dogBox);
    WildcardEx.printWildcardV1(dogBox);

    WildcardEx.printGenericV2(dogBox);
    WildcardEx.printWildcardV2(dogBox);

    // 제네릭 메서드의 경우, 제한된 타입의 하위 타입으로 반환받을 수 있다. (동적)
    Dog dog = WildcardEx.printAndRerutnGeneric(dogBox);

    // 와일드카드의 경우, 제한된 타입으로만 반환이 가능하다. 하위 타입으로는 반환받을 수 없다.
    Animal animal = WildcardEx.printAndRerutnWildcard(dogBox);
  }
}
