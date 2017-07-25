<%@include file="include/admin/admin_header.jsp" %>
        <br><br><br><br>
        <form  action="AddCourseServlet" >
            <div class="form-group">
                <label for="course_name">Course Name</label><br/>
                <input type="text" name="course_name" class="form-control" placeholder="Enter Course Name here" required><br/><br/>
                <label for="course_desc">Course Description</label><br/>
                <input type="text" name="course_desc" class="form-control" placeholder="Enter Course Description here" required><br/><br/>
                <button class="btn btn-success" type="submit" class="form-control" ><span class="glyphicon glyphicon-plus"></span>Add Course</button>
            </div>
        </form>
<%@include file="include/admin/admin_footer.jsp" %>  
    
    
