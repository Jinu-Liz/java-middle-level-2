package collection.list;

public class BeforeBatchProcessor {

  // 구체적인 객체에 의존하고 있기 때문에 수정하기 위해서는 코드 변경이 이루어진다.
  private final MyLinkedList<Integer> list = new MyLinkedList<>();

  public void logic(int size) {
    for (int i = 0; i < size; i++) {
      list.add(0, i);  // 앞에 추가
    }
  }

}
