package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

/**
 * 개 병원과 고양이 병원은 중복이 많아 보인다. (코드 재사용성이 떨어진다)
 * 그러나 타입 안전성은 명확하게 지켜진다.
 */
public class AnimalHospitalMainV0 {
  public static void main(String[] args) {
    DogHospital dogHospital = new DogHospital();
    CatHospital catHospital = new CatHospital();

    Dog dog = new Dog("멍멍이1", 100);
    Cat cat = new Cat("냐옹이1", 300);

    // 개 병원
    dogHospital.set(dog);
    dogHospital.checkup();

    // 고양이 병원
    catHospital.set(cat);
    catHospital.checkup();

    // 문제1: 개 병원에 고양이 전달
    // dogHospital.set(cat);   // 다른 타입 입력 ; 컴파일 오류

    // 문제2: 개 타입 반환
    dogHospital.set(dog);
    Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
    System.out.println("biggerDog = " + biggerDog);


  }
}
