<%@ include file="/jsps/common/includes.jsp" %>

<a href="<%=request.getContextPath()%>/marketServices/creationView">New Service</a>

<br/>

<table border="1">
    <c:forEach var="service" items="${services}" varStatus="status">
        <tr>
            <td>${status.index + 1}</td>
            <td>${service.name}</td>
            <td>${service.description}</td>
        </tr>
    </c:forEach>
</table>