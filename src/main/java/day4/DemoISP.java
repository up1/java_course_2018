package day4;

public class DemoISP {

}

interface Service {
    void f1();
    void f2();
    void f3();
    void f4();
}

interface ServiceForY {
    void f1();
    void f2();
}

class YService implements ServiceForY {

    @Override
    public void f1() {
        
    }

    @Override
    public void f2() {
        
    }
    
}

class XService implements Service {

    @Override
    public void f1() {
        
    }

    @Override
    public void f2() {
        
    }

    @Override
    public void f3() {
        
    }

    @Override
    public void f4() {
        
    }
    
}
