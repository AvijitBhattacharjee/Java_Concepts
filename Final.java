
// final - class, method, variable
// line 18 - stops class inheritence 
// line 9 - stops method overriding
// line 29 - stops variable change

final class Calc {

    public final void show() {
        System.out.println("in calc show");
    }

    public int add(int a, int b) {
        return (a+b);
    }
}

class AdvCal extends Calc {

    public void show() {
        System.out.println("in advance cal show");
    }
}

public class Final {
    public static void main(String []args) {

        final int a = 5;
        a = 6;
        System.out.println(a);

        AdvCal advCal = new AdvCal();
        advCal.show();
        System.out.println(advCal.add(4, 5));

    }
}
