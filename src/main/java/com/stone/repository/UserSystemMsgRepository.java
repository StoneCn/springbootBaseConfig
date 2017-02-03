package com.stone.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.stone.entity.UserSystemMsg;



/** 
* @author 作者 stone: 
* @version 创建时间：2016年12月28日 下午4:30:29 
* 
*/
public interface UserSystemMsgRepository extends CrudRepository<UserSystemMsg, String> {
	
	
	/**
	 * 查询某用户所有的系统消息使用分页
	 * @author stone
	 * @param userId
	 * @return
	 */
	@Query("select usm from UserSystemMsg usm where usm.userId = ?1")
	List<Object> getSystemMsgs(String userId,Pageable pageAble);
	/**
	 * 
	 * @author stone
	 * @param userId
	 * @param pageAble
	 * @return
	 */
	@Query("select usm from UserSystemMsg usm where usm.userId = ?1 order by usm.status,usm.createTime desc")
	List<UserSystemMsg> getSystemMsgs(String userId);
	
	/**
	 * 更改消息状态
	 * @author stone
	 * @param userId
	 */
	@Transactional
	@Modifying
	@Query("update UserSystemMsg set status = 1 where uid in (?1)")
	void updateMsgStatus(List<String> uid);

	/**
	 * 删除部分系统消息
	 * @author stone
	 * @return
	 */
	@Transactional
	@Modifying
	@Query("delete from UserSystemMsg where uid in (?1)")
	void deleteMsg(List<String> uid);

	/**
	 * 清空某用户的所有消息
	 * @author stone
	 * @param userId
	 */
	@Transactional
	@Modifying
	@Query("delete from UserSystemMsg where userId = ?1")
	void cleanMsg(String userId);
	
	//将某用户的所有的系统消息置为已读
	@Transactional
	@Modifying
	@Query("update UserSystemMsg set status = 1 where userId = ?1")
	void updateMsgStatusAll(String userId);
	
	
	/**
	 * 删除该用户所有的系统消息
	 * @param userId
	 */
	@Transactional
	@Modifying
	@Query("delete from UserSystemMsg where userId = ?1")
	void deleteMsgAll(String userId);



}






































