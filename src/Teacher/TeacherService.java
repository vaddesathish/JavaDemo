package Teacher;

public class TeacherService {
    public Teacher teacherService(Teacher teacher) {
        System.out.println(teacher.name+"\n"+teacher.age+"\n"+teacher.heIsAMathsTeacher+"\n"+teacher.mobileNum+"\n"+teacher.salary);
        return teacher;
    }
}
