package QLSV;

import java.util.Scanner;

public class Ham_nhap {
	private String Hoten;
	private String ID;
	private int tuoi;
	private int diemmon1;
	private int diemmon2;
	private int diemmon3;
	private int tin1;
	private int tin2;
	private int tin3;
	public Ham_nhap(String hoten, String iD, int tuoi, int diemmon1, int diemmon2, int diemmon3, int tin1, int tin2,
			int tin3) {
		super();
		Hoten = hoten;
		ID = iD;
		this.tuoi = tuoi;
		this.diemmon1 = diemmon1;
		this.diemmon2 = diemmon2;
		this.diemmon3 = diemmon3;
		this.tin1 = tin1;
		this.tin2 = tin2;
		this.tin3 = tin3;
		public Ham_nhap() {
			super();
			// TODO Auto-generated constructor stub
		}
		public void InputInfor() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap ten:");
			Hoten = sc.nextLine();
			ID = sc.nextLine();
			tuoi = sc.nextInt();
			sc.nextLine();
			diemmon1 = sc.nextInt();
			sc.nextLine();
			diemmon2 = sc.nextInt();
			sc.nextLine();
			diemmon3 = sc.nextInt();
			sc.nextLine();
			tin1 = sc.nextInt();
			sc.nextLine();
			tin2 = sc.nextInt();
			sc.nextLine();
			tin3 = sc.nextInt();
			sc.nextLine();
		}
		public void Display() {
			float dtb = ((diemmon1*tin1)+(diemmon2*tin2)+(diemmon3*tin3))/17;
			System.out.println("Ten" + Hoten);
			System.out.println("Tuoi" + tuoi);
			System.out.println("ID" + ID);
			int dtb= 0
			if(0 <dtb<4) { 
				System.out.println("Yeu");
			}
			if(4<dtb<6) {
				System.out.println("Trung binh");
			
			}
			if(6<dtb<7.5) {
				System.out.println("Kha");
			}
			if(10>dtb>8) {
				System.out.println("Gioi");
			}
		}
		public String getHoten() {
			return Hoten;
		}
		public void setHoten(String hoten) {
			Hoten = hoten;
		}
		public String getID() {
			return ID;
		}
		public void setID(String iD) {
			ID = iD;
		}
		public int getTuoi() {
			return tuoi;
		}
		public void setTuoi(int tuoi) {
			this.tuoi = tuoi;
		}
		public int getDiemmon1() {
			return diemmon1;
		}
		public void setDiemmon1(int diemmon1) {
			this.diemmon1 = diemmon1;
		}
		public int getDiemmon2() {
			return diemmon2;
		}
		public void setDiemmon2(int diemmon2) {
			this.diemmon2 = diemmon2;
		}
		public int getDiemmon3() {
			return diemmon3;
		}
		public void setDiemmon3(int diemmon3) {
			this.diemmon3 = diemmon3;
		}
		public int getTin1() {
			return tin1;
		}
		public void setTin1(int tin1) {
			this.tin1 = tin1;
		}
		public int getTin2() {
			return tin2;
		}
		public void setTin2(int tin2) {
			this.tin2 = tin2;
		}
		public int getTin3() {
			return tin3;
		}
		public void setTin3(int tin3) {
			this.tin3 = tin3;
		}
	
	

}
