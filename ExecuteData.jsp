<%-- 
   3.Assume that a database as a backend to a website exist with a table having fields:
Roll number, Name, Program Code etc. Write JSP code sequence of steps to display the list
of student with program code "BCA".
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      
                    
        <%
          
        Class.forName("com.mysql.jdbc.Driver");
        out.println("Driver loaded Successfully");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Db1", "root","");
        out.println("Connection establish Successfully");
        Statement st =con.createStatement();
        
        ResultSet rs= st.executeQuery("select * from Student");
        while(rs.next()){
        String name=rs.getString("Stu_Name");
        String course=rs.getString("Stu_Course");
    %>
        <table>
            <tr>
                <td><%out.println(name);%></td>
                <td><%out.println(course);%></td>
            </tr>
        </table>
 <%}%>
        
    </body>
</html>
