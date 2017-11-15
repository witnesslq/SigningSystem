<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>用户管理</title>
<%@include file="/common/header.jsp"%>
<script type="text/javascript">
	function doEmportExcel() {
		document.forms[0].action="{basePath}all/all_doEmportXlsFour.action";
		document.forms[0].submit();
	}
	function doImportExcel() {
		alert("请务必导入对应表格的数据");
		document.forms[0].action="{basePath}sheet/sheet_importFourExcel.action";
		document.forms[0].submit();
	}
	//提交
	function doExportExcel(){
		confirm("确认提交吗？");
		document.forms[0].action="{basePath}sheet/sheet_doSubmitFour.action";
		document.forms[0].submit();
	}
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
							<b></b><strong>计算表四</strong>
						</div>
					</div>
					<div class="search_art">
						<li style="float:left; margin-left:30px">
计算过程：<input type="button" value="导出" class="s_button" onclick="doEmportExcel()" />						</li>
					</div>

					<div class="t_list" style="margin:0px; border:0px none;">
						<table border="1" cellspacing="0" cellpadding="0" width="955px">
							<tr>
								<td colspan="14" align="center">2017年全国高校与党组织失去联系党员情况汇总表</td>
							</tr>
							<tr>
								<td colspan="14">填报单位（盖章）：</td>
							</tr>
							<tr align="center">
								<td rowspan="2"></td>
								<td rowspan="2">列号</td>
								<td rowspan="2">截止2017年6月30日未取得联系党员数量</td>
								<td colspan="4">失去联系时间</td>
								<td colspan="6">失去联系情形</td>
								<td rowspan="2">一年内已取得联系党员数量</td>
							</tr>
							<tr align="center">
								<td height="40">6个月以上不满1年</td>
								<td>1年至5年</td>
								<td>6年至10年</td>
								<td>11年及以上</td>
								<td>离职</td>
								<td>毕业后去向不明</td>
								<td>工作单位改变</td>
								<td>出国（境）</td>
								<td>居住地改变</td>
								<td>其他</td>
							</tr>
							<tr align="center">
								<td>行号</td>
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
							</tr>
							<tr align="center">
								<td>总计</td>
								<td>01</td>
								<td><input type="text" name="dataMap['011']" style="border:0px" size="3px" value="${dataMap['011']}">
								</td>
								<td><input type="text" name="dataMap['012']" style="border:0px" size="3px" value="${dataMap['012']}">
								</td>
								<td><input type="text" name="dataMap['013']" style="border:0px" size="3px" value="${dataMap['013']}">
								</td>
								<td><input type="text" name="dataMap['014']" style="border:0px" size="3px" value="${dataMap['014']}">
								</td>
								<td><input type="text" name="dataMap['015']" style="border:0px" size="3px" value="${dataMap['015']}">
								</td>
								<td><input type="text" name="dataMap['016']" style="border:0px" size="3px" value="${dataMap['016']}">
								</td>
								<td><input type="text" name="dataMap['017']" style="border:0px" size="3px" value="${dataMap['017']}">
								</td>
								<td><input type="text" name="dataMap['018']" style="border:0px" size="3px" value="${dataMap['018']}">
								</td>
								<td><input type="text" name="dataMap['019']" style="border:0px" size="3px" value="${dataMap['019']}">
								</td>
								<td><input type="text" name="dataMap['0110']" style="border:0px" size="3px" value="${dataMap['0110']}">
								</td>
								<td><input type="text" name="dataMap['0111']" style="border:0px" size="3px" value="${dataMap['0111']}">
								</td>
								<td><input type="text" name="dataMap['0112']" style="border:0px" size="3px" value="${dataMap['0112']}">
								</td>
							</tr>
							<tr align="center">
								<td>教职工（含解除劳动关系的）</td>
								<td>02</td>
								<td><input type="text" name="dataMap['021']" style="border:0px" size="3px" value="${dataMap['021']}">
								</td>
								<td><input type="text" name="dataMap['022']" style="border:0px" size="3px" value="${dataMap['022']}">
								</td>
								<td><input type="text" name="dataMap['023']" style="border:0px" size="3px" value="${dataMap['023']}">
								</td>
								<td><input type="text" name="dataMap['024']" style="border:0px" size="3px" value="${dataMap['024']}">
								</td>
								<td><input type="text" name="dataMap['025']" style="border:0px" size="3px" value="${dataMap['025']}">
								</td>
								<td><input type="text" name="dataMap['026']" style="border:0px" size="3px" value="${dataMap['026']}">
								</td>
								<td><input type="text" name="dataMap['027']" style="border:0px" size="3px" value="${dataMap['027']}">
								</td>
								<td><input type="text" name="dataMap['028']" style="border:0px" size="3px" value="${dataMap['028']}">
								</td>
								<td><input type="text" name="dataMap['029']" style="border:0px" size="3px" value="${dataMap['029']}">
								</td>
								<td><input type="text" name="dataMap['0210']" style="border:0px" size="3px" value="${dataMap['0210']}">
								</td>
								<td><input type="text" name="dataMap['0211']" style="border:0px" size="3px" value="${dataMap['0211']}">
								</td>
								<td><input type="text" name="dataMap['0212']" style="border:0px" size="3px" value="${dataMap['0212']}">
								</td>
							</tr>
							<tr align="center">
								<td>离退休人员</td>
								<td>03</td>
								<td><input type="text" name="dataMap['031']" style="border:0px" size="3px" value="${dataMap['031']}">
								</td>
								<td><input type="text" name="dataMap['032']" style="border:0px" size="3px" value="${dataMap['032']}">
								</td>
								<td><input type="text" name="dataMap['033']" style="border:0px" size="3px" value="${dataMap['033']}">
								</td>
								<td><input type="text" name="dataMap['034']" style="border:0px" size="3px" value="${dataMap['034']}">
								</td>
								<td><input type="text" name="dataMap['035']" style="border:0px" size="3px" value="${dataMap['035']}">
								</td>
								<td><input type="text" name="dataMap['036']" style="border:0px" size="3px" value="${dataMap['036']}">
								</td>
								<td><input type="text" name="dataMap['037']" style="border:0px" size="3px" value="${dataMap['037']}">
								</td>
								<td><input type="text" name="dataMap['038']" style="border:0px" size="3px" value="${dataMap['038']}">
								</td>
								<td><input type="text" name="dataMap['039']" style="border:0px" size="3px" value="${dataMap['039']}">
								</td>
								<td><input type="text" name="dataMap['0310']" style="border:0px" size="3px" value="${dataMap['0310']}">
								</td>
								<td><input type="text" name="dataMap['0311']" style="border:0px" size="3px" value="${dataMap['0311']}">
								</td>
								<td><input type="text" name="dataMap['0312']" style="border:0px" size="3px" value="${dataMap['0312']}">
								</td>
							</tr>
							<tr align="center">
								<td>高校毕业生</td>
								<td>04</td>
								<td><input type="text" name="dataMap['041']" style="border:0px" size="3px" value="${dataMap['041']}">
								</td>
								<td><input type="text" name="dataMap['042']" style="border:0px" size="3px" value="${dataMap['042']}">
								</td>
								<td><input type="text" name="dataMap['043']" style="border:0px" size="3px" value="${dataMap['043']}">
								</td>
								<td><input type="text" name="dataMap['044']" style="border:0px" size="3px" value="${dataMap['044']}">
								</td>
								<td><input type="text" name="dataMap['045']" style="border:0px" size="3px" value="${dataMap['045']}">
								</td>
								<td><input type="text" name="dataMap['046']" style="border:0px" size="3px" value="${dataMap['046']}">
								</td>
								<td><input type="text" name="dataMap['047']" style="border:0px" size="3px" value="${dataMap['047']}">
								</td>
								<td><input type="text" name="dataMap['048']" style="border:0px" size="3px" value="${dataMap['048']}">
								</td>
								<td><input type="text" name="dataMap['049']" style="border:0px" size="3px" value="${dataMap['049']}">
								</td>
								<td><input type="text" name="dataMap['0410']" style="border:0px" size="3px" value="${dataMap['0410']}">
								</td>
								<td><input type="text" name="dataMap['0411']" style="border:0px" size="3px" value="${dataMap['0411']}">
								</td>
								<td><input type="text" name="dataMap['0412']" style="border:0px" size="3px" value="${dataMap['0412']}">
								</td>
							</tr>
							<tr align="center">
								<td>其他</td>
								<td>05</td>
								<td><input type="text" name="dataMap['051']" style="border:0px" size="3px" value="${dataMap['051']}">
								</td>
								<td><input type="text" name="dataMap['052']" style="border:0px" size="3px" value="${dataMap['052']}">
								</td>
								<td><input type="text" name="dataMap['053']" style="border:0px" size="3px" value="${dataMap['053']}">
								</td>
								<td><input type="text" name="dataMap['054']" style="border:0px" size="3px" value="${dataMap['054']}">
								</td>
								<td><input type="text" name="dataMap['055']" style="border:0px" size="3px" value="${dataMap['055']}">
								</td>
								<td><input type="text" name="dataMap['056']" style="border:0px" size="3px" value="${dataMap['056']}">
								</td>
								<td><input type="text" name="dataMap['057']" style="border:0px" size="3px" value="${dataMap['057']}">
								</td>
								<td><input type="text" name="dataMap['058']" style="border:0px" size="3px" value="${dataMap['058']}">
								</td>
								<td><input type="text" name="dataMap['059']" style="border:0px" size="3px" value="${dataMap['059']}">
								</td>
								<td><input type="text" name="dataMap['0510']" style="border:0px" size="3px" value="${dataMap['0510']}">
								</td>
								<td><input type="text" name="dataMap['0511']" style="border:0px" size="3px" value="${dataMap['0511']}">
								</td>
								<td><input type="text" name="dataMap['0512']" style="border:0px" size="3px" value="${dataMap['0512']}">
								</td>
							</tr>
							<tr align="center">
								<td align="center">说明</td>
								<td align="left" colspan="13">1.本表行列关系如下：如，列关系：01=02+03+04+05，行关系：1=2+3+4+5；1=6+7+8+9+10+11；</td>
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