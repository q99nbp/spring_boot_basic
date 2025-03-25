package com.sbs.tutoral1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller_home {
  @GetMapping("/home/main")
  @ResponseBody
  public String showHome(){
    return "어서오세요.";
  }

  @GetMapping("home/plus")
  @ResponseBody
  public int showPlus(int a, @RequestParam(defaultValue = "0") int b){
    int num = 0;
    num = a - b;

    return num;
  }

}
