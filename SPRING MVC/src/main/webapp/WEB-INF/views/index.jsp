<html>
    <body>
        <h2>Your details are</h2>
        <%
                String name = (String) request.getAttribute("name");
                String pass = (String) request.getAttribute("pass");
                System.out.println("Inside index: "+name);
                System.out.println("Inside index: "+pass);
        %>
        <p><%=name%> <%=pass%></p>
    </body>
</html>
