package charSequence;

public class Gnirts implements CharSequence {

  private String str;

  public Gnirts(String str) {
    this.str = str;
  }

  @Override
  public int length() {
    int sum = 0;
    char[] chars = str.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      sum++;
    }
    return sum;
  }

  @Override
  public char charAt(int i) {
    return str.toCharArray()[i];
  }

  @Override
  public CharSequence subSequence(int i, int i1) {
    CharSequence subSeq = "";
    for (int j = i; j < i1; j++) {
      subSeq = subSeq + (charAt(j) + "");
    }
    return subSeq;
  }
}
