package service;

public class FeeRule {
    //全局计费规则（最低收费、期刊封顶、影碟宽限期）
    private static final double MINIMUM_FEE = 1.0; //最低收费
    private static final double MAX_JOURNAL_FEE = 5.0; //期刊封顶
    private static final int DVD_GRACE_PERIOD = 2; //影碟宽限期
    //获取最低收费
    public static double getMinimumFee() {
        return MINIMUM_FEE;
    }
    //获取期刊封顶
    public static double getMaxJournalFee() {
        return MAX_JOURNAL_FEE;
    }
    //获取影碟宽限期
    public static int getDvdGracePeriod() {
        return DVD_GRACE_PERIOD;
    }
}
