package collection.set;

/**
 * 해시 알고리즘을 사용하여 등록/검색/삭제의 연산 속도를 O(1)로 크게 개선.
 */
public class MyHashSetV1Main {
  public static void main(String[] args) {
    MyHashSetV1 set = new MyHashSetV1(10);
    set.add(1);
    set.add(2);
    set.add(5);
    set.add(8);
    set.add(14);
    set.add(99);
    set.add(9); // hashIndex 중복
    System.out.println(set);

    // 검색
    int searchValue = 9;
    boolean result = set.contains(searchValue);
    System.out.println("set.contains(" + searchValue + ") = " + result);

    // 삭제
    boolean removeResult = set.remove(searchValue);
    System.out.println("removeResult = " + removeResult);
    System.out.println(set);
  }
}
