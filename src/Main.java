import items.Book;
import items.DVD;
import items.Journal;
import items.LoanItem;
import service.LoanService;


public class Main {
    public static void main(String[] args) {
        //创建图书、期刊、影碟对象
        LoanItem book1 = new Book("B001", "Java Programming", 1.5);
        LoanItem journal1 = new Journal("J001", "Science Journal", 2.0);
        LoanItem dvd1 = new DVD("D001", "Inception", 3.0);
        //打印创建的三个对象的书名，ID和类型
        System.out.println("Book: " + book1.getTitle() + ", ID: " + book1.getId() + ", Type: " + book1.getClass().getSimpleName());
        System.out.println("Journal: " + journal1.getTitle() + ", ID: " + journal1.getId() + ", Type: " + journal1.getClass().getSimpleName());
        System.out.println("DVD: " + dvd1.getTitle() + ", ID: " + dvd1.getId() + ", Type: " + dvd1.getClass().getSimpleName());


        //计算租金
        // System.out.println(book1.getTitle() + " rental fee for 5 days: $" + book1.calculateRentalFee(5));
        // System.out.println(journal1.getTitle() + " rental fee for 3 days: $" + journal1.calculateRentalFee(3));
        // System.out.println(dvd1.getTitle() + " rental fee for 7 days: $" + dvd1.calculateRentalFee(7));

        //续借操作
        // if (book1 instanceof Renewable) {
        //     ((Renewable) book1).renew();
        // }
        // if (dvd1 instanceof Renewable) {
        //     ((Renewable) dvd1).renew();
        // }

        //使用LoanService进行结算服务
        // LoanService loanService = new LoanService();
        // loanService.addLoanItem(book1);
        // loanService.addLoanItem(journal1);
        // loanService.addLoanItem(dvd1);

        // loanService.printSummary();
    }
}
