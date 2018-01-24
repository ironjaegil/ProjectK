<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Home</title>
</head>
<body>
    <h1>Spring TEST</h1>
    <table>
        <thead>
            <tr>
                <th>아이디</th>
                <th>비밀번호</th>
                <th>이름</th>
                <th>생성일자</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${memberList}" var="member">
                <tr>
                    <td>${member.ID}</td>
                    <td>${member.PWD}</td>
                    <td>${member.NAME}</td>
                    <td>${member.INDATE}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
 


