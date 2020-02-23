package kieunga.com.test;

import kieunga.com.model.HinhChuNhat;
import kieunga.com.model.HinhHoc;
import kieunga.com.model.HinhVuong;

public class TestHinhHoc {

	public static void main(String[] args) {
		HinhHoc h;
		h=new HinhChuNhat(4,5);
		System.out.println("Chu vi= "+h.tinhChuVi());
		System.out.println("Diện tích= "+h.tinhDienTich());
		System.out.println("----------------------");
		h=new HinhVuong(5);
		System.out.println("Chu vi= "+h.tinhChuVi());
		System.out.println("Diện tích= "+h.tinhDienTich());
		HinhChuNhat hv1=new HinhVuong(5);
		System.out.println("----------------------");
		System.out.println("Chu vi= "+h.tinhChuVi());
		System.out.println("Diện tích= "+h.tinhDienTich());
	}

}
