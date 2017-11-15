<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ include file="/common/header.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>清空数据库</title>
    
  <script type="text/javascript">

			function doClearOne() {
			if(confirm("确认清空表一数据么？")){
				document.forms[0].action = "${basePath}cleardb/cleardb_cleardbOne.action";
				document.forms[0].submit();
				alert("清空成功");
				}
			}
			function doClearTwo() {
			if(confirm("确认清空表二数据么？")){
				document.forms[0].action = "${basePath}cleardb/cleardb_cleardbTwo.action";
				document.forms[0].submit();
				alert("清空成功");
				}
			}
			function doClearThree() {
			if(confirm("确认清空表三数据么？")){
				document.forms[0].action = "${basePath}cleardb/cleardb_cleardbThree.action";
				document.forms[0].submit();
				alert("清空成功");
				}
			}
			function doClearFour() {
			if(confirm("确认清空表四数据么？")){
				document.forms[0].action = "${basePath}cleardb/cleardb_cleardbFour.action";
				document.forms[0].submit();
				alert("清空成功");
				}
			}
			function doClearFive() {
			if(confirm("确认清空表五数据么？")){
				document.forms[0].action = "${basePath}cleardb/cleardb_cleardbFive.action";
				document.forms[0].submit();
				alert("清空成功");
				}
			}
		</script>
  </head>

<body>
	<form name="form1" action="" method="post"
		enctype="multipart/form-data">
		<div class="p_d_1">
			<div class="p_d_1_1">
				<div class="content_info">
					<div class="search_art">
						<table align="center">
							<li><input type="button" value="表一"
								class="s_button" onclick="doClearOne()" />&nbsp; <input type="button"
								value="表二" class="s_button" onclick="doClearTwo()" />&nbsp; <input
								type="button" value="表三" class="s_button" onclick="doClearThree()" />&nbsp;
								<input type="button" value="表四" class="s_button"
								onclick="doClearFour()" />&nbsp; <input type="button" value="表五"
								class="s_button" onclick="doClearFive()" />&nbsp;
							</li>
						</table>
					</div>
				</div>
			</div>
		</div>
	</form>
</body>
</html>
