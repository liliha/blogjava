<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layout" %> 

<layout:header/>

<script type="text/javascript" src="<?= base_url(); ?>tiny_mce/tiny_mce.js" ></script>
<script type="text/javascript">
	tinyMCE.init({
	        mode : "textareas",
		theme : "advanced",
        	plugins : "autolink,lists,spellchecker,pagebreak,style,layer,table,save,advhr,advimage,advlink,emotions,iespell,inlinepopups,insertdatetime,preview,media,searchreplace,print,contextmenu,paste,directionality,fullscreen,noneditable,visualchars,nonbreaking,xhtmlxtras,template",
		theme_advanced_buttons1 : "save,newdocument,|,bold,italic,underline,strikethrough,|,justifyleft,justifycenter,justifyright,justifyfull,|,styleselect,formatselect,fontselect,fontsizeselect",
        theme_advanced_buttons2 : "cut,copy,paste,pastetext,pasteword,|,search,replace,|,bullist,numlist,|,outdent,indent,blockquote,|,undo,redo,|,link,unlink,anchor,image,cleanup,help,code,|,insertdate,inserttime,preview,|,forecolor,backcolor",
        theme_advanced_buttons3 : "tablecontrols,|,hr,removeformat,visualaid,|,sub,sup,|,charmap,emotions,iespell,media,advhr,|,print,|,ltr,rtl,|,fullscreen",
        theme_advanced_toolbar_location : "top",
        theme_advanced_toolbar_align : "left",
        theme_advanced_statusbar_location : "bottom",

	});
</script>

<hr />
 <h3>Editar post</h3>
<div class="span16">
		
			<form action="Update" method="POST">
				<label>Título</label><br /><br />
				<input type="text" name="titulo" class="span14" /><br />
				<!-- hidden forms para id post e id tags? -->
				<label>Texto</label><br /><br />
				<textarea class="span14" rows="20">
					<!--  text? -->
				</textarea><br /><br />
				<!-- tags? -->
				Situação: <input type="radio" name="published" id="published" value='1' /> Publicado <input type="radio" name="published" id="published" value="0" /> Não-Publicado
				<br /><br />
				<input type="submit" name="submit" value="Enviar" class="btn primary"  />
			</form>

</div>




















<div class="container">
      <div class="content">
		<div class="hero-unit singlepost">
			<h1>${postObj.title}</h1>
			<p>
				Publicado em <strong>${postObj.addDate}</strong> por <strong>${postObj.user.name}</strong> 	| Tag(s): ${postObj.tags}</p>
			<p>${postObj.content}</p>
		</div>
		<div class="content comments">

			<a name="comments"></a>

			<h3>Coment&aacute;rios</h3>

			<h3>Enviar Coment&aacute;rio <span style="font-size: 12px"> |
			<c:choose>
	 		<c:when test="${isLoggedIn == NULL}">
				<a href="login.jsp">Efetue login</a> para comentar
			</c:when>
			<c:otherwise>
				Logado como ${userLogin} (<a href="${initParam.blogPath}?action=logout">Deslogar</a>)
			</c:otherwise>
		</c:choose>
			</span></h3>

			<form action="Comments" method="POST">
				<label for="comment">Mensagem:</label><br /><br />
				<textarea name="comment" cols="40" rows="10" class="span14" ></textarea>
				<br /><br /><input type="submit" name="submit" value="Enviar" class="btn primary"  />
			</form>

		</div>
<layout:footer/>