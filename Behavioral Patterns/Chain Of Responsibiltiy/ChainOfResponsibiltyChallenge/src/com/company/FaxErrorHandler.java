package com.company;

public class FaxErrorHandler implements RecieverInterface {
    private RecieverInterface nextReceiver;

    @Override
    public boolean processMessage(Message message) {
        if (message.text.contains("Fax")) {
            System.out.println("FaxErrorHandler processed " + message.priority + " priority issue: " + message.text);
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
