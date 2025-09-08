package com.example.notifications;

public class Demo {
    public static void main(String[] args) {
        Notifier base = new EmailNotifier("user@example.com");

        // Baseline behavior (already works)
        base.notify("Baseline email only.");

        Notifier smsAndEmail = new SmsDecorator(base, "+91-99999-11111");
        smsAndEmail.notify("Build green ✅");
        
        Notifier full = new SlackDecorator(new WhatsappDecorator(base, "user_wa"), "deployments");
        full.notify("Deployment completed 🚀");
    }
}
