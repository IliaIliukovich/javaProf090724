package lesson20250206;

import java.util.List;
import java.util.Optional;

public interface WorldDAO<T, Id> {

    List<T> getAll();
    Optional<T> getById(Id id);
    void save(T data);
    T update(T data);
    void delete(Id id);

}
