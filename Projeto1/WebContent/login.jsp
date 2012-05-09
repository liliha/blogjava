<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layout" %>

<layout:header/>

<div class="container">
      <div class="content">
      	<h2>Efetue login</h2>
		<hr />
      	<div class="span16">
      		<form action="Login" method="POST">
      			<label for="email">E-mail:</label>
      			<br /><br />
      			<input type="text" name="email" value="" id="email" class="span4"  />
      			<br />
      			<label for="password">Senha:</label>
      			<br /><br />
      			<input type="password" name="password" value="" class="span4"  />
      			<br /><br />
      			<br />
      			<input type="submit" name="submit" value="Enviar" class="btn primary"  />
      		</form>
      	</div>
<layout:footer/>