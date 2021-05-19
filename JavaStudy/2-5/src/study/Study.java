package study;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * 本課題では、コレクションフレームワークのList系クラスとMap系クラスの基本的な記述を学びましょう。
 * 現場で必ず使用するものなので、ポイントをしっかり押さえておきましょう。
 *
 * 問①〜問③まであります。
 * 問②に関しては、コメントを記述してください。
 *
 */
public class Study {

    public static final String SHOP_SHOHIN_00 = "バナナ";
    public static final String SHOP_SHOHIN_01 = "牛乳";
    public static final String SHOP_SHOHIN_02 = "豚肉";
    public static final String SHOP_SHOHIN_03 = "コロッケ";

    public static void main(String args[]) {

        // ① 定数を全て使って、String型のListを記述してください。 

    	List<String> shohinList = new ArrayList<String>();
    	shohinList.add(SHOP_SHOHIN_00);
    	shohinList.add(SHOP_SHOHIN_01);
    	shohinList.add(SHOP_SHOHIN_02);
    	shohinList.add(SHOP_SHOHIN_03);
        //個人的メモ:①は、要素を一つにまとめた記述
 



        // ② 以下の「shopMap.put(shohinList.get(1), 180);」の処理について、コメントを記述してください。
        /*
         * [仮引数のshohinListの(1)に対して、180を紐付けている記述です。]
         *
         */
        LinkedHashMap<Integer, Integer> shopMap = new LinkedHashMap<Integer, Integer>();
        shopMap.put(0, 125);
        shopMap.put(1, 180);
        shopMap.put(2, 350);
        shopMap.put(3, 100);
        //個人メモ：②は格納された要素にそれぞれ紐付けをしている記述

        // ③ カリキュラムを参考に拡張for文を使って、課題の画像と同じ表示になるよう記述してください。
        // 「shohinList」と「shopMap」が保持する値を上手く利用しましょう。
        
        for (int i = 0; i < shohinList.size(); i++) {
        	System.out.println(shohinList.get(i));
        	
        	if(i == 0) {
        		System.out.println("=" + shopMap.get(0) + "円になります");
        	}else if (i == 1) {
        		System.out.println("=" + shopMap.get(1) + "円になります");
        	}else if (i == 2) {
        		System.out.println("=" + shopMap.get(2) + "円になります");
        	}else {
        		System.out.println("=" + shopMap.get(3) + "円になります");
        	}
        }
    }
}
    