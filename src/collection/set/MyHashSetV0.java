package collection.set;

import java.util.Arrays;

/**
 * 입력 / 검색의 성능이 O(n)으로 좋지 않다.
 */
public class MyHashSetV0 {

  private int[] elementData = new int[10];

  private int size = 0;

  public boolean add(int value) {
    if (contains(value)) return false;

    elementData[size] = value;
    size++;

    return true;
  }

  public boolean contains(int value) {
    for (int data : elementData) {
      if (data == value) return true;
    }

    return false;
  }

  public int size() {
    return size;
  }

  @Override
  public String toString() {
    return "MyHashSetV0{" +
      "elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) +
      ", size=" + size +
      '}';
  }
}
