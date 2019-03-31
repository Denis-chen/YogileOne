class Material {        //定义父类：材料
    void provision(String material, String color) {
        System.out.println(material+"有光泽："+color);
    }
    void fatherExtra() {
        System.out.println("This is fatherExtra.");
    }
}

class Solid extends Material {        //定义子类：固体
    void provision(String solid, String solidColor) {
        System.out.println(solid+"有金属光泽："+solidColor);
    }
    void extra() {
        System.out.println("This is extra.");
    }
}

public class Instance {
    public static void main(String[] args) {
        Material metal;
        Solid gold = new Solid();
        metal = gold;       //metal 是 Solid 对象 gold 的上转型对象
        metal.provision("gold", "golden");
        gold.provision("gold", "golden");
        //metal.extra();        // extra 方法是子类 Solid 新增的方法，父类中不存在，所以无法使用
        gold.extra();       // extra 方法是子类 Solid 新增的方法，对象 gold 可使用





        metal.fatherExtra();        //gold 的上转型对象也可以使用 Solid 的父类 Material 的方法
        //提问：子类对象的上转型对象与父类对象的区别？

        Solid metal_2 = (Solid)metal;       //把上转型对象强制转化为子类的对象
        metal_2.extra();        //创建一个新对象 metal_2
        //metal.extra();        // extra 方法依然无法使用
    }
}