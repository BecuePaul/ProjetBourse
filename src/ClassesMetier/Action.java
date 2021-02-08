
package ClassesMetier;


public class Action
{
    private int idAction;
    private String nomAction;
    private double coursReel;
    private double coursAchat;
    private int quantiteAchat;
    
    
    public Action(int uneAction,String unNomAction,double unCoursReel, double unCoursAchat,int uneQuantiteAchat)
    {
        idAction = uneAction;
        nomAction = unNomAction;
        coursReel = unCoursReel;
        coursAchat = unCoursAchat;
        quantiteAchat = uneQuantiteAchat;   
    }

    public int getIdAction() {
        return idAction;
    }

    public void setIdAction(int idAction) {
        this.idAction = idAction;
    }

    public String getNomAction() {
        return nomAction;
    }

    public void setNomAction(String nomAction) {
        this.nomAction = nomAction;
    }

    public double getCoursReel() {
        return coursReel;
    }

    public void setCoursReel(double coursReel) {
        this.coursReel = coursReel;
    }

    public double getCoursAchat() {
        return coursAchat;
    }

    public void setCoursAchat(double coursAchat) {
        this.coursAchat = coursAchat;
    }

    public int getQuantiteAchat() {
        return quantiteAchat;
    }

    public void setQuantiteAchat(int quantiteAchat) {
        this.quantiteAchat = quantiteAchat;
    }
}