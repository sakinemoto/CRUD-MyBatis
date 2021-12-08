package com.example.domain.user.service;

import java.util.List;

import com.example.domain.user.model.MUser;

public interface UserService {

	/** ユーザー登録 */
	public void signup(MUser user);

	/** ユーザー取得 */
	public List<MUser> getUsers(MUser user);

	/** ユーザー取得（1件） */
	public MUser getUserOne(Integer userId);

	/** ユーザー更新1件 */
	public void updateUserOne(Integer userId, String password, String userName, String email);

	/** ユーザー削除 */
	public void deleteUserOne(Integer userId);

}
