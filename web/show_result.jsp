<%@page import="java.sql.ResultSet"%>
<%@include file="include/user/user_header.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<br><br><br><br><br>
<h2>Courses</h2>
<sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3307/db_online_exam" user="root" password="password"/>
    <sql:query sql="select * from result_master" var="rs"  />
        <div class="form-group">
            <table class="table table-striped table-condensed table-bordered">
                <thead>
                    <th>Name</th>
                    <th>Course</th>
                    <th>Date</th>
                    <th>Score</th>
                </thead>
                <tbody>
                <core:forEach var="data" items="${rs.rows}">
                    <tr> 
                            <td><core:out value="${data.login_id}"></core:out></td>
                            <td><core:out value="${data.course}"></core:out></td>
                            <td><core:out value="${data.date}"></core:out></td>
                            <td><core:out value="${data.total}"></core:out></td>
                    </tr>
                </core:forEach>
                </tbody>
            </table>
        </div>
    <%@include file="include/user/user_footer.jsp" %>  
    
    
