public class Mythread {
    
    
    public static void main(String[] args) {
        // Mythread m=new Mythread();
        Runnable rb=new Demo();
        Thread t1=new Cap();
        Thread t2=new Small();
        // Thread t3=new Thread(rb);
        // Thread t4=new Thread(){
        //      public void run(){
               
        //         for(char ch='a';ch<='z';ch++){
        //             System.out.println(ch);
        //         }
        //     }
        // };

        t1.start();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            // TODO: handle exception
        }
       t1.
        t2.start();
        // t3.start();
        // t4.start();

    }
}
