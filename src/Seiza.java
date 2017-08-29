
public class Seiza {


	public static void main(String[] args){
		int[] rand = Random.randomInt(12);

		for(int i = 1;i < 13;i++){
			for(int j = 0; j < 12; j++){
				if(i == rand[j]+1){
					uranai(i,j+1);
					System.out.println();

				}
			}
		}
	}

	public static void uranai(int rank,int index){
		if(index == 1){
			aries(rank);
		}else if(index == 2){
			taurus(rank);
		}else if(index == 3){
		gemini(rank);
		}else if(index == 4){
		cancer(rank);
		}else if(index == 5){
		leo(rank);
		}else if(index == 6){
		libra(rank);
		}else if(index == 7){
		virgo(rank);
		}else if(index == 8){
		scorpio(rank);
		}else if(index == 9){
		sagittarius(rank);
		}else if(index == 10){
		capricorn(rank);
		}else if(index == 11){
		aquarius(rank);
		}else if(index == 12){
		pisces(rank);
		}
	}



	//numには1 ～ 12が入ります

	public static void aries(int num){
		//牡羊座
		System.out.print(num +"位は牡羊座です！");
		switch(num){
		case 1:

			System.out.println("人生に影響を及ぼす人との出会いが訪れます");
			break;
		case 2:
			System.out.println("幸福の女神が微笑む素敵な1日になります");
			break;
		case 3:
			System.out.println("オープンな態度で過ごすのが大事");
			break;
		case 4:
			System.out.println("暮らしの中に新たなものを取り入れると吉です");
			break;
		case 5:
			System.out.println("胸がときめくシーンに遭遇する日になります");
			break;
		case 6:
			System.out.println("胸がときめくようなものを見つけられそう");
			break;
		case 7:
			System.out.println("イメージチェンジに適している日になります");
			break;
		case 8:
			System.out.println("刺激を求めて冒険をしたくなりそう");
			break;
		case 9:
			System.out.println("刺激や変化を求める日になりそう");
			break;
		case 10:
			System.out.println("無理な約束をしないように注意");
			break;
		case 11:
			System.out.println("楽しみを見つけて上手に気分転換を");
			break;
		case 12:
			System.out.println("プラス思考でいきましょう");
			break;
		}
	}

	public static void taurus(int num){
		//牡牛座
		System.out.println("牡牛座のあなたの運勢は");
		switch(num){

		case 1  : System.out.println("1位です");
		          System.out.println("今日一日幸運です");
		          break;

		case 2  : System.out.println("2位です");
		          System.out.println("良いことあるかも");
		          break;

		case 3  : System.out.println("3位です");
		          System.out.println("まあまあかな");
		          break;

		case 4  : System.out.println("4位です");
		          System.out.println("微妙かな");
		          break;

		case 5  : System.out.println("5位です");
		          System.out.println("普通");
		          break;

		case 6  : System.out.println("6位です");
		          System.out.println("悪くなく良くもない");
		          break;

		case 7  : System.out.println("7位です");
		          System.out.println("普通よりは低い");
		          break;

		case 8  : System.out.println("8位です");
		          System.out.println("悪いよりマシ");
		          break;

		case 9  : System.out.println("9位です");
		          System.out.println("まあ低いかな");
		          break;

		case 10 : System.out.println("10位です");
		          System.out.println("ドンマイ");
		          break;

		case 11 : System.out.println("11位です");
		          System.out.println("ご愁傷様です");
		          break;

		case 12 : System.out.println("12位です");
		          System.out.println("明日があるさ");
		          break;
		}


	}

	public static void gemini(int num){
		//ふたご座
		System.out.print(num +"位はふたご座です！");
		switch (num){
		case 1:
			System.out.println("ラッキーポイント：温かいお茶");
			break;
		case 2:
			System.out.println("ラッキーポイント：熱帯魚の画像");
			break;
		case 3:
			System.out.println("ラッキーポイント：ビーズブレスレット");
			break;
		case 4:
			System.out.println("ラッキーポイント：ミルクティー");
			break;
		case 5:
			System.out.println("ラッキーポイント：エスニック調味料");
			break;
		case 6:
			System.out.println("ラッキーポイント：野菜の鉢植え");
			break;
		case 7:
			System.out.println("ラッキーポイント：塗り絵");
			break;
		case 8:
			System.out.println("ラッキーポイント：旅行ガイドブック");
			break;
		case 9:
			System.out.println("ラッキーポイント：梅干し");
			break;
		case 10:
			System.out.println("ラッキーポイント：ジーパン");
			break;
		case 11:
			System.out.println("ラッキーポイント：星がデザインされた小物");
			break;
		case 12:
			System.out.println("ラッキーポイント：海鮮丼");
			break;
		}
		if(num <= 6){
			System.out.println("ただし足元にはきをつけること！！");
		}
		if(num >= 7){
			System.out.println("ただし掃除をすると運気アップ！！");
		}
	}

