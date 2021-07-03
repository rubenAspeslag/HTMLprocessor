import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HTMLString {
    private String htmlString;
    HTMLString(String str) {
        this.htmlString = str;
    }

    public String getHtmlString() {
        return htmlString;
    }
    public List<HtmlTag> getHtmlTags() {
        List<HtmlTag> htmlTags = new ArrayList<>();
        for (String tag  : getStringPerTag()) {
            System.out.println(tag);
            System.out.println("--------------------------------------------------------");
        }
        return htmlTags;
    }


    private List<String> getStringPerTag() { // devide string for each tag
        String copyHtmlString = htmlString.replace("</" , "@&//")
                .replace("/>" , "@&//").
                        replace(">","@&//")
                .replace("<","@&//");
        List<String> htmlStrings = Arrays.asList(copyHtmlString.split("@&//", 0));
        return htmlStrings;
    }
}
