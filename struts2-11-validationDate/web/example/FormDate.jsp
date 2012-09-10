<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title><s:text name="Form.titre"/></title>
    <s:head/>
  </head>

  <body background="<s:url value="/ressources/standard.jpg"/>">
    <h2><s:text name="FormDate.message"/></h2>
    <h4><s:text name="FormDate.conseil"/></h4>
    <s:form name="formulaire" action="FormDate">
      <s:textfield name="date1" key="date1.prompt"/>
      <s:textfield name="date2" key="date2.prompt" value="%{#parameters['date2']!=null ? #parameters['date2'] : date2==null ? '' :getText('date.format',{date2})}"/>
      <s:textfield name="date3" key="date3.prompt" value="%{#parameters['date3']!=null ? #parameters['date3'] : date3==null ? '' :getText('date.format',{date3})}"/>
      <s:textfield name="date4" key="date4.prompt" value="%{#parameters['date4']!=null ? #parameters['date4'] : date4==null ? '' :getText('date.format',{date4})}"/>
      <s:textfield name="date5" key="date5.prompt" value="%{#parameters['date5']!=null ? #parameters['date5'] : date5==null ? '' :getText('date.format',{date5})}"/>
      <s:textfield name="date6" key="date6.prompt"/>
      <s:submit key="Form.submitText" method="execute"/>
    </s:form>
    <br/>
    <s:url id="url" action="FormDate" method="cancel"/>
    <s:a href="%{url}"><s:text name="Form.cancelText"/></s:a>
      <br/>
    <s:url id="url" action="FormDate" method="clearModel"/>
    <s:a href="%{url}"><s:text name="Form.clearModel"/></s:a>
  </body>
</html>
