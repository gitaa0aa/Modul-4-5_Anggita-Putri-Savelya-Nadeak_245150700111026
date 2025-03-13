/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktic.geometry;

/**
 *
 * @author Hp
 */
public class Circle {
    private int id;
    private double radius;
    private final int pembilang = 22;
    private final int penyebut = 7;
    
    public Circle() {
        
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getKeliling() {
        return 2 * Math.PI * radius;
    }
    
    public double getLuas() {
        return 2 * Math.PI * Math.pow(radius, 2);
    }
    
    public void printInfoCircle() {
        System.out.println(CircleMain.GREEN +
                "ID            : " + id + "\n" + CircleMain.GREEN +
                "Radius        : " + radius + "\n" + CircleMain.GREEN +
                "Keliling      : " + getKeliling() + "\n" + CircleMain.GREEN +
                "Luas          : " + getLuas());
    }
}
