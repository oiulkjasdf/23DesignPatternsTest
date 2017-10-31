package desin.patterns.creational.fectorymethod.simplemethod;

public class MailSender implements Sender {  
    @Override  
    public void Send() {  
        System.out.println("this is mailsender!");  
    }  
}  
