package generic.ex1;

/**
 * 각 타입마다 값을 담는 Box를 만든다고 가정할 경우,
 * 타입이 늘어날 때마다 같은 모양의 Box를 계속 만들어 주어야 한다.
 */
public class BoxMain1 {

  public static void main(String[] args) {
    IntegerBox integerBox = new IntegerBox();
    integerBox.set(10);   // 오토 박싱
    Integer integer = integerBox.get();
    System.out.println("integer = " + integer);

    StringBox stringBox = new StringBox();
    stringBox.set("hello");
    String str = stringBox.get();
    System.out.println("str = " + str);
  }

}
