package Plan;

import Plan.Items.EnvelopedBoolean;
import java.util.Calendar;

public class Switch {
    public static int switcher = 0;
    public static int chosenDay = 0;
    public static Calendar chosenDate;
    public static EnvelopedBoolean editMode = new EnvelopedBoolean(false);
    public static EnvelopedBoolean grid = new EnvelopedBoolean(false);
    public static EnvelopedBoolean addingMode = new EnvelopedBoolean(false);
}
