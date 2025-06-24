package hei.school.com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hei.school.com.endpoint.AdditionController;
import org.junit.jupiter.api.Test;

public class AdditionControllerTest {
  private final AdditionController controller = new AdditionController();

  @Test
  void test_addition() {
    assertEquals(3, controller.addition(1, 2));
  }

  @Test
  void test_addition_no_overflow() {
    assertEquals(3_000_000_000L, controller.addition(1_000_000_000, 2_000_000_000));
  }
}
