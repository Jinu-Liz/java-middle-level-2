package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV3<E> implements MySet<E> {

  static final int DEFAULT_INITIAL_CAPACITY = 16;

  private int size = 0;

  private int capacity = DEFAULT_INITIAL_CAPACITY;

  private LinkedList<E>[] buckets;

  public MyHashSetV3() {
    initBuckets(capacity);
  }

  public MyHashSetV3(int capacity) {
    this.capacity = capacity;
    initBuckets(capacity);
  }

  private void initBuckets(int capacity) {
    buckets = new LinkedList[capacity];
    for (int i = 0; i < capacity; i++) {
      buckets[i] = new LinkedList<>();
    }
  }

  public boolean add(E value) {
    int hashIndex = hashIndex(value);
    LinkedList<E> bucket = buckets[hashIndex];
    if (bucket.contains(value)) return false;

    bucket.add(value);
    size++;

    return true;
  }

  public boolean contains(E searchValue) {
    int hashIndex = hashIndex(searchValue); // O(1)
    LinkedList<E> bucket = buckets[hashIndex]; // O(1)

    return bucket.contains(searchValue); // O(n) -> O(1)  해시충돌의 가능성이 매우 낮아 사실상 O(1)
  }

  public boolean remove(E value) {
    int hashIndex = hashIndex(value);
    LinkedList<E> bucket = buckets[hashIndex];
    boolean result = bucket.remove(value);
    if (!result) return false;

    size--;
    return true;
  }

  private int hashIndex(E value) {
    return Math.abs(value.hashCode()) % capacity;
  }

  public int getSize() {
    return size;
  }

  @Override
  public String toString() {
    return "MyHashSetV3{" +
      "buckets=" + Arrays.toString(buckets) +
      ", size=" + size +
      ", capacity=" + capacity +
      '}';
  }
}
