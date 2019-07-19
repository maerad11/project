package spring.entity;

public class MemoDto {
	private String when;
	private String content;
	@Override
	public String toString() {
		return "MemoDto [when=" + when + ", content=" + content + "]";
	}
	public MemoDto() {
		super();
	}
	public String getWhen() {
		return when;
	}
	public void setWhen(String when) {
		this.when = when;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
