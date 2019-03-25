class Student {

   int number;String name;

   Student() {

   }

   Student(int number,String name) {

      this.number=number;

      this.name=name;

      System.out.println("我的名字是:"+name+ "学号是:"+number);
   }

 }

class UniverStudent extends Student {

   boolean 婚否;

   UniverStudent(int number,String name,boolean b) {

      super(number,name);

      婚否=b;

      System.out.println("婚否="+婚否);

   }

}

public class exp5_8 {

   public static void main(String args[]) {

      UniverStudent ymy = new UniverStudent(20175223,"姚明宇",false);

      UniverStudent lys = new UniverStudent(20175222,"罗雨石",false);
   }

}




