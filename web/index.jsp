<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple form</title>
    </head>
    <body>
        <form action="FirstServlet" method="post">
            User Name: <input type="text" name="name">
            Password: <input type="password" name="pass">
            <input type="submit" value="Login">
        </form>
    </body>
</html>
