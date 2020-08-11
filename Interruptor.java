//Program to show use of join() method with thread interruption
class UserThread extends Thread
{
  int delay;
  public UserThread(int d)
  {
    delay = d;
  }
  public void run() //User thread
  {
   System.out.println("User thread is started, now going to suspend is for "+delay+" seconds.");
   try
   {
   Thread.sleep(delay*1000);
   System.out.println("User Thread is very happy by completing it's task...");
   }catch(InterruptedException e)
    {
      System.out.println("User Thread is interrupted.");
    }
  }
}
class Interruptor
{
 public static void main(String arr[])
 {
  System.out.println("main thread is started, now starting user thread and giving it 5 seconds to complete...");
  UserThread t = new UserThread(8);
  t.start();
  System.out.println("main thread is going to suspend for 5 seconds...");
  try
   {
    t.join(5000);
   }catch(InterruptedException e)
    {
     e.printStackTrace();
    }
   System.out.println("main thread resumes after 5 seconds...");
   if(t.isAlive())
   {
    System.out.println("User thread is taking too much time, now suspending it...");
    t.interrupt();
   }
   else
   {
     System.out.println("User thread is completed within time...");
   }
   System.out.println("main thread is completed.");
 }
}