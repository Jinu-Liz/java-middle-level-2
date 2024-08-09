package generic.ex1;

public class BoxMain2 {
  public static void main(String[] args) {

    /**
     * 계속 타입 캐스팅 코드를 넣어, 원하는 타입으로 다운 캐스팅을 해야 한다.
     * 그러나 이는 반환값이 정확히 어떤 타입인지 모르기 때문에 위험하다.
     */
    ObjectBox integerBox = new ObjectBox();
    integerBox.set(10);
    Integer integer = (Integer) integerBox.get();   // Object -> Integer 캐스팅
    System.out.println("integer = " + integer);

    ObjectBox stringBox = new ObjectBox();
    stringBox.set("hello");
    String str = (String) stringBox.get();   // Object -> String 캐스팅
    System.out.println("str = " + str);

    // 잘못된 타입의 인수 전달 시
    integerBox.set("문자100");
    hello(integerBox);
  }

  /**
   * Integer가 들어올 것이라 기대했지만, 위에서 문자열을 전달. 에러가 발생한다.
   * 실무에서 값을 넣는 사람과 받는 사람이 다를 경우, 타입을 잘못 전달할 가능성이 존재한다.
   */
  private static void hello(ObjectBox integerBox) {
    Integer result = (Integer) integerBox.get();  // String -> Integer 캐스팅 예외
    System.out.println("result = " + result);
  }

}
