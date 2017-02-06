package css.evanmumbleau.tipcalc;

/**
 * Created by emumbleau on 2/6/2017.
 */
public interface TipCalculatorInterFace {
    Double calcTotalTip(Double bill);

    Double calcTipPerPerson(Double bill, Integer numPeople);
}
