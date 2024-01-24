package problemFour;

class Simple{
    void method(){
        System.out.println("Method in Simple");
    }
}
class SimpleA extends Simple{
    void method(){
        System.out.println("Method in SimpleA");
    }
}

public class TestOverRiding {
    public static void main(String[] args) {
        Simple s1=new Simple();
        s1.method();
        SimpleA s2=new SimpleA();
        s2.method();
        Simple s3=new SimpleA();
        s3.method();
    }
}
