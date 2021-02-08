
package ClassesMetier;

import java.util.ArrayList;
public class Trader
{
    private int idTrader;
    private String nomTrader;
    private ArrayList<Action> sesActions;
    
    public Trader(int unIdTrader, String unNomTrader)
    {
        idTrader = unIdTrader;
        nomTrader = unNomTrader;
        sesActions = new ArrayList<Action>();
    }

    public int getIdTrader() {
        return idTrader;
    }

    public void setIdTrader(int idTrader) {
        this.idTrader = idTrader;
    }

    public String getNomTrader() {
        return nomTrader;
    }

    public void setNomTrader(String nomTrader) {
        this.nomTrader = nomTrader;
    }

    public ArrayList<Action> getSesActions() {
        return sesActions;
    }

    public void setSesActions(ArrayList<Action> sesActions) {
        this.sesActions = sesActions;
    }
}
