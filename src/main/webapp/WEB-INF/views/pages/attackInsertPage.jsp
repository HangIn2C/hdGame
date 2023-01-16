<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Attack Board Insert</title>
<style type="text/css">
	* {
		margin : 0;
		padding : 0;
	}
	input[name="title"]{
		width : 500px;
	}
	input[name="content"	]{
		width : 500px;
		height: 300px;
	}
</style>
</head>
<body>
	<form action="/board/insert">
		<div>
			<select name="type">
				<option value="TOTAL">TOTAL</option>
				<option value="CHESS">CHESS</option>
				<option value="CARD">CARD</option>
				<option value="BADUK">BADUK</option>
				<option value="TICTACTOE">TICTACTOE</option>
			</select>
		</div>
		
		<div>
			<p>title</p>
			<p><input type="text" name="title"></p>
		</div>
		
		<div>
			<p>content</p>
			<p><input type="text" name="content"></p>
		</div>
		
		<div>
			<input type="submit" value="작성">
			<input type="reset" value="취소">
		</div>
	</form>
</body>
</html>