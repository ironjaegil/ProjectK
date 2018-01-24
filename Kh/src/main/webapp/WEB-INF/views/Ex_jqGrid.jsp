<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- jstl을사용할수있도록 prefix명칭 적어주면 된다. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 태그에서 앞에 prefix명칭 적어주면 바인딩된다. -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css" media="screen" href="/resources/css/jquery/jquery-ui-1.10.3.custom.min.css"/>
<link rel="stylesheet" type="text/css" media="screen" href="/resources/css/ui.jqgrid.css"/>
<link rel="stylesheet" type="text/css" media="screen" href="/resources/css/jquery-ui.css"/><!-- 추가 -->
 

<script src="/resources/js/jquery-1.11.1.min.js" type="text/javascript"></script> <!-- 버전업 -->
<script src="/resources/js/jquery-ui.js" type="text/javascript"></script> <!-- 추가 -->
<script src="/resources/js/i18n/grid.locale-kr.js" type="text/javascript"></script>
<script src="/resources/js/jquery.jqGrid.min.js" type="text/javascript"></script>

<script>
$(document).ready(function () {
	//컨트롤러의 데이터 가져옴
	var mydata = '${rows}';
	var jsondata = JSON.parse(mydata);
    grid = $("#list");
    
    grid.jqGrid({
        datatype:"local",
        data: jsondata, //mydata를 json데이터로 파싱하여 넣는다.
        colNames:['USER_ID','ID','PWD','NAME','INDATE'], 
        colModel:[
        		{name :'USER_ID',index :'USER_ID',width :100 ,align :'left'						},
        		{name :'ID'		,index :'ID'	 ,width :70	 ,align :'center',sorttype :'int'	},
                {name :'PWD'	,index :'PWD'	 ,width :100 ,align :'left'						},
                {name :'NAME'	,index :'NAME'	 ,width :100 ,align :'left'						},
                {name :'INDATE'	,index :'INDATE' ,width :200 ,align :'left'						}
        ],
        //각 속성들
        rowNum:10,
        rowList:[5,10,20],
        pager: '#pager',
        gridview:true,
        rownumbers:true,
        sortname: 'invdate',
        viewrecords: true,
        sortorder: 'desc',
        caption:'USER_INFO',
        height: '500px'
    });
});
</script>
<title>jqGrid</title>
</head>
<body>
	<!--jqGrid 플러그인을 사하기위한 table 태그와 div태그 사용 -->
    <table id = "list"></table>
    <div id = "pager"></div>
    
    <div></div>
<!--검색 -->
<%-- <form:form id="form" commandName="cmd" action="/grid.do"> --%>
<!--     <table> -->
<!--     	<tr> -->
<!--     	<td>아이디조건</td> -->
<%--     	<td><form:input path="ID" /></td> --%>
<!--     	<td>이름조건</td> -->
<%--     	<td><form:input path="NAME"/></td> --%>
<%--     	<td><form:button onclikc="submit();">검색</form:button></td> --%>
<!--     	</tr> -->
<!--     </table> -->
<%-- </form:form> --%>
<!--리스트테이블 -->
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
            <c:forEach items="${rtnList}" var="member">
                <tr>
                    <td>${member.ID}</td>
                    <td>${member.PWD}</td>
                    <td>${member.NAME}</td>
                    <td>${member.INDATE}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    ${rows}
</body>
</html>



