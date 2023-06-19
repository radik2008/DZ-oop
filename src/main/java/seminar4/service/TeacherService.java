package seminar4.service;

import seminar4.model.Teacher;
import seminar4.model.User;
import seminar4.repository.TeacherRepository;
import seminar4.repository.UserRepository;

import java.util.Comparator;
import java.util.List;

public class TeacherService implements UserService<Teacher> {
    private final UserRepository<Teacher> teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        Long id = teacherRepository.getMaxId() + 1;
        Teacher teacher = new Teacher(id, fullName, age, phoneNumber);
        teacherRepository.add(teacher);
    }

    @Override
    public List<Teacher> getAll() {
        return teacherRepository.getAll();
    }

    @Override
    public List<Teacher> getAllSortUsers() {

        return null;
    }


    @Override
    public List<Teacher> getAllSortUsersByFamilyName() {
        List<Teacher> students = teacherRepository.getAll();
        students.sort(new UserComparator<>());

        return students;
    }

    @Override
    public List<Teacher> getAllSortUsersByAge() {
        List<Teacher> teachers = teacherRepository.getAll();
/*        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });*/
//        students.sort((o1, o2) -> o1.getAge().compareTo(o2.getAge()));
        teachers.sort(Comparator.comparing(User::getAge));

        return teachers;
    }

    @Override
    public void removeUser(String fullName) {
        teacherRepository.remove(fullName);
    }

    @Override
    public Teacher getById(int id) {
        return teacherRepository.getById(id);
    }
}
