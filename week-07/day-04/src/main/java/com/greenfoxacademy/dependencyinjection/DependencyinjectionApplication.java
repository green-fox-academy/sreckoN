package com.greenfoxacademy.dependencyinjection;

import com.greenfoxacademy.dependencyinjection.coloring.MyColor;
import com.greenfoxacademy.dependencyinjection.helloWorld.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyinjectionApplication implements CommandLineRunner {

  private Printer printer;
  private MyColor color;

  @Autowired
  public DependencyinjectionApplication(Printer printer, MyColor color) {
    this.printer = printer;
    this.color = color;
  }

  public static void main(String[] args) {
    SpringApplication.run(DependencyinjectionApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("Hello");
    color.printColor();
  }
}
