package generic.ex4;

/**
 * 제네릭 타입의 경우, 객체를 생성하는 시점에 타입 인자를 전달하고
 * 제네릭 메서드의 경우, 메서드를 호출하는 시점에 타입 인자를 전달한다.
 *
 * 제네릭 메서드는 인스턴스 메서드와 static 메서드에 모두 적용할 수 있다.
 * 그러나 static 메서드의 경우, 제네릭 타입의 타입 매개변수를 사용할 수 없다.
 * static 메서드는 인스턴스 단위가 아니라 클래스 단위로 작동하지만,
 * 제네릭 타입은 객체를 생성하는 시점에 타입이 정해지기 때문이다. (인스턴스 단위)
 *
 * 따라서 static 메서드에 제네릭을 도입하려면 제네릭 메서드를 사용해야한다.
 */
public class GenericMethod {

  <T> T instanceMethod() { return null; }   // 인스턴스 메서드에 제네릭 메서드를 사용할 수 있다.

  public static Object objectMethod(Object obj) {
    System.out.println("Object print: " + obj);

    return obj;
  }

  /**
   * 메서드에만 적용하여 사용하는 제네릭 메서드.
   */
  public static <T> T genericMethod(T obj) {
    System.out.println("generic print: " + obj);

    return obj;
  }

  public static <T extends Number> T numberMethod(T obj) {
    System.out.println("bound print: " + obj);

    return obj;
  }

}
