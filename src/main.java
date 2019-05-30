import java.util.Map;

public class main {

	public static void main(String[] args) {

		Map<String, String> map = new LruCacheMap<>(10);
		map.put("one", "1st");
		map.put("two", "2nd");
		map.put("three", "3rd");

//		for (String key : map.keySet()) {
//			System.out.println(key + "=" + map.get(key));
//		}

		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
	}

}
