import java.util.List;

public  class PrintTaskPending implements PrintTask {
    @Override
    public void printTasks(List<Task> tasks) {
        System.out.println("Taches non terminees :");
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                System.out.println(task);
            }
        }
    }
}
