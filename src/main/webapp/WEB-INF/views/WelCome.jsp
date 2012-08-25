<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.7.1.js"></script>
<script>
	function loadModalWindow(){
		jQuery( "dialog-modal" ).dialog({
			height: 140,
			modal: true
		});
	};
	</script>
<META http-equiv="Content-Type" content="text/html;charset=UTF-8"/>
<title>Learning MVC</title>
</head>
<body>
	<h1>${ message }</h1>

	<div class="demo">
		<div id="dialog-modal" title="Basic modal dialog" ">
			<input type="button" name="Atul"  onclick="loadModalWindow()" />
		</div>

	</div><!-- End demo -->



</body>
</html>