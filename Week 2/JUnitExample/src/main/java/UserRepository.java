public interface UserRepository {
    User findById(int id);
    void deleteById(int id);
}
