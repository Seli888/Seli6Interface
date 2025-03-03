public class Programmer implements Workable{
    String workProgrammer = "Программист пишет код";
    @Override
    public void work() {
        System.out.println(workProgrammer);
    }
}
