<%@ include file="/jsps/common/includes.jsp" %>

<form:form modelAttribute="service" action="${pageContext.request.contextPath}/marketServices/save">
    <input type="hidden" name="id" value="${item.id}"/>
    <input type="text" name="name" value="${item.name}"/>
    <br/>
    <input type="text" name="description" value="${item.description}"/>
    <br/>

    <p class="submit"><input type="submit" value="Save"/></p>
</form:form>