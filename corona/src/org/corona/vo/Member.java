package org.corona.vo;

import java.sql.Timestamp;

public class Member {
   private int no;
   private String id,password,nickname;
   private Timestamp regdate;
   private String profileImage;
   public Member() {
      
   }
   public Member(String id, String password) {
      this.id = id;
      this.password = password;
   }
   public Member(String id, String password,String nickname) {
      this.id = id;
      this.password = password;
      this.nickname = nickname;
   }
   public Member(int no, String id, String password, String nickname, Timestamp regdate, String profileImage) {
      this.no = no;
      this.id = id;
      this.password = password;
      this.nickname = nickname;
      this.regdate = regdate;
      this.profileImage = profileImage;
   }
   public int getNo() {
      return no;
   }
   public void setNo(int no) {
      this.no = no;
   }
   public String getId() {
      return id;
   }
   public void setId(String id) {
      this.id = id;
   }
   public String getPassword() {
      return password;
   }
   public void setPassword(String password) {
      this.password = password;
   }
   public String getNickname() {
      return nickname;
   }
   public void setNickname(String nickname) {
      this.nickname = nickname;
   }
   public Timestamp getRegdate() {
      return regdate;
   }
   public void setRegdate(Timestamp regdate) {
      this.regdate = regdate;
   }
   public String getProfileImage() {
      return profileImage;
   }
   public void setProfileImage(String profileImage) {
      this.profileImage = profileImage;
   }
}