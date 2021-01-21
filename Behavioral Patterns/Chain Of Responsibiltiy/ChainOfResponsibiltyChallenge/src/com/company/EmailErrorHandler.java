package com.company;

public class EmailErrorHandler implements RecieverInterface{
    private RecieverInterface nextReceiver;


    @Override
    public boolean processMessage(Message message) {
        if (message.text.contains("Email")) {
            System.out.println("EmailErrorHandler processed " + message.priority + " priority issue: " + message.text);
            return true;
        } else {
            if (nextReceiver != null) {
                nextReceiver.processMessage(message);
            }
            return false;
        }
    }

    @Override
    public void setNextChain(RecieverInterface nextChain) {
        this.nextReceiver = nextChain;
    }
}
