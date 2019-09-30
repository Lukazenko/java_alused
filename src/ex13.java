import java.util.Scanner;
import nhlstats.NHLStatistics;

public class ex13 {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("Top 25 by penalty");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("Stats for Sidney Crospy");
        NHLStatistics.searchByPlayer("Sidney Crospy");

        System.out.println("Stats for Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");

        System.out.println("Stats for Anaheim Ducks by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");


    }
}



