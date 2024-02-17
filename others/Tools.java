package others;

public class Tools {
    
    private int marks;
    public int roll;
    protected String name;

    public void show() {
        System.out.println("Hi");
    }

    public Tools(int n1, int n2) {
        this.marks = n1;
        this.roll = n2;
    }

    public Tools(String name) {
        this.name = name;
    }

}

class A {

    public void show() {
        Tools tools = new Tools("Avijit");

        System.out.println(tools.name);

    }

}

