package sum;

import java.util.ArrayList;

public class Summation {

  public int sum(ArrayList<Integer> list) throws Exception {
    if (list.isEmpty() || list == null) throw new Exception("List is empry or null.");
    int sum = 0;
    for (Integer number : list) {
      sum += number;
    }
    return sum;
  }
}
