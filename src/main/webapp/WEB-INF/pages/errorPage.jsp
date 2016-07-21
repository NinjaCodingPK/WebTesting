<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
<head>
    <title>Welcome</title>
    <style type="text/css">
        <%@include file="/resources/css/bootstrap.css"%>
    </style>
</head>
<body>
    <div style="border-style:solid; background-color:red; margin: auto;" id="header">
            <div>
                <h2 style="text-align: center; font-size: 3.8vw;">Error</h2>
            </div>
        </div>
        
        <div id="menu-block" style="width: 20%; float: left;">
            <div id="menu" style="border-style:solid">
                    <h3 style="text-align: center; width: 100%; font-size: 2.8vw;">Menu</h3>
            </div>
        </div>
        
        <div id="main" class="container" style="border-style: solid; width: 60%; float: left">
            <h3 style="font-size: 2.8vw;">Error message: </h3>
            <h5 style="font-size: 1.5vw;">${message}</h5>
            <a href="./Controller?command=SHOW_SUBJECT">Show all subjects</a>
        </div> 
</body>
</html>
