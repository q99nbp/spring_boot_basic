package com.sbs.tutoral1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller_home {
  @GetMapping("/home/main")
  @ResponseBody
  public String showHome(){
    return "어서오세요.";
  }
}
