package collection.iterable;

import java.util.Iterator;

/**
 * Iterable 인터페이스는 해당 자료구조에 사용할 반복자(Iterator)를 반환하면 된다.
 */
public class MyArray implements Iterable<Integer> {

  private int[] numbers;

  public MyArray(int[] numbers) {
    this.numbers = numbers;
  }

  @Override
  public Iterator<Integer> iterator() {
    return new MyArrayIterator(numbers);
  }
}
