package problemFour;
class A{
    void method(){
        System.out.println("Method in A");
    }
}
class B extends A{
    void method(){
        System.out.println("Method in B");
    }
}
class C extends A{
    void method(){
        System.out.println("Method in C");
    }
}
public class DynamicMethodDisplatch {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();
        A ref;
        ref=a;
        ref.method();
        ref=b;
        ref.method();
        ref=c;
        ref.method();
    }
}
