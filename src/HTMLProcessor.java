public class HTMLProcessor {
    public static void main(String[] args) {
    }

    public String getHTMLFromFile(String path) {
       HtmlFile htmlFile = new HtmlFile(path);
        return htmlFile.getContent();
   }

}
