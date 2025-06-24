package hei.school.com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hei.school.com.endpoint.AdditionController;
import org.junit.jupiter.api.Test;

public class AdditionControllerTest {
  private final AdditionController controller = new AdditionController();

  @Test
  void test_addition() {
    assertEquals(2, controller.addition(1, 1));
    // System.out.println(controller.addition(1, 1));

  }
}
