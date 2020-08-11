//Creating user threads to read name and email by user
class NameReader extends Thread
{
  DataReader dr;  //HAS-A relation by Aggregation
  public NameReader(DataReader r)
  {
   dr = r;
  }
  public void run() //user thread
  {
   System.out.println("Name Reader thread is strated, now reading name...");
   synchronized(dr)
   {
   String name = dr.readData("Enter your name please - ");
   System.out.println("Welcome Mr. "+name);
   }
  }
}
class MailReader extends Thread
{
 DataReader dr;
 public MailReader(DataReader dr)
 {
   this.dr = dr;
  }
  public void run()
  {
    System.out.println("Mail Reader is started, now registering mail...");
    synchronized(dr)
    {
    String email = dr.readData("Enter your mail id : ");
   System.out.println("Your mail "+email +" is successfully registered!");
   }
  }
}
class Register
{
 public static void main(String arr[])
 {
   DataReader r = new DataReader();
   NameReader nr = new NameReader(r);
   MailReader mr = new MailReader(r);
   nr.start();
   mr.start();
 }
}