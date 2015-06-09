package ai;

import java.util.ArrayList;

public enum Joseki {
	/*************************************************
	 * 						兎定石					 *
	 *************************************************/
	//シャープローズ系
	basicRabbit(JosekiData.basicRabbit()),
	basicSRose(JosekiData.basicSRose()),
	bestSRose(JosekiData.bestSRose()),
	bestSRose2(JosekiData.bestSRose2()),
	bestSRose3(JosekiData.bestSRose3()),
	kabutoWariSRose(JosekiData.kabutoWariSRose()),
	rotationSRose(JosekiData.rotationSRose()),
	rotationSRose2(JosekiData.rotationSRose2()),
	//フラットローズ系
	basicFRose(JosekiData.basicFRose()),
	rotationFRose(JosekiData.rotationFRose()),
	rotationFRose2(JosekiData.rotationFRose2()),
	nakayokoWariFRose(JosekiData.nakayokowariFRose()),
	kabutoWariFRose(JosekiData.kabutoWariFRose()),
	murakamiFRose(JosekiData.murakamiFRose()),
	//手塚システム
	basicTedukaSystem(JosekiData.basicTedukaSystem()),
	blackCTedukaSystem(JosekiData.blackCTedukaSystem()),
	onesideBlackCTedukaSystem(JosekiData.onesideBlackCTedukaSystem()),
	basicTedukaSystem2(JosekiData.basicTedukaSystem2()),
	basicTedukaSystem3(JosekiData.basicTedukaSystem3()),
	//馬定石
	basicHorse(JosekiData.basicHorse()),
	bestHorse(JosekiData.bestHorse()),
	patternHorse1(JosekiData.patternHorse1()),
	patternHorse2(JosekiData.patternHorse2()),
	patternHorse3(JosekiData.patternHorse3()),
	whiteBestHorse(JosekiData.whiteBestHorse()),
	//鶴定石
	basicCrane(JosekiData.basicCrane()),
	//Shaman定石
	basicShaman(JosekiData.basicShaman()),
	//雪うさぎ定石
	basicSnowRabbit(JosekiData.basicSnowRabbit()),
	patternSnowRabbit1(JosekiData.patternSnowRabbit1()),
	patternSnowRabbit2(JosekiData.patternSnowRabbit2()),
	patternSnowRabbit3(JosekiData.patternSnowRabbit3()),
	patternSnowRabbit4(JosekiData.patternSnowRabbit4()),
	bestInoue(JosekiData.bestInoue()),
	patternInoue1(JosekiData.patternInoue1()),
	patternInoue2(JosekiData.patternInoue2()),
	//横うさぎ定石
	basicYokoRabbit(JosekiData.basicYokoRabbit()),
	bestYokoRabbit(JosekiData.bestYokoRabbit()),
	patternYokoRabbit1(JosekiData.patternYokoRabbit1()),
	patternYokoRabbit2(JosekiData.patternYokoRabbit2()),
	//Ralle定石
	basicRalle(JosekiData.basicRalle()),
	//大和久流
	basicYamato(JosekiData.basicYamato()),
	//たまうさぎ定石
	patternBallRabbit1(JosekiData.patternBallRabbit1()),
	patternBallRabbit2(JosekiData.patternBallRabbit2()),
	//三村流
	patternMimura1(JosekiData.patternMimura1()),
	patternMimura2(JosekiData.patternMimura2()),
	//野兎定石
	basicWildRabbit(JosekiData.basicWildRabbit()),
	patternWildRabbit1(JosekiData.patternWildRabbit1()),
	patternWildRabbit2(JosekiData.patternWildRabbit2()),
	patternWildRabbit3(JosekiData.patternWildRabbit3()),
	
	
	
	/***************************************************
	 *						牛定石                      *
	 ***************************************************/
	//牛定石基本形
	basicCow(JosekiData.basicCow()),
	patternCow1(JosekiData.patternCow1()),
	patternCow2(JosekiData.patternCow2()),
	//快速船定石
	basicFastShip(JosekiData.basicFastShip()),
	bestFastShip(JosekiData.bestFastShip()),
	patternFastShip1(JosekiData.patternFastShip1()),
	patternFastShip2(JosekiData.patternFastShip2()),
	cutFastShip(JosekiData.cutFastShip()),
	
