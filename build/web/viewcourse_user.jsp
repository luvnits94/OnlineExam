<%@page import="java.sql.ResultSet"%>
<%@include file="include/user/user_header.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<br><br><br><br><br>
<h2>Courses</h2>
<sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3307/db_online_exam" user="root" password="password"/>
    <sql:query sql="select * from course_master" var="rs"  />
        <div class="form-group">
            <table class="table table-striped table-condensed table-bordered">
                <thead>
                <th>Course</th>
                <th>Course Description</th>
                <th>Enrollment Options</th>
                <th>Approval Status</th>
                <th>Exam Status</th>
                </thead>
                <tbody>
                    
                    
                <core:forEach var="data" items="${rs.rows}">
                    <tr> 
                            <td><core:out value="${data.course}"></core:out></td>
                            <td><core:out value="${data.course_desc}"></core:out></td>
                            
                            <sql:query sql="select exam_status,approval_status from user_course_mapping where login_id=? and course=?" var="rs1">
                                <sql:param value = "${sessionScope.username}" />
                                <sql:param value="${data.course}" />
                            </sql:query>
                            <core:choose>
                                
                                
                                
                                <core:when test="${rs1.getRowCount()>0}">
                                    <!core:when test="${data2.approval_status.equals("Approved")==true}">
                                        
                                    <!Cancel Course >
                                    
                                    
                                        <form action="RequestCancellationServlet">
                                        <td><button class="btn btn-danger" type="submit" name="btn_unroll" value="<core:out value="${data.course}"></core:out>">Cancel Course</button></td>
                                        </form>
                                        <core:forEach var="data2" items="${rs1.rows}">
                                            <td><core:out value="${data2.approval_status}"></core:out></td>
                                            <td><core:out value="${data2.exam_status}"></core:out>
                                            
                                            <!core:set var="blank" value="-" />
                                            <core:if test="${data2.exam_status eq 'Not Appeared'}">
                                                <form action="appear_exam.jsp">
                                                    <button class="btn btn-success" type="submit" name="btn_apply_exam" value="<core:out value="${data.course}"></core:out>">Appear Now</button>
                                                </form>
                                            </core:if>
                                            <!core:set var="blank" value="Appeared" />
                                            
                                            <core:if test="${data2.exam_status eq 'Appeared'}">
                                                <form action="show_result.jsp">
                                                    <button class="btn btn-success" type="submit" name="btn_apply_exam" value="<core:out value="${data.course}"></core:out>">View Result</button>
                                                </form>
                                            </core:if>
                                            
                                                    </td>
                                                    
                                        </core:forEach>
                                    <!core:when>    
                                </core:when>
                                <core:otherwise>
                                    <form action="EnrollCourseServlet">
                                        <td><button class="btn btn-primary" type="submit" name="btn_enroll" value="<core:out value="${data.course}"></core:out>">Enroll</button></td>
                                    </form>
                                    <td>-</td>
                                    <td>-</td>
                                </core:otherwise>
                            </core:choose>
                            <core:forEach var="data" items="${rs1.rows}">
                            </core:forEach>
                    </tr>
                </core:forEach>
                </tbody>
            </table>
        </div>
    <%@include file="include/user/user_footer.jsp" %>  
    
    
