<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
	<link href="${basePath}css/nsfw/css.css" rel="stylesheet" type="text/css" />
	<link href="${basePath}css/nsfw/style.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="${basePath}js/DD_belatedPNG.js" ></script>
<script type="text/javascript">
    DD_belatedPNG.fix('b, s, img, span, .prev, .next, a, input,');
</script>
<![endif]-->
<script type="text/javascript">
	function openApp(url) {
		window.top.location = url;
	}
	function delCookie() {
		top.document.cookie = "TopNode=;expires=Fri, 31 Dec 1999 23:59:59 GMT;";
	}
</script>
</head>

<body>
	<!-- 头部{ -->
	<table width="1222" border="0" align="center" cellpadding="0" cellspacing="0" background="${basePath}images/nsfw/xingzheng.png" class="top">
		<tr>
			<td width="26" height="106">&nbsp;</td>
			<td width="416" height="110" align="left" valign="middle">
				<img class="zxx_test_png" src="${basePath}images/home/ind01.png" width="550" height="50" alt="" />
			</td>
			<td width="135">&nbsp;</td>
			<td width="418">
			</td>
			<td width="300" align="right" valign="top">
				<table width="350" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td width="17" height="9"></td>
                        <td width="66" height="9"></td>
                        <td width="120" height="5"></td>
                        <td width="17" height="9"></td>
						<td width="36" height="9"></td>
						<td width="17"></td>
						<td width="46"></td>
					</tr>
					<tr>
					    <td align="center"></td>
                        <td align="left"></td>
                        <td align="left"><a><b><font color="red">欢迎您，管理员</font></b></a></td>
<%--                         <td align="center"><img src="${basePath}images/nsfw/help.png" width="12"height="17" /></td> --%>
<%-- 						<td align="left"><a href="${basePath }school/school_logout.action" target="_top">注销</a></td>
 --%>						<td width="17" align="center"><a href="${basePath }school/school_logout.action" target="_top"><img src="${basePath}images/nsfw/exit.png"width="14" height="14"/></a></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	<!-- }头部 -->
	<!-- 导航{ -->
	<div class="banner">
		<div class="menu">
			<ul class="clearfix">
				<li><a href="${basePath}common/welcome.jsp" target="mainFrame">管理</a></li>
                <li><a href="${basePath}regulation.jsp" target="mainFrame">规则</a></li>
                <li><a href="${basePath}cleardb.jsp" target="mainFrame">清空数据库</a></li>
			</ul>
		</div>
	</div>
	<!-- }导航 -->
</body>
</html>