	//ヨット定石
	basicYacht(JosekiData.basicYacht()),
	patternYacht(JosekiData.patternYacht()),
	
	//沈没船
	basicSinkedShip(JosekiData.basicSinkedShip()),
	
	//最善進行型
	patternBestGoing1(JosekiData.basicBestGoing1()),
	patternBestGoing2(JosekiData.basicBestGoing2()),
	patternBestGoing3(JosekiData.basicBestGoing3()),
	
	//コウモリ定石
	basicKoumori(JosekiData.basicKoumori()),
	patternKoumori1(JosekiData.patternKoumori1()),
	patternKoumori2(JosekiData.patternKoumori2()),
	patternKoumori3(JosekiData.patternKoumori3()),
	
	//牛戦車定石
	basicTank(JosekiData.basicTank()),
	
	//白大量取り
	basicManyWhite(JosekiData.basicManyWhite()),
	patternMany1(JosekiData.patternMany1()),
	patternMany2(JosekiData.patternMany2()),
	patternMany3(JosekiData.patternMany3()),
	patternMany4(JosekiData.patternMany4()),
	
	//飛び出し牛定石
	basicFlyingCow(JosekiData.basicFlyingCow()),
	
	//裏快速船
	basicReverseFastShip(JosekiData.basicReverseFastShip()),
	patternReverseFastShip1(JosekiData.patternReverseFastShip1()),
	patternReverseFastShip2(JosekiData.patternReverseFastShip2()),
	patternReverseFastShip3(JosekiData.patternReverseFastShip3()),
	patternReverseFastShip4(JosekiData.patternReverseFastShip4()),
	patternReverseFastShip5(JosekiData.patternReverseFastShip5()),
	patternReverseFastShip6(JosekiData.patternReverseFastShip6()),
	patternReverseFastShip7(JosekiData.patternReverseFastShip7()),
	
	//野いちご定石
	basicWildStrawberry(JosekiData.basicWildStrawberry()),
	//裏ヨット定石
	basicReverseYacht(JosekiData.basicReverseYacht()),
	//岩崎流
	basicIwasaki(JosekiData.basicIwasaki()),
	
	//飛び出し牛変化形
	reverseKoumori(JosekiData.reverseKoumori()),
	patternFlyingCow1(JosekiData.patternFlyingCow1()),
	patternFlyingCow2(JosekiData.patternFlyingCow2()),
	patternFlyingCow3(JosekiData.patternFlyingCow3()),
	patternFlyingCow4(JosekiData.patternFlyingCow4()),

	//白裏大量取り定石
	patternManyWhite1(JosekiData.patternManyWhite1()),
	patternManyWhite2(JosekiData.patternManyWhite2()),
	
	//蛇定石
	basicSnake(JosekiData.basicSnake()),
	//砂蛇定石
	basicSandSnake(JosekiData.basicSandSnake()),
	patternSandSnake1(JosekiData.patternSandSnake1()),
	patternSandSnake2(JosekiData.patternSandSnake2()),
	patternSandSnake3(JosekiData.patternSandSnake3()),
	patternSandSnake4(JosekiData.patternSandSnake4()),
	
	//マムシ定石(蛇定石変化形１)
	basicMamusi(JosekiData.basicMamusi()),
	patternMamusi1(JosekiData.patternMamusi1()),
	patternMamusi2(JosekiData.patternMamusi2()),
	patternMamusi3(JosekiData.patternMamusi3()),

	//バシリスク定石（蛇定石変化形２）
	basicBasirisuku(JosekiData.basicBasirisuku()),
	patternBasirisuku1(JosekiData.patternBasirisuku1()),
	patternBasirisuku2(JosekiData.patternBasirisuku2()),
	
