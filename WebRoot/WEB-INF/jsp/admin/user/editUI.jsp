<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/common/header.jsp"%>
    <script type="text/javascript" src="${basePath }js/datepicker/WdatePicker.js"></script>
    <script type="text/javascript" src="${basePath }js/jquery/jquery-1.10.2.min.js"></script>
    <title>用户管理</title>
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
   		function doSubmit() {
			   	//帐号唯一性校验
	   		verifyAccount(false);
	   		if(res){
	   		    document.forms[0].action = "${basePath}customer/customer_edit.action";
	   			document.forms[0].submit();
	   		}
		}
    </script>
</head>
<body class="rightBody">
<form id="form" name="form" action="${basePath }/nsfw/user_edit.action" method="post" enctype="multipart/form-data">
    <div class="p_d_1">
        <div class="p_d_1_1">
            <div class="content_info">
    <div class="c_crumbs"><div><b></b><strong>用户管理</strong>&nbsp;-&nbsp;编辑用户</div></div>
    <div class="tableH2">编辑用户</div>
    <table id="baseInfo" width="100%" align="center" class="list" border="0" cellpadding="0" cellspacing="0"  >
        <tr>
            <td class="tdBg" width="200px">用户名：</td>
            <td><input type="text" id="account" name="school.s_Name" value="${school.s_Name}" onchange="verifyAccount()"></td>
        </tr>
        <tr>
            <td class="tdBg" width="200px">密码：</td>
            <td>
               <input type="password" name="school.s_Password" value="${school.s_Password}">
            </td>
        </tr>
        <tr>
            <td class="tdBg" width="200px">所在城市：</td>
            <td><input type="text" name="school.s_City" value="${school.s_City}"></td>
        </tr>
        <tr>
            <td class="tdBg" width="200px">学校主管部门：</td>
            <td><input type="text" name="school.s_Dept" value="${school.s_Dept}"></td>
        </tr>
        <tr>
            <td class="tdBg" width="200px">所属类别：</td>
            <td><input type="text" name="school.s_Type" value="${school.s_Type}"></td>
        </tr>
        <tr>
            <td class="tdBg" width="200px">行政名称</td>
            <td><input type="text" name="school.s_Admin" value="${school.s_Admin}"></td>
        </tr>
        <tr>
            <td class="tdBg" width="200px">高职高专：</td>
            <td>
            	<input type="text" name="school.s_Manage" value="${school.s_Manage}">
            </td>
        </tr>
        <tr>
            <td class="tdBg" width="200px">地址栏：</td>
            <td><input type="text" name="school.s_Address" value="${school.s_Address}"></td>
        </tr>
        <tr>
            <td class="tdBg" width="200px">75省属学校：</td>
            <td><input type="text" name="school.s_75" value="${school.s_75}"></td>
        </tr>
    </table>
    <!-- id隐藏域 -->
    <input type="hidden" name="school.s_Id" value="${school.s_Id}"/>
    <div class="tc mt20">
        <input type="button" class="btnB2" value="保存" onclick="doSubmit()"/>
        &nbsp;&nbsp;&nbsp;&nbsp;
        <input type="button"  onclick="javascript:history.go(-1)" class="btnB2" value="返回" />
    </div>
    </div></div></div>
</form>
</body>
</html>