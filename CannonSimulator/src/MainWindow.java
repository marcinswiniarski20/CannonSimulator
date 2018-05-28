
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class MainWindow extends javax.swing.JFrame 
{
    final double gravity = 9.81;
        
    LinkedHashMap <Double, Double> setOfValues = new LinkedHashMap <Double, Double> ();
    
    CannonBall cannonBall = new CannonBall(1, 1);
    
    InitialSpeed initSpeed = new InitialSpeed(20, 45);
    
    double yValue = 0, xValue = 0;    
    double step = 0.05;
    double k1, k2, k3, k4, speedY, speedX;
    
    int counter;
    
    
    public MainWindow() 
    {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cannonBall.writeDataToTextFields(mass, airResistance);
        initSpeed.writeDataToTextFields(initialSpeed, angle);
        getDataFromTextFields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        massLabel = new javax.swing.JLabel();
        airResistanceLabel = new javax.swing.JLabel();
        angleLabel = new javax.swing.JLabel();
        mass = new javax.swing.JTextField();
        airResistance = new javax.swing.JTextField();
        angle = new javax.swing.JTextField();
        initialSpeedLabel = new javax.swing.JLabel();
        initialSpeed = new javax.swing.JTextField();
        massUnit = new javax.swing.JLabel();
        resistanceUnit = new javax.swing.JLabel();
        angleUnit = new javax.swing.JLabel();
        speedUnit = new javax.swing.JLabel();
        maxHeightLabel = new javax.swing.JLabel();
        maxHeightTimeLabel = new javax.swing.JLabel();
        flightTimeLabel = new javax.swing.JLabel();
        scopeLabel = new javax.swing.JLabel();
        maxHeight = new javax.swing.JTextField();
        maxHeightTime = new javax.swing.JTextField();
        flightTime = new javax.swing.JTextField();
        scope = new javax.swing.JTextField();
        simulationButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CannonSimulator");
        setPreferredSize(new java.awt.Dimension(680, 290));
        setSize(new java.awt.Dimension(600, 100));

        massLabel.setText("Masa kuli - m");

        airResistanceLabel.setText("Opór powietrza - b");

        angleLabel.setText("Kąt wystrzału - φ");

        mass.setName(""); // NOI18N
        mass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                massKeyTyped(evt);
            }
        });

        airResistance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                airResistanceKeyTyped(evt);
            }
        });

        angle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                angleKeyTyped(evt);
            }
        });

        initialSpeedLabel.setText("Prędkość początkowa - vo");

        initialSpeed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                initialSpeedKeyTyped(evt);
            }
        });

        massUnit.setText("[kg]");

        resistanceUnit.setText("[N]");

        angleUnit.setText("[deg]");

        speedUnit.setText("[m/s]");

        maxHeightLabel.setText("Wysokość ymax");

        maxHeightTimeLabel.setText("Czas potrzebny do osiągnięcia ymax");

        flightTimeLabel.setText("Czas lotu tmax");

        scopeLabel.setText("Zasięg xmax");

        maxHeight.setFocusable(false);

        maxHeightTime.setFocusable(false);

        flightTime.setFocusable(false);

        scope.setFocusable(false);

        simulationButton.setText("Przeprowadź symulację");
        simulationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simulationButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(airResistanceLabel)
                            .addComponent(massLabel)
                            .addComponent(angleLabel)
                            .addComponent(initialSpeedLabel))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mass, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(massUnit))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(airResistance, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(resistanceUnit))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(angle, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                    .addComponent(initialSpeed))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(speedUnit)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(angleUnit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(6, 6, 6)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scopeLabel)
                            .addComponent(flightTimeLabel)
                            .addComponent(maxHeightTimeLabel)
                            .addComponent(maxHeightLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(flightTime, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(maxHeightTime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(maxHeight, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(scope, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(simulationButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(massLabel)
                            .addComponent(mass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(massUnit)
                            .addComponent(maxHeightLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(airResistanceLabel)
                            .addComponent(airResistance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resistanceUnit)
                            .addComponent(maxHeightTimeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(flightTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(angleLabel)
                                .addComponent(angle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(angleUnit)
                                .addComponent(flightTimeLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(initialSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speedUnit)
                            .addComponent(scopeLabel)
                            .addComponent(initialSpeedLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(maxHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maxHeightTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(scope, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(simulationButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simulationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simulationButtonActionPerformed
        getDataFromTextFields();
        yValue = 0;
        xValue = 0;
        counter = 0;
        speedY = initSpeed.getVerticalSpeed();
        speedX = initSpeed.getHorizontalSpeed();
        setOfValues.clear();
        
        do
        {
            setOfValues.put(xValue, yValue);
                        
            integration(gravity, speedY);
            integration(speedX);
            
            counter++;
            
        }while(yValue >= 0);
        
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(3);
        
        scope.setText("" + df.format(xValue));
        flightTime.setText("" + df.format(counter*step));
        maxHeight.setText("" + df.format(maxHeight()));
        
        System.out.println(setOfValues);
        
        LineChart chart = new LineChart("CannonSimulator", "Simulation of the cannon", setOfValues);
        chart.pack( );
        chart.setVisible(true);
    }//GEN-LAST:event_simulationButtonActionPerformed

    private void massKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_massKeyTyped
        isNumber(evt);
    }//GEN-LAST:event_massKeyTyped

    private void airResistanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_airResistanceKeyTyped
        isNumber(evt);
    }//GEN-LAST:event_airResistanceKeyTyped

    private void angleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_angleKeyTyped
        isNumber(evt);
    }//GEN-LAST:event_angleKeyTyped

    private void initialSpeedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_initialSpeedKeyTyped
        isNumber(evt);
    }//GEN-LAST:event_initialSpeedKeyTyped

    
    public static void main(String args[]) 
    {
                     
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new MainWindow().setVisible(true);
            }
        });
    }
    
    private double maxHeight()
    { 
       int count = 0;
       double max = 0;
       for(Entry<Double, Double> entry : setOfValues.entrySet())
       {
           if(max < entry.getValue())
           {
               max = entry.getValue();
           }
       }
       for(Entry<Double, Double> entry : setOfValues.entrySet())
       {
           if(entry.getValue().equals(max))
           {
                DecimalFormat df = new DecimalFormat();
                df.setMaximumFractionDigits(3);
                maxHeightTime.setText(""+df.format(count*step));
                break;
           }
           count++;
       }
        return max;
    }
    private void integration(double x, double speed)
    {
        double b = cannonBall.getAirResistance();
        double m = cannonBall.getMass();
        
        
        k1 = (0.5)*step*(-x - (b/m)*speed);
        k2 = (0.5)*step*(-x - (b/m)*(speed + k1));
        k3 = (0.5)*step*(-x - (b/m)*(speed + k2));
        k4 = (0.5)*step*(-x - (b/m)*(speed + 2*k3));

        yValue += step*(speed + (1.0/3.0)*(k1 + k2 + k3));
        speedY += (1.0/3.0)*(k1 + 2*k2 + 2*k3 +k4);
    }
    private void integration(double speed)
    {
        double b = cannonBall.getAirResistance();
        double m = cannonBall.getMass();
        
        
        k1 = (0.5)*step*(-(b/m)*speed);
        k2 = (0.5)*step*(-(b/m)*(speed + k1));
        k3 = (0.5)*step*(-(b/m)*(speed + k2));
        k4 = (0.5)*step*(-(b/m)*(speed + 2*k3));

        xValue += step*(speed + (1.0/3.0)*(k1 + k2 + k3));
        speedX += (1.0/3.0)*(k1 + 2*k2 + 2*k3 +k4);
    }
    private void isNumber(KeyEvent evt)
    {
        boolean isNumber = false;
        char c = evt.getKeyChar();
        
        if((c >= '0' && c <= '9') || c == '.')
            isNumber = true;
        if(!isNumber)
            evt.consume();
    }
    private void getDataFromTextFields()
    {
        Double[] tmp = new Double[4];
        
        if(!mass.getText().isEmpty())
        {
            tmp[0]= Double.parseDouble(mass.getText());
            cannonBall.setMass(tmp[0]);
        }
        
        if(!angle.getText().isEmpty())
        {
            tmp[1] = Double.parseDouble(angle.getText());
            initSpeed.setAngle(tmp[1]);
        }
        
        if(!airResistance.getText().isEmpty())
        {
            tmp[2] = Double.parseDouble(airResistance.getText());
            cannonBall.setAirResistance(tmp[2]);
        }
        
        if(!initialSpeed.getText().isEmpty())
        {
            tmp[3] = Double.parseDouble(initialSpeed.getText());
            initSpeed.setSpeed(tmp[3]);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airResistance;
    private javax.swing.JLabel airResistanceLabel;
    private javax.swing.JTextField angle;
    private javax.swing.JLabel angleLabel;
    private javax.swing.JLabel angleUnit;
    private javax.swing.JTextField flightTime;
    private javax.swing.JLabel flightTimeLabel;
    private javax.swing.JTextField initialSpeed;
    private javax.swing.JLabel initialSpeedLabel;
    private javax.swing.JTextField mass;
    private javax.swing.JLabel massLabel;
    private javax.swing.JLabel massUnit;
    private javax.swing.JTextField maxHeight;
    private javax.swing.JLabel maxHeightLabel;
    private javax.swing.JTextField maxHeightTime;
    private javax.swing.JLabel maxHeightTimeLabel;
    private javax.swing.JLabel resistanceUnit;
    private javax.swing.JTextField scope;
    private javax.swing.JLabel scopeLabel;
    private javax.swing.JButton simulationButton;
    private javax.swing.JLabel speedUnit;
    // End of variables declaration//GEN-END:variables
}
