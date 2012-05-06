<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layout" %>

<layout:header/>

<div class="container">
      <div class="content">
       <c:forEach var="listPosts" items="${listPosts}">
	 	${listPosts} <br />
	  </c:forEach>
      
	      <!-- <? if($this->session->flashdata('message')): ?> 
               <div class="alert-message info fade in">
               <? echo $this->session->flashdata('message');  ?>
               </div>
               <?php endif; ?>-->
               
<layout:footer/>
 