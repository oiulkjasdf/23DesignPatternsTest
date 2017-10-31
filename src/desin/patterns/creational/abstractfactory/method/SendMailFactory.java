package desin.patterns.creational.abstractfactory.method;

public class SendMailFactory implements Provider {  
    
    @Override  
    public Sender produce(){  
        return new MailSender();  
    }  
}  