package homeworkAugust.august_8_9.control;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import homeworkAugust.august_8_9.entity.User;

public class UserSys {

	List<User> user = new ArrayList<User>();
	
	public UserSys() {
		user.add(new User(2014143136,"binlin","bl123"));
	}
	
	public User findUserByUserId(int userId) {
		Iterator<User> it = user.iterator();
		while(it.hasNext()) {
			User tempUser = it.next();
			if(tempUser.getUserId() == userId) {
				return tempUser;
			}
		}
		return null;
	}
}
