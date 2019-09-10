public class exp7_7 {

   public static void main(String args[]) {

      CargoBoat ship = new CargoBoat();

      ship.setMaxContent(1000);
      
      ship.setMinContent(223);

      int m =60;

      try{  

           ship.loading(m);
	   ship.loadin(m);
           m = 400;

           ship.loading(m);
  	   ship.loadin(m);
           m = 123;
	   ship.loadin(m);
           ship.loading(m);

           m = 555;

           ship.loading(m);
	   ship.loadin(m);
      }

      catch(DangerException e) {

           System.out.println(e.warnMess()); 

           System.out.println("无法再装载重量是"+m+"吨的集装箱");       

      }
      catch(DangerException2 e) {

           System.out.println(e.warnMess());

           System.out.println("xiaoyu重量是"+m+"吨的集装箱");

      }
      finally {

          System.out.printf("货船将正点启航");

      }

  }

}
