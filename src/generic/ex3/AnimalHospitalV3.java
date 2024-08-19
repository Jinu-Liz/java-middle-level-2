package generic.ex3;

import generic.animal.Animal;

/**
 * 타입 매개변수 T를 Animal과 그 자식만 받을 수 있도록 제한
 * Animal의 기능을 사용할 수 있게 된다.
 */
public class AnimalHospitalV3<T extends Animal> {

  private T animal;

  public void set(T animal) {
    this.animal = animal;
  }

  public void checkup() {

    System.out.println("동물 이름: " + animal.getName());
    System.out.println("동물 크기: " + animal.getSize());
    animal.sound();
  }

  public T bigger(T target) {
    return animal.getSize() > target.getSize() ? animal : target;
  }

}
