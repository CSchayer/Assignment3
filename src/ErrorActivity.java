/**
 * Created by chrisschayer on 4/3/16.
 */
public class ErrorActivity implements Activity {
    @Override
    public String name(){return "Error";}

    @Override
    public Location location() {
        Venue venue = new Venue();

        return venue;
    }

    @Override
    public String type(){return "Invalid Activity";}
}
