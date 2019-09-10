public class HardDisk {
    int amount;
    String Str = new String("In HardDisk.java:");
    void setAmount(int m) {
        amount = m;

        System.out.println(Str.toString()+amount);
    }
    int getAmount() {
        if (Str.equals("In HardDisk.java:"))
            System.out.println("HardDisk YES!");
        return amount;
    }
    HardDisk() {
    }
    HardDisk(int n) {
    }
    HardDisk(int ss, int ssss) {
    }
}

