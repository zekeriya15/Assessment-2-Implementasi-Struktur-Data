import java.util.PriorityQueue;
import java.util.ArrayList;


public class PriorityScheduler {
    private PriorityQueue<PackageSchedule> scheduleQueue;

    // constructor
    public PriorityScheduler() {
        this.scheduleQueue = new PriorityQueue<>();
    }

    public void terimaKiriman(int id, String name, int date, String type, String address) {
        this.scheduleQueue.add(new PackageSchedule(id, type, name, date, address));
    }

    public PackageSchedule getNextSchedule() {
        return this.scheduleQueue.poll();
    }

    public void cetakDaftarPaket() {
        ArrayList<PackageSchedule> schedules = new ArrayList<>();

        while(!this.scheduleQueue.isEmpty()) {
            schedules.add(this.scheduleQueue.poll());
        }

        for (PackageSchedule schedule : schedules) {
            System.out.println(schedule);
        }

    }

    
}
