<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/jsps/common/includes.jsp" %>

<table>
    <tr>
        <td>
            Operators
        </td>
        <td>
            Services
        </td>
    </tr>
    <tr>
        <td>
            <select>
                <c:forEach items="${operators}" var="item">
                    <option label="${item.id}">${item.name}</option>
                </c:forEach>
            </select>
        </td>
        <td>
            <select multiple>
                <c:forEach items="${tServices}" var="item">
                    <option label="${item.id}">${item.name}</option>
                </c:forEach>
            </select>
        </td>
    </tr>
    <tr>

        <table id="hor-minimalist-b">
            <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Telecom Service</th>
                <th scope="col">Operator</th>
                <th scope="col"></th>
                <th scope="col"></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="item" items="${map}" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${item.tSrv.name}</td>
                    <td>${item.operator.name}</td>
                    <td width="25px">
                        <a class="editLink" href="<%=request.getContextPath()%>/marketServices/edit/${item.tSrv.id}/${item.operator.id}"/>
                    </td>
                    <td width="25px">
                        <a class="deleteLink" href="<%=request.getContextPath()%>/marketServices/rm/${item.tSrv.id}/${item.operator.id}" onclick="return confirm('Do you really want to delete item?')"/>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    </tr>
</table>