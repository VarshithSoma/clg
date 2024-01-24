import java.io.*;
class ReaderThread implements Runnable{
    BufferedReader reader;
    BufferedWriter writer;
    Object lock;
    ReaderThread(BufferedReader reader,BufferedWriter writer,Object lock){
        this.reader=reader;
        this.writer=writer;
        this.lock=lock;
    }
    public void run(){
        String line;
        try{
             while((line=reader.readLine())!=null){
            synchronized(lock){
                writer.write(line);
                writer.newLine();
                writer.flush();
                System.out.println("Read and sent : "+line);
                Thread.sleep(1000);
            }
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
class ThreadReadfile{
    public static void main(String[] args) {
       try{
         BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter input file name: ");
        String inputfile=reader.readLine();
        System.out.println("Enter output file name: ");
        String outputfile=reader.readLine();
        BufferedWriter filewriter =new BufferedWriter(new FileWriter(outputfile));
        BufferedReader fileReader=new BufferedReader(new FileReader(inputfile));
        Object lock=new Object();
        Thread t=new Thread(new ReaderThread(fileReader,filewriter,lock));
        t.start();
        t.join();
       }catch(Exception e){
        System.out.println(e);
       }
    }
}