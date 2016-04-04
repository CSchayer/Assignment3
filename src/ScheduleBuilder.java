/**
 * Created by chrisschayer on 3/31/16.
 */
public class ScheduleBuilder {

    public Schedule scheduleArtBuilder(String activity1, String activity2){//for building an artschedule

        Schedule artSchedule = new Schedule();
        artSchedule.addActivity(activity1);
        artSchedule.addActivity(activity2);
        return artSchedule;
    }

    public Schedule scheduleSportBuilder(String activity1, String activity2){
        Schedule sportSchedule = new Schedule();
        sportSchedule.addActivity(activity1);
        sportSchedule.addActivity(activity2);
        return sportSchedule;
    }
}
