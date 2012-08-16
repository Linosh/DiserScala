<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<table>
    <c:forEach var="service" items="services">
        <tr>
            <td>${service.id}</td>
            <td>${service.name}</td>
            <td>${service.description}</td>
        </tr>
    </c:forEach>
</table>