package collection.array;

/**
 * 배열 리스트는 마지막에 데이터 추가/삭제할 때는 O(1)로 매우 빠르지만,
 * 중간에 데이터를 추가/삭제할 경우에는 O(n)으로 느리다.
 *
 * 따라서, 데이터를 순서대로 입/출력하고 마지막 데이터를 추가/삭제하는 경우에 가장 효율적이다.
 */
public class MyArrayListV3Main {
  public static void main(String[] args) {
    MyArrayListV3 list = new MyArrayListV3();
    System.out.println("== 마지막에 추가 / O(1) ==");
    list.add("a");
    list.add("b");
    list.add("c");
    System.out.println(list);

    System.out.println("== 원하는 위치에 추가 / O(1) ==");
    list.add(3, "addLast");
    System.out.println(list);

    System.out.println("== 맨 앞에 추가 / O(n) ==");
    list.add(0, "addFirst");
    System.out.println(list);

    System.out.println("== 마지막 삭제 / O(1) ==");
    Object removed1 = list.remove(4);
    System.out.println("removed(4) = " + removed1);
    System.out.println(list);

    System.out.println("== 맨 앞 삭제 / O(n) ==");
    Object removed2 = list.remove(0);
    System.out.println("removed(0) = " + removed2);
    System.out.println(list);
  }
}
