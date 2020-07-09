/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementstudents;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hynguyen
 */
public class ManagementStudents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Student> arr = inputArray();
        outArray(arr);
    }

    public static ArrayList<Student> inputArray() {
        ArrayList<Student> arr = new ArrayList();
        while (true) {
            System.out.println("1 primary student 2 junior student 3 highstudent 0 exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            Student b = null;
            if (choice == 1) {
                b = new PrimaryStudent();
                b.input();
                arr.add(b);
            }
            if (choice == 2) {
                b = new JuniorStudent();
                b.input();
                arr.add(b);
            }
            if (choice == 3) {
                b = new HighStudent();
                b.input();
                arr.add(b);
            }
            if (choice == 0) {
                break;
            }
        }
        return arr;
    }

    public static void outArray(ArrayList<Student> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getLoai() == 1) {
                arr.get(i).output();
                System.out.println("Primary Student score " + arr.get(i).avgePoint() + " xep loai " + arr.get(i).xepLoai(arr.get(i).avgePoint()));
            }
            if (arr.get(i).getLoai() == 2) {
                arr.get(i).output();
                System.out.println("junior Student score " + arr.get(i).avgePoint() + " xep loai " + arr.get(i).xepLoai(arr.get(i).avgePoint()));
            }
            if (arr.get(i).getLoai() == 3) {
                arr.get(i).output();
                System.out.println("High Student score " + arr.get(i).avgePoint() + " xep loai " + arr.get(i).xepLoai(arr.get(i).avgePoint()));
            }
        }
    }

}
