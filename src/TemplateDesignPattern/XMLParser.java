package TemplateDesignPattern;

public class XMLParser extends DataParser {
    @Override
    public void loadData() {
        System.out.println("Loading XML Data");
    }

    @Override
    public void parseData() {
       System.out.println("Parsing XML Data");
    }

    @Override
    public void processData() {
         System.out.println("Processing XML Data");
    }
}
