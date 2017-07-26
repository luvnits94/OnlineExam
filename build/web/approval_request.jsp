<%@page import="java.sql.ResultSet"%>
<%@include file="include/admin/admin_header.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<br><br><br><br><br>
<h2>Course Approval Requests</h2>
<sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3307/db_online_exam" user="root" password="password"/>
    <sql:query sql="select * from user_course_mapping where approval_status =?" var="rs">
        <sql:param value="Waiting for Course Approval">
        </sql:param>
    </sql:query>
        <div class="form-group">
            <table class="table table-striped table-condensed table-bordered">
                <thead>
                <th>User Name</th>
                <th>Course</th>
                <th>Approval Operations</th>
                <th>Approval Status</th>
                </thead>
                <tbody>
                <core:forEach var="data" items="${rs.rows}">
                    <tr> 
                            <td><core:out value="${data.login_id}"></core:out></td>
                            <td><core:out value="${data.course}"></core:out></td>

                            <form action="CourseApprovalServlet" class="form-group">
                                <td><button class="btn btn-success form-control" type="submit" name="btn_approve_course" value="<core:out value="${data.course}"></core:out>"><span class="glyphicon glyphicon-ok"></span> Approve Now</button></td>
                                <td><input type="hidden" name="approve_user" class="form-control" value="${data.login_id}" /></td>
                            </form>
                            <td><core:out value="${data.approval_status}"></core:out></td>
                    </tr>
                </core:forEach>
                </tbody>
            
            </table>
            <sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3307/db_online_exam" user="root" password="password"/>
            <sql:query sql="select * from user_course_mapping where approval_status =?" var="rs1">
                <sql:param value="Waiting for Cancellation Approval">
                </sql:param>
            </sql:query>
            <h2>Cancel Course Requests</h2>
            <table class="table table-striped table-condensed table-bordered">
                <thead>
                <th>User Name</th>
                <th>Course</th>
                <th>Approval Operations</th>
                <th>Approval Status</th>
                </thead>
                <tbody>
                <core:forEach var="data1" items="${rs1.rows}">
                    <tr> 
                            <td><core:out value="${data1.login_id}"></core:out></td>
                            <td><core:out value="${data1.course}"></core:out></td>

                            <form action="CancelCourseServlet" class="form-group">
                                <td><button class="btn btn-success form-control" type="submit" name="btn_approve_course" value="<core:out value="${data1.course}"></core:out>"><span class="glyphicon glyphicon-ok"></span> Approve Now</button></td>
                                <td><input type="hidden" name="approve_user" class="form-control" value="${data1.login_id}" /></td>
                            </form>
                            <td><core:out value="${data1.approval_status}"></core:out></td>
                    </tr>
                </core:forEach>
                </tbody>
            </table>
        </div>





















                    
                    
    <%@include file="include/admin/admin_footer.jsp" %>  
    
    
