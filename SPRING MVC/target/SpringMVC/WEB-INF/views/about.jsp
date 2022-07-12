<html>
<body>
<h2>About Page

    <%
        String name = (String) request.getAttribute("K");
    %>

    <%= name%>
</h2>

<form action="data" method="post">
    Name :
    <input type="text" placeholder="Enter Name" name="name"><br>
    <input type="password" placeholder="Enter Password" name="pass">
    <button type="submit">Submit</button>
</form>

</body>
</html>
