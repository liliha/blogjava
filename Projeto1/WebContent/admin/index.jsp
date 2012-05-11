<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layout" %> 

<layout:admin-header/>

<div class="container">
      <div class="content">

		<h2>Administra&ccedil;&atilde;o do Blog</h2>
		<hr />
		<ul class="tabs" data-tabs="tabs">
			<li class="active"><a href="#posts">Posts</a></li>
			<li><a href="#users">Usu&aacute;rios</a></li>
			<li><a href="#categories">Categorias</a></li>
		</ul>
		<div id="my-tab-content" class="tab-content">
			<div class="active tab-pane" id="posts">
				<h3>Gerenciar Posts</h3>
				<div class="addbutton">
					<a class="btn info" href="AddPost">Adicionar novo post</a>
				</div>
				<div class="row">
					<div class="span16">
						<table class="zebra-striped" style="margin: 0px auto !important;">
						<tr>
						<th>ID</th>
						<th>T&iacute;tulo</th>
						<th></th>
						<th></th>
						</tr>
						<c:forEach var="post" items="${posts}">
                        <tr>
                        <td>${post.id}</td>
                        <td>${post.title}</td>
                        <td width="50px"><button class="btn" name="submit" value="edit" type="submit">Editar</button></td>
			  			<td width="50px"><button class="btn danger" name="submit" value="delete" type="submit">Excluir</button></td>
                        </tr>
                        </c:forEach>
						</table>
						</div>
				</div>
			</div>
		<div class="tab-pane" id="users">
		<h3>Gerenciar Usu&aacute;rios</h3>
				<div class="addbutton">
                        <a class="btn info" href="AddUser">Adicionar novo usu&aacute;rio</a>
                </div>
                <div class="row">
                        <div class="span16">
                        <table class="zebra-striped" style="margin: 0px auto !important;">
                        <tr>
                        <th>Nome</th>
						<th>E-mail</th>
						<th>Permiss&atilde;o</th>
						<th>Mute</th>
                        <th></th>
                        <th></th>
                        </tr>
                        <c:forEach var="user" items="${users}">
                        <tr>
                        <td>${user.name}</td>
                        <td>${user.email}</td>
                        <td>user.ismuted</td>
                        <td>user.type</td>
                        <td width="50px"><button class="btn" name="submit" value="edit" type="submit">Editar</button></td>
			  			<td width="50px"><button class="btn danger" name="submit" value="delete" type="submit">Excluir</button></td>
                        </tr>
                        </c:forEach>
				 		</table>
						</div>
				</div>
	    </div>
		<div class="tab-pane" id="categories">
		<h3>Gerenciar Categorias</h3>
				<div class="addbutton">
                        <a class="btn info" href="AddCategory">Adicionar nova categoria</a>
                </div>
                <div class="row">
                        <div class="span16">
                        <table class="zebra-striped">
                        <tr>
                        <th>ID</th>
                        <th>Categoria</th>
						<th>Descri&ccedil;&atilde;o</th>	
                        <th></th>
                        <th></th>				
  	                	</tr>
  	                	<c:forEach var="category" items="${categories}">
                        <tr>
                        <td>${category.id}</td>
                        <td>${category.name}</td>
                        <td>${category.description}</td>
                        <td width="50px"><button class="btn" name="submit" value="edit" type="submit">Editar</button></td>
			  			<td width="50px"><button class="btn danger" name="submit" value="delete" type="submit">Excluir</button></td>
                        </tr>
                        </c:forEach>
  	          			</table>
              			</div>
            	</div>
	     </div>
	</div>
<layout:footer />