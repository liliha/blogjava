<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layout" %>

<layout:header/>

<layout:tinymce/>

<div class="container">
      <div class="content">

		<h2>Administra&ccedil;&atilde;o do Blog</h2>
		<hr />

		<h3>Adicionar novo post</h3>

		<div class="span16">
			<form action="Post" method="POST">
				<label for="title">T&iacute;tulo: </label> 
				<br />
				<br /> 
				<input type="text" name="title" value="" id="title" class="span14" /> 
				<br />
				<br /> 
				<label for="text">Texto:</label> 
				<br />
				<br />
				<textarea name="content" cols="40" rows="20" class="span14"></textarea>
				<br />
				<br /> 
				<label for="tags">Tags: </label> 
				<input type="text" name="tags" value="" id="tags" class="span14" /> 
				<br />
				<br /> 
				<label for="published">Situa&ccedil;&atilde;o:</label> &nbsp;&nbsp;
				<input type="radio" name="published" value="1" id="published" checked="checked" />&nbsp; Publicado 
				<input type="radio" name="published" value="0" id="published" />&nbsp;Salvo no Rascunho 
				<br />
				<br /> 
				<input type="submit" name="submit" value="Salvar" class="btn primary" />
			</form>
		</div>

<layout:footer />