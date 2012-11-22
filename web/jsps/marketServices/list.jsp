<%@ include file="/jsps/common/includes.jsp" %>

<table id="hor-minimalist-b">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">Name</th>
        <th scope="col">Description</th>
        <th scope="col"></th>
        <th scope="col"></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="service" items="${services}" varStatus="status">
        <tr>
            <td>${status.index + 1}</td>
            <td>${service.name}</td>
            <td>${service.description}</td>
            <td width="25px">
                <a class="editLink" href="<%=request.getContextPath()%>/marketServices/edit/${service.id}"/>
            </td>
            <td width="25px">
                <a class="deleteLink" href="<%=request.getContextPath()%>/marketServices/rm/${service.id}" onclick="return confirm('Do you really want to delete item?')"/>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<div class="buttonwrapper">
    <a class="ovalbutton" href="<%=request.getContextPath()%>/marketServices/creationView"><span>New Service</span></a>
</div>
