package persist;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class StudentRepository {

    private final AtomicLong identity = new AtomicLong(0);

    private final Map<Long, Student> identityMap = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        insert(new Student(null, "Иван", "Иванов", 18));
        insert(new Student(null, "Петр", "Петров", 21));
        insert(new Student(null, "Сергей", "Сидоров", 19));
    }

    public Student insert(Student student) {
        student.setId(identity.incrementAndGet());
        identityMap.put(student.getId(), student);
        return student;
    }

    public void update(Student student) {
        identityMap.put(student.getId(), student);
    }

    public void delete(long id) {
        identityMap.remove(id);
    }

    public Student findById(long id) {
        return identityMap.get(id);
    }

    public List<Student> findAll() {
        return new ArrayList<>(identityMap.values());
    }
}
