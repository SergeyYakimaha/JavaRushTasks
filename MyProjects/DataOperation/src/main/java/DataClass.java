import java.util.ArrayList;
import java.util.List;

public class DataClass<T> implements CRUDRepository<T> {

    @Override
    public void print() {
        System.out.println("DataClass print");
    }

    public T get(int id) {
        System.out.println("Нашел");
        T obj = (T)new Object();
        System.out.println(obj.getClass());
        return obj;
    }

    @Override
    public List<T> getAll() {
        System.out.println("Нашел");
        return new ArrayList<T>();
    }

    public void add(T obj) {
        System.out.println("Добавил " + obj.getClass());
    }

    public void update(T obj) {
        System.out.println("Обновил " + obj.getClass());
    }

    public void delete(int id) {
        System.out.println("Удалил");
    }
}
