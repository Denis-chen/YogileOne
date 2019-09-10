interface Infa {
    int ONE = 10;
    void TWO();
}

class Nowaday implements Infa {
    int Fal = 100;
    @Override
    public void TWO() {
        System.out.println("This is pubulic abstract void TWO. ");
        System.out.println("And the number of ONE which belongs to Infa: "+ONE);
    }
}


public class Implements {
    public static void main(String[] args) {
        Nowaday now = new Nowaday();
        Infa infa;
        infa = now;
        now.TWO();
        infa.TWO();

        Nowaday aday = (Nowaday)infa;
        if (aday.Fal==100)
            System.out.println("infa.Fal==100");

        if (((Nowaday) infa).Fal==100)
            System.out.println("infa.Fal==100");
    }
}
