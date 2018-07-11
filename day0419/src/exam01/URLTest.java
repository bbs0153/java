package exam01;

import java.net.URL;

public class URLTest {

	public static void main(String[] args) {

		try {
			URL ur1 = new URL("http://www.hanbit.co.kr/store/books/look.php?p_code=B8441457382");

			String host = ur1.getHost();
			String path = ur1.getPath();
			int port = ur1.getPort();
			String protocol = ur1.getProtocol();
			String query = ur1.getQuery();

			System.out.println("host:" + host);
			System.out.println("path:" + path);
			System.out.println("port:" + port);
			System.out.println("protocol:" + protocol);
			System.out.println("query:" + query);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
