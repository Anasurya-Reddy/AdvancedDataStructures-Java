import java.util.Arrays;
class Job {
    int id, deadline, profit;
    Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit; 
    }
}
public class JobScheduling {
    public static void scheduleJobs(Job[] jobs) {
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);
        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }
        boolean[] slots = new boolean[maxDeadline]; // Track occupied slots
        int[] result = new int[maxDeadline]; // Store job sequence
        int totalProfit = 0;
        // Step 2: Assign jobs to available slots
        for (Job job : jobs) {
            for (int j = Math.min(maxDeadline - 1, job.deadline - 1); j >= 0; j--) {
                if (!slots[j]) { // If slot is free, assign the job
                    slots[j] = true;
                    result[j] = job.id;
                    totalProfit += job.profit;
                    break;
                }
            }
        }
        // Step 3: Print the job sequence and total profit
        System.out.print("Selected Jobs: ");
        for (int id : result) {
            if (id > 0) {
                System.out.print(id + " ");
            }
        }
        System.out.println("\nTotal Profit: " + totalProfit);
    }
    public static void main(String[] args) {
        Job[] jobs = {
            new Job(1, 2, 100),
            new Job(2, 1, 19),
            new Job(3, 2, 27),
            new Job(4, 1, 25),
            new Job(5, 3, 15)
        };
        scheduleJobs(jobs);
    }
}
