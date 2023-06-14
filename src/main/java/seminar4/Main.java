package seminar4;

import seminar4.controller.StudentController;
import seminar4.controller.TeacherController;
import seminar4.model.Student;
import seminar4.model.StudentGroup;
import seminar4.model.Teacher;
import seminar4.repository.StudentRepository;
import seminar4.repository.TeacherRepository;
import seminar4.service.StudentService;
import seminar4.service.TeacherService;
import seminar4.view.SortType;
import seminar4.view.StudentView;
import seminar4.view.TeacherView;
import seminar4.view.UserView;

public class Main {
    public static void main(String[] args) {
        StudentView viewStudent = getStudentView();
//----------------------------------------------------------------------
        viewStudent.create("Ivan Morozov", 18, "02");
        viewStudent.create("Petr Vorobev", 19, "03");
        viewStudent.create("Sidor Sidorov", 20, "112");
        viewStudent.sendOnConsole(SortType.NONE);
        viewStudent.create("Elena Ivanova", 19, "911");
        viewStudent.create("Anna Morozova", 17, "01");
        viewStudent.sendOnConsole(SortType.NONE);
        viewStudent.sendOnConsole(SortType.NAME);
        viewStudent.sendOnConsole(SortType.FAMILY);
        viewStudent.sendOnConsole(SortType.AGE);

        System.out.println("*************************************");

        TeacherView viewTeacher = getTeacherView();

        viewTeacher.create("Мария Ивановна", 18, "02");
        viewTeacher.create("Наталья Петровна", 19, "03");
        viewTeacher.create("Иван Василич", 20, "112");
        viewTeacher.sendOnConsole(SortType.NONE);
        viewTeacher.create("Ольга Петровна", 19, "911");
        viewTeacher.create("Алла Николаевна", 17, "01");
        viewTeacher.sendOnConsole(SortType.NONE);
        viewTeacher.sendOnConsole(SortType.NAME);
        viewTeacher.sendOnConsole(SortType.FAMILY);
        viewTeacher.sendOnConsole(SortType.AGE);



    }

    private static StudentView getStudentView() {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
        return new StudentView(controller);
    }

    private static TeacherView getTeacherView() {
        TeacherRepository repository = new TeacherRepository();
        TeacherService service = new TeacherService(repository);
        TeacherController controller = new TeacherController(service);
        return new TeacherView(controller);
    }

}