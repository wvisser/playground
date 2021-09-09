package pkg;

public class InputValidation {

  public void foo(String x, String y) {
    checkNotNull(x);
    compute(x);
    compute(y);
  }
}
