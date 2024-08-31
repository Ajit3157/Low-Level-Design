package TemplateDesignPattern;

public class JSONParser extends DataParser{
    @Override
    public void loadData() {
        System.out.println("Loading JSON Data");
    }

    @Override
    public void parseData() {
               System.out.println("Parsing JSON Data");
    }

    @Override
    public void processData() {
        System.out.println("Processing JSON Data");
    }
}
