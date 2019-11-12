package com.example.demo;

import org.springframework.ui.Model;

public abstract class AbstractBaseController {

  protected void addAttributeFromBaseClass(Model model) {
    model.addAttribute("var_in_base_class", "value1");
  }
}
