package SpringCore;

public class UserService {
    private MessageService messageService;

    // Constructor Injection (DI)
    public UserService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void displayUserMessage() {
        System.out.println("User Message: " + messageService.getMessage());
    }
}
