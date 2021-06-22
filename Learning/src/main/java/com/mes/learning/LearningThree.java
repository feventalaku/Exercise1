/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mes.learning;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class LearningThree {
    public static void main(String[] args) {
        float height;
        float width;
        
        String stringheight;
        String stringwidth;
        
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("pleas enter window height");
        stringheight = sc.nextLine();
        System.out.println("please enter the window width");
        stringwidth = sc.nextLine();
        
        height = Float.parseFloat(stringheight);
        width = Float.parseFloat(stringwidth);
        
        areaOfWindow = height*width;
        perimeterOfWindow = 2*(height+width);
        cost = (3.50f*areaOfWindow) + (2.25f*perimeterOfWindow);
        
        System.out.println("Window height =" + stringheight);
        System.out.println("Window width=" + stringwidth);
        System.out.println("Window perimeter=" + perimeterOfWindow);
        System.out.println("Window area=" + areaOfWindow);
        System.out.println("Total cost=" + cost);
    }
    
}
