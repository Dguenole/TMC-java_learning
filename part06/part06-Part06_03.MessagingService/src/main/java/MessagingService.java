import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> messages;

    public MessagingService() {
        this.messages = new ArrayList<>();
    }
    
    public ArrayList<Message> getMessages() {
        return this.messages;
    }

    public void add(Message message) {
        if (message != null && message.getContent().length() <= 280) {
            this.messages.add(message);
        }
    }

    public ArrayList<Message> getMessages(String sender) {
        ArrayList<Message> messagesBySender = new ArrayList<>();
        for (Message message : this.messages) {
            if (message.getSender().equals(sender)) {
                messagesBySender.add(message);
            }
        }
        return messagesBySender;
    }
}
