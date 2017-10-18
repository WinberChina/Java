package exercises.access;

public class ClassOrderTest {
    static class A{
        C c =new C();
        public A(){
            System.out.println("A's Constructor");
        }
        static {
            System.out.println("A's static ");
        }

    }
    static class B extends A{

        public B(){
            System.out.println("B's Constructor");
        }
        D d = new D();
        C c =new C();
        static {
            System.out.println("B's static ");
        }

    }
    static class C {
        public C(){
            System.out.println("C's Constructor");

        }
        static {
            System.out.println("C's static");
        }
    }
    static class D{
        public D(){
            System.out.println("D's Constructor");
        }
        static {
            System.out.println("D's static");
        }
    }
    public static void main(String args[]){
        System.out.println("start");
        B b = new B();
    }
}

/*
 *Output:
 *start
 *A's static
 *B's static
 *C's static
 *C's constructor
 *A's constructor
 *D's static
 *D's constructor
 *C's constructor
 *B's constructor
 * */
