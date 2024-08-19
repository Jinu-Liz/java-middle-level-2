package generic.ex5;

import generic.animal.Animal;

/**
 * 와일드카드는 만들어져있는 제네릭을 좀 더 사용하기 쉽게 해주는 역할을 한다.
 * 타입 인자가 정해진 제네릭 타입을 전달 받아서 활용할 때 사용한다.
 */
public class WildcardEx {

  static <T> void printGenericV1(Box<T> box) {
    System.out.println("T = " + box.get());
  }

  static void printWildcardV1(Box<?> box) {
    System.out.println("? = " + box.get());
  }

  static <T extends Animal> void printGenericV2(Box<T> box) {
    T t = box.get();
    System.out.println("이름 = " + t.getName());
  }

  static void printWildcardV2(Box<? extends Animal> box) {
    Animal animal = box.get();
    System.out.println("이름 = " + animal.getName());
  }

  static <T extends Animal> T printAndRerutnGeneric(Box<T> box) {
    T t = box.get();
    System.out.println("이름 = " + t.getName());

    return t;
  }

  static Animal printAndRerutnWildcard(Box<? extends Animal> box) {
    Animal animal = box.get();
    System.out.println("이름 = " + animal.getName());

    return animal;
  }
}
