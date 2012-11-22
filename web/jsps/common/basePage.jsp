<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>
<head>

    <title><tiles:insertAttribute name="title"/></title>

    <tiles:insertAttribute name="header"/>

</head>
<body>
<div id="bodyDiv">
    <tiles:insertAttribute name="body"/>
</div>

<div id="leftMenuDiv">
    <tiles:insertAttribute name="leftMenu"/>
</div>
<div id="footerDiv">
    <tiles:insertAttribute name="footer"/>
</div>
</body>
</html>