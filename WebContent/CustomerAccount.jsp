<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width initial-scale=1">
    <title>
       Insert title here
    </title>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="css/custom.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">    
</head>
<body>
<!-- PARENT CONTAINER STARTS -->
	<div class="container-fluid myparentS">
			<%@include file="Navigation2.jsp" %>
<!-- END OF ROW 1 -->  
        <nav>
		    <div class="row">
				<div class="col-md-1">
				</div>
				
				<div class="col-md-3 logo">
				<img src="images/logo.png">
				</div>
				
				<div class="col-md-3">
				</div>
		
				<ul class="navbar-nav">
					 <li class="nav-item dropdown drops">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                           <b>Electronics</b><b class="caret"></b>
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <a class="dropdown-item" href="#">Action</a>
                            <a class="dropdown-item" href="#">Another action</a>
                            <a class="dropdown-item" href="#">Something else here</a>
                        </div>
                     </li>
                 </ul>    
			
				 <ul class="navbar-nav">
					 <li class="nav-item dropdown drops">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                           <b>Men</b><b class="caret"></b>
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <a class="dropdown-item" href="#">Action</a>
                            <a class="dropdown-item" href="#">Another action</a>
                            <a class="dropdown-item" href="#">Something else here</a>
                        </div>
                     </li>
                 </ul>    
		
				 <ul class="navbar-nav">
					 <li class="nav-item dropdown drops">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                           <b>Women</b><b class="caret"></b>
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <a class="dropdown-item" href="#">Action</a>
                            <a class="dropdown-item" href="#">Another action</a>
                            <a class="dropdown-item" href="#">Something else here</a>
                        </div>
                     </li>
                 </ul>    
			
				 <ul class="navbar-nav">
					 <li class="nav-item dropdown drops">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                           <b>Baby&nbsp;&amp;&nbsp;Kids</b><b class="caret"></b>
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <a class="dropdown-item" href="#">Action</a>
                            <a class="dropdown-item" href="#">Another action</a>
                            <a class="dropdown-item" href="#">Something else here</a>
                        </div>
                     </li>
                 </ul>    
			
				 <ul class="navbar-nav">
					 <li class="nav-item dropdown drops">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                           <b>Home&nbsp;&amp;&nbsp;Furniture</b><b class="caret"></b>
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <a class="dropdown-item" href="#">Action</a>
                            <a class="dropdown-item" href="#">Another action</a>
                            <a class="dropdown-item" href="#">Something else here</a>
                        </div>
                     </li>
                 </ul>
                 
                 <div class="col-md-5">
                 </div>
                 
             </div>       
       	 </nav> 
<!-- END OF ROW 2 -->
          <div class="container">
		  		<div class="row" style="background-image:url(images/texture-bw.png)">
					<div class="col-md-1">
					</div> 
					
		    		<div class="col-md-5">
			     		<h3 id="texture"><b>MY ACCOUNT</b></h3>
		    		</div>
		    		
		    	    <div class="col-md-3 home">
		    	    </div>
		    	    
		    	    <div class="col-md-3 home">
		    			<a class="li">HOME</a>/MY ACCOUNT
		    		</div>
		    	</div>	
	 	  </div>	
