package Dictionary_Chapter21.java;
import java.util.HashMap;

public class Dictionary_Chapter21 {

	
	
		//英単語辞書を作成
		HashMap<String,String>Dictionary = new HashMap<String,String>();
		
		public Dictionary_Chapter21() {
		
		//英単語と意味を追加
		Dictionary.put("apple","りんご");
		Dictionary.put("peach","桃");
		Dictionary.put("banana","バナナ");
		Dictionary.put("lemon","レモン");
		Dictionary.put("pear","梨");
		Dictionary.put("kiwi","キウィ");
		Dictionary.put("strawberry","いちご");
		Dictionary.put("grape","ぶどう");
		Dictionary.put("muscat","マスカット");
		Dictionary.put("cherry","さくらんぼ");
		
		
	}
		
	public void search (String[]word) {
		for(int i = 0;i<word.length;i++) {
			if(Dictionary.get(word[i])!=null){
				System.out.println(word[i]+"の意味は"+Dictionary.get(word[i]));
			}else {
				System.out.println(word[i]+"は存在しません");
		
				
						
			}
		}
	}
					
		
	
		
	}

