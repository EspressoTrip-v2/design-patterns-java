package com.company;

public interface RecieverInterface {
    boolean processMessage(Message message);
    void setNextChain(RecieverInterface nextChain);
}
