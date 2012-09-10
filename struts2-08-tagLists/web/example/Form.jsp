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
	    <s:select name="select1" list="{'vert','jaune','rouge'}" size="1" key="Form.select1"/>
	    <s:select name="select2" list="{'vert','jaune','rouge'}" size="3" key="Form.select2" multiple="true"/>
	    <s:select name="select3" list="#{'01':'vert(01)','02':'jaune(02)','03':'rouge(03)','04':'blanc(04)','05':'noir(05)'}" size="3" key="Form.select3" multiple="true"/>
	    <s:select name="select4" list="dico" size="3" key="Form.select4" multiple="true"/>
	    <s:select name="select5" list="couleurs" listKey="id" listValue="nom" size="3" key="Form.select5" multiple="true" />
	    <s:checkboxlist name="checkboxlist1" list="#{'01':'vert(01)','02':'jaune(02)','03':'rouge(03)','04':'blanc(04)','05':'noir(05)'}" key="Form.checkboxlist1"/>
	    <s:checkboxlist name="checkboxlist2" list="dico" key="Form.checkboxlist2"/>
	    <s:checkboxlist name="checkboxlist3" list="couleurs" listKey="id" listValue="nom" key="Form.checkboxlist3" />
	    <s:radio name="radio1" list="#{'01':'vert(01)','02':'jaune(02)','03':'rouge(03)','04':'blanc(04)','05':'noir(05)'}" key="Form.radio1"/>
	    <s:radio name="radio2" list="dico" key="Form.radio2"/>
	    <s:radio name="radio3" list="couleurs" listKey="id" listValue="nom" key="Form.radio3" />
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
		<td><s:text name="Form.select1"/></td>
		<td><s:property value="select1"/>
	    </tr>
	    <tr>
		<td><s:text name="Form.select2"/></td>
		<td><s:property value="select2SelectedValues"/>
	    </tr>
	    <tr>
		<td><s:text name="Form.select3"/></td>
		<td><s:property value="select3SelectedValues"/>
	    </tr>
	    <tr>
		<td><s:text name="Form.select4"/></td>
		<td><s:property value="select4SelectedValues"/>
	    </tr>
	    <tr>
		<td><s:text name="Form.select5"/></td>
		<td><s:property value="select5SelectedValues"/>
	    </tr>
	    <tr>
		<td><s:text name="Form.checkboxlist1"/></td>
		<td><s:property value="checkboxlist1SelectedValues"/>
	    </tr>
	    <tr>
		<td><s:text name="Form.checkboxlist2"/></td>
		<td><s:property value="checkboxlist2SelectedValues"/>
	    </tr>
	    <tr>
		<td><s:text name="Form.checkboxlist3"/></td>
		<td><s:property value="checkboxlist3SelectedValues"/>
	    </tr>
	    <tr>
		<td><s:text name="Form.radio1"/></td>
		<td><s:property value="radio1"/>
	    </tr>
	    <tr>
		<td><s:text name="Form.radio2"/></td>
		<td><s:property value="radio2"/>
	    </tr>
	    <tr>
		<td><s:text name="Form.radio3"/></td>
		<td><s:property value="radio3"/>
	    </tr>
	</table>
    </body>
</html>
