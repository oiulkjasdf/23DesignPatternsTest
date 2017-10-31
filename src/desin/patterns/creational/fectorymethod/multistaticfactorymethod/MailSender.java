package desin.patterns.creational.fectorymethod.multistaticfactorymethod;

public class MailSender implements Sender {  
    @Override  
    public void Send() {  
        System.out.println("this is mailsender!");  
    }  
}  
