<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/common/header.jsp"%>
    <script type="text/javascript" src="${basePath }js/jquery/jquery-1.10.2.min.js"></script>
    <script type="text/javascript">
     var res = false;
    	//校验帐号唯一性
    	function verifyAccount(asyncFlag){
    		if(asyncFlag != false) asyncFlag = true;
    		//1、获取帐号
    		var $account = $("#account");
    		if($account.val() != ""){
    			//2、根据帐号到数据库中查询用户记录并返回结果，提示用户该帐号是否可以
    			$.ajax({
    				url:"${basePath}customer/customer_verifyAccount.action",
    				type:"get",
    				data:{"school.s_Name":$account.val()},
    				async:asyncFlag,//是否异步请求
    				success:function(msg){
    					if("true" != msg){//说明帐号已经存在
    						alert("该帐号已经被使用；请输入其它帐号！");
    						$account.focus();
    						res = false;
    					} else {
    						res = true;
    					}
    				}
    			});
    		}
    	}
    
    //执行保存
	function doSubmit() {
    	//帐号唯一性校验
   		verifyAccount(false);
   		if(res){
   		    document.forms[0].action = "${basePath}customer/customer_add.action";
   			document.forms[0].submit();
   		}
	}
    </script>
    <title>用户管理</title>
    
</head>
<body class="rightBody">
<form id="form" name="form" method="post" enctype="multipart/form-data">
    <div class="p_d_1">
        <div class="p_d_1_1">
            <div class="content_info">
    <div class="c_crumbs"><div><b></b><strong>用户管理</strong>&nbsp;-&nbsp;新增用户</div></div>
    <div class="tableH2">新增用户</div>
    <table id="baseInfo" width="100%" align="center" class="list" border="0" cellpadding="0" cellspacing="0"  >
        <tr>
            <td class="tdBg" width="200px">用户名：</td>
            <td><input type="text" id="account" name="school.s_Name" onchange="verifyAccount()"></td>
        </tr>
        <tr>
            <td class="tdBg" width="200px">密码：</td>
            <td>
               <input type="password" name="school.s_Password">
            </td>
        </tr>
        <tr>
            <td class="tdBg" width="200px">所在城市：</td>
            <td><input type="text" name="school.s_City"></td>
        </tr>
        <tr>
            <td class="tdBg" width="200px">学校主管部门：</td>
            <td><input type="text" name="school.s_Dept"></td>
        </tr>
        <tr>
            <td class="tdBg" width="200px">所属类别：</td>
            <td><input type="text" name="school.s_Type"></td>
        </tr>
        <tr>
            <td class="tdBg" width="200px">行政名称</td>
            <td><input type="text" name="school.s_Admin"></td>
        </tr>
        <tr>
            <td class="tdBg" width="200px">高职高专：</td>
            <td>
            	<input type="text" name="school.s_Manage">
            </td>
        </tr>
        <tr>
            <td class="tdBg" width="200px">地址栏：</td>
            <td><input type="text" name="school.s_Address"></td>
        </tr>
        <tr>
            <td class="tdBg" width="200px">75省属学校：</td>
            <td><input type="text" name="school.s_75"></td>
        </tr>
    </table>
    <div class="tc mt20">
        <input type="button" class="btnB2" value="保存" onclick="doSubmit()"/>
        &nbsp;&nbsp;&nbsp;&nbsp;
        <input type="button"  onclick="javascript:history.go(-1)" class="btnB2" value="返回" />
    </div>
    </div></div></div>
</form>
</body>
</html>