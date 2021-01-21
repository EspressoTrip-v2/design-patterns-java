package com.company;

public class Client {

    public static void main(String[] args) {

        /* Create handlers */
        RecieverInterface faxHandler, emailHandler;
        emailHandler = new EmailErrorHandler();
        faxHandler = new FaxErrorHandler();

        /* Set Chain */
        faxHandler.setNextChain(emailHandler);

        /* Issue Raiser */
        IssueRaiser raiser = new IssueRaiser(faxHandler);

        /* Messages */
        Message m1 = new Message("Fax reaching late to destination", MessagePriority.Normal);
        Message m2 = new Message("Email send failure", MessagePriority.High);
        Message m3 = new Message("Email CC message send fail", MessagePriority.Normal);
        Message m4 = new Message("Fax failure", MessagePriority.High);

        /* Raise Error */
        raiser.raiseMessage(m1);
        raiser.raiseMessage(m2);
        raiser.raiseMessage(m3);
        raiser.raiseMessage(m4);

    }
}
