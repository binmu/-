package homeworkAugust.august_8_9.control;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import homeworkAugust.august_8_9.entity.User;

public class UserProperties {

	public void saveProerties(User user) {
		Properties p = new Properties();
		p.setProperty("userId", ""+user.getUserId());
		p.setProperty("last_login_time", ""+System.currentTimeMillis());
		try {
			FileWriter fw = new FileWriter("src/user.properties");
			p.store(fw, "用户上次登录时间");
			fw.close();
			System.out.println("保存user.properties成功！！！！");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
