public class HTMLProcessor {
    public static void main(String[] args) {
        getHTMLFromFile("E:\\gip\\gip\\code\\oefeningenHTML.html").getHtmlTags();
    }

    static public HTMLString getHTMLFromFile(String path) {
       HtmlFile htmlFile = new HtmlFile(path);
        return new HTMLString(htmlFile.getContent());
   }


}
