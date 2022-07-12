<html>
    <body>
        <h2>All About

            <%
                String name = (String) request.getAttribute("K"); // This value comes from the controller
            %>

            <%= name%>
        </h2>

        <form action="data" method="post">
            Name :
            <input type="text" placeholder="Enter Name" name="name"><br>
            Password :
            <input type="password" placeholder="Enter Password" name="pass"><br>
            <button type="submit">Submit</button>
        </form>

    </body>
</html>
