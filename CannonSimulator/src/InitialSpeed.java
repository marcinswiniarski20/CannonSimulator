import java.lang.Math.*;
import javax.swing.JTextField;

public class InitialSpeed 
{
    private double speed;
    private double angle;
    private double angleInRadians;
    
    public InitialSpeed(double speed, double angle)
    {
        this.speed = speed;
        this.angle = angle;
    }

    public double getVerticalSpeed()
    {
        angleInRadians = angle*Math.PI/180;
        return speed*Math.sin(angleInRadians);
    }
    public double getHorizontalSpeed()
    {
        angleInRadians = angle*Math.PI/180;
        return speed*Math.cos(angleInRadians);
    }
    public void setSpeed(double speed)
    {
        this.speed = speed;
    }
    public void setAngle(double angle)
    {
        this.angle = angle;
    }
    public double getAngle()
    {
        return angle;
    }
    public void writeDataToTextFields(JTextField s, JTextField a)
    {
        s.setText(""+speed);
        a.setText(""+angle);
    }
}
