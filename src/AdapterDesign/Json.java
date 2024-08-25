package AdapterDesign;

public class Json implements jsonConverter{
    @Override
    public void convert(String json) {
        System.out.println("converted to json");
    }
}