	//コブラ定石（蛇定石変化形３）
	basicCobura(JosekiData.basicCobura()),
	patternCobura1(JosekiData.patternCobura1()),
	patternCobura2(JosekiData.patternCobura2()),
	patternCobura3(JosekiData.patternCobura3()),
	
	//つちのこ定石（蛇定石変化形４）
	basicTsuchinoko(JosekiData.basicTsuchinoko()),
	patternTsuchinoko1(JosekiData.patternTsuchinoko1()),
	patternTsuchinoko2(JosekiData.patternTsuchinoko2()),
	patternTsuchinoko3(JosekiData.patternTsuchinoko3()),
	
	//バッファロー
	basicBufferlow(JosekiData.basicBufferlow()),
	patternBufferlow1(JosekiData.patternBufferlow1()),//e7バッファロー
	patternBufferlow2(JosekiData.patternBufferlow2()),
	patternBufferlow3(JosekiData.patternBufferlow3()),
	
	
	//丸岡バッファロー
	basicMaruokaBufferlow(JosekiData.basicMaruokaBufferlow()),
	patternMaruokaBufferlow1(JosekiData.patternMaruokaBufferlow1()),
	patternMaruokaBufferlow2(JosekiData.patternMaruokaBufferlow2()),
	patternMaruokaBufferlow3(JosekiData.patternMaruokaBufferlow3()),
	
	//谷田バッファロー
	basicTanidaBufferlow(JosekiData.basicTanidaBufferlow()),
	bestTanidaBufferlow(JosekiData.bestTanidaBufferlow()),
	patternTanidaBufferlow1(JosekiData.patternTanidaBufferlow1()),
	patternTanidaBufferlow2(JosekiData.patternTanidaBufferlow2()),
	
	//北陸バッファロー
	basicHokurikuBufferlow(JosekiData.basicHokurikuBufferlow()),
	patternHokurikuBufferlow1(JosekiData.patternHokurikuBufferlow1()),
	patternHokurikuBufferlow2(JosekiData.patternHokurikuBufferlow2()),
	
	//ロケット定石
	basicRocket(JosekiData.basicRocket()),
	bestRocket(JosekiData.bestRocket()),
	patternRocket(JosekiData.patternRocket()),
	
	//裏蛇定石
	basicReverseSnake(JosekiData.basicReverseSnake()),
	bestReverseSnake(JosekiData.bestReverseSnake()),
	patternReverseSnake1(JosekiData.patternReverseSnake1()),
	patternReverseSnake2(JosekiData.patternReverseSnake2()),
	
	//狸定石
	basicRacoon(JosekiData.basicRacoon()),
	bestRacoon(JosekiData.bestRacoon()),
	
	//裏狸定石
	basicReverseRacoon(JosekiData.basicReverseRacoon()),
	bestReverseRacoon(JosekiData.bestReverseRacoon()),
	
	//暴走牛定石
	basicGangCow(JosekiData.basicGangCow()),
	
	
	/**********************************************
	 *                虎定石　　　　　　　　　　　　　　 * 
	 **********************************************/
	
	//花形基本形
	basicFlower(JosekiData.basicFlower()),
	
	//酉フック
	basicBirdFook(JosekiData.basicBirdFook()),
	//酉ストレート
	basicBirdStreet(JosekiData.basicBirdStreet()),
	//酉アッパー
	basicBirdUpper(JosekiData.basicBirdUpper()),
	//金魚定石
	basicGoldfish(JosekiData.basicGoldfish()),
	//金魚回避
	basicAvoidingGoldfish(JosekiData.basicAvoidingGoldfish()),
	//FJT定石
	basicFJT(JosekiData.basicFJT()),
	patternFJT1(JosekiData.patternFJT1()),
	patternFJT2(JosekiData.patternFJT2()),

	//バナナ定石
	basicBanana(JosekiData.basicBanana()),
	patternBanana(JosekiData.patternBanana()),
	
	//まこ虎定石
	basicMakoTiger(JosekiData.basicMakoTiger()),
	
