public class MilitaryService implements NationalService {

    private int daysLeft;

    MilitaryService(int daysLeft){
        this.daysLeft = daysLeft;
    }

    @Override
    public int getDaysLeft() {
        return this.daysLeft;
    }

    @Override
    public void work() {
        if (this.daysLeft > 0) {
            this.daysLeft--;
        }
    }
}
