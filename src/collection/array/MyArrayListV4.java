package collection.array;

import java.util.Arrays;

/**
 * 배열을 사용하므로, 정확한 길이를 알지 못하면 메모리가 낭비될 수 있다.
 * 데이터를 중간에 추가/삭제 시 비효율적이다.
 */
public class MyArrayListV4<E> {

  private static final int DEFAULT_CAPACITY = 5;

  private Object[] elementData;

  private int size = 0;

  public MyArrayListV4() {
    elementData = new Object[DEFAULT_CAPACITY];
  }

  public MyArrayListV4(int initialCapacity) {
    elementData = new Object[initialCapacity];
  }

  public int size() {
    return size;
  }

  /**
   * 타입을 지정해버리면, 타입 방어를 할 수 없다.
   * 따라서, 데이터가 들어오는 경우를 잘 막아야한다.
    */
  public void addBad(String s) {
    elementData[size] = s;
    size++;
  }

  public void add(E e) {
    if (size == elementData.length) grow();

    elementData[size] = e;
    size++;
  }

  // 코드 추가
  public void add(int index, E e) {
    if (size == elementData.length) grow();

    // 데이터 이동
    shiftRightFrom(index);
    elementData[index] = e;
    size++;
  }

  // 코드 추가, 요소의 마지막부터 index까지 오른쪽으로 밀기
  private void shiftRightFrom(int index) {
    for (int i = size; i > index; i--) {
      elementData[i] = elementData[i - 1];
    }
  }

  private void grow() {
    int oldCapacity = elementData.length;
    int newCapacity = oldCapacity * 2;
    // 배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
    elementData = Arrays.copyOf(elementData, newCapacity);
  }

  @SuppressWarnings("unchecked")
  public E get(int index) {
    return (E) elementData[index];
  }

  public E set(int index, E element) {
    E oldValue = get(index);
    elementData[index] = element;

    return oldValue;
  }

  // 코드 추가
  public E remove(int index) {
    E oldValue = get(index);
    shiftLeftFrom(index);

    size--;
    elementData[size] = null;

    return oldValue;
  }

  // 코드 추가, 요소의 index부터 마지막까지 왼쪽으로 밀기
  private void shiftLeftFrom(int index) {
    for (int i = index; i < size -1; i++) {
      elementData[i] = elementData[i + 1];
    }
  }

  public int indexOf(E o) {
    for (int i = 0; i < size; i++) {
      if (o.equals(elementData[i])) return i;
    }

    return -1;
  }

  public String toString() {
    return Arrays.toString(Arrays.copyOf(elementData, size)) +
      ", size = " + size + ", capacity = " + elementData.length;
  }
}
