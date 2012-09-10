<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
	<title><s:text name="Form.titre"/></title>
	<s:head/>
    </head>

    <body background="<s:url value="/ressources/standard.jpg"/>">
	<h2><s:text name="Form.message"/></h2>
	<h3><s:text name="Form.langues"/></h3>
	<ul>
	    <li>
		<s:url id="url" action="Form">
		    <s:param name="request_locale">en</s:param>
		</s:url>
		<s:a href="%{url}"><s:text name="Form.anglais"/></s:a>
		</li>
		<li>
		<s:url id="url" action="Form">
		    <s:param name="request_locale">fr</s:param>
		</s:url>
		<s:a href="%{url}"><s:text name="Form.francais"/></s:a>
		</li>
	    </ul>
	<s:form name="formulaire">
	    <s:textfield name="textfield" key="Form.textfield" />
	    <s:password name="password" key="Form.password"/>
	    <s:textarea name="textarea" key="Form.textarea" cols="40" rows="5"/>
	    <s:select name="select1" list="select1Values" size="1" key="Form.select1" headerValue="<-- select 1 -->" headerKey="-1" />
	    <s:select name="select2" size="3" list="select2Values" key="Form.select2"/>
	    <s:select name="select3" size="3" list="select3Values" key="Form.select3" multiple="true"/>
	    <s:radio name="radio" list="radioValues" key="Form.radio"/>
	    <s:checkbox name="checkbox" key="Form.checkbox"/>
	    <s:checkboxlist name="checkboxlist" list="checkboxlistValues" key="Form.checkboxlist"/>
	    <s:hidden name="hidden" key="Form.hidden"/>
	    <s:submit key="Form.submitText" name="submitText"/>
	</s:form>
	<hr/>
	<h2><s:text name="Confirmation.message"/></h2>
	<table border="1">
	    <tr>
		<th><s:text name="Confirmation.champ"/></th>
		<th><s:text name="Confirmation.valeur"/></th>
	    </tr>
	    <tr>
		<td><s:text name="Form.textfield"/></td>
		<td><s:property value="textfield"/>
	    </tr>
	    <tr>
		<td><s:text name="Form.password"/></td>
		<td><s:property value="password"/>
	    </tr>
	    <tr>
		<td><s:text name="Form.textarea"/></td>
		<td><s:property value="textarea"/>
	    </tr>
	    <tr>
		<td><s:text name="Form.select1"/></td>
		<td><s:property value="select1"/>
	    </tr>
	    <tr>
		<td><s:text name="Form.select2"/></td>
		<td><s:property value="select2"/>
	    </tr>
	    <tr>
		<td><s:text name="Form.select3"/></td>
		<td><s:property value="select3SelectedValues"/>
	    </tr>
	    <tr>
		<td><s:text name="Form.radio"/></td>
		<td><s:property value="radio"/>
	    </tr>
	    <tr>
		<td><s:text name="Form.checkbox"/></td>
		<td><s:property value="checkbox"/>
	    </tr>
	    <tr>
		<td><s:text name="Form.checkboxlist"/></td>
		<td><s:property value="checkboxlistSelectedValues"/>
	    </tr>
	    <tr>
		<td><s:text name="Form.hidden"/></td>
		<td><s:property value="hidden"/>
	    </tr>
	</table>
    </body>
</html>
