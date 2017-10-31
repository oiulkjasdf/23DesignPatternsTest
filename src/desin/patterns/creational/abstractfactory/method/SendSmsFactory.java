package desin.patterns.creational.abstractfactory.method;

public class SendSmsFactory implements Provider{  
	  
    @Override  
    public Sender produce() {  
        return new SmsSender();  
    }  
}  