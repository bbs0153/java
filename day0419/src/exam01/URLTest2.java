package exam01;

import java.io.InputStream;
import java.net.URL;

public class URLTest2 {

	public static void main(String[] args) {

		try {
			URL ur1 = new URL("http://www.hanbit.co.kr/store/books/look.php?p_code=B8441457382");

			InputStream is = ur1.openStream();
			int ch;
			while ((ch = is.read()) != -1) {

				System.out.print((char) ch);
			}

			is.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
