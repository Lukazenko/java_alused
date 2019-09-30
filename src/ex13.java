import java.util.Scanner;
import nhlstats.NHLStatistics;

public class ex13 {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by goals\n");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("\nTop 25 by penalty\n");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("\nStats for Sidney Crosby\n");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println("\nStats for Philadelphia Flyers\n");
        NHLStatistics.teamStatistics("PHI");

        System.out.println("\nStats for Anaheim Ducks by points\n");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");


    }
}



