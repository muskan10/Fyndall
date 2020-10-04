<%-- 
    Document   : c_quiz1
    Created on : 3 May, 2020, 11:30:32 AM
    Author     : Mitali
--%>
<html>
<head>
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">

<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="style.css" />

<title> Welcome </title>


<!ques paper>
<style>
input.MyButton {
width: 100px;
padding: 10px;
font-size:20px;
}

.pagination {
  display: inline-block;
}

.pagination a {
  color: black;
  float: left;
  padding: 15px 20px;
  text-decoration: none;
}

.pagination a.active {
  background-color:  #ffcc00;
  color: white;
}

.pagination a:hover:not(.active) {background-color: #ddd;}


</style>
</head>

<body>
<jsp:include page="nav.jsp"></jsp:include>

<center>
<button class="button" id="mybut" onclick="myFunction()" style="float:center;font-weight:bold;font-size:20px">START QUIZ</button>
<br>
<br>

<script>
function myFunction() {
  location.href="c1.jsp";
}
</script>


</body>
</html>