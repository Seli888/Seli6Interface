public class Teacher implements Workable{
    String workTeacher = "Учитель проводит урок";
    @Override
    public void work() {
        System.out.println(workTeacher);
    }
}
