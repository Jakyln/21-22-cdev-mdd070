package observator;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();

        MailSubscriber mailSubscriber = new MailSubscriber("alexandre@ipi.com");
        document.subscribe(mailSubscriber);

        document.sauvegarder();
    }
}
