package homeworkAugust.august_8_9.control;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import homeworkAugust.august_8_9.entity.User;


public class SaveUser {
	public void saveUserDat(User user) {	
		try {
			FileOutputStream fos = new FileOutputStream("src/user.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(user);
			oos.close();
			System.out.println("±£´æuser.dat³É¹¦£¡£¡£¡");
			new UserProperties().saveProerties(user);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
