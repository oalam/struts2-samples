<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title><s:text name="Form.titre"/></title>
    <s:head/>
  </head>

  <body background="<s:url value="/ressources/standard.jpg"/>">
    <h2><s:text name="FormDivers.message"/></h2>
    <s:form name="formulaire" action="FormDivers">
      <s:textfield name="email" key="email.prompt" size="30"/>
      <s:textfield name="url1" key="url.prompt" size="30"/>
      <s:textfield name="chaine" key="chaine.prompt" size="10"/>
      <s:submit key="Form.submitText" method="execute"/>
    </s:form>
    <br/>
    <s:url id="url" action="FormDivers" method="cancel"/>
    <s:a href="%{url}"><s:text name="Form.cancelText"/></s:a>
      <br/>
    <s:url id="url" action="FormDivers" method="clearModel"/>
    <s:a href="%{url}"><s:text name="Form.clearModel"/></s:a>
  </body>
</html>
