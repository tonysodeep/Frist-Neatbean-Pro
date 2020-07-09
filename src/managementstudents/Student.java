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
public class Student {

 
    String code = "";
    String name = "";
    double math = 0.0;
    double literature = 0.0;

    void input() {
        System.out.print("Input St code ");
        Scanner s = new Scanner(System.in);
        this.code = s.nextLine();
        System.out.print("Input name ");
        s = new Scanner(System.in);
        this.name = s.nextLine();
        System.out.print("Input math ");
        s = new Scanner(System.in);
        this.math = s.nextDouble();
        System.out.print("Input literature ");
        s = new Scanner(System.in);
        this.literature = s.nextDouble();
    }
    void output(){
        System.out.print("St code "+this.code+" name "+this.name+" math "+this.math+" literature "+this.literature);
    }
    double avgePoint(){
        return (this.literature+this.math)/2;
    }
    String xepLoai(double point){
        if(point>=9.0)
            return "Xuat sac";
        if(point>=8)
            return "Gioi";
        if(point>=5)
            return "Kha";
        if(point>=3)
            return "Trung Binh";
        else{
            return "Yeu";
        }
    }
    int getLoai(){
        return 1;
    }
}
