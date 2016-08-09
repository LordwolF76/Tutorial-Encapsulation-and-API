/**
 * Created by LordwolF on 8/8/2016.
 */
class Plant {
    //the idea is to make things private to keep them within the class
    //access the class using methods, but not the data itself
    //this also serves to avoid crosslinkages with variables such as name etc.
    //provide an API for access outside
    
    public static final  int ID = 7;

    private String name;

    public String getData() {
        String data = "some stuff" + calculateGrowth();

        return data;

    }

    private int calculateGrowth() {
        return 9;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class App {
    public static void main(String[] args) {

    }
}
