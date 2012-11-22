<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/jsps/common/includes.jsp" %>

<table>
    <tr>
        <td>
            Operators:
        </td>
        <td>&nbsp;&nbsp;&nbsp;
            Services:
        </td>
    </tr>
    <tr>
        <td>
            <select id="operators" name="operators">
                <c:forEach items="${operators}" var="item">
                    <option label="${item.id}">${item.name}</option>
                </c:forEach>
            </select>
        </td>
        <td>&nbsp;&nbsp;&nbsp;
            <select multiple="multiple" size="5" id="tServices" name="tServices">
                <c:forEach items="${tServices}" var="item">
                    <option label="${item.id}">${item.name}</option>
                </c:forEach>
            </select>
        </td>
        <td> &nbsp;&nbsp;&nbsp;
            <div class="buttonwrapper" style="padding: 0 0 0 20px">
                <a id="addLink" class="ovalbutton" href="<%=request.getContextPath()%>/mapping/addtServ2Operator"><span>Add</span></a>
            </div>
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
                    <td>${item.tsrv.name}</td>
                    <td> -> </td>
                    <td>${item.operator.name}</td>
                    <td width="25px">
                        <a class="deleteLink" href="<%=request.getContextPath()%>/mapping/telecomServ2Operator/rm/${item.tsrv.id}/${item.operator.id}" onclick="return confirm('Do you really want to delete item?')"/>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    </tr>
</table>