	public static void cancer(int num){
		//かに座
		System.out.print(num +"位はかに座です！");
		if(num == 1){
			System.out.println("ラッキーアイテム：ホチキス");
		}
		else if(num == 2){
			System.out.println("ラッキーアイテム：カッター");
		}
		else if(num == 3){
			System.out.println("ラッキーアイテム：アロンアルファ");
		}
		else if(num == 4){
			System.out.println("ラッキーアイテム：定規");
		}
		else if(num == 5){
			System.out.println("ラッキーアイテム：コンパス");
		}
		else if(num == 6){
			System.out.println("ラッキーアイテム：消しゴム");
		}
		else if(num == 7){
			System.out.println("ラッキーアイテム：鉛筆");
		}
		else if(num == 8){
			System.out.println("ラッキーアイテム：蛍光ペン");
		}
		else if(num == 9){
			System.out.println("ラッキーアイテム：万年筆");
		}
		else if(num == 10){
			System.out.println("ラッキーアイテム：ハサミ");
		}
		else if(num == 11){
			System.out.println("ラッキーアイテム：のり");
		}
		else if(num == 12){
			System.out.println("ラッキーアイテム：油性ペン");
		}
		if(num <= 6){
			System.out.println("ただし設定が良さそうなジャグラーにはきをつけること！！");
		}
		if(num >= 7){
			System.out.println("ただしものまねをすると運気アップ！！");
		}
	}

	public static void leo(int num){
		//獅子座
		System.out.print(num +"位は獅子座です！");
		switch(num){
		case 1 :
			System.out.println("ラッキーアイテムは、帽子");
			break;
		case 2 :
			System.out.println("ラッキーアイテムは、財布");
			break;
		case 3 :
			System.out.println("ラッキーアイテムは、腕時計");
			break;
		case 4 :
			System.out.println("ラッキーアイテムは、鉛筆");
			break;
		case 5 :
			System.out.println("ラッキーアイテムは、風船");
			break;
		case 6 :
			System.out.println("ラッキーアイテムは、ネックレス");
			break;
		case 7 :
			System.out.println("ラッキーアイテムは、ブレスレット");
			break;
		case 8 :
			System.out.println("ラッキーアイテムは、ハンカチ");
			break;
		case 9 :
			System.out.println("ラッキーアイテムは、シャーペン");
			break;
		case 10 :
			System.out.println("ラッキーアイテムは、日傘");
			break;
		case 11 :
			System.out.println("ラッキーアイテムは、うちわ");
			break;
		case 12 :
			System.out.println("ラッキーアイテムは、本");
			break;
		}

	}

