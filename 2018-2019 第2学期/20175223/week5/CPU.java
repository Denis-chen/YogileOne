public class CPU {
    int speed;
    String Str = new String("In CPU.java:");
    void setSpeed(int m) {
        speed = m;
        System.out.println(Str.toString()+speed);
    }
    int getSpeed() {
        if (Str.equals("In CPU.java:")) {
            System.out.println("CPU YES!");
        }
        return speed;
    }
    CPU() {

    }
    CPU(String n, int o) {
        if (n.equals("In CPU.java:") && o == 0)
            System.out.println("CPU YES!");
    }
}

