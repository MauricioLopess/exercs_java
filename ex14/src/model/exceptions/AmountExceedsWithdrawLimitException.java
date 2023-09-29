package model.exceptions;

public class AmountExceedsWithdrawLimitException extends Exception {
    public AmountExceedsWithdrawLimitException(String msg){
        super(msg);
    }
}
