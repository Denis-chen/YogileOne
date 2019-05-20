import java.util.*;
public class weekly5_20 {
    public static void main(String args[]) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();


        // ArrayList add
        long startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time: ArrayList add: " + duration);

        // LinkedList add
        startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time: LinkedList add: " + duration);

        // Vector add
        Vector v = new Vector();
        for (int i = 0; i < 100000; i++) {
            v.add(i);
        }
        System.out.println("Time: Vector add: " + duration);

        // ArrayList get
        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time: ArrayList get:  " + duration);

        // LinkedList get
        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time: LinkedList get: " + duration);

        // Vector get
        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            v.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time: Vector get: " + duration);

        // ArrayList remove
        startTime = System.nanoTime();

        for (int i = 9999; i >= 0; i--) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time: ArrayList remove:  " + duration);

        // LinkedList remove
        startTime = System.nanoTime();

        for (int i = 9999; i >= 0; i--) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time: LinkedList remove: " + duration);

        // Vector remove
        startTime = System.nanoTime();

        for (int i = 9999; i >= 0; i--) {
            v.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time: Vector remove: " + duration);



        /*
        //测试String、StringBuffer、StringBuilder
        String ss1 = "123";

        String ss2 = "123";
        System.out.println (ss1 == ss2);

        StringBuffer sss1 = new StringBuffer ("123456");
        StringBuffer sss3 = sss1;
        StringBuffer sss2 = new StringBuffer ("123456");
        System.out.println (sss1 == sss2);
        sss1.append ("qwe");
        System.out.println (sss1 == sss3);

        StringBuilder ssss1 = new StringBuilder ("asd");
        StringBuilder ssss2 = ssss1;
        System.out.println (ssss1 == ssss2);
        StringBuilder ssss3 = new StringBuilder ("asd");
        System.out.println (ssss1 == ssss3);
        ssss1.append ("qwe");
        System.out.println (ssss1 == ssss2);
        */
    }
}