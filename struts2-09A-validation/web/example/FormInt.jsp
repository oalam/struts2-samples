<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title><s:text name="Form.titre"/></title>
    <s:head/>
  </head>

  <body background="<s:url value="/ressources/standard.jpg"/>">
    <h2><s:text name="FormInt.message"/></h2>
    <s:form name="formulaire" action="FormInt">
      <s:textfield name="int1" key="int1.prompt"/>
      <s:textfield name="int2" key="int2.prompt"/>
      <s:textfield name="int3" key="int3.prompt"/>
      <s:textfield name="int4" key="int4.prompt"/>
      <s:textfield name="int5" key="int5.prompt"/>
      <s:textfield name="int6" key="int6.prompt"/>
      <s:submit key="Form.submitText" method="execute"/>
    </s:form>
    <br/>
    <s:url id="url" action="FormInt" method="cancel"/>
    <s:a href="%{url}"><s:text name="Form.cancelText"/></s:a>
      <br/>
    <s:url id="url" action="FormInt" method="clearModel"/>
    <s:a href="%{url}"><s:text name="Form.clearModel"/></s:a>
  </body>
</html>
