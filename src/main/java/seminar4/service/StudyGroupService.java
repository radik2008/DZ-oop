package seminar4.service;

import seminar4.model.Student;
import seminar4.model.StudyGroup;
import seminar4.model.Teacher;

import java.util.List;

public class StudyGroupService {
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        StudyGroup studyGroup = new StudyGroup();
        studyGroup.setTeacher(teacher);
        studyGroup.setStudents(students);
        return studyGroup;
    }
}