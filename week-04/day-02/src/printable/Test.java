package printable;

import java.util.ArrayList;
import java.util.List;

public class Test {

  public static void main(String[] args) {
    List<Domino> dominoes = new ArrayList<>();
    List<ToDo> todos = new ArrayList<>();

    dominoes.add(new Domino(5, 6));
    dominoes.add(new Domino(1, 3));

    todos.add(new ToDo("Buy Fruits", "High", false));
    todos.add(new ToDo("Finish Exercises", "Hight", true));

    for (Domino d : dominoes) {
      d.printAllFields();
    }

    for (ToDo t : todos) {
      t.printAllFields();
    }
  }
}
