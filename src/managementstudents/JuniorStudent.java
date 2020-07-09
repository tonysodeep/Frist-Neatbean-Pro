/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementstudents;

import java.util.Scanner;

/**
 *
 * @author hynguyen
 */
public class JuniorStudent extends Student{
    double physic = 0.0;

   

    @Override
    void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        System.out.print("input physic point ");
        Scanner scanner = new Scanner(System.in);
        this.physic = scanner.nextDouble();
    }

    @Override
    void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(" physic "+this.physic);
    }

    @Override
    double avgePoint() {
        return (this.math+this.physic+this.literature)/3;
    }

    @Override
    int getLoai() {
        return 2;
    }
    
}
