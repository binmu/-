package homeworkAugust.august_8_9.show;

import java.util.Scanner;

import homeworkAugust.august_8_9.control.ReadUserProperties;
import homeworkAugust.august_8_9.control.SaveUser;
import homeworkAugust.august_8_9.control.UserSys;
import homeworkAugust.august_8_9.entity.User;


public class UserLogin {

	public static void main(String[] args) {
		UserSys userSys = new UserSys();
		Scanner sc = new Scanner(System.in);
		User tempUser = null;
		boolean flag = true;
		while(flag) {
			System.out.print("«Î ‰»Î”√ªßID£∫");
			int tempId = sc.nextInt();
			tempUser = userSys.findUserByUserId(tempId);
			flag = tempUser == null;
		}
		int count = 0;
		while(count<3) {
			System.out.print("«Î ‰»Î√‹¬Î£∫");
			String tempPassword = sc.next();
			if(tempUser.getUserPassword().equals(tempPassword)) {		
				new ReadUserProperties().readUserProperties();
				new SaveUser().saveUserDat(tempUser);
				System.out.println("µ«¬º≥…π¶");
				System.out.println(tempUser.toString());
				return;
			}else {	
				System.out.println("’À∫≈√‹¬Î¥ÌŒÛ£°£°£°«Î÷ÿ–¬ ‰»Î£°");
				count++;
			}
		}
		if(count == 3) {
			System.out.println("ƒ˙“— ‰¥Ì»˝¥Œ√‹¬Î£°£°£°’Àªß∂≥Ω·£°");
		}
	}
}

