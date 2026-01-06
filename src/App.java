
class A{
    A(){
        super();
        System.out.println("A's Constructor");
    }
}

class B extends A {
    B(){
        super();
        System.out.println("B's Constructor");
    }
    
}

class C extends B {
    C(){
        super();
        System.out.println("C's Constructor");
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        C c = new C();
        System.out.println(c.hashCode());
    }
}
