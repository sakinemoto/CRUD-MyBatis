package com.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.domain.user.model.MUser;

@Mapper
public interface UserMapper {
	// インターフェースに＠MapperアノテーションをつけることでMyBatisでリポジトリー作成できる
	/** ユーザー登録 */
	public int insertOne(MUser user);

	// select文の実行結果が複数件になる場合、メソッドの戻り値をListにする
	// **ユーザー取得*/
	public List<MUser> findMany(MUser user);

	// **ユーザー１件取得*/
	public MUser findOne(Integer userId);

	/** ユーザー更新（1件） */
	public void updateOne(@Param("userId") Integer userId, @Param("password") String password,
			@Param("userName") String userName);

	/** ユーザー削除（1件） */
	public int deleteOne(@Param("userId") Integer useId);


}
