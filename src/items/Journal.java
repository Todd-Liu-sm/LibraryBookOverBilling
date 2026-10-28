package items;
import items.Renewable;
import service.FeeRule;
public class Journal extends LoanItem implements Renewable {
    //期刊类：继承LoanItem类，实现Renewable接口
    public Journal(String id, String title, double dailyRate) {
        super(id, title, dailyRate);
    }

    @Override
    public double calculateRentalFee(int days) {
        double fee = getDailyRate() * days;
        if (fee < FeeRule.getMinimumFee()) {
            return FeeRule.getMinimumFee();
        }
        if (fee > FeeRule.getMaxJournalFee()) {
            return FeeRule.getMaxJournalFee();
        }
        else {
            return fee;
        }
    }

    @Override
    public void renew() {
        System.out.println("Journal " + getTitle() + " has been renewed.");
    }

    @Override
    public String category() {
        return "期刊";
    }
}
