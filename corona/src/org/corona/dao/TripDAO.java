package org.corona.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.corona.util.SqlSessionUtil;
import org.corona.vo.PageVO;
import org.corona.vo.Trip;

public class TripDAO {
   public static List<Trip> selectList(PageVO pageVO) {
      SqlSession session = null;
      
      try {
         session = SqlSessionUtil.getSession();
    	 return session.selectList("trips.selectList",pageVO);
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         if(session!=null) {
            session.close();
         }
      }//try~catch~finally end
      return null;
   }//selectList();
   
   public static Trip selectOne(int no) {
      SqlSession session = null;
      try {
         session = SqlSessionUtil.getSession();
         return session.selectOne("trips.selectOne",no);
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         if(session!=null) {
            session.close();
         }
      }//try~catch~finally end
      return null;
   }//selectList();
   
   public static int selectTotal() {
      SqlSession session = null;
      try {
         session = SqlSessionUtil.getSession();
         return session.selectOne("trips.selectTotal");
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         if(session!=null) {
            session.close();
         }
      }//try~catch~finally end
      return -1;
   }//selectList();
   
   public static int delete(int no) {
      
      SqlSession session = null;
      try {
         session = SqlSessionUtil.getSession();
         return session.delete("trips.delete",no);
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         if(session!=null) {
            session.close();
         }
      }//try~catch~finally end
      
      return -1;
   }
   
   public static int insert(Trip trip) {
	      
	      SqlSession session = null;
	      try {
	         session = SqlSessionUtil.getSession();
	         return session.insert("trips.insert",trip);
	      }catch(Exception e) {
	         e.printStackTrace();
	      }finally {
	         if(session!=null) {
	            session.close();
	         }
	      }//try~catch~finally end
	      
	      return -1;
	   }
   
   public static int update(Trip trip) {
	      
	      SqlSession session = null;
	      try {
	         session = SqlSessionUtil.getSession();
	         return session.update("trips.update",trip);
	      }catch(Exception e) {
	         e.printStackTrace();
	      }finally {
	         if(session!=null) {
	            session.close();
	         }
	      }//try~catch~finally end
	      
	      return -1;
	   }
}