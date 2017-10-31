package desin.patterns.creational.fectorymethod.multistaticfactorymethod;

public class FactoryTest {  
	  
    public static void main(String[] args) {  
        Sender produceMail = SendFactory.produceMail();  
        produceMail.Send();  
    }  
}  