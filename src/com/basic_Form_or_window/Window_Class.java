package com.basic_Form_or_window;

import javax.swing.*;

class Window_Class extends JFrame {
    //constructor
    public Window_Class()
    {
        super.setTitle("New Window");  //will work without super keyword as setTitle is in JFrame, but we specify to understand better
        super.setSize(500,500);
        super.setLocation(200,200);
        super.setVisible(true);
        System.out.print("In constructor"); //this will be printed in the terminal after window creation
    }

}
