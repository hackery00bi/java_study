package lec07Pjt001;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		/*
		// ¹è¿­ ¼±¾ð ÈÄ ÃÊ±âÈ­
		int[] arr1 = new int[5];
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		arr1[3] = 400;
		arr1[4] = 500;
		
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[1] : " + arr1[1]);
		System.out.println("arr1[2] : " + arr1[2]);
		System.out.println("arr1[3] : " + arr1[3]);
		System.out.println("arr1[4] : " + arr1[4]);
		
		System.out.println();
		
		// ¹è¿­ ¼±¾ð°ú ÃÊ±âÈ­¸¦ µ¿½Ã¿¡
		int[] arr2 = {10, 20, 30, 40, 50};
		
		System.out.println("arr2[0] : " + arr2[0]);
		System.out.println("arr2[1] : " + arr2[1]);
		System.out.println("arr2[2] : " + arr2[2]);
		System.out.println("arr2[3] : " + arr2[3]);
		System.out.println("arr2[4] : " + arr2[4]);
		
		System.out.println();
		
		// ¹è¿­À» ÀÌ¿ëÇÑ ÇÐ»ç°ü¸®
		String[] name = {"¹ÚÂùÈ£", "ÀÌ½Â¿±", "¹Úº´È£", "ÀÌº´±Ô", "·ùÇöÁø"};
		int[] score = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.printf("%sÀÇ Á¡¼ö¸¦ ÀÔ·ÂÇÏ½Ã¿À. : ", name[0]);
		score[0] = scanner.nextInt();
		
		System.out.printf("%sÀÇ Á¡¼ö¸¦ ÀÔ·ÂÇÏ½Ã¿À. : ", name[1]);
		score[1] = scanner.nextInt();
		
		System.out.printf("%sÀÇ Á¡¼ö¸¦ ÀÔ·ÂÇÏ½Ã¿À. : ", name[2]);
		score[2] = scanner.nextInt();
		
		System.out.printf("%sÀÇ Á¡¼ö¸¦ ÀÔ·ÂÇÏ½Ã¿À. : ", name[3]);
		score[3] = scanner.nextInt();
		
		System.out.printf("%sÀÇ Á¡¼ö¸¦ ÀÔ·ÂÇÏ½Ã¿À. : ", name[4]);
		score[4] = scanner.nextInt();
		
		System.out.printf("%s Á¡¼ö : \t%.2f\n", name[0], (double)score[0]);
		System.out.printf("%s Á¡¼ö : \t%.2f\n", name[1], (double)score[1]);
		System.out.printf("%s Á¡¼ö : \t%.2f\n", name[2], (double)score[2]);
		System.out.printf("%s Á¡¼ö : \t%.2f\n", name[3], (double)score[3]);
		System.out.printf("%s Á¡¼ö : \t%.2f\n", name[4], (double)score[4]);
		
		double ave = (double)(score[0] + score[1] + score[2] + score[3] + score[4]) / 5;
		System.out.printf("-----------------------\nÆò Á¡ : \t%.2f", ave);
		
		scanner.close();
		
		System.out.println();
		*/
		// ¹è¿­ ±âº»¼Ó¼º
		int[] arrAtt1 = {10, 20, 30, 40, 50, 60};
		int[] arrAtt2 = null;
		int[] arrAtt3 = null;
		
		// ¹è¿­ ±æÀÌ
		System.out.println("arrAtt1.length : " + arrAtt1.length);
		
		// ¹è¿­ ¿ä¼Ò Ãâ·Â
		System.out.println("arrAtt1 : " + Arrays.toString(arrAtt1));
		
		// ¹è¿­ ¿ä¼Ò º¹»ç
		arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length);
		System.out.println("arrAtt3 : " + Arrays.toString(arrAtt3));
		
		// ¹è¿­ ·¹ÆÛ·±½º
		arrAtt2 = arrAtt1;
		System.out.println("arrAtt1 : " + arrAtt1);
		System.out.println("arrAtt2 : " + arrAtt2);
		System.out.println("arrAtt3 : " + arrAtt3);
		
		System.out.println();
		
		// ´ÙÂ÷¿ø ¹è¿­
		int[][]  arrMul  = new int[3][2];
		arrMul[0][0] = 10;
		arrMul[0][1] = 100;
		arrMul[1][0] = 20;
		arrMul[1][1] = 200;
		arrMul[2][0] = 30;
		arrMul[2][1] = 300;
		
		System.out.println("arrMul[0] : " + Arrays.toString(arrMul[0]));
		System.out.println("arrMul[1] : " + Arrays.toString(arrMul[1]));
		System.out.println("arrMul[2] : " + Arrays.toString(arrMul[2]));

	}

}
