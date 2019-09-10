public class CargoBoat {

     int realContent;  //装载的重量

     int maxContent;   //最大装载量

     int minContent; //最小装载量

     public void setMaxContent(int c) {

         maxContent = c;

     }
     
     public void setMinContent(int c) {

         minContent = c;

     }

     public void loading(int m) throws DangerException {

       realContent += m;

       if(realContent>maxContent) {

          throw new DangerException(); 

       }
       System.out.println("目前装载了"+realContent+"吨货物");

     }

     public void loadin(int m) throws DangerException2 {

       realContent += m;

       if(realContent<minContent) {

          throw new DangerException2();

       }
       System.out.println("目前装载了"+realContent+"吨货物");

     }
}
