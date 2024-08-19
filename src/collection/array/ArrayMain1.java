package collection.array;

import java.util.Arrays;

/**
 * 배열은 메모리상에 순서대로 붙어서 존재한다.
 * int는 4byte를 차지한다.
 * 따라서 int 배열의 경우, 배열의 시작 참조에 (4 * 인덱스)를 더하는 것으로 위치를 바로 찾을 수 있다.
 *
 * 공식 : 배열의 시작 참조 + (자료의 크기 * 인덱스 위치)
 * ex) int 배열의 시작 참조값이 'x100' 일 경우, 1번 인덱스는 x104, 2번 인덱스는 x108이 된다.
 * 따라서, 배열에 아무리 많은 데이터가 들어있어도 인덱스를 사용하는 경우 '한 번의 연산'으로 필요한 위치를 찾을 수 있다.
 */
public class ArrayMain1 {
  public static void main(String[] args) {
    int[] arr = new int[5];
    // index 입력: 0(1)
    System.out.println("== index 입력: O(1) ==");
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    System.out.println(Arrays.toString(arr));

    System.out.println("== index 변경: O(1) ==");
    arr[2] = 10;
    System.out.println(Arrays.toString(arr));

    System.out.println("== index 조회: O(1) ==");
    System.out.println("arr[2] = " + arr[2]);

    System.out.println("== 배열 검색: O(n) ==");
    System.out.println(Arrays.toString(arr));
    int value = 10;
    for (int i = 0; i < arr.length; i++) {
      System.out.println("arr[" + i + "]: " + arr[i]);
      if (arr[i] == value) {
        System.out.println(value + " 찾음");
        break;
      }
    }
  }
}
