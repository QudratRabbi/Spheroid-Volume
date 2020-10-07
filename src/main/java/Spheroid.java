/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Author : Qudrat Rabbi
 * Professor : John Baugh
 * CIS 296
 */
public class Spheroid {
    private double radius_equatorial;
    private double radius_polar;
    
    public Spheroid(double equatorial_radius,double polar_radius){//Constructor
        this.radius_equatorial = equatorial_radius;
        this.radius_polar = polar_radius;
    }
    public double getEquatorialRad(){   //Accessor for Equatorial radii
        return this.radius_equatorial;
    }
    public double getPolarRad(){    // Accessor function for polar radii
        return this.radius_polar;
    }
    public void setEquatorialRad(double equatorial_radius){//mutator for equatorial radius
        this.radius_equatorial = equatorial_radius;
    }
    public void setPolarRad(double polar_radius){//mutator for polar radii
        this.radius_polar = polar_radius;
    }
    public double getVolume(){
        double volume = (4.0 / 3) * Math.PI * (radius_equatorial * radius_equatorial * radius_polar);
        return Math.round(volume * 100) / 100.0;//
    }
    public String getClassification(){
        if ( this.radius_equatorial == radius_polar)return "Sphere";// a = c
        else if ( this.radius_equatorial > this.radius_polar) return "Oblate";// a > c
        else if (this.radius_equatorial < this.radius_polar) return "Prolate";// a < c 
        
        return null;
    }
}
