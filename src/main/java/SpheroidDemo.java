/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Qudrat E rabbi
 * Professor : John Baugh
 * CIS 296
 * 
 */
public class SpheroidDemo {
    public static void main(String[] args){
        Scanner input_file;
        ArrayList<Spheroid> Spheroids;
    try {
        Spheroids = new ArrayList<Spheroid>();
        input_file = new Scanner (new File("input.txt"));
        while(input_file.hasNext()){
            double a  = input_file.nextDouble(); // eq radius
            double c = input_file.nextDouble(); // polar radius
            Spheroids.add(new Spheroid(a,c)); // appending new spheroids to arraylist            
        }
        for ( int i = 0; i < Spheroids.size();i++){
            System.out.println(Spheroids.get(i).getVolume() + " " + Spheroids.get(i).getClassification());
        }
        input_file.close();
    }
    catch(FileNotFoundException ex){
        System.out.println("File missing. Please check directory");
    }
    
}
}
