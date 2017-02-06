package css.evanmumbleau.tipcalc;

/**
 * Created by emumbleau on 2/6/2017.
 */
public class TipCalculator implements TipCalculatorInterFace {
    //private Double bill;
   // private Integer numPeople;
    private Double totTip;
    private Double tipPerPerson;
    final Double BASICTIP = 0.1;

    @Override
    public Double calcTotalTip(Double bill){
        totTip = bill * BASICTIP;
        return totTip;
    }

    @Override
    public Double calcTipPerPerson(Double bill, Integer numPeople){

        tipPerPerson = calcTotalTip(bill) / numPeople;
        return tipPerPerson;
    }

}
