package desin.patterns.creational.fectorymethod.multifactorymethod;

public class SendFactory {  
    
    public Sender produceMail(){  
        return new MailSender();  
    }  
      
    public Sender produceSms(){  
        return new SmsSender();  
    }  
} 