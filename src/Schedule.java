
import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private List<Activity> activities = new ArrayList<Activity>();
    private boolean isValidSchedule;
    public void addActivity(String activity){

        activities.add(setActivity(activity));
    }

    public List<Activity> getActivityList(List<Activity> activities)
    {
        List<Activity> temp = new ArrayList<Activity>(activities);
        return temp;
    }

    public void verifyActivities(List<Activity> activities)
    {
         isValidSchedule = true;
        for(int i = 0; i<activities.size()-1;i++)
        {
            if(i==activities.size()-1)
            {
                if(activities.get(i) instanceof ErrorActivity)
                {
                    isValidSchedule = false;
                    break;
                }
            }
            else {
                if (activities.get(i) instanceof ErrorActivity) {
                    isValidSchedule = false;
                    break;
                } else if (activities.get(i).type() == activities.get(i + 1).type()) {
                    isValidSchedule = false;
                    break;
                } else if ((activities.get(i)).getClass().getSuperclass() != activities.get(i + 1).getClass().getSuperclass()) {
                    isValidSchedule = false;
                    break;
                }
            }
        }

    }

    public void showActivities(){
        int i = 1;
        verifyActivities(getActivityList(activities));
        if(isValidSchedule) {
            for (Activity activity : activities) {
                System.out.println("Activity #" + i);
                System.out.println("----------------------------------");
                System.out.println("Activity : " + activity.name());
                System.out.println("Location : " + activity.location().location(activity.name()));
                System.out.println("Type : " + activity.type());
                System.out.println();
                i++;
            }
        }
        else
        {
            System.out.println("Invalid activity requested");
        }
    }
    public Activity setActivity(String activity)
    {
        Activity tempActivity;
        switch(activity.toUpperCase())
        {
            case "GYMNASTICS":
                tempActivity = new Gymnastics();
                break;
            case "CREATIVE DANCE":
                tempActivity = new CreativeDance();
                break;

            case "SWIMMING":
                tempActivity = new Swimming();
                break;
            case "SYNCHRONIZED SWIMMING":
                tempActivity= new SynchSwimming();
                break;

            case "BASEBALL":
                tempActivity = new Baseball();
                break;

            case "SEWING":
                tempActivity = new Sewing();
                break;

            case "PAINTING":
                tempActivity = new Painting();
                break;

            case "PHOTOGRAPHY":
                tempActivity = new Photography();
                break;

            case "HORTICULTURE":
                tempActivity = new Horticulture();
                break;

            default:
                tempActivity = new ErrorActivity();
        }
        return tempActivity;
    }
}
