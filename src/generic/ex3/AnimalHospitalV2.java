package generic.ex3;

/**
 * 자바 컴파일러 입장에서는 T에 어떤 타입이 들어올 지 예측할 수 없다.
 * Animal 타입의 자식이 들어오기를 원했지만, 코드 어디에도 Animal에 대한 정보가 없다.
 */
public class AnimalHospitalV2<T> {

  private T animal;

  public void set(T animal) {
    this.animal = animal;
  }

  public void checkup() {
    // T의 타입은 메서드를 정의하는 시점에는 알 수 없다. Object의 기능만 사용 가능.

    animal.toString();
    animal.equals(null);

    //컴파일 오류
//    System.out.println("동물 이름: " + animal.getName());
//    System.out.println("동물 크기: " + animal.getSize());
//    animal.sound();
  }

  public T bigger(T target) {
    return null;

    //컴파일 오류
//    return animal.getSize() > target.getSize() ? animal : target;
  }

}
