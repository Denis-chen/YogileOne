class Material {        //定义父类：材料
    Material() {
    }
    void provision(String material, String color) {
        System.out.println(material+"有光泽："+color);
    }
}

class Solid extends Material {        //定义子类：固体
    void provision(String solid, String solidColor) {
        System.out.println(solid+"有金属光泽："+solidColor);
    }
}

public class Intence {
    Metarial metal;
    Metal gold = new Metal;
    metal = gold;
    metal.provision(gold, golden);
    gold.provision(gold, golden);
}
