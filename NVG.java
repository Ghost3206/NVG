/** 
 * This is a simulation of the Night Vision menu from the ACE3 mod for
 * ARMA 3. This is not a fully functional component of the mod, but
 * rather a virtual representation how the menu would work. It is meant to
 * look as close to the in-game model as possible.
 */

package nvg;

// Use the .* insetad of adding each individual import independently,
// as this will take up A LOT of lines of code and will clutter things up
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class NVG implements ActionListener, WindowListener, ChangeListener {

    public static void main(String[] args) {
        // JPanel Grid Layout Constraints
        
        // Initialize the JFrame GUI
        JFrame gui = new JFrame("ARMA 3: GAME OPTIONS");
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(400,250);
        gui.getContentPane().setBackground(new Color(100,100,100));
        gui.setLayout(new GridLayout(3, 6, 2, 2));     
        
        
        
        // **************
        // LABELS SECTION        
        
        // This is the main label, which corresponds to the individual option
        // inside of the ACE addon options in-game
        JLabel ace = new JLabel();
        ace.setText("ADDON: ACE Nightvision" );
        ace.setFont(new Font ("Arial", Font.BOLD, 16));
        ace.setForeground(Color.lightGray);

        
        // NVG Effect Label
        JLabel effect = new JLabel();
        effect.setText("NVG Effect Scale:");
        effect.setFont(new Font ("Arial", Font.BOLD, 12));
        effect.setForeground(Color.white);
        
        // NVG Fog Label
        JLabel fog = new JLabel();
        fog.setText("NVG Fog Scale:");
        fog.setFont(new Font ("Arial", Font.BOLD, 12));
        fog.setForeground(Color.white);
        
        // NVG Noise Label
        JLabel noise = new JLabel();
        noise.setText("NVG Fog Scale:");
        noise.setFont(new Font ("Arial", Font.BOLD, 12));
        noise.setForeground(Color.white);
                
        // ADS Blur Label
        JLabel blur = new JLabel();
        blur.setText("Aim Down Sights Blur:");
        blur.setFont(new Font ("Arial", Font.BOLD, 12));
        blur.setForeground(Color.white);
        
        // DIsable NVG Label
        JLabel disable = new JLabel();
        disable.setText("Disable NVGs in scope:");
        disable.setFont(new Font ("Arial", Font.BOLD, 12));
        disable.setForeground(Color.white);
        
        // Shutter Effects label
        JLabel shutter = new JLabel();
        shutter.setText("Shutter Effects:");
        shutter.setFont(new Font ("Arial", Font.BOLD, 12));
        shutter.setForeground(Color.white);        
        
        // ***************
        // BUTTONS SECTION
        
        // SAVE Buttion
        JButton save = new JButton();
        save.setToolTipText("SAVE");
        save.setBackground(Color.GRAY);
        save.setForeground(Color.WHITE);
        
        // LOAD Button
        JButton load = new JButton();
        load.setToolTipText("LOAD");
        load.setBackground(Color.GRAY);
        load.setForeground(Color.WHITE);
        
        // IMPORT Button
        JButton imp = new JButton();
        imp.setToolTipText("IMPORT");
        imp.setBackground(Color.GRAY);
        imp.setForeground(Color.WHITE);
        
        // EXPORT Button
        JButton exp = new JButton();
        exp.setToolTipText("EXPORT");
        exp.setBackground(Color.GRAY);
        imp.setForeground(Color.WHITE);
        
        // **************
        // SLIDERS SECTION
        
        JSlider sliderEffect = new JSlider(JSlider.HORIZONTAL);
        JSlider sliderFog = new JSlider(JSlider.HORIZONTAL);
        JSlider sliderNoise = new JSlider(JSlider.HORIZONTAL);
        JSlider sliderBlur = new JSlider(JSlider.HORIZONTAL);
        
        
        // **************
        // PANELS SECTION
               
        // This adds the labels, sliders, and all the other stuff to the JPanel.
        // And yes, DARK THEME EVERYTHING
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        panel.setLayout(new GridLayout(6, 2, 2, 2));
        panel.add(effect);
        panel.add(fog);
        panel.add(noise);
        panel.add(blur);
        panel.add(disable);
        panel.add(shutter);
        panel.add(sliderEffect);
        panel.add(sliderFog);
        panel.add(sliderNoise);
        panel.add(sliderBlur);
        
        // Second Panel for Buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(100,100,100));
        buttonPanel.setLayout(new GridLayout(1, 4, 2, 2));
        buttonPanel.add(save);
        buttonPanel.add(load);
        buttonPanel.add(imp);
        buttonPanel.add(exp);        
        
 
        // This adds the JPanel to the JFrame
        gui.add(ace);
        gui.add(panel);
        gui.add(buttonPanel);
        gui.setVisible(true);
    }
    
    // This is to remind the user that this is NOT an in-game asset, but rather
    // a GUI representation in Java to show the capabilites of ACE menues in 
    // ARMA 3.
    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Non functioning button,"
                                              + " not a live in-game component.");
    }

    @Override
    public void stateChanged(ChangeEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowOpened(WindowEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosed(WindowEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
