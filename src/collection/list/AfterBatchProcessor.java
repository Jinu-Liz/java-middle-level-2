package collection.list;

public class AfterBatchProcessor {

  private final MyList<Integer> list;

  // MyList라는 추상화를 통해 구체적인 객체를 코드 변경 없이 변경할 수 있다.
  public AfterBatchProcessor(MyList<Integer> list) {
    this.list = list;
  }

  public void logic(int size) {
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < size; i++) {
      list.add(0, i);  // 앞에 추가
    }

    long endTime = System.currentTimeMillis();
    System.out.println("크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
  }

}
