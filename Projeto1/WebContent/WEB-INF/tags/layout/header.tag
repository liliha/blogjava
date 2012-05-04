<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layout" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Nome do blog</title>
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Le HTML5 shim, for IE6-8 support of HTML elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <link href="css/bootstrap.css" rel="stylesheet" type="text/css">
	<link href="css/main.css" rel="stylesheet" type="text/css">
	<script src="http://code.jquery.com/jquery-1.7.1.min.js" type="text/javascript" ></script>     
    <script src="js/bootstrap-alerts.js" type="text/javascript"></script>
	<script src="js/blog.js" type="text/javascript"></script>
  </head>

  <body>
    <div class="topbar">
      <div class="topbar-inner">
        <div class="container-fluid">
        <layout:logo />
          <ul class="nav">
          </ul>
	 <p class="pull-right">
	 
	<!--  <?php
	    $user_login = $this->session->userdata('login');
	    $logado = $this->session->userdata('is_logged_in');
	    $admin = $this->session->userdata('admin');
	    
		if($logado == NULL){
		  echo 'Bem vindo! '. anchor('login', 'Efetue seu login.');
		} elseif ($admin){
		      echo 'Voc&ecirc; est&aacute; logado no modo '.anchor('admin/','administrador').'. '.anchor('login/logout', 'Sair');
		  }else{
		      echo 'Ol&aacute;, '. $user_login .'! '.anchor('login/logout', 'Sair');
		  }
	 ?>-->
	 </p>
        </div>
      </div>
</div>
