package Components;

// This is a custom button
//Not to be confused with JButton
//Used as a custom swing component

import javax.swing.*;
import java.awt.*;


public class Button extends JPanel{

    //button properties or variables
    Font myFont = new Font("Helvetica", Font.PLAIN, 20);
    String myButtonText = "New Button";
    int myButtonPadding =  3;
    int myButtonWidth = 150;
    private int myVerticalShift = 0;
    private int myButtonHeight = 60;
    private Color myPaddingColor = Color.gray;
    private int myPush = 0;
    private int myButtonposx = 0;
    private int mtButtonposy = 0;

    public Button(Color backColor){

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        myVerticalShift = getHeight()/2  -myButtonHeight/2;
        g.setFont(myFont);

        g.setColor(new Color(144,12,63));
        g.fillRoundRect(20+ this.myButtonPadding,myVerticalShift +this.myButtonPadding,this.myButtonWidth,this.myButtonHeight,25,25); //xpos, y pos, width, height

        g.setColor(new Color(209,10,67));
        g.fillRoundRect(20 + this.myPush,myVerticalShift + this.myPush,this.myButtonWidth,this.myButtonHeight,25,25); //xpos, y pos, width, height

        g.setColor(new Color(255,255,255));
        //g.drawString(myButtonText,(int)(getWidth()/2-myButtonText.length()*myFont.getSize()/2), (int)(getHeight()/2*myFont.getSize()/2));
        g.drawString(this.myButtonText,-30 + this.myButtonWidth/2 , myVerticalShift+5 + this.myButtonHeight/2);
    }

    public void setFont(Font font){this.myFont = font;} //change font

    public void setText(String buttonText){this.myButtonText = buttonText;} //Change text

    public void setPadding(int paddingAmount){this.myButtonPadding = paddingAmount;} //Change text

    public void setPaddingColor(Color paddingColor){this.myPaddingColor = paddingColor;} //change padding color of button

    public void push(Boolean Pushed){
        if(Pushed.booleanValue() == true){
            this.myPush = -(this.myButtonPadding);
        }
        else if(Pushed.booleanValue() == false){
            this.myPush = 0;
        }
    }
}
