//code by CW Coleman
//save as JavaPlot.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Wait {
  public static void oneSec() {
    try {
      Thread.currentThread().sleep(1000);
       }
     catch (InterruptedException e) {
       e.printStackTrace();
       }
     }
  public static void manySec(long s) {
     try {
       Thread.currentThread().sleep(s * 1000);
       }
     catch (InterruptedException e) {
       e.printStackTrace();
       }
     }
      public static void millSec(long s) {
     try {
       Thread.currentThread().sleep(s);
       }
     catch (InterruptedException e) {
       e.printStackTrace();
       }
     }
}


public class JavaPlot extends JFrame {
   public JavaPlot()
   {
      super( "Java Plot" );
      setSize(1000,1000);
      setVisible( true );
   }
   public void paint( Graphics g ){
        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		    // only change code below this line
        int x, y, h, k, t;
        int iRed, iGreen, iBlue, aiRed, aiGreen, aiBlue;//integer RGB
        double sRed, sGreen, sBlue;// double start RGB
        double eRed, eGreen, eBlue;// double end RGB
        double aRed, aGreen, aBlue;// ajust RGB
        x = 0;  y = 0; h = 0; k = 100; t = 500;
        double theta;
        iRed = 127;
        iGreen = 64;
        iBlue = 0;
        aiRed = 3;  // adjust integer Red
        for (x = 0;x <800;x++){
		        if (iRed > 255) iRed = 0;
            if (iRed < 0) iRed = 255;
            g.setColor(new Color(iRed,iGreen,iBlue));
          //  g.drawLine(h,k,800-h,600+k);
            g.drawOval(t-x,k+x,600+h,400-k);
            g.drawOval(t-x,k+x,650+h,450-k);
            g.drawOval(t-x,k+x,700+h,500-k);
            g.drawOval(t-x,k+x,750+h,550-k);
            g.drawOval(t-x,k+x,800+h,600-k);
            g.drawOval(t-x,k+x,850+h,650-k);
            g.drawOval(t-x,k+x,900+h,700-k);
            g.drawOval(t-x,k+x,950+h,750-k);
            g.drawOval(t-x,k+x,1000+h,800-k);

            g.drawOval(-t+x,-k-x,600+h,400-k);
            g.drawOval(-t+x,-k-x,650+h,450-k);
            g.drawOval(-t+x,-k-x,700+h,500-k);
            g.drawOval(-t+x,-k-x,750+h,550-k);
            g.drawOval(-t+x,-k-x,800+h,600-k);
            g.drawOval(-t+x,-k-x,850+h,650-k);
            g.drawOval(-t+x,-k-x,900+h,700-k);
            g.drawOval(-t+x,-k-x,950+h,750-k);
            g.drawOval(-t+x,-k-x,1000+h,800-k);
            iRed = iRed + aiRed;
            h = h + 1;
            k = k + 1;
		        System.out.println("Ctrl+c to stop. t = " + t+" h= "+h+" k ="+k);
		        Wait.millSec(6);

            // call to Wait class
            // only change code above this line
            // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
      }//end for
  }

// execute application
  public static void main( String args[] ){
    JavaPlot myobject = new JavaPlot();//change this
  	   	// adapter to handle only windowClosing event
        myobject.addWindowListener(
  			   new WindowAdapter() {
				      public void windowClosing( WindowEvent event )
				          {System.exit( 2 );}
                }  // end WindowAdapter
        ); // end call to addWindowListener
   }//end main
}// end class Painter
