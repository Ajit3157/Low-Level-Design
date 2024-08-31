package TemplateDesignPattern;

public abstract class DataParser {
    
    public abstract void loadData();
    public abstract void parseData();
    public abstract void processData();

    public final void load(){
        loadData();
        parseData();
        processData();
    }
    
}
