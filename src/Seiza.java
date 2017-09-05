
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
			System.out.println("ただしやりすぎには気を付けましょう");
			break;
		case 2:
			System.out.println("幸福の女神が微笑む素敵な1日になります");
			System.out.println("ただしハメを外しすぎないようにしましょう");
			break;
		case 3:
			System.out.println("オープンな態度で過ごすのが大事");
			System.out.println("ただしオープンしすぎないこと");
			break;
		case 4:
			System.out.println("暮らしの中に新たなものを取り入れると吉です");
			System.out.println("ただしお金を使いすぎないこと");
			break;
		case 5:
			System.out.println("胸がときめくシーンに遭遇する日になります");
			System.out.println("ただし過度な期待はしないこと");
			break;
		case 6:
			System.out.println("胸がときめくようなものを見つけられそう");
			System.out.println("ただしあまり探しすぎないこと");
			break;
		case 7:
			System.out.println("イメージチェンジに適している日になります");
			System.out.println("いろいろ服を変えて運気アップ");
			break;
		case 8:
			System.out.println("刺激を求めて冒険をしたくなりそう");
			System.out.println("消しゴムもって運気アップ");
			break;
		case 9:
			System.out.println("刺激や変化を求める日になりそう");
			System.out.println("水を飲んで運気アップ");
			break;
		case 10:
			System.out.println("無理な約束をしないように注意");
			System.out.println("お守りもって運気アップ");
			break;
		case 11:
			System.out.println("楽しみを見つけて上手に気分転換を");
			System.out.println("リンゴをもって運気アップ");
			break;
		case 12:
			System.out.println("プラス思考でいきましょう");
			System.out.println("金を集めて運気アップ");
			break;
		}
	}

	public static void taurus(int num){
		//牡牛座
		System.out.println("牡牛座のあなたの運勢は");
		switch(num){

		case 1  :
		          System.out.println("今日一日幸運です");
		          System.out.println("ラッキーアイテムはハンカチです");
		          break;

		case 2  :
              System.out.println("良いことあるかも");
		          System.out.println("ラッキーアイテムはティッシュです");
		          break;

		case 3  : 
              System.out.println("まあまあかな");
		          System.out.println("ラッキーアイテムは目薬です");
		          break;

		case 4  :
              System.out.println("微妙かな");
		          System.out.println("ラッキーアイテムは腕時計です");
		          break;

		case 5  :
              System.out.println("普通");
		          System.out.println("ラッキーアイテムはメモ帳です");
		          break;

		case 6  :
              System.out.println("悪くなく良くもない");
		          System.out.println("ラッキーアイテムはイヤホンです");
		          break;

		case 7  :
              System.out.println("普通よりは低い");
		          System.out.println("ラッキーアイテムは本です");
        　　　break;

		case 8  :
		          System.out.println("悪いよりマシ");
		          System.out.println("ラッキーアイテムはゴムです");
              break;

		case 9  :
		          System.out.println("まあ低いかな");
              System.out.println("ラッキーアイテムはネックレスです");
              break;

		case 10 :
		          System.out.println("ドンマイ");
              System.out.println("ラッキーアイテムはミサンガです");
              break;

		case 11 : 
		          System.out.println("ご愁傷様です");
              System.out.println("ラッキーアイテムは包帯です");
              break;

		case 12 : 
		          System.out.println("明日があるさ");
              System.out.println("ラッキーアイテムはお守りです");
              break;
		}
		if(num >= 6){System.out.println("ただし蜂には気を付けよう");}
		if(num <= 7){System.out.println("ストレッチをして運気アップ");}
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

			if(num <= 6){
				System.out.println("ただし集合時間など、時間に気を付けること！！");
			}
			if(num >= 7){
				System.out.println("ただし本の整理など、身の回りの整理整頓をすると運気アップ！！");
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
			System.out.println("ただし時間をかけすぎて先に買われないよう注意！");
		}

		else if(num == 2){
			System.out.println("総合運★★★★★恋愛運★★★★☆仕事運★★★★★金財運★★★★☆");
			System.out.println("趣味や習い事で、周囲から注目される出来事が起こりそう！");
			System.out.println("賞を受けるなど、その分野における名誉を手に入れることができるかもしれません。");
			System.out.println("楽しみでやっていたことが仕事となり、金銭につながる可能性も。一躍有名人の予感です。");
			System.out.println("視野を広げ、様々なことにチャレンジするといいでしょう。");
		}

		else if(num == 3){
			System.out.println("総合運★★★★☆恋愛運★★★★☆仕事運★★★★☆金財運★★★★☆");
			System.out.println("ずっとやりたかったこと、憧れていたことにチャレンジすべき好機。");
			System.out.println("今なら、周囲は惜しみなく協力してくれるはず。そうした好意に素直に頼れば、");
			System.out.println("ネックだった金銭問題なども難なくクリア。新たな一歩を踏み出せるはず。");
			System.out.println("ただし油断してお金を使いすぎないよう注意！");
		}

		else if(num == 4){
			System.out.println("総合運★★★★☆恋愛運★★★☆☆仕事運★★★★☆金財運★★★★☆");
			System.out.println("仕事のことでも、お金の動かし方でも、どうなるか知りたいという好奇心が強いでしょう。｢こんな方法もあるかも｣と興味が湧くとき。");
			System.out.println("うまくいくという確信よりも、");
			System.out.println("リスクを最小限に抑える方法も考えついたら、実行して正解！");
			System.out.println("慎重に行動すればさらにリスクを減らすことが出来るでしょう。");
		}

		else if(num == 5){
			System.out.println("総合運★★★☆☆恋愛運★★★☆☆仕事運★★★☆☆金財運★★★☆☆");
			System.out.println("メンテナンスに最適な日。ゆっくりお風呂に浸かったり鏡に姿を映しながら、身体の隅々までしっかりチェック！　");
			System.out.println("疲れが残っていないか、体型に変化はないかなど");
			System.out.println("時間をかけて確認すると、美しさが格段にアップするはず。");
			System.out.println("ただし寝すぎには注意、遅刻には気を付けて！");
		}

		else if(num == 6){
			System.out.println("総合運★★★☆☆恋愛運★★★☆☆仕事運★★★☆☆金財運★★★☆☆");
			System.out.println("何か新しいことを始めるのにいい日。今日スタートさせたことは後に、あなたに幸福をもたらすはず。");
			System.out.println("ただしそれには、長続きさせることが重要。「これだ！」というものに出会ったら、");
			System.out.println("じっくり腰をすえて取り組むようにして。");
			System.out.println("続くか続かないかの判断を素早く行えば時間を有効に活用出来るでしょう。");
		}

		else if(num == 7){
			System.out.println("総合運★★★☆☆恋愛運★★★☆☆仕事運★★★☆☆金財運★★☆☆☆");
			System.out.println("家庭内にトラブル発生！　どうしたらいいのか、家族全員あたふたしてしまいそう。");
			System.out.println("ただ、問題が起こったことでみんなが一致団結。これまでバラバラだった心が一つになるなど、");
			System.out.println("絆を深めることができそう。収束には少し時間を要しますが、協力し合って解決できるはず。");
			System.out.println("相手の言葉をしっかりと聞き、理解するよう心がけましょう。");
		}

		else if(num == 8){
			System.out.println("総合運★★★☆☆恋愛運★★★☆☆仕事運★★★☆☆金財運★☆☆☆☆");
			System.out.println("自分の欲望を満たすためにお金をつかうのではなく、誰かのために、役立つお金の使い方をして。");
			System.out.println("お世話になっている人に贈り物をしたり、ちょこちょこ募金をしたり、");
			System.out.println("共感できるボランティア団体に寄付したり…。後悔なく使うことができるはずです。");
			System.out.println("ただ、ボランティアへの募金に使いすぎないよう注意が必要。");
		}
		else if(num == 9){
			System.out.println("総合運★★★☆☆恋愛運★☆☆☆☆仕事運★★★☆☆金財運★★☆☆☆");
			System.out.println("｢これはこのペースで続いていくはずだ｣と思っていた仕事に、何か変化がありそうな日。");
			System.out.println("しかし、ドンと構えて大丈夫！というのも、一時的には不安定に見えても、");
			System.out.println("さらに発展させていくチャンスになるから。堂々と仕事と向き合えば、充実する1日です。");
			System.out.println("問題が起きた時も冷静に対応すれば、大きくなることはなさそうです。");
		}

		else if(num == 10){
			System.out.println("総合運★★☆☆恋愛運★☆☆☆☆仕事運★★☆☆☆金財運★★☆☆☆");
			System.out.println("自分ではかわいいわがままのつもりが、相手にとっては大迷惑…ということがちょこちょこありそう。");
			System.out.println("今日は、自分を抑えて何事も他人に譲ってしまうこと。大きなトラブルを招かないためにも、");
			System.out.println("主張しないことが一番です。");
			System.out.println("相手の表情を読み取るようにしましょう。");
		}

		else if(num == 11){
			System.out.println("総合運★☆☆☆☆恋愛運★★☆☆☆仕事運★☆☆☆☆金財運★☆☆☆☆");
			System.out.println("焦って答えを出す必要はなしチャンスが舞い込んできそうです。驚くほどの大役もあれば、ボランティア的な");
			System.out.println("役割のものもあるでしょう。かし慎重になる必要があります。どんなに魅力的に見えるものでも、");
			System.out.println("あとで期待はずれだったと感じるものが混じっているかもしれません。");
			System.out.println("プライドを満たすことだけを考えていないか、自分がどうしたいかをじっくり考えてから決断しましょう。");
			System.out.println("決断は慎重に。あなたの今後を変える出来事かも？");
		}

		else if(num == 12){
			System.out.println("総合運★☆☆☆☆恋愛運★☆☆☆☆仕事運★☆☆☆☆金財運★☆☆☆☆");
			System.out.println("どうでもいいことがきっかけとなって、親やきょうだいなど、身内と大ゲンカしちゃいそう。");
			System.out.println("長引くのは必至。もしかしたら断絶の可能性も…。たとえ納得いかなくても、今後のことを考えたら");
			System.out.println("自分から譲歩するべき。面と向かうのがイヤなら、手紙などで気持ちを伝えて。");
			System.out.println("長引いてしまうとどんどん伝えにくくなってしまうので早急に解決するようにしましょう。");
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
