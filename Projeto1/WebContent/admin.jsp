<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
	<hr />
	<ul class="tabs" data-tabs="tabs">
	  <li class="active"><a href="#posts">Posts</a></li>
	  <li><a href="#usuarios">Usuários</a></li>
	  <li><a href="#comentarios">Comentários</a></li>
	</ul>	
	<div id="my-tab-content" class="tab-content">
		<div class="active tab-pane" id="posts">
		<h3>Adicionar Posts</h3>
		<div class="addbutton">
			<a class="btn info" href="umactionparapost">Adicionar novo post</a>
		</div>
		<div class="row">
			<div class="span16">
			
			<table class="zebra-striped" style="margin: 0px auto !important;">
			
			<tr>
			<th>ID</th>
			<th>Título</th>
			<th></th>
			<th></th>
			</tr>
			<?php foreach ($all_posts as $post): ?>
			<tr>
			  <?php echo form_open('admin/get_action_posts');
			      echo form_hidden('id', $post->id);?>
			  <td># <?php echo $post->id; ?></td>
			  <td><?php echo $post->titulo; ?></td>
			  <td width="50px"><button class="btn" name="submit" value="editar" type="submit">Editar</button></td>
			  <td width="50px"><button class="btn danger" name="submit" value="excluir" type="submit">Excluir</button></td>
			  <?php echo form_close(); ?>
			</tr>
			<?php endforeach; ?>
			</table>
			
			</div>
		</div>
		</div>
		<div class="tab-pane" id="usuarios">
		<h3>Gerenciar Usu&aacute;rios</h3>
		<div class="addbutton">
                        <a class="btn info" href="<?= base_url(); ?>index.php/admin/users">Adicionar novo usu&aacute;rio</a>
                </div>
                <div class="row">
                        <div class="span16">
                        <table class="zebra-striped" style="margin: 0px auto !important;">
                        <tr>
                        <th>ID</th>
                        <th>Nome</th>
			<th>Login</th>
			<th>Permiss&atilde;o</th>
                        <th></th>
                        <th></th>
                        </tr>
			<?php foreach ($all_users as $user): ?>	
			<tr>
			<?php echo form_open('admin/get_action_users');
			      echo form_hidden('id_usuario', $user->id_usuario);?>
                        <td># <?php echo $user->id_usuario; ?></td>
                        <td><?php echo $user->nome; ?></td>
			<td><?php echo $user->login; ?></td>
			<?php
			    if($user->admin == 0){
			      echo "<td> Usu&aacute;rio </td>";
			    } else {
			      echo "<td> Admin </td>";
			    }
			?>
			<td width="50px"><button class="btn" name="submit" value="editar" type="submit">Editar</button></td>
			<td width="50px"><button class="btn danger" name="submit" value="excluir" type="submit">Excluir</button></td>
                        <?php echo form_close(); ?>
			</tr>
			<?php endforeach; ?>
	                </table>
			</div>
		</div>
	        </div>
		
		<div class="tab-pane" id="comentarios">
		<h3>Gerenciar Comentarios</h3>
                <div class="row">
                        <div class="span16">
                        <table class="zebra-striped">
                        <tr>
                        <th>ID</th>
                        <th>Post</th>
			<th>Coment&aacute;rio</th>	
                        <th></th>
                        <th></th>
			<?php foreach ($all_comments as $comment): ?>	
  	                <tr>
			<?php echo form_open('admin/get_action_comments');
			      echo form_hidden('id_comment', $comment->id_comentario);?>
                        <td># <?php echo $comment->id_comentario; ?></td>
                        <td><?php echo $comment->titulo; ?></td>
			<td><?php echo $comment->texto; ?></td>
			<td width="50px"><button class="btn" value="aprovar" name="submit" type="submit">Aprovar</button></td>
			<td width="50px"><button class="btn danger" value="excluir" name="submit" type="submit">Excluir</button></td>
			<?php echo form_close(); ?>
                        </tr>
			<?php endforeach; ?>
                        </table>
                        </div>
                </div>
	        </div>
	</div>