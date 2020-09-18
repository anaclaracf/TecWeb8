<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
    <body>
        A sua idade é de ${ param.idade *365} dias.
        <br>
        Você está ${ param.idade >40?"velho":"novo" }
    </body>
</html>