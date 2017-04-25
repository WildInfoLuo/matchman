package com.wild.mapper.message;

import java.util.List;

import com.wild.entity.message.IInformation;
import com.wild.entity.message.MComment;
import com.wild.entity.message.MMessage;
import com.wild.entity.message.MMessageCommentRelation;

public interface MCommentMapper {

	/**
	 * 根据公开消息ID查询该消息的评论
	 * 
	 * @return
	 */
	public List<MComment> getComments(IInformation information);

	/**
	 * 插入评论
	 * 
	 * @param comment
	 * @return
	 */
	public int insertComment(MComment comment);

	/**
	 * 插入消息评论关系表
	 * 
	 * @param mcr
	 * @return
	 */
	public int insertIMC(MMessageCommentRelation mcr);

	/**
	 * 插入热点
	 * 
	 * @param message
	 * @return
	 */
	public int insertMessage(MMessage message);

	/**
	 * 根据热点id查询热点详情
	 * 
	 * @param message
	 * @return
	 */
	public List<MMessage> selectMessage(MMessage message);

}