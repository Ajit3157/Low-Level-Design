package AdapterDesign;

public class XMLConverter implements Adapter{

    jsonConverter converter;
    public XMLConverter(jsonConverter converter) {
        this.converter = converter;
    }
    @Override
    public void convert(String obj) {
        converter.convert(obj);
        System.out.println("converted to XML via JSON");
    }
}
