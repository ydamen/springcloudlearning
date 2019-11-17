package cn.ydamen.feign.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceHiError implements ServiceHi {
   @Override
   public String sayHiFromClientOne(String name) {
      return "sorry "+name;
   }
}
