package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {
  public static void main(String[] args) {
    MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});
    Iterator<Integer> iterator = myArray.iterator();
    System.out.println("iterator 사용");

    while (iterator.hasNext()) {{
      Integer value = iterator.next();
      System.out.println("value = " + value);
    }}

    // 추가

    /**
     * java: for-each not applicable to expression type
     *   required: array or java.lang.Iterable
     *   found:    collection.iterable.MyArray
     *
     *   Iterable을 구현하지 않으면 해당 에러가 발생.
     *   향상된 for문은 Iterable 인터페이스를 구현한 객체에 대해
     *   반복을 사용할 수 있도록 해주는 것을 알 수 있다.
     */
    System.out.println("for-each 사용");
    for (int value : myArray) {
      System.out.println("value = " + value);
    }
  }
}
