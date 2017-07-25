package com.exam.session;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpSession;
public class Session {
    public static int sessionUpdate(Connection con,String login_id,int session_info,String session_id){
        int status = -1;
        PreparedStatement st = null;
        try {
            st = con.prepareStatement("update login_master set session_info = ? , session_id = ? where login_id = ?");
            st.setInt(1,session_info);
            st.setString(3,login_id);
            st.setString(2,session_id);
            status = st.executeUpdate();
        } 
        catch (SQLException ex) {
            System.err.println(ex);
        }
        finally{
            return status;    
        }
    }
    public static int sessionGet(Connection con,String login_id,String session_id){
        int status = -1;
        PreparedStatement st = null;
        try {
            st = con.prepareStatement("select * from login_master where login_id = ?");
            st.setString(1,login_id);
            ResultSet rs  = st.executeQuery();
            if(rs.next()){
                if(rs.getInt(3) == 1 && rs.getString(4).equals(session_id))
                {
                    return 1;
                }
                else{
                    return -1;
                }
            }
            else{
                return -1;
            }
        } 
        catch (SQLException ex) {
            System.err.println(ex);
            return -1;
        }
    }
}
