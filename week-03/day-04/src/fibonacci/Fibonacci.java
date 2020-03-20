package fibonacci;

public class Fibonacci {

  public int getElementAtIndex(int number){
    if (number < 0) {
      return 0;
    }
    if(number == 1 || number == 2){
      return 1;
    }
    return getElementAtIndex(number - 1) + getElementAtIndex(number - 2);
  }
}
