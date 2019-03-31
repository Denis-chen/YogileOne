import javax.sql.rowset.serial.SerialStruct;

public class PC {
    CPU cpu = new CPU();
    HardDisk HD = new HardDisk();
    void setCPU(CPU c) {
        cpu = c;
    }
    void setHardDisk(HardDisk h) {
        HD = h;
    }
    void show() {
        String Str1 = new String("CPUspeed=");
        String Str2 = new String("HDcapacity=");
        System.out.println(Str1.toString()+cpu.getSpeed());
        System.out.println(Str2.toString()+HD.getAmount());
        if (Str1.equals("CPUspeed="))
            System.out.println("PC YES!");
    }
    PC() {
    }
    PC(CPU cpu) {
    }
    PC(HardDisk HD) {
    }
    PC(CPU cpu, HardDisk HD) {
    }
}
