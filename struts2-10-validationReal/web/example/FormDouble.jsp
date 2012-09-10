<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title><s:text name="Form.titre"/></title>
    <s:head/>
  </head>

  <body background="<s:url value="/ressources/standard.jpg"/>">
    <h2><s:text name="FormDouble.message"/></h2>
    <h4><s:text name="FormDouble.conseil"/></h4>
    <s:form name="formulaire" action="FormDouble">
      <s:textfield name="double1" key="double1.prompt"/>
      <s:textfield name="double2" key="double2.prompt" value="%{#parameters['double2']!=null ? #parameters['double2'] : double2==null ? '' : getText('double.format',{double2})}"/>
      <s:textfield name="double3" key="double3.prompt" value="%{#parameters['double3']!=null ? #parameters['double3'] : double3==null ? '' : getText('double.format',{double3})}"/>
      <s:textfield name="double4" key="double4.prompt" value="%{#parameters['double4']!=null ? #parameters['double4'] : double4==null ? '' : getText('double.format',{double4})}"/>
      <s:textfield name="double5" key="double5.prompt" value="%{#parameters['double5']!=null ? #parameters['double5'] : double5==null ? '' : getText('double.format',{double5})}"/>
      <s:textfield name="double6" key="double6.prompt"/>
      <s:submit key="Form.submitText" method="execute"/>
    </s:form>
    <br/>
    <s:url id="url" action="FormDouble" method="cancel"/>
    <s:a href="%{url}"><s:text name="Form.cancelText"/></s:a>
      <br/>
    <s:url id="url" action="FormDouble" method="clearModel"/>
    <s:a href="%{url}"><s:text name="Form.clearModel"/></s:a>
  </body>
</html>