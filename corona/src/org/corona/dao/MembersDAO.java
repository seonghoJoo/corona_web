package org.corona.dao;

import org.apache.ibatis.session.SqlSession;
import org.corona.util.SqlSessionUtil;
import org.corona.vo.Member;

public class MembersDAO {
   
   public static Member selectLogin(Member member) {
      
      SqlSession session = null;
      try {
         session = SqlSessionUtil.getSession();
         return session.selectOne("members.selectLogin",member);
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         if(session!=null) {
            session.close();
         }
      }//try catch finally end
      
      return null;
   }
   
   public static int insertMember(Member member) {
      SqlSession session = null;
      try {
         session = SqlSessionUtil.getSession();
         return session.insert("members.insertMember",member);
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         if(session!=null) {
            session.close();
         }
      }
      return -1;
   }

}