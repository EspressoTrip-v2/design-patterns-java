package com.company;

public class IssueRaiser {
    public RecieverInterface setFirstReciever;

    public IssueRaiser(RecieverInterface setFirstReciever) {
        this.setFirstReciever = setFirstReciever;
    }

    public void raiseMessage(Message message){
        if(setFirstReciever!=null){
            setFirstReciever.processMessage(message);
        }
    }
}
