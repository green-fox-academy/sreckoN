package strings;

public class UrlFixer {

    public static void main(String[] args) {

        String url = "https//www.reddit.com/r/nevertellmethebots";

        System.out.println(fixUrl(url));

    }

    public static String fixUrl(String url) {
        return url.replace("https", "https:").replace("nevertellmethebots", "nevertellmetheodds");
    }

}
