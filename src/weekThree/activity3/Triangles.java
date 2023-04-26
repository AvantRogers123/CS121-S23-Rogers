package weekThree.activity3;

import javax.swing.*;

public class Triangles {
    public static void main(String[] args) {
        int side1, side2 , side3;
        String triangle;
        side1 = Integer.parseInt(JOptionPane.showInputDialog("Length of side 1"));
        side2 = Integer.parseInt(JOptionPane.showInputDialog("Length of side 2"));
        side3 = Integer.parseInt(JOptionPane.showInputDialog("Length of side 3"));

        if( side1 != side2 && side1 != side3 && side2 != side3 ){
            triangle = "Scalene";
        }else if( side1 == side2 && side2 == side3)
        {
            triangle = "Equilateral  ";
        }
        else if( side1 == side2 || side1 == side3 || side2 == side3 )
        {
            triangle = "Isosceles";

            }
            else {
                triangle = "not a triangle";
            }
            JOptionPane.showMessageDialog(null,String.format("the"+ "triangle is %s", triangle));
            System.exit(0);




        }

    }

