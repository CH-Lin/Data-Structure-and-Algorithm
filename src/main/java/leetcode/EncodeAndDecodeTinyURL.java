package leetcode;

import java.util.HashMap;

public class EncodeAndDecodeTinyURL {

	HashMap<String, String> map = new HashMap<String, String>();

	// Encodes a URL to a shortened URL.
	public String encode(String longUrl) {
		int val = longUrl.hashCode();
		String hex = Integer.toHexString(val);
		map.put(hex, longUrl);
		return hex;
	}

	// Decodes a shortened URL to its original URL.
	public String decode(String shortUrl) {
		String url = map.get(shortUrl);
		return url;
	}

}
