package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

  private List<Item> items = new ArrayList<>();

  public void add(Item item) {
    items.add(item);
  }

  public void displayItem() {
    System.out.println("장바구니 상품 출력");
    items.forEach(item -> System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice()));

    /**
     * 이렇게 쓰면 루프를 2번 돌지만, 양이 많지 않기 때문에
     * 유지보수를 생각하면 합계 계산 로직을 별도로 만드는 것이 좋다.
     * 추후, 별도의 메서드로 추출하여 사용하기에도 편하다.
     */
    int totalPrice = 0;
    for (Item item : items) {
      totalPrice += item.getTotalPrice();
    }

    System.out.println("전체 가격 합: " + totalPrice);
  }

}
