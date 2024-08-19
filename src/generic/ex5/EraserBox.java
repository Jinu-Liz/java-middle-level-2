package generic.ex5;

/**
 * 제네릭 타입은 컴파일 시점에 Object로 변환된다.
 * 따라서 instanceof는 항상 Object와 비교하여 항상 참이 나오는 현상이 발생하게 된다.
 * 이로 인해 제네릭 타입은 instanceof로 비교할 수 없다.
 *
 * new 또한 항상 new Object()가 되어버린다. 이는 개발자의 의도와 다르므로, new 또한 사용할 수 없다.
 */
public class EraserBox<T> {

  public boolean instanceCheck(Object param) {
//    return param instanceof T;    // 에러

    return false;
  }

  public void creat() {
//    return new T();   // 에러
  }

}
