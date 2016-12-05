<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<div>
    <%= request.getAttribute("message")%>
</div>
<div>
    <span>
        My Book System
    </span>
    <form action="login" method="post">
        <div>
            <label>Username</label>
            <input type="text" name="userName">
        </div>
        <div>
            <label >Password</label>
            <input type="password" name="passWord">
        </div>
        <button type="submit">Login</button>
    </form>
</div>
</body>
</html>