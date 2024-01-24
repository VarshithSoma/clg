package problemFour;
class SuperClass{
    public SuperClass(String str){
        System.out.println("Base class Constructor : "+str);
    }
}
class SubClass extends SuperClass{
    public SubClass(String str){
        super(str);
        System.out.println("Sub class Constructor : "+str);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        SubClass obj=new SubClass("called");
    }
}
