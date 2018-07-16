package com.fromqtoj.config;

import com.fromqtoj.bean.Color;
import com.fromqtoj.bean.Person;
import com.fromqtoj.condition.LinuxCondition;
import com.fromqtoj.condition.MyImportSelector;
import com.fromqtoj.condition.WindowsCondition;
import org.springframework.context.annotation.*;
//@Conditional({WindowsCondition.class})
@Configuration
public class MainConfigOfImportCondition {
  @Conditional({WindowsCondition.class})
  @Bean("window000")
  public Person person01(){
    return new Person("window-01",62);
  }

  @Conditional({LinuxCondition.class})
  @Bean("linux000")
  public Person person02(){
    return new Person("linux-01", 48);
  }
}
