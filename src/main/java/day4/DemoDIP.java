package day4;

public class DemoDIP {
    public static void main(String[] args) {
        Callee callee = new Callee();
        /**
         *  DI => Dependency Injection
         *  1. Method Injection
         *  2. Constructor Injection
         *  3. Properties Injection
         */
        Caller caller = new Caller(); // 2
        caller.call(callee); // 1
    }
}
class Caller {
    Callee c;
    public void call(Callee callee) {
//        Callee c = new Callee();
        this.c = callee;
        System.out.println("Called Caller.call()");
        c.process();
    }
}
class Callee {
    public void process() {
        System.out.println("Called Callee.process()");
    }
}
