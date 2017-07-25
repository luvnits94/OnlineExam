<%@page import="java.sql.ResultSet"%>
<%@include file="include/admin/admin_header.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<br><br><br><br><br>
<h2>Courses</h2>
    <sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3307/db_online_exam" user="root" password="password"/>
    <sql:query sql="select * from course_master" var="rs"/>
        <div class="form-group">
            <table class="table table-striped table-condensed table-bordered">
                <thead>
                <th>Course</th>
                <th>Course Description</th>
                </thead>
                <tbody>
                <core:forEach var="data" items="${rs.rows}">
                    <tr> 
                            <td><core:out value="${data.course}"></core:out></td>
                            <td><core:out value="${data.course_desc}"></core:out></td>
                            <form action="DeleteCourseServlet">
                                <td><button class="btn btn-danger" type="submit" name="btn_del" value="<core:out value="${data.course}"></core:out>">Delete</button></td>
                            </form>
                            <form action="#">
                            <td><button class="btn btn-primary" type="submit" name="btn_edit" value="<core:out value="${data.course}"></core:out>">Edit</button></td>
                            </form>
                    </tr>
                </core:forEach>
                </tbody>
            </table>
        </div>





















                    
                    
<%@include file="include/admin/admin_footer.jsp" %>  
    
    
