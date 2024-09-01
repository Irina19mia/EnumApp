package app;

import app.advisor.Advisor;
import app.advisor.Day;
import app.advisor.WeekAdvisor;

public class Main {

    public static void main(String[] args) {
        Advisor advisor = new WeekAdvisor();
        advisor.advise(Day.THURSDAY);
        advisor.advise(Day.FRIDAY);
        advisor.advise(Day.SUNDAY);
    }
}
