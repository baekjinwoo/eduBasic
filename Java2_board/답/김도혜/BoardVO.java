package vo;

public class BoardVO {
	private int seq;
	private String title;
	private String contents;
	private String writer;
	private String time;
	private String pw;
	private int viewcount;
	
	public BoardVO(){
		
	}

	public BoardVO(int seq, String title, String writer) {
		super();
		this.seq = seq;
		this.title = title;
		this.writer = writer;
	}

	public BoardVO(int seq, String title, String contents, String writer, String pw) {
		super();
		this.seq = seq;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.pw = pw;
	}

	public BoardVO( String title, String contents, String writer, String pw) {
		super();
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.pw = pw;
	}

	public BoardVO(int seq, String title, String contents, String writer, String time, String pw, int viewcount) {
		super();
		this.seq = seq;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.time = time;
		this.pw = pw;
		this.viewcount = viewcount;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getViewcount() {
		return viewcount;
	}

	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}

	@Override
	public String toString() {
		return "[seq=" + seq + ", title=" + title + ", contents=" + contents + ", writer=" + writer + ", time="
				+ time + ", viewcount=" + viewcount + "]";
	}
	
	
	
}
