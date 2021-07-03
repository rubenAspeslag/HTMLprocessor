public class HTMLProcessor {
    public static void main(String[] args) {
    }

    public HTMLString getHTMLFromFile(String path) {
       HtmlFile htmlFile = new HtmlFile(path);
        return new HTMLString(htmlFile.getContent());
   }


}
