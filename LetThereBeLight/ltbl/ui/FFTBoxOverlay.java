package ltbl.ui;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.Random;
import java.awt.Rectangle;

import ltbl.algo.FFTBox;


public class FFTBoxOverlay extends JPanel {
    // store location/dimensions of box as fractions of the graph's dimensions
    private int [] dimensions; // x0, y0, x1, y1
    private int xOuter, yOuter;
    private FFTBox box;
    
    public FFTBoxOverlay () {
        // make box
        box = new FFTBox();
        // initially we want it to be not showed until we set its size via the MousePanel
        Random rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        this.setBackground( new Color( r, g, b ) );
    }
    
    // Sets the size of the box based on the graph's dimensions and box's current relative dimensions
    public void updateRelative () {
        // FFTBox stores its bounding dimensions as doubles from 0-1
        // where 0 and 1 are the outermost dimensions on the graph
        dimensions = box.getDimensions( xOuter, yOuter );
    }
    
    // sets the size of the graph's dimensions
    public void setOuter ( int x, int y ) {
        xOuter = x;
        yOuter = y;
    }
    
    public void setDimensions ( int x0, int y0, int x1, int y1 ) {
        dimensions = new int[4];
        dimensions[0] = x0;
        dimensions[1] = y0;
        dimensions[2] = x1;
        dimensions[3] = y1;
        // assuming setOuter has been called, this should work
        box.setDimensions( dimensions, xOuter, yOuter );
        this.setSize( Math.abs(x0-x1), Math.abs(y0-y1) );
        this.setLocation( Math.min(x0,x1), Math.min(y0,y1) );
        this.setVisible(true);
        this.paintImmediately( this.getBounds(null) );
    }
    
    public int[] getDimensions () {
        return dimensions;
    }
}



