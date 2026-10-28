package items;
import items.Renewable;
import service.FeeRule;
public class DVD extends LoanItem implements Renewable {
    //DVD类：继承LoanItem类，实现Renewable接口
    public DVD(String id, String title, double dailyRate) {
        super(id, title, dailyRate);
    }

    @Override
    public double calculateRentalFee(int days) {
        double fee = getDailyRate() * days;
        if (fee < FeeRule.getMinimumFee()) {
            return FeeRule.getMinimumFee();
        }
        if (days > FeeRule.getDvdGracePeriod()) {
            return getDailyRate() * days;
        } else {
            return 0.0; // 在宽限期内不收费
        }
    }

    @Override
    public void renew() {
        System.out.println("DVD " + getTitle() + " has been renewed.");
    }

    @Override
    public String category() {
        return "影碟";
    }
}
