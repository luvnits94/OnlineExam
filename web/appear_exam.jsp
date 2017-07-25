<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@include file="include/exam/user_header.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<br>
<sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3307/db_online_exam" user="root" password="password"/>
    <sql:query sql="select * from question_master where course = ? order by rand() limit ? "  var="rs">
        <sql:param value="${param.btn_apply_exam}" />    
        <sql:param value="${no_of_qs}" />    
    </sql:query>
    <core:out value="${requestScope.btn_apply_exam}"></core:out>
        <div class="container">
            <form class="form-group" action="ResultCal">
            <core:set var="i" value="1"></core:set>
                <h2>Examination</h2>
                <h2>Course: <core:out value="${param.btn_apply_exam}"/></h2>
                <%
                    ArrayList a = new ArrayList();
                %>
                <core:forEach var="data" items="${rs.rows}">
                    <h3>Question <core:out value="${i}"/>: <core:out value="${data.question}"/></h3>
                    <div class="radio">
                        <label><input type="radio" name="qs<core:out value="${i}"/>"value="<core:out value="${data.op1}"/>" /><core:out value="${data.op1}"/></label>
                    </div>
                    <div class="radio">
                        <label><input type="radio" name="qs<core:out value="${i}"/>"value="<core:out value="${data.op2}"/>"  /><core:out value="${data.op2}"/></label>
                    </div>
                    <div class="radio">
                        <label><input type="radio" name="qs<core:out value="${i}"/>"value="<core:out value="${data.op3}"/>" /><core:out value="${data.op3}"/></label>
                    </div>
                    <div class="radio">
                        <label><input type="radio" name="qs<core:out value="${i}"/>"value="<core:out value="${data.op4}"/>" /><core:out value="${data.op4}"/></label>
                    </div>
                        <core:set var="ans" value="${data.ans}"/>
                    <%
                        a.add((String)pageContext.getAttribute("ans"));
                        out.println("Answer:"+(String)(pageContext.getAttribute("ans")+" "+a.get(0)));
                        session.setAttribute("ans_list", a);
                    %>
                    <core:set var="i" value="${i+1}"/>
                </core:forEach>
                    <input type="submit" class="btn-success form-control" value="Finish Exam" />
            </form>
        </div>
    <%@include file="include/exam/user_footer.jsp" %>  

