package generic.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal> {

  private T animal;

  public void set(T animal) {
    this.animal = animal;
  }

  /**
   * 제네릭 타입과 제네릭 메서드의 타입 인자명이 같을 경우,
   * 제네릭 메서드가 우선 순위를 가진다.
   * 프로그래밍은 보다 가깝고, 구체적인 것이 우선 순위를 가지기 때문.
   *
   * 당연한 얘기지만, 같이 만들 경우에는 애매모호하므로 이름을 다르게 지어야한다.
   */
  public <T> T printAndReturn(T z) {
    System.out.println("animal.className: " + animal.getClass().getName());
    System.out.println("t.className: " + z.getClass().getName());

    return z;
  }
}
