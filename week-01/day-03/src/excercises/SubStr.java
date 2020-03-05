package excercises;

public class SubStr {

    public static void main(String[] args) {
        System.out.println(subStr("this is what I'm searching in", "searching"));
    }

    public static int subStr(String a, String b) {
        if (!a.contains(b)) return -1;
        return a.indexOf(b);
    }
}
