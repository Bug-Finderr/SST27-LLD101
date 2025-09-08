package com.example.notifications;

public class WhatsappDecorator extends NotifierDecorator {
    private final String phoneNumber;

    public WhatsappDecorator(Notifier notifier, String phoneNumber) {
        super(notifier);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(String text) {
        System.out.println("[WhatsApp -> " + phoneNumber + "]: " + text);
        super.notify(text);
    }
}
