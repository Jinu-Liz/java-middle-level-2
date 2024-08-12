package generic.ex1;

public class RowTypeMain {
  public static void main(String[] args) {
    /**
     * raw 타입. 권장되지 않는다.
     * 제네릭이 없던 시절의 과거 코드와의 하위호환이 필요했기 때문에 어쩔수 없이 지원.
     */
    GenericBox integerBox = new GenericBox();
    // GenericBox<Object> integerBox = new GenericBox<>();  // 권장
    integerBox.set(10);

  }
}
