package items;

public class Book extends LoanItem implements Renewable {
    //图书类：继承LoanItem类，实现Renewable接口
    public Book(String id, String title, double dailyRate) {
        super(id, title, dailyRate);
    }

    @Override
    public double calculateRentalFee(int days) {
        return getDailyRate() * days;
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
