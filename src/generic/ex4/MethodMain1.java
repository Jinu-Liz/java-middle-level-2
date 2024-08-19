package generic.ex4;

public class MethodMain1 {
  public static void main(String[] args) {
    Integer i = 10;
    Object obj = GenericMethod.objectMethod(i);
    Integer integer = (Integer) obj;

    // 타입 인자(Type Argument) 명시적 전달
    System.out.println("명시적 타입 인자 전달");
    Integer result = GenericMethod.<Integer>numberMethod(i);
    Integer integerValue = GenericMethod.<Integer>numberMethod(10);
    Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

    // 타입 추론. 자바 컴파일러가 인자와 반환값을 통해 타입을 추론한다.
    System.out.println("타입 추론");
    Integer result1 = GenericMethod.numberMethod(i);
    Integer integerValue1 = GenericMethod.numberMethod(10);
    Double doubleValue1 = GenericMethod.numberMethod(20.0);
  }
}
