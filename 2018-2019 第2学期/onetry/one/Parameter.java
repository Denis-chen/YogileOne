public class Parameter {

    public static void main(String[] args) {
        
        //使用可变参数
        System.out.println(add(2,3));
        System.out.println(add(2,3,4));
        
        //使用数组方式
        int[] x1=new int[]{2,3};
        int[] x2=new int[]{2,3,4};
        System.out.println(add2(x1));
        System.out.println(add2(x2));
    }
    
    /*
     *1  只能出现在参数列表的最后； 
     *2 ...位于变量类型和变量名之间；
     *3  调用可变参数的方法时，编译器为该可变参数隐含创建一个数组，在方法体中一数组的形式访问可变参数。
     *4 参数的类型必须保持一致
    */
    public static int add(int x,int ... args){
        int sum=x;
        for(int i=0;i<args.length;i++){
            sum+=args[i];
        }
        return sum;
    }
    //传入数组参数
    public static int add2(int[] args){
        int sum=0;
        for(int i=0;i<args.length;i++){
            sum+=args[i];
        }
        return sum;
        
    }
}
