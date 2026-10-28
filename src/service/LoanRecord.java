package service;

import items.LoanItem;

public class LoanRecord {
//数据类：一条借阅记录（借阅物+借阅人+逾期天数）
    private LoanItem item;
    private String borrower;
    private int overdueDays;

    public LoanRecord(LoanItem item, String borrower, int overdueDays) {
        this.item = item;
        this.borrower = borrower;
        this.overdueDays = overdueDays;
    }

    // Getters and setters
    public LoanItem getItem() {
        return item;
    }

    public void setItem(LoanItem item) {
        this.item = item;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public int getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(int overdueDays) {
        this.overdueDays = overdueDays;
    }
}
