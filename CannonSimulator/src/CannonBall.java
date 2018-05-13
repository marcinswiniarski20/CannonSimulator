
import javax.swing.JTextField;


public class CannonBall 
{
    private double mass;
    private double airResistance;
    
    public CannonBall(double mass, double airResistance)
    {
        this.mass = mass;
        this.airResistance = airResistance;
    }

    public void setMass(double mass)
    {
        this.mass = mass;
    }
    public void setAirResistance(double airResistance)
    {
        this.airResistance = airResistance;
    }
    public double getMass()
    {
        return mass;
    }
    public double getAirResistance()
    {
        return airResistance;
    }
    
    public void writeDataToTextFields(JTextField m, JTextField r)
    {
        m.setText(""+mass);
        r.setText(""+airResistance);
    }
}
