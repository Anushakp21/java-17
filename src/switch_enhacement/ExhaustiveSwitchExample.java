package switch_enhacement;

public class ExhaustiveSwitchExample  {
	 public static String describeDay(Day day) {
	        return switch (day) {
	            case MONDAY, FRIDAY -> "Start or end of the work week!";
	            case TUESDAY, WEDNESDAY, THURSDAY -> "Midweek work day!";
	            case SATURDAY, SUNDAY -> "Weekend relaxation!";
	        };
	    }

	    enum Day {
	        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	    }
	    public static void main(String[] args) {
	        System.out.println(describeDay(Day.MONDAY));
	        System.out.println(describeDay(Day.SATURDAY));
	    }
}