	//コンポス定石
	basciCompos(JosekiData.basicCompos()),
	patternComposFAT(JosekiData.patternComposFAT()),
	patternCompos1(JosekiData.patternCompos1()),
	patternCompos2(JosekiData.patternCompos2()),
	patternSCompos(JosekiData.patternSCompos()),
	patternFCompos(JosekiData.patternFCompos()),
	
	//たまぷらーざ定石
	basicTamaPlaza(JosekiData.basicTamaPlaza()),
	bestTamaPlaza(JosekiData.bestTamaPlaza()),
	patternTamaPlaza1(JosekiData.patternTamaPlaza1()),
	patternTamaPlaza2(JosekiData.patternTamaPlaza2()),
	
	//ロジステロ流
	basicRogistero(JosekiData.basicRogistero()),
	bestRogistero(JosekiData.bestRogistero()),
	patternRogistero(JosekiData.patternRogistero()),
	
	//ライトニングボルト
	basicLightening(JosekiData.basicLightening()),
	bestLightening(JosekiData.bestLightening()),
	betterLightening(JosekiData.betterLightening()),
	
	//ノーカン定石
	basicNoCount(JosekiData.basicNoCount()),
	bestNoCount1(JosekiData.bestNoCount1()),
	bestNoCount2(JosekiData.bestNoCount2()),
	patternNoCount1(JosekiData.patternNoCount1()),
	patternNoCount2(JosekiData.patternNoCount2()),
	patternNoCount3(JosekiData.patternNoCount3()),
	patternNoCount4(JosekiData.patternNoCount4()),
	patternNoCount5(JosekiData.patternNoCount5()),
	
	//縦取り殺され
	basicTateKilled(JosekiData.basicTateKilled()),
	//Kung定石
	basicKung(JosekiData.basicKung()),
	patternKung(JosekiData.patternKung()),
	//ミサイル定石
	basicMissile(JosekiData.basicMissile()),
	//龍定石(未実装)
	//basicDragon(JosekiData.basicDragon()),
	//風神定石
	basicFujin(JosekiData.basicFujin()),
	//竜巻定石
	basicTornade(JosekiData.basicTornade()),
	//エビ系定石
	basicZarigani(JosekiData.basicZarigani()),
	basicEbi(JosekiData.basicEbi()),
	//イエス流
	patternYes1(JosekiData.patternYes1()),
	patternYes2(JosekiData.patternYes2()),
	//BergTiger
	basicBergTiger(JosekiData.basicBergTiger()),
	//Leader's Tiger
	basicLeadersTiger(JosekiData.basicLeadersTiger()),
	patternLeadersTiger1(JosekiData.patternLeadersTiger1()),
	patternLeadersTiger2(JosekiData.patternLeadersTiger2()),
	//プライトウェル
	basicPlightwell(JosekiData.basicPlightwell());
	
	
	
	
	/********************************************************
	 * 							鼠系　　　　　　　　　　　　　　　  *
	 ********************************************************/
	
	/*
	//猫定石
	basicCat(JosekiData.basicCat()),
	bestCat(JosekiData.bestCat()),
	patternCat1(JosekiData.patternCat1()),
	patternCat2(JosekiData.patternCat2()),
	//猫経由虎定石
	basicTigerThroughCat(JosekiData.basicTigerThroughCat()),
	//NoCat定石
	basicNoCat(JosekiData.basicNoCat()),
	//燕定石
	basicSwallow(JosekiData.basicSwallow()),
	patternSwallow(JosekiData.patternSwallow()),
	//ラッコ定石
	basicRakko(JosekiData.basicRakko()),
	
	//羊定石
	basicSheep(JosekiData.basicSheep()),
	bestSheep(JosekiData.bestSheep()),
	patternSheep(JosekiData.patternSheep()),
	//ネズミ定石
	basicMouse(JosekiData.basicMouse()),
	bestMouse(JosekiData.bestMouse()),
	patternMouse(JosekiData.patternMouse());
	
	*/
	
	private ArrayList<Integer> array;

	Joseki(ArrayList<Integer> a){
		this.array = a;
	}
	
	public ArrayList<Integer> returnJoseki(){
		return array;
	}

}
