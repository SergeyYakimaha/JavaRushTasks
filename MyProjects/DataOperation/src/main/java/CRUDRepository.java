import java.util.List;

public interface CRUDRepository<T> {
    T get(int id);
    List<T> getAll();
    void add(T obj);
    void update(T obj);
    void delete(int id);

    default void print() {
        System.out.println("CRUDRepository print");
    }
}
