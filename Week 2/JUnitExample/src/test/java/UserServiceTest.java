import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    // Exercise 1: Mocking and Stubbing
    @Test
    public void testFindUserById_MockingAndStubbing() {
        UserRepository mockRepo = mock(UserRepository.class);
        UserService userService = new UserService(mockRepo);

        User dummyUser = new User(1, "Alice");
        when(mockRepo.findById(1)).thenReturn(dummyUser);

        User result = userService.findUserById(1);

        assertNotNull(result);
        assertEquals("Alice", result.getName());
    }

    // Exercise 2: Verifying Interactions
    @Test
    public void testDeleteUser_VerifyInteraction() {
        UserRepository mockRepo = mock(UserRepository.class);
        UserService userService = new UserService(mockRepo);

        userService.deleteUser(42);

        verify(mockRepo, times(1)).deleteById(42);
    }
}
