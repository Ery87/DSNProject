<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
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

</head>


<body>
  <div id="main">
    <div id="header">
      <div id="banner">
	    <a href="#">Welcome in Private Social Network </a>
	  </div><!--end banner-->
   <div id="menubar">
   <ul id="menu">
  
            <form method="post" action="search" >
           
           <li> Search friend: <input type="text" name="name"></li>
           
            <li> <input type="button" value="Search" onClick="Login()"></input></li>
         
            </form>
            
            </ul>
            </div><!--end menubar-->
      
    </div><!--end header-->
    
	<div id="site_content">
       <ul class="slideshow">
          <li class="show"><img width="918" height="350" src="resources/images/home_1.jpg"  /></li>
        <li><img width="918" height="350" src="resources/images/home_2.jpg" /></li>
      </ul>     
	  <div id="content">
        <div class="content_item">
        
          <div class="cont_profile"> 
      <table>
      <tr>
      <td>Firstname: </td>
      <td><h3>${map.profile.get(0)}</h3> </td>
      <td>Birth day: </td>
      <td><h3>${map.profile.get(2)}</h3> </td>
      </tr>
      <tr>
      <td>Lastname:</td>
      <td><h3>${map.profile.get(1)}</h3></td>
      <td>City: </td>
      <td><h3>${map.profile.get(3)}</h3> </td>
      </tr>
      
      </table>
       
    </div>
   
          <div class="sidebar">
          <div class="sidebar_top"></div>
          <div class="sidebar_item" >
		<img src="resources/images/photo_profile"+${map.profile.get(4)}+"/"/>
        </div>
      
          <div class="sidebar_base"></div>
        </div><!--end sidebar--> 
		</div><!--end content_item-->
      </div><!--end content-->
      <div class="sidebar_container">
        <div class="sidebar">
          <div class="sidebar_top"></div>
          <div class="sidebar_item">
           <h2>Lista amici:</h2>
            <ul>
      <c:forEach var="user" items="${map.friend}">  
   
     <li><h5><a href="/profile/${user}"> ${user}</a></h5></li>
   </c:forEach>  
  
</ul>
</div>

	 
          <div class="sidebar_base"></div>
        </div><!--end sidebar-->
        
		<div class="sidebar">
          <div class="sidebar_top"></div>
          <div class="sidebar_item">
            <h2>Album</h2>
            <ul>
            <c:forEach var="album" items="${map.album}">
            <li><h5><a href=""> ${album}</a></h5></li>
            
            </c:forEach>
            </ul>
          </div>
          <div class="sidebar_base"></div>
        </div><!--end sidebar-->
      </div><!--end sidebar_container-->
      <div class="updw">
  <h2>Upload image: </h2>
    <form method="post" action="upload" >
    <p>Photo: <input type="file" name="photo"></input>
   <input type="submit" name="upload"></input></p>
    </form>
  </div>
	</div><!--end site_content-->
  </div><!--end main-->
  
  <div id="footer">
    <div id="footer_container">
	  <div class="footer_container_box">
		
		</div>	  
	  </div><!--end footer_container_box1-->      
	  <br style="clear:both"/>
	  <br />
    </div>
  </div><!--end footer-->
</body>
</html>
