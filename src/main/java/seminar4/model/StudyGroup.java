package seminar4.model;

import java.util.List;

public class StudyGroup {
    private Teacher teacher;

    public List<Student>students;

    public StudyGroup() {
        this.teacher = teacher;
        this.students = students;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }


}
