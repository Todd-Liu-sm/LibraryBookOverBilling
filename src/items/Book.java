package items;
import items.Renewable;
import service.FeeRule;
public class Book extends LoanItem implements Renewable {
    //图书类：继承LoanItem类，实现Renewable接口
    public Book(String id, String title, double dailyRate) {
        super(id, title, dailyRate);
    }

    @Override
    public double calculateRentalFee(int days) {
        //应当收费但算出来不足最低收费的，按最低收费收；算出来为0的不在此列。
        double fee = getDailyRate() * days;
        if (fee < FeeRule.getMinimumFee()) {
            return FeeRule.getMinimumFee();
        }
        return fee;
    }

    @Override
    public void renew() {
        System.out.println("Book " + getTitle() + " has been renewed.");
    }

    @Override
    public String category() {
        return "图书";
    }
}
