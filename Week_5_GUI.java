/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week_5_gui;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author Scott
 */
public class Week_5_GUI {

    // define the class fields to items in the project
    
    private final JButton btnSave, btnCancel, btnOpenForm;
    private JTextField txtFirstName,txtLastName,txtEmail;
    private JLabel lblFirstName,lblLastName,lblEmail,lblDay;
    private JPanel textFieldPanel,radioGroupPanel,cmbPanel,btnPanel;
    private JRadioButton rdoMale,rdoFemale;
    private ButtonGroup genderGroup;
    private JMenu myMenu;
    
    private Week_5_GUI()
    {
         btnSave = new JButton("Save");
         btnCancel = new JButton("Cancel");
         btnOpenForm = new JButton("Open Frame");
         btnSave.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e){
                System.out.println("Your first name is : " 
                + txtFirstName.getText()); };
            }); 
          btnCancel.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent e)
             {
                 System.out.println("You Clicked the Cancel Button");
                 System.exit(0);
             };
         });  
          btnOpenForm.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e){
                System.out.println("Your first name is : " 
                + txtFirstName.getText()); };
            }); 
         
    }
    private JPanel createTextFieldPanel()
    {
        textFieldPanel = new JPanel();
        textFieldPanel.setLayout(new GridLayout(3,2));
        
        lblFirstName = new JLabel("First Name:");
        lblLastName = new JLabel("Last Name:");
        lblEmail = new JLabel("Email :");
        
        txtFirstName = new JTextField(15);
        txtLastName = new JTextField(15);
        txtEmail = new JTextField(15);
        
        textFieldPanel.add(lblFirstName);
        textFieldPanel.add(txtFirstName);
        
        textFieldPanel.add(lblLastName);
        textFieldPanel.add(txtLastName);
        
        textFieldPanel.add(lblEmail);
        textFieldPanel.add(txtEmail);
        
        return textFieldPanel;
    }
    private JPanel createRadioButtonPanel()
    {
        radioGroupPanel = new JPanel();
        radioGroupPanel.setLayout(new FlowLayout());
        
        rdoMale = new JRadioButton("Male");
        rdoFemale = new JRadioButton("Female");
        
        genderGroup = new ButtonGroup();
        
        genderGroup.add(rdoMale);
        genderGroup.add(rdoFemale);
        
        radioGroupPanel.add(rdoMale);
        radioGroupPanel.add(rdoFemale);
        return radioGroupPanel;
    }
    
    private JPanel createComboBoxPanel()
    {
        cmbPanel = new JPanel();
        cmbPanel.setLayout(new GridLayout(1,2));
        lblDay = new JLabel("Day of the week");
        
        
        String[] daysOfTheWeek = new String[]
        {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        
        JComboBox<String> cmbDay = new JComboBox<>(daysOfTheWeek);
        
        cmbPanel.add(lblDay);
        cmbPanel.add(cmbDay);
        
        return cmbPanel;
    
    }
    private JPanel createButtonPanel()
    {
        btnPanel= new JPanel();
        btnPanel.setLayout(new FlowLayout());
        
        
        btnPanel.add(btnSave);
        btnPanel.add(btnCancel);
        btnPanel.add(btnOpenForm);
        return btnPanel;
    }
    private JMenu menuBar()
    {
        
        return myMenu;
    }
    public static void main(String[] args) {
        
        //defines a new gui obkect for the class 
        
        Week_5_GUI gui = new Week_5_GUI();
        
            JFrame frame = new JFrame("GUI Demo");
            frame. setLayout(new GridLayout(4,1));
            
            frame.add(gui.createTextFieldPanel());
            frame.add(gui.createRadioButtonPanel());
            frame.add(gui.createComboBoxPanel());
            frame.add(gui.createButtonPanel());
            frame.add(gui.menuBar());
            frame.setSize(300,300);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
    }
}
