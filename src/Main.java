import AbstractDesign.ShapeFactoryImpl;
import AdapterDesign.Adapter;
import AdapterDesign.Json;
import AdapterDesign.XMLConverter;
import AdvancedFactoryDesign.CircleFactory;
import AdvancedFactoryDesign.RectangleFactory;
import AdvancedFactoryDesign.ShapeFactory;
import BuilderDesignPattern.Student;
import BuilderDesignPattern.StudentBuilder;
import ChainOfResponsibility.Debugger;
import ChainOfResponsibility.ErrorLog;
import ChainOfResponsibility.information;
import ChainOfResponsibility.logger;
import Composite.Box;
import Composite.Delivery;
import Composite.Product;
import Decorator.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       /* logger lg = new information(new Debugger(new ErrorLog(null)));
        lg.log("error" , "this is custom error");
        lg.log("info" , "this is custom info");
        lg.log("debug" , "this is custom debug"); */

      /*  Notify nt = new WhatsappNotify(new TelegramNotify(new Notifier()));
        nt.send("Hey Product is available");*/

       /* Delivery dl = new Box(Arrays.asList(new Product(100 , "Product1"),
                new Box(Arrays.asList(new Product(200 , "Product2") , new Product(500 , "Product3")))));
        System.out.println(dl.getPrice()); */

       /* Adapter ad = new XMLConverter(new Json());
        ad.convert("XML Obj"); */

       /* ShapeFactory sp = new ShapeFactoryImpl();
        sp.getShape("Rectangle").draw();*/

       /* ShapeFactory Sp = new CircleFactory();
        Sp.getShape().draw();
        ShapeFactory Sp2 = new RectangleFactory();
        Sp2.getShape().draw(); */

        StudentBuilder sb = new StudentBuilder();
        Student st = sb.setName("ajit").setAge(25).setRollNumber(1).setAddress("jethana , Ajmer , Rajasthan").build();
        System.out.println(st.getAddress());
        System.out.println(st.getAge());

    }
}