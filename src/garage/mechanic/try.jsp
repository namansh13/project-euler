<?php
session_start ();
if (! isset ( $_SESSION ["username"] )) {
	echo "<script type='text/javascript'>alert('Please login again!');</script>";
	header ( "Refresh:0.01;URL=login.php" );
}

?><br>


<html>
<title>Compose</title>

<head>
<script>
/*function showResult(str) {
  if (str.length==0) { 
    document.getElementById("try").innerHTML="";
    document.getElementById("try").style.border="0px";
    return;
  }
  if (window.XMLHttpRequest) {
    // code for IE7+, Firefox, Chrome, Opera, Safari
    xmlhttp=new XMLHttpRequest();
  } else {  // code for IE6, IE5
    xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
  xmlhttp.onreadystatechange=function() {
    if (xmlhttp.readyState==4 && xmlhttp.status==200) {
      document.getElementById("try").innerHTML=xmlhttp.responseText;
      document.getElementById("try").style.border="1px solid #A5ACB2";
	document.getElementById("livesearch").style.width="200px";
    }
  }
  xmlhttp.open("GET","try.php?q="+str,true);
  xmlhttp.send();
}*/
</script>



</head>


<style type="text/css">
input[type="text"], input[type="password"], textarea {
	background-color: #d1d1d1;
}

body {
	color: rgb(136, 136, 136);
	text-align: center;
	background-image: url(<?php echo $_SESSION ["Background"] . ".jpg";?>);
	-webkit-background-size: cover;
}

.subject {
	text-align: center;
}

.footer {
	position: absolute;
	bottom: 5px;
	text-align: center;
	width: 99%;
}

label {
	display: inline-block;
	width: 80px; //
	margin-right: 30px;
	text-align: left;
}

.header {
	position: relative;
	left: -40px;
	z-index: 1;
}

#try {
	position: relative;
	width: 200px;
	cursor: default;
	z-index: 9999 !important;
}

:focus {
	outline: none;
}

::-moz-focus-inner {
	border: 0;
}
</style>

<script type="text/javascript">
function ValidateForm(){
	
	var x=document.forms.userinfo.to.value;
	var y=document.forms.userinfo.cc.value;
	var z=document.forms.userinfo.bcc.value;
	
	if(x==null||x==""){
		if(y==null||y==""){
			
		{
		alert("Both To and Cc cannot be null");
		return false;
		}

	}

	var to=x.split(";");
	var cc=y.split(";");
	var bcc=z.split(";");
	var i;
	
	for(i=0;i<to.length;i++){
	if(to[i]!=null){
		   atpos = to[i].indexOf("@");
		   dotpos = to[i].lastIndexOf(".");
		   if (atpos < 1 || ( dotpos - atpos < 2 )) 
		   {
		       alert("Please enter correct email ID")
		       return false;
		   }

		}
	}

	for(i=0;i<to.length;i++){
		if(cc[i]!=null){
			   atpos = cc[i].indexOf("@");
			   dotpos = cc[i].lastIndexOf(".");
			  
			   if (atpos < 1 || ( dotpos - atpos < 2 )) 
			   {
			       alert("Please enter correct email ID")
			       return false;
			   }

			}
		}

	for(i=0;i<to.length;i++){
		if(bcc[i]!=null){
			   atpos = bcc[i].indexOf("@");
			   dotpos = bcc[i].lastIndexOf(".");
			   if (atpos < 1 || ( dotpos - atpos < 2 )) 
			   {
			       alert("Please enter correct email ID")
			       return false;
			   }

			}
		}

	
	
	/*var x=document.forms.userinfo.email.value;
		if(x==null||x=="")
		{
		alert("Email can not be null");
		return false;		
		}
		atpos = x.indexOf("_");
		btpos = x.indexOf("/");
		if(atpos>-1||btpos>-1){
			alert("email cannot contain invalid characters");
			return false;
		}
	 atpos = x.indexOf("@");
	   dotpos = x.lastIndexOf(".");
	   if (atpos < 1 || ( dotpos - atpos < 2 )) 
	   {
	       alert("Please enter correct email ID")
	       return false;
	   }
	   var x=document.forms.userinfo.email2.value;
	   if(x==null||x=="")
		{
		alert("Secondary email can not be null");
		return false;		
		}
		 atpos = x.indexOf("@");
		   dotpos = x.lastIndexOf(".");
		   if (atpos < 1 || ( dotpos - atpos < 2 )) 
		   {
		       alert("Please enter correct Secondary email ID")
		       return false;
		   }

		   var x=document.forms.userinfo.password.value;
			if((x.length<6)||(x.length>16))
			{
				alert("password should contain 6 to 16 characters")
				return false;
			}
	   
	var x=document.forms.userinfo.addressl1.value;
	if(x==null||x=="")
	{
	alert("Address Line 1 can not be null");
	return false;		
	}
	var x=document.forms.userinfo.addressl2.value;
	if(x==null||x=="")
	{
	alert("Address Line 2 can not be null");
	return false;		
	}

	var x=document.forms.userinfo.SecurityAnswer.value;
	if(x==null||x=="")
		{
		alert("Security Answer can not be null");
		return false;		
		}*/
}
</script>

<body bgproperties="fixed">


	<form action="homepage.php" method="get">
		<div style="position: fixed; left: 0px;">

			<button
				style='background: none; border: none; color: rgb(206, 206, 206);'><-Back</button>
		</div>
	</form>
	<br>



	<form action="mailsentsuccess.php" method="post" name="userinfo"
		onsubmit="return ValidateForm()">
		<div class="header">
			<label for='to'>To : </label><input type="text" name="to" size="100"><br>
			<label for='cc'>Cc : </label><input type="text" name="cc" size="100"><br>
			<label for='bcc'>Bcc : </label><input type="text" name="bcc"
				size="100"><br> <label for='subject'>Subject : </label><input
				type="text" name="subject" size="100"><br>
		</div>
		<div class="subject">
			<label for='message'>Message : </label>
			<textarea rows="23" cols="100" name="message"></textarea>
			<br> <input type="submit" value="Send"
				style="width: 100px; background: rgba(10, 10, 10, 0.8); border: none; color: rgba(200, 200, 200, 1)">
		</div>
	</form>
	<div class="footer"><?php include 'copyright.php'; ?></div>
	</div>

</body>
</html>