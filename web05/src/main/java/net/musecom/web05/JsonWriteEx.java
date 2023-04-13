package net.musecom.web05;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class JsonWriteEx {
	public void jsonIn(String uname, String age, String chari) {
		JSONObject obj = new JSONObject();
		obj.put("uname", uname);
		obj.put("age", age);
		obj.put("chari", chari);
		
		try {
			FileWriter writer = new FileWriter("c://Users/i7E--047/Desktop/java/json/data.json",true);
			writer.write(obj.toString());
			writer.flush();  //남아있는 메모리 정리
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
