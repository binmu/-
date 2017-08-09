package homeworkAugust.august_8_9.control;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Properties;

public class ReadUserProperties {

	public void readUserProperties() {
		Properties p = new Properties();
		try {
			p.load(new FileReader("src/user.properties"));
			System.out.println(p.getProperty("userId"));
			String ltr = p.getProperty("last_login_time");
			long lt = Long.parseLong(ltr);
			System.out.println("上次登录时间：");
			System.out.println(new Timestamp(lt));
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
