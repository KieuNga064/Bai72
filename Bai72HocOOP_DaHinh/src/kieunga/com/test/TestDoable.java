package kieunga.com.test;

import kieunga.com.model.IDoable;
import kieunga.com.model.NhanVien;
import kieunga.com.model.SinhVien;

public class TestDoable {

	public static void main(String[] args) {
		IDoable x;
		x=new NhanVien();
		x.doSomething();
		x=new SinhVien();
		x.doSomething();
	}

}
