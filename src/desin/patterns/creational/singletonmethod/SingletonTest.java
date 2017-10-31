package desin.patterns.creational.singletonmethod;

public class SingletonTest extends Thread{
	
	@Override
	public void run() {
		
		Singleton singleton=new Singleton();
	}
}  