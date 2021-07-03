import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HtmlTag {
    private String name;
    private Map<String, Object> athributes = new HashMap<>();
    private List<HtmlTag> childs = new ArrayList<>();

    public HtmlTag(String name) {
        this.name = name;
    }
    void addAthrebute(String key, Object value) {
        athributes.put(key,value);
    }
    void addChild(HtmlTag child) {
        childs.add(child);
    }
}
