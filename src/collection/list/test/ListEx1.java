package collection.list.test;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
  public static void main(String[] args) {
    List<Integer> students = new ArrayList<>();
    students.add(90);
    students.add(80);
    students.add(70);
    students.add(60);
    students.add(50);

    int total = students.stream()
      .reduce(Integer::sum)
      .get();

    double average = (double) total / students.size();
    System.out.println("점수 총합: " + total);
    System.out.println("점수 평균: " + average);
  }
}
