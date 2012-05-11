<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layout" %> 

<layout:header/>

<layout:tinymce/>

<hr />
 <h3>Editar post</h3>
<div class="span16">
		
			<form action="Update" method="POST">
				<label>Título</label><br /><br />
				<input type="text" name="titulo" class="span14" value="${postObj.title}" /><br />
				<!-- hidden forms para id post e id tags? -->
				<label>Texto:</label><br /><br />
				<textarea class="span14" rows="20">
					${postObj.content}
				</textarea><br /><br />
				<!-- tags? -->
				<label for="published">Situa&ccedil;&atilde;o:</label> &nbsp;&nbsp; <input type="radio" name="published" id="published" value='1' /> Publicado <input type="radio" name="published" id="published" value="0" /> Salvo no Rascunho 
				Tag(s): <input type="text" name="tags" class="span14" value="${postObj.tags}" /><br />
				<br /><br />
				<label for="category">Categoria:</label>
				<select name="category">
				<c:forEach items="${categoriesObj}" var="category">
					<option value="${category.id}">${category.name}</option>
				</c:forEach>
				</select>
				<input type="submit" name="submit" value="Editar" class="btn primary"  />
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