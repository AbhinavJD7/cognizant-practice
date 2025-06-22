interface Notification {
    void notifyUser();
}

class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending an Email Notification");
    }
}

class SMSNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending an SMS Notification");
    }
}

class NotificationFactory {
    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty())
            return null;
        if (channel.equalsIgnoreCase("EMAIL"))
            return new EmailNotification();
        if (channel.equalsIgnoreCase("SMS"))
            return new SMSNotification();
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification notification1 = factory.createNotification("EMAIL");
        notification1.notifyUser();

        Notification notification2 = factory.createNotification("SMS");
        notification2.notifyUser();
    }
}