<!-- END OF ROW 3 -->
         <div class="container">
       			<div class="row">
       				<div class="col-md-1">
       				</div>
       				
       				<div class="col-md-6">
       				 	<br><h4 id="mytext">Change your personal details or password  here</h4><br>
       				 	<h5>Pallentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egastas.</h5>
       				    <br><hr>
       				 
       				    <h3><b>CHANGE PASSWORD</b></h3>
       				     
       				    <hr class="myline">
       				    
       				    <form action="changepassword" method="post">
     		                 <div class="row">
	       				       <div class="col-md-6">
	       				            Old Password<br>
	       				            <input type="text" size="41" name="oldpwd">
	       				            
	       				       </div>
	       				     </div>
	       				      <br>
     		                  <div class="row">
		       				       <div class="col-md-6">
		       				            New Password<br>
		       				            <input type="text" size="41" name="newpwd">
		       				            
		       				       </div>
		       				       <div class="col-md-6">
		       				            Retype password<br>
		       				            <input type="text" size="41" name="renew">
		       				       </div>
	       				      </div>
     		                  <br>
     		                  <div class="row">
	       				       <div class="col-md-4">
	       				          
	       				       </div>
	       				       <div class="col-md-4">
	       				            
	       				             <input type="submit" class="cen" id="c" value=" Save New Password">
	       				       </div>
	       				       <div class="col-md-4">
	       				       
	       				       </div>
	       				  </div>
     		                 
     		            </form>
                     
                        <hr>
                     
                        <h3><b>PERSONAL DETAILS</b></h3>
                     
	       				 <hr class="myline">
	       				 <form action="personaldetails" method="post">
	       				  <div class="row">
	       				       <div class="col-md-6">
	       				            First Name<br>
	       				            <input type="text" size="41" name="fname">
	       				            
	       				       </div>
	       				       <div class="col-md-6">
	       				            Last Name<br>
	       				            <input type="text" size="41" name="lname">
	       				       </div>
	       				  </div>
       				      <br>
     		            <div class="row">
     		               <div class="col-md-12">
		     		         Gender<br>  
		     		            &nbsp;&nbsp;<input type="radio" name="gender" value="male"> Male<br>
		                        &nbsp;&nbsp;<input type="radio" name="gender" value="female"> Female<br>
		                        &nbsp;&nbsp;<input type="radio" name="gender" value="other">Transgender
		                    </div>      
                         </div> 
                         <br>  
     		            <div class="row">
     		               <div class="col-md-12">
	     		                 Address<br>
	     		               <textarea cols="93" rows="1" name="address"></textarea>
     		               </div>      
                       </div>   
     		           <br>
     		           <div class="row">     
     		              <div class="col-md-3"> City <br> 
     		                     <input type="text" size="14" name="city">
     		               </div>
     		               <div class="col-md-3"> Zip <br> 
     		                     <input type="text" size="14" name="zip">
     		               </div>
     		               <div class="col-md-3"> State <br> 
     		                     <select name="state">
									 
									  <option value="US">US</option>
									  <option value="INDIA">INDIA</option>
									  <option value="AUSTRALIA">AUSTRALIA</option>
								</select>
     		               </div>
     		               <div class="col-md-3"> Country <br> 
     		                     <select name="country">
									 
									  <option value="US">US</option>
									  <option value="INDIA">INDIA</option>
									  <option value="AUSTRALIA">AUSTRALIA</option>
								</select>
  
     		               </div>
     		           </div>
     		           <br>
     		             <div class="row">
	       				       <div class="col-md-6">
	       				            Contact Number<br>
	       				            <input type="text" size="41" name="contact">
	       				            
	       				       </div>
	       				       <div class="col-md-6">
	       				            Email Id<br>
	       				            <input type="text" size="41" name="email">
	       				       </div>
	       				  </div>
	       				  <br>
	       				  <div class="row">
	       				       <div class="col-md-4">
	       				       </div>
	       				       <div class="col-md-4">      
     		                      <input type="submit" class="cen" id="c" value=" Save changes">
     		                          
     		                   </div>
                          </div>
                     </form>
                </div>
                
       			
       			<div class="col-md-3">
       			     <h5>
						<strong>CUSTOMER SECTION</strong>
					</h5>
					<hr class="myline">
					<ul class="nav nav-pills nav-stacked">
						<li><a href="#" class="active"><span
							class="glyphicon glyphicon-list"></span> My Orders</a></li>
						<li><a href="#" class="li"><span class="glyphicon glyphicon-heart"></span>
							My Wishlist</a></li>
						<li><a href="#" class="li"><span class="glyphicon glyphicon-user"></span>
							My Account </a></li>
						<li><a href="SignInSignUpForms.jsp" class="li"><span class="glyphicon glyphicon-log-out"></span>
							Logout</a></li>
					</ul>
       			</div>
       			
       			<div class="col-md-2"></div>
       			
          </div>
       </div> <br><br>
       </div>
<!-- --------END OF ROW 4------------- --> 
      <%@include file="BottomContainer.html" %>
<!------- END OF PARENT CONTAINER--------- -->     

</body>
</html>