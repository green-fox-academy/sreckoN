package charSequence;

public class Shifter implements CharSequence {

  private String str;
  private int shift;

  public Shifter(String str, int shift) {
    this.str = str;
    this.shift = shift;
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
    int index = 0;
    if ((i + shift) > length()) {
      while (index > length()) {
        index = ((i + shift) - length());
      }
    } else {
      index = (i + shift);
    }
    return str.toCharArray()[index];
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
