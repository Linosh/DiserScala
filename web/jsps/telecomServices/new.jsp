<%@ include file="/jsps/common/includes.jsp" %>

<form:form modelAttribute="service" action="${pageContext.request.contextPath}/telecomServices/create">
    <input type="text" name="name"/>
    <br/>
    <input type="text" name="description"/>
    <br/>

    <p class="submit"><input type="submit" value="Add Service"/></p>
</form:form>