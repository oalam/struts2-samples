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
	    <s:textfield name="data.textfield" key="Form.textfield" />
	    <s:password name="data.password" key="Form.password"/>
	    <s:textarea name="data.textarea" key="Form.textarea" cols="40" rows="5"/>
	    <s:select name="data.select1" list="data.select1Values" size="1" key="Form.select1" headerValue="<-- select 1 -->" headerKey="-1" />
	    <s:select name="data.select2" size="3" list="data.select2Values" key="Form.select2"/>
	    <s:select name="data.select3" size="3" list="data.select3Values" key="Form.select3" multiple="true"/>
	    <s:radio name="data.radio" list="data.radioValues" key="Form.radio"/>
	    <s:checkbox name="data.checkbox" key="Form.checkbox"/>
	    <s:checkboxlist name="data.checkboxlist" list="data.checkboxlistValues" key="Form.checkboxlist"/>
	    <s:hidden name="data.hidden" key="Form.hidden"/>
	    <s:submit key="Form.submitText" name="data.submitText"/>
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
		<td><s:property value="data.textfield"/>
	    </tr>
	    <tr>
		<td><s:text name="Form.password"/></td>
		<td><s:property value="data.password"/>
	    </tr>
	    <tr>
		<td><s:text name="Form.textarea"/></td>
		<td><s:property value="data.textarea"/>
	    </tr>
	    <tr>
		<td><s:text name="Form.select1"/></td>
		<td><s:property value="data.select1"/>
	    </tr>
	    <tr>
		<td><s:text name="Form.select2"/></td>
		<td><s:property value="data.select2"/>
	    </tr>
	    <tr>
		<td><s:text name="Form.select3"/></td>
		<td><s:property value="data.select3SelectedValues"/>
	    </tr>
	    <tr>
		<td><s:text name="Form.radio"/></td>
		<td><s:property value="data.radio"/>
	    </tr>
	    <tr>
		<td><s:text name="Form.checkbox"/></td>
		<td><s:property value="data.checkbox"/>
	    </tr>
	    <tr>
		<td><s:text name="Form.checkboxlist"/></td>
		<td><s:property value="data.checkboxlistSelectedValues"/>
	    </tr>
	    <tr>
		<td><s:text name="Form.hidden"/></td>
		<td><s:property value="data.hidden"/>
	    </tr>
	</table>
    </body>
</html>
