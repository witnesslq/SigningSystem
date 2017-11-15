<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
request.setAttribute("basePath", path);
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<link href="${basePath}/css/loginAdmin.css" type="text/css" rel="stylesheet">
<script type="text/javascript">

	function logins(){
		document.forms[0].submit(); 
	}

	function setClean(){
		document.getElementById("account").value = "";
		document.getElementById("password").value = "";
	}
	
	/* //解决session里的user清空后，出现的登录页面嵌入的问题
	if(window != window.parent) {
		window.parent.location.reload();
	} */
</script>
<style type="text/css">
html { overflow-y: hidden;  }

.password{
      background-color:#f1f3f6;
	  border:1px solid #f1f3f6;
	  font-color:#ccc;
	  outline:none;
}

#Layer1 {
	position:absolute;
	left:224px;
	top:479px;
	padding-top:5px;
	width:99px;
	height:21px;
	background-color:#fff;
	z-index:1;
}
.password1 {      
	 background-color:#f1f3f6;
	  border:1px solid #f1f3f6;
	  font-color:#ccc;
}
#account {
	outline:none;
}

.youbian input{ border:0px none; background-color:transparent; color:#555;padding-left:10px;font-size:16px;width:100%;overflow: hidden;}
</style>
</head>
<body scroll="no">
<form action="${basePath}/admin/admin_login.action" method="post">
<div id="lo_tf">
<div class="outside">
    <div class="head">
      <table width="1000" height="60" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td width="840" align="left"><img src="${basePath}/images/login/form_03.png"   width="550" height="50"/></td>
          <td align="center">&nbsp;&nbsp;<a href="#"></a></td>
        </tr>
      </table>
    </div>
    <div class="main2">
	   <div class="content">  
	   <div class="youbian">
	    <table width="251" border="0" cellpadding="0" cellspacing="0">
          <tr>
            <td height="12">&nbsp;</td>
          </tr>
          <tr>
           <td height="45" align="left"></td>
          </tr>
          <tr>
          	<td height="13">&nbsp;
            	<span><div height=20 valign="middle" style="padding-left: 18px"><font color="red" id="errMsg">
            	<!-- 登录验证信息 -->
            	</font></div></span>
            </td>
          </tr>
          <tr>
            <td height="40">
			<table width="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    	<td height="32" align="left"><span style="color:#767676;font-size:14px;">帐&nbsp;号:</span>
   <c:choose>
        <c:when test="${loginResult=='defeat'}">
         <span id="msg" style="font-size: 15px"><font color="red">用户名或密码错误</font></span>                     	
        </c:when>	                      
   </c:choose>
  </tr>
</table>

			<table width="100%" height="39" border="0" cellpadding="0" cellspacing="0">
              <tr>
                <td background="${basePath}/images/login/shuru_03.png" width=""><table width="100%" border="0" cellpadding="0" cellspacing="0">
                  <tr>
                    <td align="left">
                    <!-- <s:textfield id="account" name="user.account" cssClass="password1" cssStyle="color: #767676" size="31"/> -->
                    <input type="text" id="account" name="admin.s_Name" class="password1">
                    </td>
                  </tr>
                </table></td>
              </tr>
            </table></td>
          </tr>
		    <tr>
            <td height="10"><table width="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="32" align="left"><span style="color:#767676;font-size:14px;">密&nbsp;码:</span></td>
  </tr>
</table></td>
          </tr>
          <tr>
            <td height="40"><table width="100%" height="39" border="0" cellpadding="0" cellspacing="0">
              <tr>
                <td background="${basePath}/images/login/shuru_03.png"><table width="100%" border="0" cellpadding="0" cellspacing="0">
                  <tr>
                    <td align="left">
                    	<!-- <s:password id="password" name="user.password" cssClass="password"  cssStyle="color: #767676" size="31"/> -->
                    	<input type="password" id="password" name="admin.s_Password" class="password">
                    </td>
                  </tr>
                </table></td>
              </tr>
            </table></td>
          </tr>
          
		   <tr>
            <td height="10">&nbsp;</td>
          </tr>
          <tr>
            <td height="40"><table width="100%" border="0" cellpadding="0" cellspacing="0">
              <tr>
                <td align="right"><a href="#" onclick="javascript:logins();"><img src="${basePath}/images/login/form_15.png" width="95" height="37"/></a></td>
                <td width="18">&nbsp;</td>
                <td align="left"><img src="${basePath}/images/login/form_17.png" width="95" height="37" onclick="setClean()"/></td>
              </tr>
            </table></td>
          </tr>
        </table>
	    
	  </div>   
       </div>
   </div>
	<div class="foot">©版权所有:辽宁省教育厅&nbsp;|&nbsp;地址:辽宁省沈阳市皇姑区崇山东路46-1号&nbsp;|&nbsp;邮编:110032
		<br/>
		研发与技术支持:&nbsp;&nbsp;小强&nbsp;青決&nbsp;&nbsp;开发小组
	</div>
</div>
</div>
</form>
</body>
</html>