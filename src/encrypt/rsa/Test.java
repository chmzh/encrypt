package encrypt.rsa;

import java.util.Map;

public class Test {
	public static void main(String[] args) {
		//System.out.println(-2>>>4);
		
//		for (int i = 10001; i <= 10053; i++) {
//			System.out.println("imgs.put("+i+",R.drawable.h"+i+");");
//		}
		
		String body = "<img src='abc' height=1 width=1 >";
		body = body.replaceAll("(<img[^>]*?)\\s+width\\s*=\\s*\\S+", "$1");
		
		System.out.println(body);
		
		Map<String,String> envs = System.getenv();
		
		for(Map.Entry<String, String> entry:envs.entrySet()){
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
	}
	
	
	
	
}