	public static void virgo(int num){
		//おとめ座
		System.out.print(num +"位はおとめ座です！");
		if(num == 1){
			System.out.println("ラッキーアイテム：赤いアヒルのおもちゃ");
		}
		else if(num == 2){
			System.out.println("ラッキーアイテム：４Bのシャーペン");
		}
		else if(num == 3){
			System.out.println("ラッキーアイテム：ビトンの財布");
		}
		else if(num == 4){
			System.out.println("ラッキーアイテム：赤いアイホン");
		}
		else if(num == 5){
			System.out.println("ラッキーアイテム：銀色のファーストピアス");
		}
		else if(num == 6){
			System.out.println("ラッキーアイテム：青いコンバースの靴");
		}
		else if(num == 7){
			System.out.println("ラッキーアイテム：緑色のハート柄のパンツ");
		}
		else if(num == 8){
			System.out.println("ラッキーアイテム：コカ・コーラの空き瓶");
		}
		else if(num == 9){
			System.out.println("ラッキーアイテム：チチカカのネックレス");
		}
		else if(num == 10){
			System.out.println("ラッキーアイテム：元カノ（元カレ）の連絡先");
		}
		else if(num == 11){
			System.out.println("ラッキーアイテム：デューサーの４番");
		}
		else if(num == 12){
			System.out.println("ラッキーアイテム：マニックパニックのカラーワックス");
		}
		if(num <= 6){
			System.out.println("ただしあざとい女には気をつけること！！！");
		}
		if(num >= 7){
			System.out.println("ただし男っぽい女と話すと運気アップ！！！");
		}
	}
	public static void libra(int num){
		//天秤座
		System.out.print(num +"位は天秤座です！");
		if(num == 1){
			System.out.println("ラッキーアイテム：腕時計");
			System.out.println("スズメバチには気をつけよう！！");
		}
		else if(num == 2){
			System.out.println("ラッキーアイテム：android端末");
			System.out.println("ただし雨漏りには気を付けること");
		}
		else if(num == 3){
			System.out.println("ラッキーアイテム：りんご");
			System.out.println("ただし足元には気を付けること");
		}
		else if(num == 4){
			System.out.println("ラッキーアイテム：100円玉");
			System.out.println("ただし後ろには気を付けること");
		}
		else if(num == 5){
			System.out.println("ラッキーアイテム：千円札");
			System.out.println("階段に気を付けること");
		}
		else if(num == 6){
			System.out.println("ラッキーアイテム：一万円札");
			System.out.println("赤の扉には気を付けること");
		}
		else if(num == 7){
			System.out.println("ラッキーアイテム：赤のボールペン");
			System.out.println("スクワットをすると運気アップ");
		}
		else if(num == 8){
			System.out.println("ラッキーアイテム：イヤホン");
			System.out.println("屈伸をすると運気アップ");
		}
		else if(num == 9){
			System.out.println("ラッキーアイテム：色鉛筆");
			System.out.println("ジョギングをすると運気アップ");
		}
		else if(num == 10){
			System.out.println("ラッキーアイテム：ブランケット");
			System.out.println("ゲームをすると運気アップ");
		}
		else if(num == 11){
			System.out.println("ラッキーアイテム：文鎮");
			System.out.println("習字をすると運気アップ");
		}
		else if(num == 12){
			System.out.println("ラッキーアイテム：アニマルビデオ");
			System.out.println("頑張って");
		}
	}

	public static void scorpio(int num){
		//さそり座
		System.out.print(num +"位はさそり座です！");
		if(num == 1){
			System.out.println("ラッキーアイテム：スカイブルーの小物");
		}
		else if(num == 2){
			System.out.println("ラッキーアイテム：財布");
		}
		else if(num == 3){
			System.out.println("ラッキーアイテム：iphone");
		}
		else if(num == 4){
			System.out.println("ラッキーアイテム：500円玉");
		}
		else if(num == 5){
			System.out.println("ラッキーアイテム：5千円札");
		}
		else if(num == 6){
			System.out.println("ラッキーアイテム：千円札");
		}
		else if(num == 7){
			System.out.println("ラッキーアイテム：ギザ十");
		}
		else if(num == 8){
			System.out.println("ラッキーアイテム：100円玉");
		}
		else if(num == 9){
			System.out.println("ラッキーアイテム：銀色の500円");
		}
		else if(num == 10){
			System.out.println("ラッキーアイテム：昭和64年の10円");
		}
		else if(num == 11){
			System.out.println("ラッキーアイテム：二千円札");
		}
		else if(num == 12){
			System.out.println("ラッキーアイテム：女の子の連絡先");
		}

	}

