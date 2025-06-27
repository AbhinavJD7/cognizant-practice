public class UserService {
    private UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User findUserById(int id) {
        return repo.findById(id);
    }

    public void deleteUser(int id) {
        repo.deleteById(id);
    }
}
