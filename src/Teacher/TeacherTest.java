package Teacher;
    public class TeacherTest {
        public static void main(String[] args) {
            Teacher teacher=new Teacher("sandeep", 26, true, "+6302720664", 25000.500);
            //teacher.name="sandeep";
            //teacher.age=26;
            //teacher.heIsAMathsTeacher=true;
            //teacher.mobileNum="+6302720664";
            //teacher.salary=25000.500;
            TeacherService obj=new TeacherService();
            obj.teacherService(teacher);


        }
    }

