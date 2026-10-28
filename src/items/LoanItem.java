package items;

public abstract class LoanItem {
    //抽象父类：保存编号、题名、日费率，声明抽象方法
    private String id;
    protected String title;   
    protected double dailyRate;

    public LoanItem(String id, String title, double dailyRate) {
        this.id = id;
        this.title = title;
        this.dailyRate = dailyRate;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    //抽象方法category()（返回「图书」「期刊」「影碟」
    public abstract String category();

    public abstract double calculateRentalFee(int days);
}
