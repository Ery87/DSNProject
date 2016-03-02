<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">

<head>
  <title>DSN Project</title>
  <meta name="description" content="free website template" />
  <meta name="keywords" content="enter your keywords here" />
  <meta http-equiv="content-type" content="text/html; charset=iso-8859-1" />
 
 <link href="resources/css/style.css" rel="stylesheet" type="text/css"/ >  
 <script type="text/javascript" src="resources/js/jquery.min.js"></script>
  <script type="text/javascript" src="resources/js/image_slide.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<link href="${style}" rel="stylesheet" />
<script src="${jquery.min}"></script>
<script src="${image_slide}"></script>
<script type="text/javascript">

function checkPass()
{
    //Store the password field objects into variables ...
    var pass1 = document.getElementById('pw');
    var pass2 = document.getElementById('Cpw');
    //Store the Confimation Message Object ...
    var message = document.getElementById('confirmMessage');
    //Set the colors we will be using ...
    var goodColor = "#66cc66";
    var badColor = "#ff6666";
    //Compare the values in the password field 
    //and the confirmation field
    if(pass1.value == pass2.value){
        //The passwords match. 
        //Set the color to the good color and inform
        //the user that they have entered the correct password 
        pass2.style.backgroundColor = goodColor;
        message.style.color = goodColor;
        message.innerHTML = "Passwords Match!"
    }else{
        //The passwords do not match.
        //Set the color to the bad color and
        //notify the user.
        pass2.style.backgroundColor = badColor;
        message.style.color = badColor;
        message.innerHTML = "Passwords Do Not Match!"
    }
}
</script> 
  
</head>

<body>
  <div id="main">
    <div id="header">
      <div id="banner">
	    <a href="#">Welcome in Private Social Network </a>
	  </div><!--end banner-->
   <div id="menubar">
   <ul id="menu">
  
            <form method="post" name="login.js">
           
           <li>Email: <input type="text" name="nome"></li>
          
          
            <li> Pw: <input type="text" name="nome"></li>
           
            <li> <input type="button" value="Login" onClick="Login()"></input></li>
         
            </form>
            
            </ul>
            </div><!--end menubar-->
      
    </div><!--end header-->
    
<div id="site_content">
       <ul class="slideshow">
        <li class="show"><img width="918" height="350" src="resources/images/home_1.jpg" alt="&quot;Enter your caption here&quot;" /></li>
        <li><img width="918" height="350" src="resources/images/home_2.jpg" alt="&quot;Enter your caption here&quot;" /></li>
      </ul>          
	  <div id="content">
        <div class="content_item">
        <h2>Completed registration! </h2>
            <p>&nbsp;</p>
		</div><!--end sidebar-->
      </div><!--end content-->
      
	
  </div><!--end main-->
  
  <div id="footer">
    <div id="footer_container">
	 	  
	  </div><!--end footer_container_box1-->      
	 
	 
    </div>
  </div><!--end footer-->
</body>
</html>
