public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double MILES_TO_CASH = 0.0035;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }
    public RewardValue(double milesValue, boolean isMiles){
        if(isMiles){
            this.milesValue = milesValue;
            this.cashValue = milesToCash(milesValue);
        }else{
            throw new IllegalArgumentException("Second Parameter must be true.");
        }
    }
    public double cashToMiles(double cash){
        return cash/ MILES_TO_CASH;
    }
    public double milesToCash(double miles){
        return miles * MILES_TO_CASH;
    }
    public double getCashValue() {
        return cashValue;
    }
    public double getMilesValue() {
        return milesValue;
    }
}
