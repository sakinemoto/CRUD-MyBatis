package com.example.domain.user.service.impla;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.user.model.MUser;
import com.example.domain.user.service.UserService;
import com.example.repository.UserMapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper mapper;

	/** ユーザー登録 */
	@Override
	public void signup(MUser user) {
		user.setDepartmentId(1); // 部署
		user.setRole("ROLE_GENERAL");// ロール
		mapper.insertOne(user);
	}

	/** ユーザー取得 */
	@Override
	public List<MUser> getUsers(MUser user) {
		return mapper.findMany(user);
	}

	/** ユーザー取得（1件） */
	@Override
	public MUser getUserOne(Integer UserId) {
		return mapper.findOne(UserId);
	}

	/** ユーザー更新1件 */
	@Override
	public void updateUserOne(String password, String userName, String email) {
		mapper.updateOne(password, userName, email);
	}

	/** ユーザー削除1件 */
	@Override
	public void deleteUserOne(Integer userId) {
		mapper.deleteOne(userId);
	}

}
