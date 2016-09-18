
import java.util.Timer;

public class d3seconds_count extends Thread {
	  private volatile String msg = "遊戲開始";
//	  private volatile int a = (int) (Math.random()*10*(int)Math.pow(10, getdi())+1);
//	  private volatile int b = (int) (Math.random()*10*(int)Math.pow(10, getdi())+1);
	  private volatile int c = 1;
	  private volatile int an=0;
//	  private Timer t1;
	  
	  public d3seconds_count() {
	    Thread listener = new InputListener(this);
	    listener.start();
//	    t1.start();
	    this.start();
	  } 
	    
	  public static void main(String[] args) {
		  d3seconds_count myApp = new d3seconds_count();
	  }
	  
	  
	  public void setMsg(int a,int b) { this.msg =Integer.toString(a)+"*"+Integer.toString(b); } 
	  
	  public String getMsg() { return msg; }
	  
	  public void setan(int a,int b) { this.an =a*b; } 
	  
	  public int getan() { return an; }
	  
	  public void setdi(int c) { this.c =c+1; } 
	  
	  public int getdi() { return c; }
	    
	  public void run() {
//	  t1=new Timer();
		int d=-1;
	    while(true) {
	      System.out.println( getMsg() );
	      try{ sleep(3000);
	      		d=d+1;
	      		if(d==5){
	      			setdi(getdi());//每15秒時間懲罰
	      			System.out.println("時間懲罰");
	      			d=0;
	      			}
	      		int a = (int) (Math.random()*10*(int)Math.pow(10, getdi())+1);
	      		int b = (int) (Math.random()*10*(int)Math.pow(10, getdi())+1);
	      		setMsg(a,b);
	      		setan(a,b);
	      } 
	      catch(InterruptedException ie) {
	    	  
	      } 
	    } 
	  }
	    
	  public class InputListener extends Thread {
	    private d3seconds_count app;
	    private java.util.Scanner input;

	    public InputListener(d3seconds_count app) {
	      this.app = app;
	      input = new java.util.Scanner(System.in);
	    }

	    public void run() {
	      int lateset = input.nextInt();

	      while( lateset!=getan()) { 
//	        app.setMsg(latest);
	        lateset = input.nextInt();
	      }
		System.out.println("恭喜你過關了")
	      System.exit(0);
	    } 

	  } 
//	  public class temer extends Thread{
//		  private play20160918 abc;
//	  }
	} 
