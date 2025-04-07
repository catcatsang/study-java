package com.app.domain.vo;

import java.util.Objects;

public class ReplyVO {
	private String updated;
	private Long id;
	private String replyContent;
	private Long postId;
	private Long memberId;
	private String created;
	
	
	public ReplyVO() {;}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	public Long getPostId() {
		return postId;
	}
	public void setPostId(Long postId) {
		this.postId = postId;
	}
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getUpdated() {
		return updated;
	}
	public void setUpdated(String updated) {
		this.updated = updated;
	}
	public ReplyVO(Long id, String replyContent, Long postId, Long memberId, String created, String updated) {
		super();
		this.id = id;
		this.replyContent = replyContent;
		this.postId = postId;
		this.memberId = memberId;
		this.created = created;
		this.updated = updated;
	}
	@Override
	public String toString() {
		return "ReplyVO [id=" + id + ", replyContent=" + replyContent + ", postId=" + postId + ", memberId=" + memberId
				+ ", created=" + created + ", updated=" + updated + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReplyVO other = (ReplyVO) obj;
		return Objects.equals(id, other.id);
	}
}
