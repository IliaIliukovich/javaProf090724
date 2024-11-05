package lesson20241105.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class UsePriorityQueueExample {

    // ProjectManager --> Task (name, priority)
    // Programmer1, Programmer2
    public static class ProjectManager {

        private Queue<Task> queue;
        private int i = 0;

        public ProjectManager(Queue<Task> queue) {
            this.queue = queue;
        }

        public void giveTask() {
            Random random = new Random();
            Task task = new Task("Task " + i++, random.nextInt(10));
            queue.add(task);
            System.out.println("Task is given: " + task);
        }

    }

    public static class Programmer {

        private Queue<Task> queue;

        public Programmer(Queue<Task> queue) {
            this.queue = queue;
        }

        public void doTask() {
            if (!queue.isEmpty()) {
                Task task = queue.remove();
                System.out.println(this + " doing task: " + task);
            } else {
                System.out.println("No tasks in the queue");
            }
        }

    }

    public static class Task implements Comparable<Task>{
        private String name;
        private int priority;

        public Task(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        @Override
        public int compareTo(Task o) {
            return o.priority - this.priority;
        }

        @Override
        public String toString() {
            return "Task{" +
                    "name='" + name + '\'' +
                    ", priority=" + priority +
                    '}';
        }
    }

    public static void main(String[] args) {
        Queue<Task> taskQueue = new PriorityQueue<>();
        ProjectManager projectManager = new ProjectManager(taskQueue);
        Programmer programmer1 = new Programmer(taskQueue);
        Programmer programmer2 = new Programmer(taskQueue);

        projectManager.giveTask();
        projectManager.giveTask();
        projectManager.giveTask();
        projectManager.giveTask();
        projectManager.giveTask();

        while (!taskQueue.isEmpty()) {
            programmer1.doTask();
            programmer2.doTask();
        }

    }






}
