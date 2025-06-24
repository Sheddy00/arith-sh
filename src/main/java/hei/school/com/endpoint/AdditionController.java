package hei.school.com.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {

  @GetMapping("/add")
  public double addition(@RequestParam double a, @RequestParam double b) {
    return a + b;
  }
}
