package com.example.demo;

import javax.validation.constraints.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController extends AbstractBaseController {

  @GetMapping("/page")
  public @NotNull String getPage(@NotNull Model model) {

    addAttributeFromBaseClass(model);// does not work
    addAttributeInConcreteClass(model);// works
    model.addAttribute("var_direct_in_controller_method", "value3");// works

    return "page";
  }

  private void addAttributeInConcreteClass(Model model) {
    model.addAttribute("var_concrete_class", "value2");
  }
}
