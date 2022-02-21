/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutor;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Thuc
 */
public class Tutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ArrayList<SinhVien> listSV = new ArrayList<>();
        SinhVien sv = new SinhVien();
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap ten");
        sv.setName(sc.nextLine());
        System.out.println("Moi ban nhap address");
        sv.setAddress(sc.nextLine());
        System.out.println("Moi ban nhap birth");
        sv.setBirth(sc.nextLine());
        System.out.println("Moi ban nhap chuyen nganh");
        sv.setChuyenNganh(sc.nextLine());
        System.out.println("Moi ban nhap diem");
        sv.setPoint(sc.nextFloat());
//        listSV.add(sv);
        System.out.println("Ten Sinh Vien la: "+ sv.getName());
        System.out.println("Dia Chi Sinh Vien la: "+ sv.getAddress());
        System.out.println("Nam Sinh cua Sinh Vien la: "+ sv.getBirth());
        System.out.println("Chuyen Nganh Sinh Vien la: "+ sv.getChuyenNganh());
        System.out.println("Diem Sinh Vien la: "+ new Tutor().XepLoai(sv.getPoint()));
    }
    public String XepLoai(float point){
        if(point<5){
            return "Yeu";
        }else if(point>5 && point<7){
            return "Trung Binh";
        }else if(point>=7 && point<9){
            return "Gioi";
        }else{
            return "Xuat Sac";
        }
    }
    
}
