package generic.test.ex5;

public class Box<T> {

  private T value;

  public T get() {
    return this.value;
  }

  public void set(T value) {
    this.value = value;
  }
}
