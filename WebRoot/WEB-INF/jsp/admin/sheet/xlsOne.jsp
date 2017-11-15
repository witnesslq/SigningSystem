<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>用户管理</title>
<%@include file="/common/header.jsp"%>
<style type="text/css">
</style>
<script type="text/javascript">
	function doEmportExcel() {
		document.forms[0].action = "{basePath}all/all_doEmportXlsOne.action";
		document.forms[0].submit();
	}
	function doImportExcel() {
		alert("请务必导入对应表格的数据");
		document.forms[0].action = "{basePath}sheet/sheet_importOneExcel.action";
		document.forms[0].submit();
	}
	function doSubmit() {
		document.forms[0].action = "{basePath}sheet/sheet_doSubmit.action";
		document.forms[0].submit();
	}

	//关于表单验证
</script>
</head>
<body class="rightBody">
	<form name="form1" action="" method="post"
		enctype="multipart/form-data">
		<div class="p_d_1">
			<div class="p_d_1_1">
				<div class="content_info">
					<div class="c_crumbs">
						<div>
							<b></b><strong>计算表一</strong>
						</div>
					</div>
					<div class="search_art">
						<li style="float:left; margin-left:30px">
						 	计算过程：<input type="button" value="导出" class="s_button" onclick="doEmportExcel()" />
						</li>
					</div>

					<div class="t_list" style="margin:0px; border:0px none;">
						<table border="1" cellspacing="0" cellpadding="0">
							<tr>
								<td colspan="16" align="center">2017年全国高校基层党组织建设情况统计表</td>
							</tr>
							<tr>
								<td colspan="16">填报单位（盖章）：</td>
							</tr>

							<tr align="center">
								<td rowspan="2" colspan="2"></td>
								<td rowspan="2">列号</td>
								<td rowspan="2">高校总数</td>
								<td>建立党委的高校</td>
								<td>建立总支部的高校</td>
								<td>建立支部的高校</td>
								<td>未建立党组织的高校</td>
								<td colspan="8">高校基层党组织总数</td>
							</tr>

							<tr align="center">
								<td>小计</td>
								<td>小计</td>
								<td>小计</td>
								<td>小计</td>
								<td>校级党委数</td>
								<td>院系级党委数</td>
								<td>院系级党总支数</td>
								<td>直属党支部数</td>
								<td>教职工党总支</td>
								<td>教职工党总支（党支部）数（含离退休人员党支部数）</td>
								<td>离退休人员党支部数</td>
								<td>学生党支部数</td>

							</tr>
							<tr align="center">
								<td colspan="2">行号</td>
								<td></td>
								<td>1</td>
								<td>2</td>
								<td>3</td>
								<td>4</td>
								<td>5</td>
								<td>6</td>
								<td>7</td>
								<td>8</td>
								<td>9</td>
								<td>10</td>
								<td>11</td>
								<td>12</td>
								<td>13</td>
							</tr>
							<tr align="center">
								<td colspan="2">总计</td>
								<td>01</td>
								<td align="center"><input type="text" style="border:0px"
									size="3px" value="${dataMap['011']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['012']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['013']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['014']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['015']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['016']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['017']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['018']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['019']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['0110']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['0111']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['0112']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['0113']}"></td>
							</tr>
							<tr align="center">
								<td rowspan="3">合计</td>
								<td>本科院校</td>
								<td>02</td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['021']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['022']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['023']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['024']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['025']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['026']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['027']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['028']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['029']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['0210']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['0211']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['0212']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['0213']}"></td>
							</tr>
							<tr align="center">
								<td>专科院校（含职业技术学院）</td>
								<td>03</td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['031']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['032']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['033']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['034']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['035']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['036']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['037']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['038']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['039']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['0310']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['0311']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['0312']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['0313']}"></td>
							</tr>
							<tr align="center">
								<td>民办高校（含独立学院）</td>
								<td>04</td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['041']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['042']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['043']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['044']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['045']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['046']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['047']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['048']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['049']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['0410']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['0411']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['0412']}"></td>
								<td><input type="text" style="border:0px" size="3px"
									value="${dataMap['0413']}"></td>
							</tr>
							<tr>
								<td align="center">说明</td>
								<td align="left" colspan="13">1.本表行列关系如下：如，列关系：01=02+03+04，行关系：1=2+3+4+5；</td>
							</tr>
							<tr>
								<td></td>
								<td colspan="13">2.统计数据截至2017年6月30日。</td>
						</table>
					</div>
				</div>
			</div>
		</div>
	</form>

</body>
</html>