<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/resources/layout/header.jsp"%>
<body>
	<table>
		<tr>
			<th>NO</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
		</tr>
		<c:forEach var="lectureroom" items="${lectureroomList}" varStatus="loop">
			<tr>
				<td>${lectureroom.LectureroomId}</td>
				<td>${lectureroom.LectureroomTitle}</td>
				<td>${lectureroom.LectureroomMentor}</td>
				<td>${lectureroom.LectureroomRegdate}</td>
			</tr>
		</c:forEach>
	</table>
	
	<a href="<c:url value="/lectureroom/write"/>">글쓰기</a>

</body>








<%@ include file="/resources/layout/footer.jsp"%>

</html>
