import java.lang.*;
class MyThread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            try{
            sleep(2000);
            System.out.println("i="+i);
        }catch(Exception e){
            System.out.println(e);
        }
        }
    }
}
class DemoSleep{
    public static void main(String[] args) {
        MyThread t=new MyThread();
    }
}