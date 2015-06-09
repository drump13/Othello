package ai;

import java.sql.Array;
import java.util.ArrayList;

import javax.swing.JEditorPane;

public class JosekiData {
	
	

	/***********************************
	 *             兎定石               *
	 **********************************/
	//兎基本定石
	public static ArrayList<Integer> basicRabbit(){
		ArrayList<Integer> josekiList = new ArrayList<Integer>();
		josekiList.add(54);
		josekiList.add(35);
		josekiList.add(24);
		josekiList.add(53);
		josekiList.add(42);
		josekiList.add(25);
		josekiList.add(32);
		josekiList.add(55);
		josekiList.add(45);
		josekiList.add(36);
		
		return josekiList;
	}
	
	//シャープローズ基本形
	public static ArrayList<Integer> basicSRose(){
		ArrayList<Integer> josekiList = new ArrayList<Integer>();
		josekiList.add(54);
		josekiList.add(35);
		josekiList.add(24);
		josekiList.add(53);
		josekiList.add(42);
		josekiList.add(25);
		josekiList.add(32);
		josekiList.add(55);
		josekiList.add(45);
		josekiList.add(36);
		josekiList.add(62);
		josekiList.add(23);
		
		return josekiList;
		
	}
	
	//シャープローズ最善型（爲則シャープローズ）
	public static ArrayList<Integer> bestSRose(){
		ArrayList<Integer> josekiList = new ArrayList<Integer>();
		josekiList.add(54);
		josekiList.add(35);
		josekiList.add(24);
		josekiList.add(53);
		josekiList.add(42);
		josekiList.add(25);
		josekiList.add(32);
		josekiList.add(55);
		josekiList.add(45);
		josekiList.add(36);
		josekiList.add(62);
		josekiList.add(23);
		josekiList.add(13);
		josekiList.add(12);
		josekiList.add(14);
		josekiList.add(3);
		josekiList.add(1);
		josekiList.add(2);
		josekiList.add(4);
		
		return josekiList;
		
	}
	
	
	//シャープローズ15-b6型（爲則シャープローズVer2）
		public static ArrayList<Integer> bestSRose2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(32);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(36);
			josekiList.add(62);
			josekiList.add(23);
			josekiList.add(13);
			josekiList.add(12);
			josekiList.add(15);
			josekiList.add(22);
			josekiList.add(14);
			josekiList.add(63);
			return josekiList;
			
		}
	
		//シャープローズ15-g5型（爲則シャープローズVer3）
		public static ArrayList<Integer> bestSRose3(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(32);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(36);
			josekiList.add(62);
			josekiList.add(23);
			josekiList.add(13);
			josekiList.add(12);
			josekiList.add(64);
			josekiList.add(22);
			josekiList.add(14);
			josekiList.add(4);
			josekiList.add(3);
			josekiList.add(2);
			josekiList.add(15);
			josekiList.add(5);
			josekiList.add(56);
			josekiList.add(65);
			return josekiList;
		}	
		
		//シャープローズ13-e7(兜割り型)
		public static ArrayList<Integer> kabutoWariSRose(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(32);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(36);
			josekiList.add(62);
			josekiList.add(23);
			josekiList.add(46);
			josekiList.add(22);
			josekiList.add(64);
			josekiList.add(57);
			return josekiList;
		}
		
		//シャープローズ13-g6(ローテーション型)
		public static ArrayList<Integer> rotationSRose(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(32);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(36);
			josekiList.add(62);
			josekiList.add(23);
			josekiList.add(65);
			josekiList.add(22);
			josekiList.add(56);
			josekiList.add(31);
			josekiList.add(46);
			josekiList.add(51);
			josekiList.add(27);
			josekiList.add(52);
			josekiList.add(26);
			josekiList.add(72);
			josekiList.add(41);
			return josekiList;
		}
		
		//シャープローズ13-g5(ローテーション型)
		public static ArrayList<Integer> rotationSRose2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(32);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(36);
			josekiList.add(62);
			josekiList.add(23);
			josekiList.add(64);
			josekiList.add(22);
			josekiList.add(56);
			josekiList.add(31);
			josekiList.add(46);
			josekiList.add(51);
			josekiList.add(41);
			josekiList.add(50);
			josekiList.add(27);
			josekiList.add(52);
			josekiList.add(26);
			
			return josekiList;
		}
		
		
		//フラットローズ基本形
		public static ArrayList<Integer> basicFRose(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(32);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(36);
			josekiList.add(63);
			josekiList.add(23);
			
			return josekiList;
		}

		
		//ローテーションフラットローズ
		public static ArrayList<Integer> rotationFRose(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(32);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(36);
			josekiList.add(63);
			josekiList.add(23);
			josekiList.add(64);
			josekiList.add(22);
			josekiList.add(56);
			josekiList.add(31);
			josekiList.add(46);
			josekiList.add(51);
			josekiList.add(27);
			josekiList.add(52);
			josekiList.add(26);
			josekiList.add(37);
			josekiList.add(47);
			josekiList.add(62);
			josekiList.add(41);
			josekiList.add(73);
			josekiList.add(50);
			
			return josekiList;
		}
		
		//ローテーションフラットローズ　19-e2変化
		public static ArrayList<Integer> rotationFRose2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(32);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(36);
			josekiList.add(63);
			josekiList.add(23);
			josekiList.add(64);
			josekiList.add(22);
			josekiList.add(56);
			josekiList.add(31);
			josekiList.add(46);
			josekiList.add(51);
			josekiList.add(27);
			josekiList.add(52);
			josekiList.add(26);
			josekiList.add(37);
			josekiList.add(47);
			josekiList.add(62);
			josekiList.add(41);
			josekiList.add(52);
			josekiList.add(27);
			josekiList.add(62);
			josekiList.add(50);
			josekiList.add(57);
			return josekiList;
		}
		
		//中横割り型フラットローズ
		public static ArrayList<Integer> nakayokowariFRose(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(32);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(36);
			josekiList.add(63);
			josekiList.add(23);
			josekiList.add(64);
			josekiList.add(22);
			josekiList.add(13);
			josekiList.add(12);
			josekiList.add(14);
			josekiList.add(4);
			josekiList.add(3);
			josekiList.add(2);
			josekiList.add(15);
			josekiList.add(26);
			return josekiList;
		}

		//兜割り型フラットローズ
		public static ArrayList<Integer> kabutoWariFRose(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(32);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(36);
			josekiList.add(63);
			josekiList.add(23);
			josekiList.add(46);
			josekiList.add(22);
			josekiList.add(64);
			josekiList.add(57);
			josekiList.add(65);
			josekiList.add(56);
			
			return josekiList;
		}
		
		//村上流フラットローズ型
		public static ArrayList<Integer> murakamiFRose(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(32);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(36);
			josekiList.add(63);
			josekiList.add(23);
			josekiList.add(65);
			josekiList.add(64);
			josekiList.add(46);
			josekiList.add(57);
			josekiList.add(56);
			josekiList.add(75);
			josekiList.add(74);
			return josekiList;
		}
		
		//手塚システム基本形
		public static ArrayList<Integer> basicTedukaSystem(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(32);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(36);
			josekiList.add(46);
			josekiList.add(26);
			josekiList.add(23);
			josekiList.add(52);
			josekiList.add(37);
		
			return josekiList;
		}
		
		//C打ち型手塚システム
		public static ArrayList<Integer> blackCTedukaSystem(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(32);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(36);
			josekiList.add(46);
			josekiList.add(26);
			josekiList.add(23);
			josekiList.add(52);
			josekiList.add(37);
			josekiList.add(27);
			josekiList.add(17);
			josekiList.add(41);
			josekiList.add(15);
			josekiList.add(47);
			josekiList.add(57);
			josekiList.add(56);
			josekiList.add(63);
			return josekiList;
		}
		
		//片方C打ち型手塚システム　下辺を白に操作されやすい、うちにくい
		public static ArrayList<Integer> onesideBlackCTedukaSystem(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(32);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(36);
			josekiList.add(46);
			josekiList.add(26);
			josekiList.add(23);
			josekiList.add(52);
			josekiList.add(37);
			josekiList.add(27);
			josekiList.add(56);
			josekiList.add(57);
			josekiList.add(17);
			josekiList.add(41);
			josekiList.add(51);
			josekiList.add(14);
			
			return josekiList;
		}
		
		//手塚システム17-g4変化型
		public static ArrayList<Integer> basicTedukaSystem2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(32);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(36);
			josekiList.add(46);
			josekiList.add(26);
			josekiList.add(23);
			josekiList.add(52);
			josekiList.add(37);
			josekiList.add(27);
			josekiList.add(63);
			josekiList.add(72);
			josekiList.add(17);
			
			return josekiList;
		}
		
		
		//手塚システム14-f8変化型
		public static ArrayList<Integer> basicTedukaSystem3(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(32);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(36);
			josekiList.add(46);
			josekiList.add(26);
			josekiList.add(23);
			josekiList.add(57);
			josekiList.add(15);
			josekiList.add(14);
			josekiList.add(5);
			
		
			return josekiList;
		}
		
		//馬定石基本形
		public static ArrayList<Integer> basicHorse(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(32);
			return josekiList;
		}
		//馬定石最善形
		public static ArrayList<Integer> bestHorse(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(32);
			josekiList.add(42);
			josekiList.add(63);
			josekiList.add(64);
			josekiList.add(45);
			josekiList.add(23);
			josekiList.add(62);
			josekiList.add(25);
			josekiList.add(52);
			josekiList.add(21);
			josekiList.add(22);
			josekiList.add(55);
			return josekiList;
		}
		
		//馬定石12-f変化型

		public static ArrayList<Integer> patternHorse1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(32);
			josekiList.add(42);
			josekiList.add(63);
			josekiList.add(64);
			josekiList.add(45);
			josekiList.add(23);
			josekiList.add(62);
			josekiList.add(52);
			josekiList.add(41);
			josekiList.add(65);
			josekiList.add(51);
			josekiList.add(26);
			
			return josekiList;
		}

		//馬定石11-e2変化型	
		public static ArrayList<Integer> patternHorse2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(32);
			josekiList.add(42);
			josekiList.add(63);
			josekiList.add(64);
			josekiList.add(45);
			josekiList.add(23);
			josekiList.add(41);
			josekiList.add(55);
			return josekiList;
		}

		//馬定石10-f6変化型	
		public static ArrayList<Integer> patternHorse3(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(32);
			josekiList.add(42);
			josekiList.add(63);
			josekiList.add(64);
			josekiList.add(45);
			josekiList.add(55);
			josekiList.add(41);
			josekiList.add(72);
			josekiList.add(62);
			josekiList.add(52);
			return josekiList;
		}

		//白次善手対応型馬定石
		public static ArrayList<Integer> whiteBestHorse(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(22);
			josekiList.add(25);
			josekiList.add(45);
			josekiList.add(14);
			josekiList.add(42);
			josekiList.add(52);
			josekiList.add(63);
			josekiList.add(31);
			josekiList.add(51);
			josekiList.add(56);
			return josekiList;
		}


		//鶴定石
		public static ArrayList<Integer> basicCrane(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(36);
			josekiList.add(55);
			josekiList.add(32);
			josekiList.add(22);
			josekiList.add(42);
			josekiList.add(52);
			josekiList.add(63);
			josekiList.add(64);
			josekiList.add(45);
			josekiList.add(65);
			josekiList.add(62);
			josekiList.add(73);
			return josekiList;
		}
		
		//Shaman定石
		public static ArrayList<Integer> basicShaman(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(52);
			josekiList.add(64);
			josekiList.add(45);
			josekiList.add(55);
			josekiList.add(65);
			josekiList.add(63);
			josekiList.add(36);
			josekiList.add(32);
			josekiList.add(46);
			josekiList.add(22);
			josekiList.add(23);
			josekiList.add(13);
			
			return josekiList;
		}
		
		
		//雪うさぎ定石基本形
		public static ArrayList<Integer> basicSnowRabbit(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(45);
			josekiList.add(55);
			return josekiList;
		}

		//雪うさぎ定石9-g4 13-d7 変化形
		public static ArrayList<Integer> patternSnowRabbit1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(45);
			josekiList.add(55);
			josekiList.add(63);
			josekiList.add(23);
			josekiList.add(64);
			josekiList.add(22);
			josekiList.add(36);
			josekiList.add(56);
			josekiList.add(26);
			josekiList.add(46);
			josekiList.add(32);
			josekiList.add(47);
			josekiList.add(65);
			josekiList.add(27);
			return josekiList;
		}


		//雪うさぎ　9-g4 13-f7 変化型
		public static ArrayList<Integer> patternSnowRabbit2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(45);
			josekiList.add(55);
			josekiList.add(63);
			josekiList.add(23);
			josekiList.add(64);
			josekiList.add(22);
			josekiList.add(56);
			josekiList.add(65);
			josekiList.add(46);
			josekiList.add(32);
			josekiList.add(26);
			return josekiList;
		}
		

		//雪うさぎ　9-d7 11-e7 変化型
		public static ArrayList<Integer> patternSnowRabbit3(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(45);
			josekiList.add(55);
			josekiList.add(36);
			josekiList.add(26);
			josekiList.add(46);
			josekiList.add(47);
			josekiList.add(37);
			josekiList.add(27);
			josekiList.add(56);
			josekiList.add(57);
			josekiList.add(62);
			josekiList.add(23);
			return josekiList;
		}


		//雪うさぎ 9-d7 11-f7
		public static ArrayList<Integer> patternSnowRabbit4(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(45);
			josekiList.add(55);
			josekiList.add(36);
			josekiList.add(26);
			josekiList.add(56);
			josekiList.add(13);
			josekiList.add(14);
			josekiList.add(57);
			josekiList.add(46);
			josekiList.add(47);
			return josekiList;
		}
		
		//井上流最善型
		public static ArrayList<Integer> bestInoue(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(45);
			josekiList.add(56);
			josekiList.add(36);
			josekiList.add(47);
			josekiList.add(52);
			josekiList.add(55);
			josekiList.add(57);
			josekiList.add(23);
			josekiList.add(46);
			josekiList.add(64);
			josekiList.add(27);
			josekiList.add(37);
			
			return josekiList;
		}
		
		

		//井上流　10-f6変化型
		public static ArrayList<Integer> patternInoue1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(45);
			josekiList.add(56);
			josekiList.add(36);
			josekiList.add(55);
			josekiList.add(14);
			
			return josekiList;
		}
		
		//井上流　10-c7変化型
		public static ArrayList<Integer> patternInoue2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(45);
			josekiList.add(56);
			josekiList.add(36);
			josekiList.add(26);
			josekiList.add(55);
			josekiList.add(46);
			josekiList.add(52);
			josekiList.add(65);
			josekiList.add(37);
			josekiList.add(23);
			josekiList.add(47);
			josekiList.add(57);
			josekiList.add(67);
			josekiList.add(64);
			return josekiList;
		}
		
		//横うさぎ基本形
		public static ArrayList<Integer> basicYokoRabbit(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(32);
			josekiList.add(64);
			return josekiList;
		}
		
		//横うさぎ最善形
		public static ArrayList<Integer> bestYokoRabbit(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(32);
			josekiList.add(64);
			josekiList.add(45);
			josekiList.add(55);
			josekiList.add(62);
			josekiList.add(23);
			josekiList.add(13);
			josekiList.add(12);
			josekiList.add(14);
			josekiList.add(3);
			josekiList.add(1);
			josekiList.add(2);
			josekiList.add(4);
			return josekiList;
		}
		
		//横うさぎ 9-f6変化形
		public static ArrayList<Integer> patternYokoRabbit1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(32);
			josekiList.add(64);
			josekiList.add(55);
			josekiList.add(52);
			josekiList.add(65);
			josekiList.add(22);
			josekiList.add(62);
			josekiList.add(45);
			josekiList.add(63);
			josekiList.add(56);
			josekiList.add(21);
			josekiList.add(23);
			return josekiList;
		}
		
		//横うさぎ 9-f6 11-g4変化形
		public static ArrayList<Integer> patternYokoRabbit2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(32);
			josekiList.add(64);
			josekiList.add(45);
			josekiList.add(36);
			return josekiList;
		}
				
		//Ralle定石
		public static ArrayList<Integer> basicRalle(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(32);
			josekiList.add(52);
			josekiList.add(45);
			josekiList.add(55);
			josekiList.add(63);
			josekiList.add(62);
			josekiList.add(64);
			josekiList.add(74);
			josekiList.add(73);
			josekiList.add(72);
			josekiList.add(65);
			josekiList.add(75);
			josekiList.add(51);
			josekiList.add(41);
			josekiList.add(50);
			josekiList.add(30);
			
			return josekiList;
		}
		
		//大和久流　（白やや不利）
		public static ArrayList<Integer> basicYamato(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(55);
			josekiList.add(52);
			josekiList.add(23);
			josekiList.add(32);
			return josekiList;
		}
				
		//たまうさぎ定石　9-f3型
		public static ArrayList<Integer> patternBallRabbit1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(32);
			josekiList.add(41);
			josekiList.add(52);
			josekiList.add(22);
			josekiList.add(23);
			josekiList.add(31);
			return josekiList;
		}
		
		//たまうさぎ定石　9-g4型
		public static ArrayList<Integer> patternBallRabbit2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(32);
			josekiList.add(41);
			josekiList.add(63);
			josekiList.add(52);
			josekiList.add(31);
			josekiList.add(65);
			return josekiList;
		}
		
		//三村流 7-e6型
		public static ArrayList<Integer> patternMimura1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(32);
			josekiList.add(45);
			josekiList.add(64);
			josekiList.add(23);
			josekiList.add(22);
			josekiList.add(31);
			josekiList.add(55);
			josekiList.add(21);
			josekiList.add(14);
			return josekiList;
		}
			
		//三村流 7-f3型
		public static ArrayList<Integer> patternMimura2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(32);
			josekiList.add(52);
			josekiList.add(41);
			josekiList.add(23);
			josekiList.add(22);
			josekiList.add(25);
			return josekiList;
		}

		//野兎定石基本形
		public static ArrayList<Integer> basicWildRabbit(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(25);
			josekiList.add(53);
			josekiList.add(45);
			return josekiList;
		}		
		
		//野兎定石　7-d3変化形
		public static ArrayList<Integer> patternWildRabbit1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(25);
			josekiList.add(53);
			josekiList.add(45);
			josekiList.add(64);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(42);
			josekiList.add(24);
			josekiList.add(12);
			josekiList.add(13);
			josekiList.add(22);
			josekiList.add(14);
			josekiList.add(55);
			josekiList.add(52);
			josekiList.add(65);
			josekiList.add(21);
			return josekiList;
		}
		

		//野兎定石　7-e3変化形
		public static ArrayList<Integer> patternWildRabbit2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(32);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(36);
			return josekiList;
		}
		
		//野兎定石 6-g6変化形
		public static ArrayList<Integer> patternWildRabbit3(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(32);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(36);
			return josekiList;
		}
		
		/*****************************
		 * 　　　牛定石			   	 *
		 * **************************/
		
		//牛基本定石
		public static ArrayList<Integer> basicCow(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(42);
			josekiList.add(24);
			return josekiList;
		}
		
		//牛基本　8-3d変化形　黒最善対応型
		public static ArrayList<Integer> patternCow1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(42);
			josekiList.add(24);
			josekiList.add(23);
			josekiList.add(32);
			josekiList.add(52);
			josekiList.add(41);
			josekiList.add(63);
			josekiList.add(64);
			josekiList.add(51);
			return josekiList;
		}
		
		//牛定石 8-3d変化形　黒次善対応型
		public static ArrayList<Integer> patternCow2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(42);
			josekiList.add(24);
			josekiList.add(23);
			josekiList.add(32);
			josekiList.add(22);
			josekiList.add(51);
			josekiList.add(41);
			josekiList.add(36);
			josekiList.add(46);
			josekiList.add(35);
			return josekiList;
		}
				
		//快速船定石基本形
		public static ArrayList<Integer> basicFastShip(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(42);
			josekiList.add(24);
			josekiList.add(23);
			josekiList.add(46);
			josekiList.add(25);
			josekiList.add(41);
			josekiList.add(52);
			josekiList.add(51);
			return josekiList;
		}
		
		//快速船定石最善形
		public static ArrayList<Integer> bestFastShip(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(42);
			josekiList.add(24);
			josekiList.add(23);
			josekiList.add(46);
			josekiList.add(25);
			josekiList.add(41);
			josekiList.add(52);
			josekiList.add(51);
			josekiList.add(64);
			josekiList.add(63);
			josekiList.add(65);
			josekiList.add(35);
			josekiList.add(72);
			josekiList.add(74);
			josekiList.add(62);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(12);
			josekiList.add(13);
			return josekiList;
		}
				
		//快速船定石 13-g4変化形
		public static ArrayList<Integer> patternFastShip1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(42);
			josekiList.add(24);
			josekiList.add(23);
			josekiList.add(46);
			josekiList.add(25);
			josekiList.add(41);
			josekiList.add(52);
			josekiList.add(51);
			josekiList.add(63);
			josekiList.add(64);
			josekiList.add(74);
			josekiList.add(35);
			josekiList.add(36);
			josekiList.add(14);
			return josekiList;
		}
		
		//快速船定石　13-g6変化形２
		public static ArrayList<Integer> patternFastShip2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(42);
			josekiList.add(24);
			josekiList.add(23);
			josekiList.add(46);
			josekiList.add(25);
			josekiList.add(41);
			josekiList.add(51);
			josekiList.add(52);
			josekiList.add(65);
			josekiList.add(64);
			josekiList.add(35);
			josekiList.add(32);
			josekiList.add(74);
			josekiList.add(56);
			josekiList.add(21);
			return josekiList;
		}
		
		//快速船外し定石
		public static ArrayList<Integer> cutFastShip(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(42);
			josekiList.add(24);
			josekiList.add(23);
			josekiList.add(46);
			josekiList.add(25);
			josekiList.add(41);
			josekiList.add(52);
			josekiList.add(32);
			josekiList.add(22);
			josekiList.add(31);
			josekiList.add(40);
			josekiList.add(20);
			josekiList.add(51);
			josekiList.add(21);
			josekiList.add(30);
			
			return josekiList;
		}
		
		//ヨット定石基本形
		public static ArrayList<Integer> basicYacht(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(42);
			josekiList.add(24);
			josekiList.add(23);
			josekiList.add(46);
			josekiList.add(14);
			josekiList.add(41);
			josekiList.add(52);
			josekiList.add(51);
			josekiList.add(64);
			josekiList.add(63);
			josekiList.add(65);
			josekiList.add(35);
			josekiList.add(72);
			return josekiList;
		}
				
		//ヨット定石　11-f2変化形
		public static ArrayList<Integer> patternYacht(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(42);
			josekiList.add(24);
			josekiList.add(23);
			josekiList.add(46);
			josekiList.add(14);
			josekiList.add(41);
			josekiList.add(51);
			josekiList.add(31);
			josekiList.add(52);
			josekiList.add(32);
			josekiList.add(22);
			josekiList.add(21);
			josekiList.add(50);
			josekiList.add(40);
			josekiList.add(20);
			josekiList.add(60);
			josekiList.add(63);
			return josekiList;
		}
				
		//沈没船定石				
		public static ArrayList<Integer> basicSinkedShip(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(42);
			josekiList.add(24);
			josekiList.add(23);
			josekiList.add(36);
			josekiList.add(25);
			josekiList.add(41);
			josekiList.add(52);
			josekiList.add(32);
			josekiList.add(22);
			josekiList.add(31);
			return josekiList;
		}
				
		//最善進行定石 9-b5型
		public static ArrayList<Integer> basicBestGoing1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(42);
			josekiList.add(24);
			josekiList.add(23);
			josekiList.add(35);
			josekiList.add(14);
			josekiList.add(32);
			josekiList.add(22);
			josekiList.add(41);
			josekiList.add(51);
			josekiList.add(21);
			josekiList.add(50);
			josekiList.add(13);
			return josekiList;
		}
		
		//最善進行定石 9-b6型
		public static ArrayList<Integer> basicBestGoing2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(42);
			josekiList.add(24);
			josekiList.add(23);
			josekiList.add(35);
			josekiList.add(15);
			josekiList.add(14);
			josekiList.add(25);
			josekiList.add(36);
			josekiList.add(26);
			josekiList.add(15);
			josekiList.add(56);
			josekiList.add(46);
			josekiList.add(47);
			return josekiList;
		}
		
		//最善進行定石 9-c6型
		public static ArrayList<Integer> basicBestGoing3(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(42);
			josekiList.add(24);
			josekiList.add(23);
			josekiList.add(25);
			josekiList.add(14);
			josekiList.add(36);
			josekiList.add(46);
			josekiList.add(15);
			josekiList.add(27);
			josekiList.add(5);
			josekiList.add(12);
			josekiList.add(22);
			josekiList.add(52);
			josekiList.add(62);
			return josekiList;
		}
		
		//コウモリ定石基本形
		public static ArrayList<Integer> basicKoumori(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(42);
			josekiList.add(24);
			josekiList.add(64);
			josekiList.add(62);
			
			return josekiList;
		}
		
		//コウモリ定石　9-g4変化形
		public static ArrayList<Integer> patternKoumori1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(42);
			josekiList.add(24);
			josekiList.add(64);
			josekiList.add(62);
			josekiList.add(63);
			josekiList.add(52);
			josekiList.add(41);
			josekiList.add(75);
			return josekiList;
		}
			
		//コウモリ定石　9-c6変化型
		public static ArrayList<Integer> patternKoumori2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(42);
			josekiList.add(24);
			josekiList.add(64);
			josekiList.add(62);
			josekiList.add(25);
			josekiList.add(35);
			josekiList.add(63);
			josekiList.add(52);
			josekiList.add(41);
			josekiList.add(32);
			return josekiList;
		}
				
		//コウモリ定石　8-f3変化形
		public static ArrayList<Integer> patternKoumori3(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(42);
			josekiList.add(24);
			josekiList.add(64);
			josekiList.add(52);
			josekiList.add(65);
			josekiList.add(46);
			josekiList.add(32);
			josekiList.add(63);
			josekiList.add(51);
			josekiList.add(62);
			josekiList.add(74);
			josekiList.add(72);
			josekiList.add(73);
			josekiList.add(75);
			josekiList.add(23);
			josekiList.add(71);
			josekiList.add(35);
			return josekiList;
		}
				
		//戦車定石
		public static ArrayList<Integer> basicTank(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(42);
			josekiList.add(24);
			josekiList.add(25);
			josekiList.add(35);
			josekiList.add(46);
			josekiList.add(56);
			return josekiList;
		}
				
		//白大量取り定石基本形
		public static ArrayList<Integer> basicManyWhite(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(42);
			josekiList.add(35);
			return josekiList;
		}
				
										
		//白大量取り最善進行　13-c6型
		public static ArrayList<Integer> patternMany1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(42);
			josekiList.add(35);
			josekiList.add(63);
			josekiList.add(32);
			josekiList.add(22);
			josekiList.add(72);
			josekiList.add(23);
			josekiList.add(62);
			josekiList.add(25);
			josekiList.add(24);
			josekiList.add(64);
			josekiList.add(73);
			josekiList.add(36);
			josekiList.add(52);
			josekiList.add(46);
			return josekiList;
		}
				
		//白大量取り最善進行　13-g5型　
		public static ArrayList<Integer> patternMany2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(42);
			josekiList.add(35);
			josekiList.add(63);
			josekiList.add(32);
			josekiList.add(22);
			josekiList.add(72);
			josekiList.add(23);
			josekiList.add(62);
			josekiList.add(64);
			josekiList.add(65);
			josekiList.add(46);
			josekiList.add(36);
			josekiList.add(74);
			josekiList.add(52);
			josekiList.add(73);
			josekiList.add(75);
			josekiList.add(25);
			return josekiList;
		}
				
											
		//白大量取り最善進行　13-e7
		public static ArrayList<Integer> patternMany3(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(42);
			josekiList.add(35);
			josekiList.add(63);
			josekiList.add(32);
			josekiList.add(22);
			josekiList.add(72);
			josekiList.add(23);
			josekiList.add(62);
			josekiList.add(46);
			josekiList.add(52);
			josekiList.add(25);
			return josekiList;
		}
				
		//白大量取り　7-c4型
		public static ArrayList<Integer> patternMany4(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(42);
			josekiList.add(35);
			josekiList.add(23);
			josekiList.add(52);
			josekiList.add(62);
			josekiList.add(22);
			josekiList.add(24);
			josekiList.add(12);
		
			return josekiList;
		}
				
		//飛び出し牛基本定石
		public static ArrayList<Integer> basicFlyingCow(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(64);
			return josekiList;
		}
		
		//裏快速船基本形
		public static ArrayList<Integer> basicReverseFastShip(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(64);
			josekiList.add(46);
			josekiList.add(56);
			josekiList.add(74);
			return josekiList;
		}				
		//裏快速船定石　9-g4変化形１
		public static ArrayList<Integer> patternReverseFastShip1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(64);
			josekiList.add(46);
			josekiList.add(56);
			josekiList.add(74);
			josekiList.add(63);
			josekiList.add(65);
			josekiList.add(42);
			josekiList.add(24);
			josekiList.add(52);
			josekiList.add(35);
			josekiList.add(47);
			josekiList.add(32);
			josekiList.add(26);
			return josekiList;
		}
				
				
		//裏快速船定石　9-g4変化形2
		public static ArrayList<Integer> patternReverseFastShip2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(64);
			josekiList.add(46);
			josekiList.add(56);
			josekiList.add(74);
			josekiList.add(63);
			josekiList.add(65);
			josekiList.add(42);
			josekiList.add(73);
			josekiList.add(52);
			josekiList.add(32);
			josekiList.add(47);
			josekiList.add(25);
			josekiList.add(72);
			josekiList.add(71);
			josekiList.add(24);
			return josekiList;
		}
		
		
		//裏快速船定石　9-g4変化形3
		public static ArrayList<Integer> patternReverseFastShip3(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(64);
			josekiList.add(46);
			josekiList.add(56);
			josekiList.add(74);
			josekiList.add(63);
			josekiList.add(65);
			josekiList.add(42);
			josekiList.add(52);
			josekiList.add(72);
			josekiList.add(73);
			josekiList.add(75);
			josekiList.add(57);
			josekiList.add(24);
			josekiList.add(35);
			josekiList.add(36);
			
			return josekiList;
		}
				
				
		//裏快速船定石　9-e3変化形１
		public static ArrayList<Integer> patternReverseFastShip4(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(64);
			josekiList.add(46);
			josekiList.add(56);
			josekiList.add(74);
			josekiList.add(42);
			josekiList.add(32);
			josekiList.add(62);
			josekiList.add(63);
			josekiList.add(52);
			josekiList.add(65);
			josekiList.add(23);
			return josekiList;
		}
		
		//裏快速船定石 9-e3変化形２
		public static ArrayList<Integer> patternReverseFastShip5(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(64);
			josekiList.add(46);
			josekiList.add(56);
			josekiList.add(74);
			josekiList.add(42);
			josekiList.add(32);
			josekiList.add(62);
			josekiList.add(52);
			josekiList.add(73);
			josekiList.add(72);
			josekiList.add(63);
			josekiList.add(75);
			josekiList.add(65);
			josekiList.add(24);
			josekiList.add(23);
			return josekiList;
		}
		
		
		//裏快速船定石　9-d3変化形　（村上流）
		public static ArrayList<Integer> patternReverseFastShip6(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(64);
			josekiList.add(46);
			josekiList.add(56);
			josekiList.add(74);
			josekiList.add(42);
			josekiList.add(32);
			josekiList.add(63);
			josekiList.add(73);
			josekiList.add(72);
			josekiList.add(71);
			josekiList.add(62);
			josekiList.add(25);
			return josekiList;
		}
		
		//裏快速船8-c5変化形
		public static ArrayList<Integer> patternReverseFastShip7(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(64);
			josekiList.add(46);
			josekiList.add(56);
			josekiList.add(24);
			josekiList.add(52);
			josekiList.add(63);
			josekiList.add(42);
			josekiList.add(65);
			josekiList.add(22);
			josekiList.add(32);
			return josekiList;
		}
				
		//野いちご定石
		public static ArrayList<Integer> basicWildStrawberry(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(64);
			josekiList.add(46);
			josekiList.add(56);
			josekiList.add(35);
			josekiList.add(52);
			josekiList.add(65);
			josekiList.add(37);
			josekiList.add(74);
			josekiList.add(42);
			josekiList.add(36);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(24);
			
			return josekiList;
		}
			
		//牛基本定石
		public static ArrayList<Integer> basicReverseYacht(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(64);
			josekiList.add(46);
			josekiList.add(56);
			josekiList.add(74);
			josekiList.add(47);
			josekiList.add(24);
			josekiList.add(63);
			josekiList.add(73);
			josekiList.add(42);
			josekiList.add(35);
			josekiList.add(52);
			
			return josekiList;
		}
				
				
		//岩崎流
		public static ArrayList<Integer> basicIwasaki(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(64);
			josekiList.add(46);
			josekiList.add(36);
			josekiList.add(65);
			josekiList.add(63);
			josekiList.add(75);
			josekiList.add(42);
			josekiList.add(24);
			return josekiList;
		}
				
						
		//裏コウモリ定石
		public static ArrayList<Integer> reverseKoumori(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(64);
			josekiList.add(46);
			josekiList.add(42);
			return josekiList;
		}
		
		//飛び出し牛8-g6 9-d3変化形
		public static ArrayList<Integer> patternFlyingCow1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(64);
			josekiList.add(46);
			josekiList.add(42);
			josekiList.add(65);
			josekiList.add(32);
			josekiList.add(24);
			josekiList.add(35);
			josekiList.add(25);
			josekiList.add(56);
			josekiList.add(23);
			josekiList.add(47);
			return josekiList;
		}
				
		//飛び出し牛 8-g6 9-d6変化形
		public static ArrayList<Integer> patternFlyingCow2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(64);
			josekiList.add(46);
			josekiList.add(42);
			josekiList.add(65);
			josekiList.add(35);
			josekiList.add(23);
			josekiList.add(24);
			josekiList.add(52);
			josekiList.add(63);
			return josekiList;
		}
		
		//飛び出し牛 8-f3型
		public static ArrayList<Integer> patternFlyingCow3(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(64);
			josekiList.add(46);
			josekiList.add(42);
			josekiList.add(52);
			josekiList.add(24);
			josekiList.add(23);
			josekiList.add(62);
			josekiList.add(25);
			josekiList.add(35);
			josekiList.add(36);
			josekiList.add(47);
			josekiList.add(37);
			return josekiList;
		}
				
		
		//飛び出し牛 8-g4変化形
		public static ArrayList<Integer> patternFlyingCow4(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(64);
			josekiList.add(46);
			josekiList.add(42);
			josekiList.add(63);
			josekiList.add(52);
			josekiList.add(32);
			josekiList.add(22);
			josekiList.add(35);
			josekiList.add(65);
			josekiList.add(74);
			josekiList.add(23);
			
			return josekiList;
		}
				
		//白裏大量 8-g6型（リンゴ定石）
		public static ArrayList<Integer> patternManyWhite1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(64);
			josekiList.add(35);
			josekiList.add(64);
			josekiList.add(65);
			josekiList.add(24);
			josekiList.add(23);
			josekiList.add(52);
			return josekiList;
		}
		
		
		//白裏大量　8-g4型
		public static ArrayList<Integer> patternManyWhite2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(64);
			josekiList.add(35);
			josekiList.add(46);
			josekiList.add(63);
			josekiList.add(52);
			josekiList.add(74);
			josekiList.add(42);
			josekiList.add(32);
			josekiList.add(26);
			josekiList.add(56);
			josekiList.add(65);
			josekiList.add(47);
			josekiList.add(75);
			josekiList.add(76);
			
			return josekiList;
		}
		
		//蛇基本定石
		public static ArrayList<Integer> basicSnake(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(65);
			return josekiList;
		}
				
		//砂蛇基本定石
		public static ArrayList<Integer> basicSandSnake(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(65);
			josekiList.add(24);
			josekiList.add(52);
			return josekiList;
		}
	
		//砂蛇定石　9-c3型
		public static ArrayList<Integer> patternSandSnake1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(65);
			josekiList.add(24);
			josekiList.add(52);
			josekiList.add(46);
			josekiList.add(22);
			josekiList.add(23);
			josekiList.add(42);
			josekiList.add(64);
			josekiList.add(56);
			josekiList.add(75);
			josekiList.add(35);
			josekiList.add(36);
			return josekiList;
		}
		
		//砂蛇定石 9-d6型
		public static ArrayList<Integer> patternSandSnake2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(65);
			josekiList.add(24);
			josekiList.add(52);
			josekiList.add(46);
			josekiList.add(35);
			josekiList.add(56);
			josekiList.add(36);
			josekiList.add(64);
			return josekiList;
		}
		
		//砂蛇定石　8-g4型
		public static ArrayList<Integer> patternSandSnake3(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(65);
			josekiList.add(24);
			josekiList.add(52);
			josekiList.add(63);
			josekiList.add(74);
			josekiList.add(73);
			josekiList.add(72);
			josekiList.add(42);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(46);
			josekiList.add(23);
			josekiList.add(75);
			josekiList.add(76);
			return josekiList;
		}
				
		//砂蛇定石　8-g5型
		public static ArrayList<Integer> patternSandSnake4(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(65);
			josekiList.add(24);
			josekiList.add(52);
			josekiList.add(64);
			josekiList.add(35);
			josekiList.add(42);
			josekiList.add(74);
			josekiList.add(62);
			josekiList.add(23);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(25);
			josekiList.add(63);
			return josekiList;
		}
				
		
		//マムシ基本定石
		public static ArrayList<Integer> basicMamusi(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(65);
			josekiList.add(24);
			josekiList.add(63);
			josekiList.add(64);
			josekiList.add(73);
			return josekiList;
		}
				
		//マムシ定石　11-h2型
		public static ArrayList<Integer> patternMamusi1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(65);
			josekiList.add(24);
			josekiList.add(63);
			josekiList.add(64);
			josekiList.add(73);
			josekiList.add(72);
			josekiList.add(71);
			josekiList.add(75);
			josekiList.add(62);
			josekiList.add(36);
			josekiList.add(52);
			josekiList.add(42);
			josekiList.add(35);
			josekiList.add(76);
			return josekiList;
		}
				
		//マムシ定石　11-f3型
		public static ArrayList<Integer> patternMamusi2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(65);
			josekiList.add(24);
			josekiList.add(63);
			josekiList.add(64);
			josekiList.add(73);
			josekiList.add(72);
			josekiList.add(52);
			josekiList.add(74);
			josekiList.add(75);
			josekiList.add(76);
			josekiList.add(35);
			josekiList.add(42);
			josekiList.add(23);
			josekiList.add(56);
			josekiList.add(62);
			return josekiList;
		}
				
		//マムシ定石　10-h6型
		public static ArrayList<Integer> patternMamusi3(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(65);
			josekiList.add(24);
			josekiList.add(63);
			josekiList.add(64);
			josekiList.add(73);
			josekiList.add(75);
			josekiList.add(52);
			josekiList.add(42);
			josekiList.add(23);
			josekiList.add(62);
			josekiList.add(72);
			josekiList.add(56);
			josekiList.add(74);
			josekiList.add(71);
			josekiList.add(46);
			josekiList.add(22);
			josekiList.add(57);
			return josekiList;
		}
				
		//バシリスク基本定石
		public static ArrayList<Integer> basicBasirisuku(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(65);
			josekiList.add(24);
			josekiList.add(63);
			josekiList.add(64);
			josekiList.add(52);
			josekiList.add(42);
			return josekiList;
		}
				
		//バシリスク定石　11-c4変化形
		public static ArrayList<Integer> patternBasirisuku1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(65);
			josekiList.add(24);
			josekiList.add(63);
			josekiList.add(64);
			josekiList.add(52);
			josekiList.add(42);
			josekiList.add(23);
			josekiList.add(62);
			josekiList.add(74);
			josekiList.add(36);
			josekiList.add(35);
			josekiList.add(26);
			return josekiList;
		}
				
		//バシリスク定石　11-h5
		public static ArrayList<Integer> patternBasirisuku2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(65);
			josekiList.add(24);
			josekiList.add(63);
			josekiList.add(64);
			josekiList.add(52);
			josekiList.add(42);
			josekiList.add(74);
			josekiList.add(51);
			josekiList.add(32);
			josekiList.add(22);
			josekiList.add(25);
			return josekiList;
		}
				
		
	
		//コブラ基本定石
		public static ArrayList<Integer> basicCobura(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(65);
			josekiList.add(25);
			return josekiList;
		}
	
		//コブラ定石 7-g5型
		public static ArrayList<Integer> patternCobura1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(65);
			josekiList.add(25);
			josekiList.add(64);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(56);
			josekiList.add(36);
			josekiList.add(46);
			josekiList.add(57);
			josekiList.add(15);
			josekiList.add(47);
			josekiList.add(23);
			josekiList.add(63);
			return josekiList;
		}
				
		//コブラ定石　7-f3型
		public static ArrayList<Integer> patternCobura2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(65);
			josekiList.add(25);
			josekiList.add(52);
			josekiList.add(64);
			josekiList.add(35);
			josekiList.add(42);
			josekiList.add(24);
			josekiList.add(56);
			josekiList.add(63);
			josekiList.add(46);
			josekiList.add(62);
			josekiList.add(36);
			return josekiList;
		}
				
		//コブラ定石 7-f3 8-e7変化型
		public static ArrayList<Integer> patternCobura3(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(65);
			josekiList.add(25);
			josekiList.add(52);
			josekiList.add(46);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(42);
			josekiList.add(56);
			josekiList.add(36);
			josekiList.add(47);
			josekiList.add(57);
			josekiList.add(67);
			josekiList.add(22);
			josekiList.add(75);
			josekiList.add(14);
			return josekiList;
		}
				
		
		//つちのこ基本定石
		public static ArrayList<Integer> basicTsuchinoko(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(65);
			josekiList.add(35);
			return josekiList;
		}		
				
		//つちのこ定石 7-e3型
		public static ArrayList<Integer> patternTsuchinoko1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(65);
			josekiList.add(35);
			josekiList.add(42);
			josekiList.add(52);
			josekiList.add(63);
			josekiList.add(64);
			josekiList.add(32);
			josekiList.add(41);
			josekiList.add(25);
			josekiList.add(73);
			josekiList.add(24);
			josekiList.add(31);
			josekiList.add(22);
			return josekiList;
		}	
				
				
		//つちのこ定石 7-g4型
		public static ArrayList<Integer> patternTsuchinoko2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(65);
			josekiList.add(35);
			josekiList.add(63);
			josekiList.add(56);
			josekiList.add(25);
			josekiList.add(46);
			josekiList.add(62);
			josekiList.add(64);
			josekiList.add(75);
			josekiList.add(36);
			josekiList.add(57);
			josekiList.add(74);
			josekiList.add(73);
			josekiList.add(72);
			josekiList.add(71);
			return josekiList;
		}
		
		//つちのこ定石 7-c6型
		public static ArrayList<Integer> patternTsuchinoko3(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(65);
			josekiList.add(35);
			josekiList.add(25);
			josekiList.add(46);
			josekiList.add(57);
			josekiList.add(56);
			josekiList.add(64);
			josekiList.add(36);
			josekiList.add(42);
			return josekiList;
		}
			
		//バッファロー基本定石
		public static ArrayList<Integer> basicBufferlow(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(22);
			return josekiList;
		}
							
		//　e7バッファロー定石
		public static ArrayList<Integer> patternBufferlow1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(22);
			josekiList.add(46);
			return josekiList;
		}
		
		
		//e7バッファロー定石 8-f2型
		public static ArrayList<Integer> patternBufferlow2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(22);
			josekiList.add(46);
			josekiList.add(52);
			josekiList.add(51);
			josekiList.add(64);
			josekiList.add(35);
			josekiList.add(63);
			josekiList.add(42);
			josekiList.add(32);
			return josekiList;
		}
								
		//e7バッファロー定石 8-e3型
		public static ArrayList<Integer> patternBufferlow3(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(22);
			josekiList.add(52);
			josekiList.add(42);
			josekiList.add(32);
			josekiList.add(41);
			josekiList.add(50);
			josekiList.add(24);
			josekiList.add(65);
			josekiList.add(64);
			josekiList.add(23);
			josekiList.add(31);
			return josekiList;
		}
		
		//丸岡バッファロー基本定石
		public static ArrayList<Integer> basicMaruokaBufferlow(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(22);
			josekiList.add(36);
			return josekiList;
		}
		
		//丸岡バッファロー定石　7-f3 9-g5　型
		public static ArrayList<Integer> patternMaruokaBufferlow1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(22);
			josekiList.add(36);
			josekiList.add(52);
			josekiList.add(35);
			josekiList.add(64);
			josekiList.add(42);
			josekiList.add(63);
			josekiList.add(73);
			josekiList.add(46);
			josekiList.add(47);
			josekiList.add(56);
			josekiList.add(72);
			josekiList.add(32);
			return josekiList;
		}
		
		//丸岡バッファロー定石 7-f3 9-e7型
		public static ArrayList<Integer> patternMaruokaBufferlow2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(22);
			josekiList.add(36);
			josekiList.add(52);
			josekiList.add(35);
			josekiList.add(46);
			josekiList.add(24);
			josekiList.add(25);
			josekiList.add(15);
			josekiList.add(64);
			josekiList.add(42);
			josekiList.add(27);
			
			return josekiList;
		}
		
		//丸岡バッファロー定石　7-e3型
		public static ArrayList<Integer> patternMaruokaBufferlow3(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(22);
			josekiList.add(36);
			josekiList.add(42);
			josekiList.add(35);
			josekiList.add(46);
			josekiList.add(24);
			josekiList.add(25);
			josekiList.add(14);
			josekiList.add(62);
			josekiList.add(56);
			return josekiList;
		}
				
				
		//谷田バッファロー基本定石
		public static ArrayList<Integer> basicTanidaBufferlow(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(22);
			josekiList.add(35);
			josekiList.add(52);
			return josekiList;
		}
				
				
		//谷田バッファロー最善定石
		public static ArrayList<Integer> bestTanidaBufferlow(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(22);
			josekiList.add(35);
			josekiList.add(52);
			josekiList.add(23);
			josekiList.add(24);
			josekiList.add(13);
			josekiList.add(25);
			josekiList.add(14);
			josekiList.add(4);
			josekiList.add(2);
			josekiList.add(5);
			josekiList.add(42);
			josekiList.add(32);
			josekiList.add(15);
			
			return josekiList;
		}
		
		//谷田バッファロー定石 8-e3変化型
		public static ArrayList<Integer> patternTanidaBufferlow1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(22);
			josekiList.add(35);
			josekiList.add(52);
			josekiList.add(42);
			josekiList.add(32);
			josekiList.add(25);
			josekiList.add(63);
			josekiList.add(72);
			josekiList.add(74);
			josekiList.add(41);
			josekiList.add(31);
			josekiList.add(23);
			josekiList.add(13);
			josekiList.add(21);
			return josekiList;
		}
		
		
		//谷田バッファロー定石　8-c5変化型
		public static ArrayList<Integer> patternTanidaBufferlow2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(22);
			josekiList.add(35);
			josekiList.add(52);
			josekiList.add(24);
			josekiList.add(63);
			josekiList.add(72);
			josekiList.add(25);
			josekiList.add(23);
			josekiList.add(74);
			return josekiList;
		}
		
		//北陸バッファロー基本定石
		public static ArrayList<Integer> basicHokurikuBufferlow(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(22);
			josekiList.add(23);
			josekiList.add(32);
			return josekiList;
		}
				
		//北陸バッファロー定石　8-d6型
		public static ArrayList<Integer> patternHokurikuBufferlow1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(22);
			josekiList.add(23);
			josekiList.add(32);
			josekiList.add(35);
			josekiList.add(24);
			josekiList.add(25);
			josekiList.add(36);
			josekiList.add(27);
			josekiList.add(15);
			josekiList.add(26);
			josekiList.add(46);
			josekiList.add(37);
			josekiList.add(56);
			josekiList.add(5);
			return josekiList;
		}
				
		//北陸バッファロー定石　8-c6型
		public static ArrayList<Integer> patternHokurikuBufferlow2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(22);
			josekiList.add(23);
			josekiList.add(32);
			josekiList.add(25);
			josekiList.add(42);
			josekiList.add(52);
			josekiList.add(13);
			josekiList.add(35);
			josekiList.add(63);
			return josekiList;
		}
		
		//ロケット基本定石
		public static ArrayList<Integer> basicRocket(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(62);
			return josekiList;
		}
				
		//ロケット最善定石
		public static ArrayList<Integer> bestRocket(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(62);
			josekiList.add(35);
			josekiList.add(42);
			josekiList.add(63);
			josekiList.add(24);
			josekiList.add(23);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(41);
			
			return josekiList;
		}
		
		
		//ロケット定石 6-f3変化型
		public static ArrayList<Integer> patternRocket(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(62);
			josekiList.add(52);
			josekiList.add(64);
			josekiList.add(65);
			josekiList.add(63);
			josekiList.add(72);
			josekiList.add(42);
			josekiList.add(51);
			josekiList.add(32);
			josekiList.add(35);
			josekiList.add(50);
			josekiList.add(75);
			return josekiList;
		}
	
		//裏蛇基本定石
		public static ArrayList<Integer> basicReverseSnake(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(32);
			return josekiList;
		}
		
		//裏蛇最善定石
		public static ArrayList<Integer> bestReverseSnake(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(32);
			josekiList.add(35);
			josekiList.add(52);
			josekiList.add(42);
			josekiList.add(64);
			josekiList.add(65);
			josekiList.add(63);
			josekiList.add(72);
			josekiList.add(73);
			josekiList.add(74);
			josekiList.add(46);
			return josekiList;
		}
		
		
		//裏蛇定石　7-g5型
		public static ArrayList<Integer> patternReverseSnake1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(32);
			josekiList.add(35);
			josekiList.add(64);
			josekiList.add(65);
			josekiList.add(52);
			josekiList.add(42);
			josekiList.add(63);
			josekiList.add(72);
			josekiList.add(73);
			josekiList.add(74);
			josekiList.add(46);
			return josekiList;
		}
	
		//裏蛇定石　6-e7変化型
		public static ArrayList<Integer> patternReverseSnake2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(32);
			josekiList.add(46);
			josekiList.add(52);
			josekiList.add(42);
			josekiList.add(63);
			josekiList.add(64);
			josekiList.add(56);
			josekiList.add(62);
			
			return josekiList;
		}
	
		//狸基本定石
		public static ArrayList<Integer> basicRacoon(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(63);
			return josekiList;
		}
	
		//狸最善定石
		public static ArrayList<Integer> bestRacoon(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(63);
			josekiList.add(46);
			josekiList.add(56);
			josekiList.add(64);
			josekiList.add(42);
			josekiList.add(32);
			josekiList.add(74);
			return josekiList;
		}
	
			
		//裏狸基本定石
		public static ArrayList<Integer> basicReverseRacoon(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(52);
			return josekiList;
		}
			
		
		//裏狸最善定石
		public static ArrayList<Integer> bestReverseRacoon(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(52);
			josekiList.add(24);
			josekiList.add(25);
			josekiList.add(42);
			josekiList.add(64);
			josekiList.add(46);
			josekiList.add(36);
			josekiList.add(65);
			josekiList.add(63);
			josekiList.add(74);
			return josekiList;
		}
			
		//暴走牛
		public static ArrayList<Integer> basicGangCow(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(55);
			josekiList.add(45);
			josekiList.add(53);					
			josekiList.add(66);
			return josekiList;
		}

		/*******************************************************
		 * 						虎定石						   *
		 *******************************************************/						
		 
		//花形定石
		public static ArrayList<Integer> basicFlower(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(24);
			josekiList.add(12);
			josekiList.add(21);
			return josekiList;
		}
					
		//酉フック定石
		public static ArrayList<Integer> basicBirdFook(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(24);
			josekiList.add(12);
			josekiList.add(21);
			josekiList.add(42);
			josekiList.add(31);
			josekiList.add(25);
			josekiList.add(13);
			josekiList.add(2);
			josekiList.add(62);
			josekiList.add(63);
			josekiList.add(52);
			josekiList.add(20);
			josekiList.add(14);
			josekiList.add(3);
			josekiList.add(5);
			josekiList.add(30);
			josekiList.add(41);
			josekiList.add(51);
			return josekiList;
		}
		
		//酉ストレート定石
		public static ArrayList<Integer> basicBirdStreet(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(24);
			josekiList.add(12);
			josekiList.add(21);
			josekiList.add(42);
			josekiList.add(31);
			josekiList.add(25);
			josekiList.add(13);
			josekiList.add(3);
			josekiList.add(14);
			josekiList.add(15);
			josekiList.add(36);
			josekiList.add(46);
			return josekiList;
		}
	
		//酉アッパー定石
		public static ArrayList<Integer> basicBirdUpper(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(24);
			josekiList.add(12);
			josekiList.add(21);
			josekiList.add(42);
			josekiList.add(31);
			josekiList.add(25);
			josekiList.add(13);
			josekiList.add(14);
			josekiList.add(51);
			josekiList.add(45);
			josekiList.add(52);
			josekiList.add(20);
			josekiList.add(2);
			josekiList.add(3);
			josekiList.add(4);
			return josekiList;
		}
	
		//金魚定石
		public static ArrayList<Integer> basicGoldfish(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(24);
			josekiList.add(12);
			josekiList.add(21);
			josekiList.add(45);
			josekiList.add(25);
			josekiList.add(13);
			josekiList.add(14);
			josekiList.add(31);
			josekiList.add(42);
			josekiList.add(5);
			josekiList.add(20);
			josekiList.add(15);
			josekiList.add(52);
			josekiList.add(55);
			josekiList.add(56);
			josekiList.add(41);
			return josekiList;
		}
	
		
		//金魚回避定石
		public static ArrayList<Integer> basicAvoidingGoldfish(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(24);
			josekiList.add(12);
			josekiList.add(21);
			josekiList.add(45);
			josekiList.add(13);
			josekiList.add(52);
			josekiList.add(42);
			josekiList.add(41);
			josekiList.add(55);
			josekiList.add(31);
			josekiList.add(63);
			josekiList.add(15);
			return josekiList;
		}
	
		//FJT定石
		public static ArrayList<Integer> basicFJT(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(24);
			josekiList.add(12);
			josekiList.add(21);
			josekiList.add(13);
			josekiList.add(42);
			josekiList.add(45);
			josekiList.add(55);
			josekiList.add(4);
			josekiList.add(3);
			josekiList.add(14);
			josekiList.add(5);
			josekiList.add(36);
			josekiList.add(26);
			josekiList.add(46);
			
			return josekiList;
		}
		
		//FJT定石 14-g4型
		public static ArrayList<Integer> patternFJT1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(24);
			josekiList.add(12);
			josekiList.add(21);
			josekiList.add(13);
			josekiList.add(42);
			josekiList.add(45);
			josekiList.add(25);
			josekiList.add(63);
			josekiList.add(55);
			josekiList.add(15);
			josekiList.add(65);
			josekiList.add(64);
			josekiList.add(52);
			josekiList.add(36);
			josekiList.add(56);
			return josekiList;
		}
		
		//FJT定石 11-c6型
		public static ArrayList<Integer> patternFJT2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(24);
			josekiList.add(12);
			josekiList.add(21);
			josekiList.add(13);
			josekiList.add(25);
			josekiList.add(31);
			josekiList.add(45);
			josekiList.add(14);
			return josekiList;
		}
	
	
		//バナナ定石基本形
		public static ArrayList<Integer> basicBanana(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(24);
			josekiList.add(13);
			josekiList.add(12);
			josekiList.add(21);
			josekiList.add(36);
			josekiList.add(25);
			josekiList.add(45);
			josekiList.add(14);
			josekiList.add(4);
			return josekiList;
		}
		//バナナ定石 9-b5変化型
		public static ArrayList<Integer> patternBanana(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(24);
			josekiList.add(13);
			josekiList.add(14);
			josekiList.add(25);
			josekiList.add(52);
			josekiList.add(45);
			josekiList.add(42);
			josekiList.add(65);
			josekiList.add(55);
			josekiList.add(64);
			josekiList.add(36);
			
			return josekiList;
		}
	
		//まこ虎定石
		public static ArrayList<Integer> basicMakoTiger(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(24);
			josekiList.add(14);
			josekiList.add(13);
			josekiList.add(12);
			josekiList.add(21);
			josekiList.add(55);
			josekiList.add(63);
			josekiList.add(42);
			josekiList.add(45);
			josekiList.add(25);
			return josekiList;
		}
		
		//コンポス定石基本形
		public static ArrayList<Integer> basicCompos(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(52);
			josekiList.add(45);
			josekiList.add(46);
			josekiList.add(36);
			return josekiList;
		}
				

		//コンポスFAT形
		public static ArrayList<Integer> patternComposFAT(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(52);
			josekiList.add(45);
			josekiList.add(46);
			josekiList.add(36);
			josekiList.add(65);
			josekiList.add(57);
			josekiList.add(56);
			josekiList.add(64);
			josekiList.add(75);
			josekiList.add(73);
			josekiList.add(63);
			josekiList.add(72);
			josekiList.add(74);
			josekiList.add(76);
			return josekiList;
		}
		

		//コンポス定石 14-c5変化型（ジャンポス）
		public static ArrayList<Integer> patternCompos1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(52);
			josekiList.add(45);
			josekiList.add(46);
			josekiList.add(36);
			josekiList.add(65);
			josekiList.add(57);
			josekiList.add(24);
			josekiList.add(25);
			josekiList.add(26);
			josekiList.add(27);
			josekiList.add(13);
			return josekiList;
		}


		//コンポス定石 13-8変化型
		public static ArrayList<Integer> patternCompos2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(52);
			josekiList.add(45);
			josekiList.add(46);
			josekiList.add(36);
			josekiList.add(65);
			josekiList.add(37);
			josekiList.add(24);
			josekiList.add(25);
			josekiList.add(26);
			josekiList.add(27);
			return josekiList;
		}
		

		//シャープコンポス定石
		public static ArrayList<Integer> patternSCompos(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(52);
			josekiList.add(45);
			josekiList.add(46);
			josekiList.add(36);
			josekiList.add(65);
			josekiList.add(64);
			josekiList.add(24);
			josekiList.add(15);
			josekiList.add(25);
			josekiList.add(14);
			josekiList.add(26);
			josekiList.add(57);
			josekiList.add(47);
			josekiList.add(56);
			josekiList.add(75);
			josekiList.add(73);
			josekiList.add(13);
			return josekiList;
		}
		
		

		//フラットコンポス定石
		public static ArrayList<Integer> patternFCompos(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(52);
			josekiList.add(45);
			josekiList.add(46);
			josekiList.add(36);
			josekiList.add(65);
			josekiList.add(64);
			josekiList.add(24);
			josekiList.add(25);
			josekiList.add(56);
			josekiList.add(47);
			josekiList.add(75);
			josekiList.add(73);
			josekiList.add(27);
			josekiList.add(57);
			josekiList.add(74);
			josekiList.add(76);
			return josekiList;
		}
		


		//たまプラーザ定石基本形
		public static ArrayList<Integer> basicTamaPlaza(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(52);
			josekiList.add(45);
			josekiList.add(46);
			josekiList.add(56);
			return josekiList;
		}


		//たまプラーザ定石最善形
		public static ArrayList<Integer> bestTamaPlaza(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(52);
			josekiList.add(45);
			josekiList.add(46);
			josekiList.add(56);
			josekiList.add(24);
			josekiList.add(15);
			josekiList.add(65);
			josekiList.add(64);
			josekiList.add(25);
			josekiList.add(47);
			josekiList.add(14);
			josekiList.add(42);
			return josekiList;
		}
		


		//たまプラーザ定石 15-e3変化型
		public static ArrayList<Integer> patternTamaPlaza1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(52);
			josekiList.add(45);
			josekiList.add(46);
			josekiList.add(56);
			josekiList.add(24);
			josekiList.add(15);
			josekiList.add(65);
			josekiList.add(42);
			josekiList.add(41);
			josekiList.add(63);
			josekiList.add(64);
			josekiList.add(25);
			
			return josekiList;
		}
		


		//たまプラーザ定石 13-d3変化型
		public static ArrayList<Integer> patternTamaPlaza2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(52);
			josekiList.add(45);
			josekiList.add(46);
			josekiList.add(56);
			josekiList.add(24);
			josekiList.add(42);
			josekiList.add(41);
			josekiList.add(63);
			return josekiList;
		}
		
		


		//ロジステロ定石基本形
		public static ArrayList<Integer> basicRogistero(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(52);
			josekiList.add(45);
			josekiList.add(46);
			josekiList.add(25);
			return josekiList;
		}
		
		
		//ロジステロ定石最善形
		public static ArrayList<Integer> bestRogistero(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(52);
			josekiList.add(45);
			josekiList.add(46);
			josekiList.add(25);
			josekiList.add(65);
			josekiList.add(57);
			josekiList.add(56);
			josekiList.add(31);
			josekiList.add(24);
			josekiList.add(42);
			josekiList.add(13);
			josekiList.add(4);
			return josekiList;
		}

		//ロジステロ定石 12-g5型
		public static ArrayList<Integer> patternRogistero(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(52);
			josekiList.add(45);
			josekiList.add(46);
			josekiList.add(25);
			josekiList.add(64);
			josekiList.add(65);
			josekiList.add(56);
			josekiList.add(74);
			return josekiList;
		}
		
		//ライトニングボルト定石基本形
		public static ArrayList<Integer> basicLightening(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(52);
			josekiList.add(42);
			return josekiList;
		}


		
		//ライトニングボルト定石最善対応型
		public static ArrayList<Integer> bestLightening(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(52);
			josekiList.add(42);
			josekiList.add(13);
			josekiList.add(14);
			josekiList.add(45);
			josekiList.add(46);
			return josekiList;
		}
		
		
		//ライトニングボルト定石 次善対応型
		public static ArrayList<Integer> betterLightening(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(52);
			josekiList.add(42);
			josekiList.add(64);
			josekiList.add(25);
			josekiList.add(41);
			josekiList.add(36);
			josekiList.add(56);
			josekiList.add(63);
			return josekiList;
		}


		
		//ノーカン定石基本形
		public static ArrayList<Integer> basicNoCount(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(64);
			return josekiList;
		}


		//ノーカン定石最善形１　15-h5型
		public static ArrayList<Integer> bestNoCount1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(64);
			josekiList.add(45);
			josekiList.add(36);
			josekiList.add(42);
			josekiList.add(24);
			josekiList.add(52);
			josekiList.add(46);
			josekiList.add(74);
			josekiList.add(41);
			josekiList.add(25);
			josekiList.add(31);
			josekiList.add(21);
			josekiList.add(12);
			josekiList.add(13);
			josekiList.add(65);
			josekiList.add(3);
			return josekiList;
		}

		//ノーカン定石最善型2 15-b6型
		public static ArrayList<Integer> bestNoCount2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(64);
			josekiList.add(45);
			josekiList.add(36);
			josekiList.add(42);
			josekiList.add(24);
			josekiList.add(52);
			josekiList.add(46);
			josekiList.add(15);
			josekiList.add(63);
			josekiList.add(25);
			josekiList.add(62);
			josekiList.add(72);
			josekiList.add(51);
			josekiList.add(75);
			josekiList.add(14);
			return josekiList;
		}
		
		//ノーカン定石 9-e3変化型
		public static ArrayList<Integer> patternNoCount1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(64);
			josekiList.add(42);
			josekiList.add(52);
			josekiList.add(63);
			josekiList.add(41);
			josekiList.add(31);
			josekiList.add(72);
			josekiList.add(50);
			josekiList.add(62);
			josekiList.add(45);
			josekiList.add(24);
			josekiList.add(51);
			josekiList.add(56);
			
			return josekiList;
		}
		
		//ノーカン定石 11-f7変化型（北島流）　
		public static ArrayList<Integer> patternNoCount2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(64);
			josekiList.add(45);
			josekiList.add(36);
			josekiList.add(56);
			josekiList.add(24);
			josekiList.add(15);
			josekiList.add(42);
			josekiList.add(25);
			josekiList.add(46);
			josekiList.add(57);
			josekiList.add(37);
			
			return josekiList;
		}

		
		//ノーカン定石 11-e7変化型
		public static ArrayList<Integer> patternNoCount3(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(64);
			josekiList.add(45);
			josekiList.add(36);
			josekiList.add(46);
			josekiList.add(24);
			josekiList.add(52);
			josekiList.add(63);
			josekiList.add(42);
			josekiList.add(65);
			return josekiList;
		}
		

		
		//ノーカン定石 13-f7変化型
		public static ArrayList<Integer> patternNoCount4(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(64);
			josekiList.add(45);
			josekiList.add(36);
			josekiList.add(42);
			josekiList.add(56);
			josekiList.add(46);
			josekiList.add(25);
			josekiList.add(15);
			josekiList.add(63);
			josekiList.add(72);
			return josekiList;
		}

		//ノーカン定石 13-e7変化型
		public static ArrayList<Integer> patternNoCount5(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(64);
			josekiList.add(45);
			josekiList.add(36);
			josekiList.add(42);
			josekiList.add(24);
			josekiList.add(46);
			josekiList.add(52);
			josekiList.add(63);
			josekiList.add(15);
			josekiList.add(14);
			josekiList.add(65);
			
			return josekiList;
		}

		//縦取り殺され定石
		public static ArrayList<Integer> basicTateKilled(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(64);
			josekiList.add(45);
			josekiList.add(24);
			josekiList.add(52);
			josekiList.add(14);
			josekiList.add(13);
			josekiList.add(21);
			josekiList.add(26);
			josekiList.add(36);
			josekiList.add(12);
			return josekiList;
		}

		//Kung定石基本形
		public static ArrayList<Integer> basicKung(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(13);
			josekiList.add(52);
			josekiList.add(45);
			josekiList.add(42);
			josekiList.add(64);
			josekiList.add(65);
			josekiList.add(63);
			josekiList.add(73);
			josekiList.add(74);
			josekiList.add(75);
			josekiList.add(62);
			josekiList.add(72);
			josekiList.add(56);
			josekiList.add(57);
			josekiList.add(51);
			josekiList.add(50);
			return josekiList;
		}


		//Kung定石　9-c2変化型
		public static ArrayList<Integer> patternKung(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(13);
			josekiList.add(21);
			josekiList.add(52);
			josekiList.add(42);
			josekiList.add(41);
			josekiList.add(25);
			josekiList.add(45);
			josekiList.add(24);
			josekiList.add(31);
			josekiList.add(30);
			josekiList.add(12);
			josekiList.add(14);
			josekiList.add(40);
			josekiList.add(50);
			return josekiList;
		}


		//ミサイル定石
		public static ArrayList<Integer> basicMissile(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(64);
			josekiList.add(25);
			josekiList.add(24);
			josekiList.add(23);
			return josekiList;
		}


		//龍定石
		public static ArrayList<Integer> basicDragon(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			return josekiList;
		}

		//風神定石
		public static ArrayList<Integer> basicFujin(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(32);
			josekiList.add(52);
			josekiList.add(12);
			josekiList.add(24);
			josekiList.add(63);
			josekiList.add(62);
			josekiList.add(25);
			josekiList.add(23);
			josekiList.add(45);
			
			return josekiList;
		}

		//竜巻定石
		public static ArrayList<Integer> basicTornade(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(53);
			josekiList.add(55);
			josekiList.add(32);
			josekiList.add(52);
			josekiList.add(12);
			josekiList.add(26);
			josekiList.add(36);
			josekiList.add(46);
			josekiList.add(37);
			josekiList.add(25);
			josekiList.add(56);
			josekiList.add(45);
			josekiList.add(24);
			return josekiList;
		}

		//ザリガニ定石
		public static ArrayList<Integer> basicZarigani(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(24);
			josekiList.add(53);
			josekiList.add(52);
			josekiList.add(42);
			josekiList.add(24);
			josekiList.add(65);
			return josekiList;
		}

		//エビ定石
		public static ArrayList<Integer> basicEbi(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(25);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(24);
			josekiList.add(23);
			josekiList.add(14);
			josekiList.add(36);
			return josekiList;
		}

		//イエス流定石
		public static ArrayList<Integer> patternYes1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(12);
			josekiList.add(25);
			josekiList.add(53);
			josekiList.add(45);
			josekiList.add(24);
			josekiList.add(14);
			return josekiList;
		}


		//イエス流定石　8-b6型
		public static ArrayList<Integer> patternYes2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(12);
			josekiList.add(25);
			josekiList.add(15);
			josekiList.add(36);
			josekiList.add(47);
			josekiList.add(21);
			josekiList.add(20);
			josekiList.add(2);
			josekiList.add(45);
			josekiList.add(13);
			return josekiList;
		}


		//Berg Tiger定石
		public static ArrayList<Integer> basicBergTiger(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(14);
			josekiList.add(13);
			josekiList.add(53);
			josekiList.add(24);
			josekiList.add(12);
			josekiList.add(21);
			josekiList.add(55);
			josekiList.add(63);
			josekiList.add(42);
			josekiList.add(45);
			josekiList.add(25);
			return josekiList;
		}


		//Leader's Tiger定石
		public static ArrayList<Integer> basicLeadersTiger(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(45);
			josekiList.add(12);
			josekiList.add(41);
			josekiList.add(24);
			josekiList.add(25);
			josekiList.add(42);
			josekiList.add(31);
			josekiList.add(55);
			josekiList.add(52);
			josekiList.add(21);
			return josekiList;
		}

		//Leader's Tiger定石8-f6変化型(ビン)
		public static ArrayList<Integer> patternLeadersTiger1(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(45);
			josekiList.add(55);
			josekiList.add(42);
			josekiList.add(24);
			josekiList.add(25);
			josekiList.add(14);
			josekiList.add(36);
			josekiList.add(46);
			josekiList.add(15);
			josekiList.add(12);
			josekiList.add(57);
			josekiList.add(26);
			josekiList.add(3);
			return josekiList;
		}

		
		//Leader's Tiger定石 8-f6変化型　(坂口流)
		public static ArrayList<Integer> patternLeadersTiger2(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(45);
			josekiList.add(55);
			josekiList.add(42);
			josekiList.add(24);
			josekiList.add(25);
			josekiList.add(15);
			josekiList.add(26);
			josekiList.add(14);
			josekiList.add(46);
			josekiList.add(36);
			josekiList.add(56);
			josekiList.add(52);
			return josekiList;
		}

		//プライトウェル定石
		public static ArrayList<Integer> basicPlightwell(){
			ArrayList<Integer> josekiList = new ArrayList<Integer>();
			josekiList.add(54);
			josekiList.add(35);
			josekiList.add(22);
			josekiList.add(32);
			josekiList.add(23);
			josekiList.add(53);
			josekiList.add(42);
			josekiList.add(52);
			josekiList.add(45);
			josekiList.add(55);
			josekiList.add(63);
			josekiList.add(41);
			josekiList.add(31);
			josekiList.add(25);
			josekiList.add(46);
			return josekiList;
		}

}
