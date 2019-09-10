abstract class Data {
    abstract public void DisplayValue();
}
class Integer extends  Data {
    int value;
    Integer() {
        value=100;
    }
    public void DisplayValue(){
        System.out.println (value);
    }
}
abstract class Factory {
    abstract public Data CreateDataObject();
}
class IntFactory extends Factory {
    public Data CreateDataObject(){
        return new Integer();
    }
}

class Float extends  Data {
    float value;
    Float() {
        value=5223;
    }
    public void DisplayValue(){
        System.out.println (value);
    }
}
class FloatFactory extends Factory {
    public Data CreateDataObject(){
        return new Float();
    }
}

class Document {
    Data pd;
    Document(Factory pf){
        pd = pf.CreateDataObject();
    }
    public void DisplayData(){
        pd.DisplayValue();
    }
}

public class MyDoc {
    static Document d;
    public static void main(String[] args) {
        d = new Document(new FloatFactory());
        d.DisplayData();
    }
}