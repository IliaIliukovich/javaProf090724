package lesson202410124;

import static lesson202410124.JobActions.Task;
public class Office {

    public static void main(String[] args) {

        JobActions manager = new JobActions() {
            @Override
            public void doTask(Task task) {
                System.out.println("We need to: " + task.getName());
            }

            @Override
            public void haveRest() {
                System.out.println("Drink coffee");
            }
        };

        JobActions worker = new JobActions() {
            @Override
            public void doTask(Task task) {
                System.out.println("Doing task: " + task.getName());
            }

            @Override
            public void haveRest() {
                System.out.println("Having rest and smoking");
            }
        };

        JobActions lazyWorker = new JobActions() {
            @Override
            public void doTask(Task task) {
                haveRest();
            }

            @Override
            public void haveRest() {
                System.out.println("Doing nothing");
            }
        };

        Task task = new Task("Create Web application", "Docs");

        manager.doTask(task);
        manager.haveRest();
        worker.doTask(task);
        worker.haveRest();
        lazyWorker.doTask(task);
        lazyWorker.haveRest();


        JobActions programmer = new Employee("Tom") {
            @Override
            public void doTask(Task task) {
                System.out.println(this.getName() + " doing task: " + task.getName());
            }

            @Override
            public void haveRest() {
                System.out.println("Relaxing");
            }
        };
        programmer.doTask(task);
        programmer.haveRest();

    }



}
