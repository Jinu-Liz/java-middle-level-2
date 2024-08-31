package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 배열 크기를 크게 만들면 충돌은 줄지만, 많은 메모리가 낭비 된다.
 * 보통 75%를 적절한 크기로 보고 기준으로 잡는 것이 효과적.
 */
public class HashStart5 {

  static final int CAPACITY = 10;

  public static void main(String[] args) {
    LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
    System.out.println("buckets = " + Arrays.toString(buckets));
    for (int i = 0; i < CAPACITY; i++) {
      buckets[i] = new LinkedList<>();
    }

    System.out.println("buckets = " + Arrays.toString(buckets));
    add(buckets, 1);
    add(buckets, 2);
    add(buckets, 5);
    add(buckets, 8);
    add(buckets, 14);
    add(buckets, 99);
    add(buckets, 9);  // 중복
    System.out.println("buckets = " + Arrays.toString(buckets));

    // 검색
    int searchValue = 9;
    boolean contains = contains(buckets, searchValue);
    System.out.println("buckets.contains(" + searchValue + ") = " + contains);
  }

  private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
    int hashIndex = hashIndex(searchValue);
    LinkedList<Integer> bucket = buckets[hashIndex];

    return bucket.contains(searchValue);
  }

  private static void add(LinkedList<Integer>[] buckets, int value) {
    int hashIndex = hashIndex(value);
    LinkedList<Integer> bucket = buckets[hashIndex];  // O(1)
    if (!bucket.contains(value)) bucket.add(value); // O(n)
  }

  private static int hashIndex(int value) {
    return value % CAPACITY;
  }
}
