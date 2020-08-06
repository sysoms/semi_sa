package mvc.vo;

//보드 테이블 VO
public class BoardVO {

   private int board_writer_num , board_num;
   private String board_title , board_content , board_img , board_date , board_like_userid;
   private String search_option, keyword;
private int maxnum;
   
//댓글
private int cm_num,cm_user_num;
private String cm_content;   




   public int getCm_num() {
	return cm_num;
}
public void setCm_num(int cm_num) {
	this.cm_num = cm_num;
}
public int getCm_user_num() {
	return cm_user_num;
}
public void setCm_user_num(int cm_user_num) {
	this.cm_user_num = cm_user_num;
}
public String getCm_content() {
	return cm_content;
}
public void setCm_content(String cm_content) {
	this.cm_content = cm_content;
}
public int getMaxnum() {
	return maxnum;
}
public void setMaxnum(int maxnum) {
	this.maxnum = maxnum;
}
   
   
   public int getBoard_writer_num() {
      return board_writer_num;
   }
   public void setBoard_writer_num(int board_writer_num) {
      this.board_writer_num = board_writer_num;
   }
   public int getBoard_num() {
      return board_num;
   }
   public void setBoard_num(int board_num) {
      this.board_num = board_num;
   }
   public String getBoard_title() {
      return board_title;
   }
   public void setBoard_title(String board_title) {
      this.board_title = board_title;
   }
   public String getBoard_content() {
      return board_content;
   }
   public void setBoard_content(String board_content) {
      this.board_content = board_content;
   }
   public String getBoard_img() {
      return board_img;
   }
   public void setBoard_img(String board_img) {
      this.board_img = board_img;
   }
   public String getBoard_date() {
      return board_date;
   }
   public void setBoard_date(String board_date) {
      this.board_date = board_date;
   }
   public String getBoard_like_userid() {
      return board_like_userid;
   }
   public void setBoard_like_userid(String board_like_userid) {
      this.board_like_userid = board_like_userid;
   }
public String getKeyword() {
	return keyword;
}
public void setKeyword(String keyword) {
	this.keyword = keyword;
}
public String getSearch_option() {
	return search_option;
}
public void setSearch_option(String search_option) {
	this.search_option = search_option;
} 
}