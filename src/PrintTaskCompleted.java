import java.util.List;

public class PrintTaskCompleted implements PrintTask {
    @Override
    public void printTasks(List<Task> tasks) {
        System.out.println("Taches terminees :");
        for (Task task : tasks) {
            if (task.isCompleted()) {
                System.out.println(task);
            }
        }
    }
}
