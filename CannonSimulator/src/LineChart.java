import java.awt.Color; 
import java.awt.BasicStroke; 
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import javax.swing.JFrame;

import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.data.xy.XYDataset; 
import org.jfree.data.xy.XYSeries; 
import org.jfree.chart.plot.XYPlot; 
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.plot.PlotOrientation; 
import org.jfree.data.xy.XYSeriesCollection; 
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;


public class LineChart extends JFrame
{
    LinkedHashMap <Double, Double> dataSet;
    static private int locationPoint = 0;
    
    public LineChart(String applicationTitle, String chartTitle, LinkedHashMap<Double, Double> dataSet) 
    {
        super(applicationTitle);
        this.dataSet = dataSet;
        JFreeChart xylineChart = ChartFactory.createXYLineChart(
         chartTitle ,
         "X" ,
         "Y" ,
         createDataset() ,
         PlotOrientation.VERTICAL ,
         true , true , false);
         
      ChartPanel chartPanel = new ChartPanel( xylineChart );
      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
      final XYPlot plot = xylineChart.getXYPlot( );
      
      XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer( );
      renderer.setPaint(Color.BLACK);
      renderer.setStroke(new BasicStroke(4.0f));
      
      plot.setRenderer(renderer); 
      this.setContentPane(chartPanel);
      this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      this.setLocation(100 + 2*locationPoint, 50 + locationPoint);
      locationPoint +=30;
    }
    private XYDataset createDataset( ) {
      final XYSeries series = new XYSeries("Y(X)");
       
      
      for(Entry<Double, Double> entry : dataSet.entrySet())
      {
          series.add(entry.getKey(), entry.getValue());
      }   
                   
      final XYSeriesCollection dataset = new XYSeriesCollection( );         
      dataset.addSeries(series);          
      
      return dataset;
   }
    
}