	public static void sagittarius(int num){
		//いて座
		System.out.print(num +"位はいて座です！");
		if(num == 1){
			System.out.println("総合運★★★★★恋愛運★★★★★仕事運★★★★☆金財運★★★★★");
			System.out.println("ショッピング運あり。たまたま入ったお店で一目惚れの予感。");
			System.out.println("その商品は、まさに一生モノ。たとえ予算オーバーでも、必ず手に入れるべき。");
			System.out.println("その他、迷った時は時間を置いて二度チェック。それでも欲しかったら買いです！");
		}

		else if(num == 2){
			System.out.println("総合運★★★★★恋愛運★★★★☆仕事運★★★★★金財運★★★★☆");
			System.out.println("趣味や習い事で、周囲から注目される出来事が起こりそう！");
			System.out.println("賞を受けるなど、その分野における名誉を手に入れることができるかもしれません。");
			System.out.println("楽しみでやっていたことが仕事となり、金銭につながる可能性も。一躍有名人の予感です。");
		}

		else if(num == 3){
			System.out.println("総合運★★★★☆恋愛運★★★★☆仕事運★★★★☆金財運★★★★☆");
			System.out.println("ずっとやりたかったこと、憧れていたことにチャレンジすべき好機。");
			System.out.println("今なら、周囲は惜しみなく協力してくれるはず。そうした好意に素直に頼れば、");
			System.out.println("ネックだった金銭問題なども難なくクリア。新たな一歩を踏み出せるはず。");
		}

		else if(num == 4){
			System.out.println("総合運★★★★☆恋愛運★★★☆☆仕事運★★★★☆金財運★★★★☆");
			System.out.println("仕事のことでも、お金の動かし方でも、どうなるか知りたいという好奇心が強いでしょう。｢こんな方法もあるかも｣と興味が湧くとき。");
			System.out.println("うまくいくという確信よりも、");
			System.out.println("リスクを最小限に抑える方法も考えついたら、実行して正解！");
		}

		else if(num == 5){
			System.out.println("総合運★★★☆☆恋愛運★★★☆☆仕事運★★★☆☆金財運★★★☆☆");
			System.out.println("メンテナンスに最適な日。ゆっくりお風呂に浸かったり鏡に姿を映しながら、身体の隅々までしっかりチェック！　");
			System.out.println("疲れが残っていないか、体型に変化はないかなど");
			System.out.println("時間をかけて確認すると、美しさが格段にアップするはず。");
		}

		else if(num == 6){
			System.out.println("総合運★★★☆☆恋愛運★★★☆☆仕事運★★★☆☆金財運★★★☆☆");
			System.out.println("何か新しいことを始めるのにいい日。今日スタートさせたことは後に、あなたに幸福をもたらすはず。");
			System.out.println("ただしそれには、長続きさせることが重要。「これだ！」というものに出会ったら、");
			System.out.println("じっくり腰をすえて取り組むようにして。");
		}

		else if(num == 7){
			System.out.println("総合運★★★☆☆恋愛運★★★☆☆仕事運★★★☆☆金財運★★☆☆☆");
			System.out.println("家庭内にトラブル発生！　どうしたらいいのか、家族全員あたふたしてしまいそう。");
			System.out.println("ただ、問題が起こったことでみんなが一致団結。これまでバラバラだった心が一つになるなど、");
			System.out.println("絆を深めることができそう。収束には少し時間を要しますが、協力し合って解決できるはず。");
		}

		else if(num == 8){
			System.out.println("総合運★★★☆☆恋愛運★★★☆☆仕事運★★★☆☆金財運★☆☆☆☆");
			System.out.println("自分の欲望を満たすためにお金をつかうのではなく、誰かのために、役立つお金の使い方をして。");
			System.out.println("お世話になっている人に贈り物をしたり、ちょこちょこ募金をしたり、");
			System.out.println("共感できるボランティア団体に寄付したり…。後悔なく使うことができるはずです。");
		}

		else if(num == 9){
			System.out.println("総合運★★★☆☆恋愛運★☆☆☆☆仕事運★★★☆☆金財運★★☆☆☆");
			System.out.println("｢これはこのペースで続いていくはずだ｣と思っていた仕事に、何か変化がありそうな日。");
			System.out.println("しかし、ドンと構えて大丈夫！というのも、一時的には不安定に見えても、");
			System.out.println("さらに発展させていくチャンスになるから。堂々と仕事と向き合えば、充実する1日です。");
		}

		else if(num == 10){
			System.out.println("総合運★★☆☆恋愛運★☆☆☆☆仕事運★★☆☆☆金財運★★☆☆☆");
			System.out.println("自分ではかわいいわがままのつもりが、相手にとっては大迷惑…ということがちょこちょこありそう。");
			System.out.println("今日は、自分を抑えて何事も他人に譲ってしまうこと。大きなトラブルを招かないためにも、");
			System.out.println("主張しないことが一番です。");
		}

		else if(num == 11){
			System.out.println("総合運★☆☆☆☆恋愛運★★☆☆☆仕事運★☆☆☆☆金財運★☆☆☆☆");
			System.out.println("焦って答えを出す必要はなしチャンスが舞い込んできそうです。驚くほどの大役もあれば、ボランティア的な");
			System.out.println("役割のものもあるでしょう。かし慎重になる必要があります。どんなに魅力的に見えるものでも、");
			System.out.println("あとで期待はずれだったと感じるものが混じっているかもしれません。");
			System.out.println("プライドを満たすことだけを考えていないか、自分がどうしたいかをじっくり考えてから決断しましょう。");
		}

		else if(num == 12){
			System.out.println("総合運★☆☆☆☆恋愛運★☆☆☆☆仕事運★☆☆☆☆金財運★☆☆☆☆");
			System.out.println("どうでもいいことがきっかけとなって、親やきょうだいなど、身内と大ゲンカしちゃいそう。");
			System.out.println("長引くのは必至。もしかしたら断絶の可能性も…。たとえ納得いかなくても、今後のことを考えたら");
			System.out.println("自分から譲歩するべき。面と向かうのがイヤなら、手紙などで気持ちを伝えて。");
		}
	}

