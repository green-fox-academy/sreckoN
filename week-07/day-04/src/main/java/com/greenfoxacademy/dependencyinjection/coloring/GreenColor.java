package com.greenfoxacademy.dependencyinjection.coloring;

import com.greenfoxacademy.dependencyinjection.helloWorld.Printer;
import org.springframework.beans.factory.annotation.Autowired;

//@Service
public class GreenColor implements MyColor {

  private Printer printer;

  @Autowired
  public GreenColor(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor() {
    printer.log("It is green in color...");
  }
}
