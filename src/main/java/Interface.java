// Copyright (c) avijit bhattacharjee 2024
// 3 types of interface... will document


interface Computer {
    void show();
}

class Laptop implements Computer {
    public void show() {
        System.out.println("code, complie, run laptop");
    }
}

class Desktop implements Computer {
    public void show() {
        System.out.println("code, complie, run desktop");
    }
}

class Developer {
    public void work(Computer lap) {
        lap.show();
    }
}

public class Interface {
    public static void main(String[] args) {


        Computer laptop = new Laptop();
        Computer desktop = new Desktop();

        Developer developer = new Developer();
        developer.work(laptop);
    }
}
