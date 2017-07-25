<%@include file="include/admin/admin_header.jsp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
    <br><br><br><br>
        <form  action="AddQuestionServlet" >
            <div class="form-group">
                <label for="course">Course Name</label><br/>
                <sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3307/db_online_exam" user="root" password="password"/>
                <sql:query sql="select * from course_master" var="rs"/>
                <select name="course" class="form-control">
                    <core:forEach var="data" items="${rs.rows}">
                        <option value="${data.course}"><core:out value="${data.course}"></core:out></option>
                    </core:forEach>
                </select>
                <input type="text" name="question_name" class="form-control" placeholder="Enter Question Name here" required><br/><br/>
                <input type="text" name="op1" class="form-control" placeholder="Enter Option 1 here" required><br/>
                <input type="text" name="op2" class="form-control" placeholder="Enter Option 2 here" required><br/>
                <input type="text" name="op3" class="form-control" placeholder="Enter Option 3 here" required><br/>
                <input type="text" name="op4" class="form-control" placeholder="Enter Option 4 here" required><br/>
                <label for="ans">Select the Correct Answer</label><br/>
                <select name="ans">
                    <option name="ans" class="form-control" value="1">Option 1</option>
                    <option name="ans" class="form-control" value="2">Option 2</option>
                    <option name="ans" class="form-control" value="3">Option 3</option>
                    <option name="ans" class="form-control" value="4">Option 4</option>
                </select>
                <!input type="text" name="ans" class="form-control" placeholder="Enter Answer here" required><br/>
                <button class="btn btn-success" type="submit" class="form-control" ><span class="glyphicon glyphicon-plus"></span>Add Question</button>
            </div>
        </form>
<%@include file="include/admin/admin_footer.jsp" %>  
