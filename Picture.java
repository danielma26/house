/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square wall;
    private Square window_1;
    private Square window_2;
    private Square window_3;
    private Square window_4;
    private Square window_5;
    private Square window_6;
    private Square window_7;
    private Square window_8;
    private Square window_9;
    private Square window_10;
    private Triangle roof;
    private Triangle roof_1;
    private Circle sun;
    private Person person;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window_1 = new Square();
        window_2 = new Square();
        window_3 = new Square();
        window_4 = new Square();
        window_5 = new Square();
        window_6 = new Square();
        window_7 = new Square();
        window_8 = new Square();
        window_9 = new Square();
        window_10 = new Square ();
        roof_1 = new Triangle();
        roof = new Triangle();  
        sun = new Circle();
        person = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.changeColor("green");
            wall.moveHorizontal(-180);
            wall.moveVertical(-60);
            wall.changeSize(300);
            wall.makeVisible();
            
            
            //1st floor
            window_1.changeColor("blue");
            window_1.moveHorizontal(-150);
            window_1.moveVertical(70);
            window_1.changeSize(50);
            window_1.makeVisible();
            
            window_2.changeColor("blue");
            window_2.moveHorizontal(-50);
            window_2.moveVertical(70);
            window_2.changeSize(50);
            window_2.makeVisible();
            
            
            window_3.changeColor("blue");
            window_3.moveHorizontal(50);
            window_3.moveVertical(70);
            window_3.changeSize(50);
            window_3.makeVisible();
            
            //2nd floor
            window_4.changeColor("blue");
            window_4.moveHorizontal(-150);
            window_4.moveVertical(10);
            window_4.changeSize(50);
            window_4.makeVisible();
            
            window_5.changeColor("blue");
            window_5.moveHorizontal(-50);
            window_5.moveVertical(10);
            window_5.changeSize(50);
            window_5.makeVisible();
            
            window_6.changeColor("blue");
            window_6.moveHorizontal(50);
            window_6.moveVertical(10);
            window_6.changeSize(50);
            window_6.makeVisible();  
            //3rd floor
            window_7.changeColor("blue");
            window_7.moveHorizontal(-150);
            window_7.moveVertical(-50);
            window_7.changeSize(50);
            window_7.makeVisible(); 
            
            window_8.changeColor("blue");
            window_8.moveHorizontal(-50);
            window_8.moveVertical(-50);
            window_8.changeSize(50);
            window_8.makeVisible(); 
            
            window_9.changeColor("blue");
            window_9.moveHorizontal(50);
            window_9.moveVertical(-50);
            window_9.changeSize(50);
            window_9.makeVisible(); 
            
            //entrance
            window_10.changeColor("blue");
            window_10.moveHorizontal(-50);
            window_10.moveVertical(140);
            window_10.changeSize(40);
            window_10.makeVisible();            
            
            roof.changeColor("red");
            roof.changeSize(10, 40);
            roof.moveHorizontal(70);
            roof.moveVertical(110);
            roof.makeVisible();
            
            roof_1.changeColor("magenta");
            roof_1.changeSize(20, 300);
            roof_1.moveHorizontal(70);
            roof_1.moveVertical(-100);
            roof_1.makeVisible();
            
            
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-100);
            sun.changeSize(80);
            sun.makeVisible();
            
            person.changeColor("black");
            person.moveHorizontal(-130);
            person.moveVertical(70);
            person.makeVisible();
            
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window_1.changeColor("white");
        window_2.changeColor("white");
        window_3.changeColor("white");
        window_4.changeColor("white");
        window_5.changeColor("white");
        window_6.changeColor("white");
        window_7.changeColor("white");
        window_8.changeColor("white");
        window_9.changeColor("white");
        window_10.changeColor("white");
        roof.changeColor("white");
        roof_1.changeColor("black");
        sun.changeColor("black");
        person.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("green");
        window_1.changeColor("blue");
        window_2.changeColor("blue");
        window_3.changeColor("blue");
        window_4.changeColor("blue");
        window_5.changeColor("blue");
        window_6.changeColor("blue");
        window_7.changeColor("blue");
        window_8.changeColor("blue");
        window_9.changeColor("blue");
        window_10.changeColor("blue");
        roof.changeColor("red");
        roof_1.changeColor("magenta");
        sun.changeColor("yellow");
        person.changeColor("black");
    }
}
