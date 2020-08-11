//Program to perform operation with Daemon thread
class DaemonThread extends Thread
{
 int delay;
 public DaemonThread(int d)
 {
  delay = d;
 }
 public void run()
 {
  Thread th = Thread.currentThread();
  if(th.isDaemon())
  {
   System.out.println(th.getName()+" is started as Daemon thread.");
   for(int i=1; i<=10; i++)
   {
    try
     {
    System.out.println("Daemon Thread is scheduled - "+i +" times.");
      Thread.sleep(delay*1000);
     }catch(InterruptedException e)
      {
       e.printStackTrace();
      }
    }
   }
   else
   {
    System.out.println(th.getName()+" is started as Non-Daemon thread.");
   }
 }
}
class DaemonCreator
{
 public static void main(String arr[])
 {
  System.out.println("main thread is started, now starting user thread as daemon...");
  DaemonThread th = new DaemonThread(2);
  th.setDaemon(true); //to create daemon thread
  th.start();
  try
  {
   for(int j=5; j>=1; j--)
   {
    System.out.println("Non-Daemon Thread scheduled - "+j+" times."); 
   Thread.sleep(2000);
    
   }
  }catch(InterruptedException e)
   {
    e.printStackTrace();
   }
  System.out.println("Non-Daemon thread is completed.");
 }
}