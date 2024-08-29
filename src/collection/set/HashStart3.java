package collection.set;

import java.util.Arrays;

public class HashStart3 {
  public static void main(String[] args) {
    /**
     * 입력: {1, 2, 5, 8, 14, 99}
     * [null, 1, 2, null, null, 5, null, null, 8, null, ..., 14, ..., 99]
     * 메모리가 너무 낭비된다. 따라서, 이 방식은 입력값의 범위가 넓다면 사용하기에는 문제가 있다.
     */
    Integer[] inputArray = new Integer[100];
    inputArray[1] = 1;
    inputArray[2] = 2;
    inputArray[5] = 5;
    inputArray[8] = 8;
    inputArray[14] = 14;
    inputArray[99] = 99;
    System.out.println("inputArray = " + Arrays.toString(inputArray));

    int searchValue = 99;
    Integer result = inputArray[searchValue]; // O(1)
    System.out.println("result = " + result);
  }
}
