package items;

public class DVD extends LoanItem implements Renewable {
    //DVD类：继承LoanItem类，实现Renewable接口
    public DVD(String id, String title, double dailyRate) {
        super(id, title, dailyRate);
    }

    @Override
    public double calculateRentalFee(int days) {
        return getDailyRate() * days;
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
