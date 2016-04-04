/**
 * Created by chrisschayer on 3/31/16.
 */
public class ScheduleBuilderDemo {
    public static void main(String[] args) {
        ScheduleBuilder scheduleBuilder = new ScheduleBuilder();

        Schedule artSchedule =  scheduleBuilder.scheduleArtBuilder("Sewing","Creative Dance");

        artSchedule.showActivities();

        Schedule sportSchedule = scheduleBuilder.scheduleSportBuilder("Swimming","Horticulture");
        sportSchedule.showActivities();
    }
}
