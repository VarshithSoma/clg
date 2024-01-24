public class ThreadPriority extends Thread{
    public static void main(String[] args) {
        ThreadPriority tp1=new ThreadPriority();
        ThreadPriority tp2=new ThreadPriority();
        tp1.setName("high");
        tp2.setName("low");
        tp1.setPriority(Thread.MAX_PRIORITY-1);
        tp2.setPriority(Thread.MIN_PRIORITY+1);
        System.out.println("High priority thread is : " +tp1.getPriority());
        System.out.println("High priority thread is : " +tp1.getPriority());
        tp2.start();
        tp1.start();
    }
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(this.getName()+" :"+i);
        }
    }
}