	public static void capricorn(int num){
		//やぎ座
		System.out.print(num +"位はやぎ座です！");
		if(num == 1){
			System.out.println("１位です。");
			System.out.println("ラッキーアイテム：スーパーコンピュータ");
		}
		else if(num == 2){
			System.out.println("２位です。");
			System.out.println("ラッキーアイテム：金塊");
		}
		else if(num == 3){
			System.out.println("３位です。");
			System.out.println("ラッキーアイテム：ダイヤモンド");
		}
		else if(num == 4){
			System.out.println("４位です。");
			System.out.println("ラッキーアイテム：2000円札");
		}
		else if(num == 5){
			System.out.println("５位です。");
			System.out.println("ラッキーアイテム：マンガ肉");
		}
		else if(num == 6){
			System.out.println("６位です。");
			System.out.println("ラッキーアイテム：100円札");
		}
		else if(num == 7){
			System.out.println("７位です。");
			System.out.println("ラッキーアイテム：サファイア");
		}
		else if(num == 8){
			System.out.println("８位です。");
			System.out.println("ラッキーアイテム：ruby");
		}
		else if(num == 9){
			System.out.println("９位です。");
			System.out.println("ラッキーアイテム：リオレイア");
		}
		else if(num == 10){
			System.out.println("１０位です。");
			System.out.println("ラッキーアイテム：歯車");
		}
		else if(num == 11){
			System.out.println("１１位です。");
			System.out.println("ラッキーアイテム：無");
		}
		else if(num == 12){
			System.out.println("１２位です。");
			System.out.println("ラッキーアイテム：エリエール");
		}

		if(num <= 6){
			System.out.println("ただし佐藤大地には気をつけること！！！");
		}
		if(num >= 7){
			System.out.println("ただし佐藤大地をからかうと運気アップ！！！");
		}
	}

	public static void aquarius(int num){
		//みずがめ座
		System.out.print(num +"位はみずがめ座です！");
		if(num == 1){
			System.out.println("ラッキーアイテム：お金");
		}
		else if(num == 2){
			System.out.println("ラッキーアイテム：宝くじ");
		}
		else if(num == 3){
			System.out.println("ラッキーアイテム：財布");
		}
		else if(num == 4){
			System.out.println("ラッキーアイテム：万札");
		}
		else if(num == 5){
			System.out.println("ラッキーアイテム：5千円札");
		}
		else if(num == 6){
			System.out.println("ラッキーアイテム：千円札");
		}
		else if(num == 7){
			System.out.println("ラッキーアイテム：500円玉");
		}
		else if(num == 8){
			System.out.println("ラッキーアイテム：100円玉");
		}
		else if(num == 9){
			System.out.println("ラッキーアイテム：10円玉");
		}
		else if(num == 10){
			System.out.println("ラッキーアイテム：5円玉");
		}
		else if(num == 11){
			System.out.println("ラッキーアイテム：1円玉");
		}
		else if(num == 12){
			System.out.println("ラッキーアイテム：物乞い");
		}
	}

	public static void pisces(int num){
		//うお座
		System.out.print(num +"位はうお座です！");
		if(num == 1){
			System.out.println("ラッキーアイテムは大根です");
		}else if(num == 2){
			System.out.println("ラッキーアイテムはたまごです");
		}else if(num == 3){
			System.out.println("ラッキーアイテムはこんにゃくです");
		}else if(num == 4){
			System.out.println("ラッキーアイテムはちくわです");
		}else if(num == 5){
			System.out.println("ラッキーアイテムは餅入り巾着です");
		}else if(num == 6){
			System.out.println("ラッキーアイテムははんぺんです");
		}else if(num == 7){
			System.out.println("ラッキーアイテムは牛すじ串です");
		}else if(num == 8){
			System.out.println("ラッキーアイテムは厚揚げです");
		}else if(num == 9){
			System.out.println("ラッキーアイテムはじゃがいもです");
		}else if(num == 10){
			System.out.println("ラッキーアイテムはしらたきです");
		}else if(num == 11){
			System.out.println("ラッキーアイテムはがんもどきです");
		}else if(num == 12){
			System.out.println("ラッキーアイテムはさつま揚げです");
		}
		if(num <= 6){
			System.out.println("ただしPDTには気をつけること！！！");
		}
		if(num >= 7){
			System.out.println("ただしPDTをからかうと運気アップ！！！");
		}

	}

}
