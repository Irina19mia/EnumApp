package app.advisor;

public class WeekAdvisor implements Advisor {

    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Get up early and try to do difficult tasks until afternoon.");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Try kayaking!");
                break;
        }
    }
}
