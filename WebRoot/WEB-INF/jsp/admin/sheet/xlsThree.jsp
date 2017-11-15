<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>用户管理</title>
<%@include file="/common/header.jsp"%>
<script type="text/javascript">
	function doEmportExcel() {
		document.forms[0].action="{basePath}all/all_doEmportXlsThree.action";
		document.forms[0].submit();
	}
	function doImportExcel() {
	alert("请务必导入对应表格的数据");
	document.forms[0].action="{basePath}sheet/sheet_importThreeExcel.action";
	document.forms[0].submit();
	}
	//提交
	function doExportExcel(){
		confirm("确认提交吗？");
		document.forms[0].action="{basePath}sheet/sheet_doSubmitThree.action";
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
							<b></b><strong>计算表三</strong>
						</div>
					</div>
					<div class="search_art">
						<li style="float:left; margin-left:30px">
计算过程：<input type="button" value="导出" class="s_button" onclick="doEmportExcel()" />						</li>
					</div>

					<div class="t_list" style="margin:0px; border:0px none;">
						<table border="1" cellspacing="0" cellpadding="0">
							<tr>
								<td colspan="15" align="center">2017年全国高校学生党员队伍结构和党组织基本状况统计表</td>
							</tr>
							<tr>
								<td colspan="15">填报单位（盖章）：</td>
							</tr>
							<tr align="center">
								<td rowspan="3" colspan="3"></td>
								<td rowspan="3">列号</td>
								<td colspan="11">在校生党员队伍结构</td>
							</tr>
							<tr align="center">
								<td rowspan="2">在校生总数</td>
								<td colspan="5">学生党员情况</td>
								<td colspan="4">申请入党情况</td>
								<td rowspan="2">学生党支部数</td>
							</tr>
							<tr align="center">
								<td>党员总数</td>
								<td>预备党员</td>
								<td>正式党员</td>
								<td>当年发展党员数</td>
								<td>党员占学生总数的比例</td>
								<td>非党员学生数</td>
								<td>申请入党学生数</td>
								<td>入党积极分子数</td>
								<td>非党员学生申请入党比例</td>
							</tr>
							<tr align="center">
								<td colspan="3">行号</td>
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
							</tr>
							<tr align="center">
								<td colspan="3">总计</td>
								<td>001</td>
								<td><input type="text" name="dataMap['0011']" style="border:0px" size="3px" value="${dataMap['0011']}">
								</td>
								<td><input type="text" name="dataMap['0012']" style="border:0px" size="3px" value="${dataMap['0012']}">
								</td>
								<td><input type="text" name="dataMap['0013']" style="border:0px" size="3px" value="${dataMap['0013']}">
								</td>
								<td><input type="text" name="dataMap['0014']" style="border:0px" size="3px" value="${dataMap['0014']}">
								</td>
								<td><input type="text" name="dataMap['0015']" style="border:0px" size="3px" value="${dataMap['0015']}">
								</td>
								<td><input type="text" name="dataMap['0016']" style="border:0px" size="3px" value="${dataMap['0016']}">
								</td>
								<td><input type="text" name="dataMap['0017']" style="border:0px" size="3px" value="${dataMap['0017']}">
								</td>
								<td><input type="text" name="dataMap['0018']" style="border:0px" size="3px" value="${dataMap['0018']}">
								</td>
								<td><input type="text" name="dataMap['0019']" style="border:0px" size="3px" value="${dataMap['0019']}">
								</td>
								<td><input type="text" name="dataMap['00110']" style="border:0px" size="3px" value="${dataMap['00110']}">
								</td>
								<td><input type="text" name="dataMap['00111']" style="border:0px" size="3px" value="${dataMap['00111']}">
								</td>
							</tr>
							<tr align="center">
								<td colspan="3">其中少数民族数量</td>
								<td>002</td>
								<td><input type="text" name="dataMap['0021']" style="border:0px" size="3px" value="${dataMap['0021']}">
								</td>
								<td><input type="text" name="dataMap['0022']" style="border:0px" size="3px" value="${dataMap['0022']}">
								</td>
								<td><input type="text" name="dataMap['0023']" style="border:0px" size="3px" value="${dataMap['0023']}">
								</td>
								<td><input type="text" name="dataMap['0024']" style="border:0px" size="3px" value="${dataMap['0024']}">
								</td>
								<td><input type="text" name="dataMap['0025']" style="border:0px" size="3px" value="${dataMap['0025']}">
								</td>
								<td><input type="text" name="dataMap['0026']" style="border:0px" size="3px" value="${dataMap['0026']}">
								</td>
								<td><input type="text" name="dataMap['0027']" style="border:0px" size="3px" value="${dataMap['0027']}">
								</td>
								<td><input type="text" name="dataMap['0028']" style="border:0px" size="3px" value="${dataMap['0028']}">
								</td>
								<td><input type="text" name="dataMap['0029']" style="border:0px" size="3px" value="${dataMap['0029']}">
								</td>
								<td><input type="text" name="dataMap['00210']" style="border:0px" size="3px" value="${dataMap['00210']}">
								</td>
								<td><input type="text" name="dataMap['00211']" style="border:0px" size="3px" value="${dataMap['00211']}">
								</td>
							</tr>
							<tr align="center">
								<td colspan="3">其中女生数量</td>
								<td>003</td>
								<td><input type="text" name="dataMap['0031']" style="border:0px" size="3px" value="${dataMap['0031']}">
								</td>
								<td><input type="text" name="dataMap['0032']" style="border:0px" size="3px" value="${dataMap['0032']}">
								</td>
								<td><input type="text" name="dataMap['0033']" style="border:0px" size="3px" value="${dataMap['0033']}">
								</td>
								<td><input type="text" name="dataMap['0034']" style="border:0px" size="3px" value="${dataMap['0034']}">
								</td>
								<td><input type="text" name="dataMap['0035']" style="border:0px" size="3px" value="${dataMap['0035']}">
								</td>
								<td><input type="text" name="dataMap['0036']" style="border:0px" size="3px" value="${dataMap['0036']}">
								</td>
								<td><input type="text" name="dataMap['0037']" style="border:0px" size="3px" value="${dataMap['0037']}">
								</td>
								<td><input type="text" name="dataMap['0038']" style="border:0px" size="3px" value="${dataMap['0038']}">
								</td>
								<td><input type="text" name="dataMap['0039']" style="border:0px" size="3px" value="${dataMap['0039']}">
								</td>
								<td><input type="text" name="dataMap['00310']" style="border:0px" size="3px" value="${dataMap['00310']}">
								</td>
								<td><input type="text" name="dataMap['00311']" style="border:0px" size="3px" value="${dataMap['00311']}">
								</td>
							</tr>
							<tr align="center">
								<td rowspan="9">合计</td>
								<td rowspan="3">研究生</td>
								<td>小计</td>
								<td>004</td>
								<td><input type="text" name="dataMap['0041']" style="border:0px" size="3px" value="${dataMap['0041']}">
								</td>
								<td><input type="text" name="dataMap['0042']" style="border:0px" size="3px" value="${dataMap['0042']}">
								</td>
								<td><input type="text" name="dataMap['0043']" style="border:0px" size="3px" value="${dataMap['0043']}">
								</td>
								<td><input type="text" name="dataMap['0044']" style="border:0px" size="3px" value="${dataMap['0044']}">
								</td>
								<td><input type="text" name="dataMap['0045']" style="border:0px" size="3px" value="${dataMap['0045']}">
								</td>
								<td><input type="text" name="dataMap['0046']" style="border:0px" size="3px" value="${dataMap['0046']}">
								</td>
								<td><input type="text" name="dataMap['0047']" style="border:0px" size="3px" value="${dataMap['0047']}">
								</td>
								<td><input type="text" name="dataMap['0048']" style="border:0px" size="3px" value="${dataMap['0048']}">
								</td>
								<td><input type="text" name="dataMap['0049']" style="border:0px" size="3px" value="${dataMap['0049']}">
								</td>
								<td><input type="text" name="dataMap['00410']" style="border:0px" size="3px" value="${dataMap['00410']}">
								</td>
								<td><input type="text" name="dataMap['00411']" style="border:0px" size="3px" value="${dataMap['00411']}">
								</td>
							</tr>
							<tr align="center">
								<td>博士</td>
								<td>005</td>
								<td><input type="text" name="dataMap['0051']" style="border:0px" size="3px" value="${dataMap['0051']}">
								</td>
								<td><input type="text" name="dataMap['0052']" style="border:0px" size="3px" value="${dataMap['0052']}">
								</td>
								<td><input type="text" name="dataMap['0053']" style="border:0px" size="3px" value="${dataMap['0053']}">
								</td>
								<td><input type="text" name="dataMap['0054']" style="border:0px" size="3px" value="${dataMap['0054']}">
								</td>
								<td><input type="text" name="dataMap['0055']" style="border:0px" size="3px" value="${dataMap['0055']}">
								</td>
								<td><input type="text" name="dataMap['0056']" style="border:0px" size="3px" value="${dataMap['0056']}">
								</td>
								<td><input type="text" name="dataMap['0057']" style="border:0px" size="3px" value="${dataMap['0057']}">
								</td>
								<td><input type="text" name="dataMap['0058']" style="border:0px" size="3px" value="${dataMap['0058']}">
								</td>
								<td><input type="text" name="dataMap['0059']" style="border:0px" size="3px" value="${dataMap['0059']}">
								</td>
								<td><input type="text" name="dataMap['00510']" style="border:0px" size="3px" value="${dataMap['00510']}">
								</td>
								<td><input type="text" name="dataMap['00511']" style="border:0px" size="3px" value="${dataMap['00511']}">
								</td>
							</tr>
							<tr align="center">
								<td>硕士</td>
								<td>006</td>
								<td><input type="text" name="dataMap['0061']" style="border:0px" size="3px" value="${dataMap['0061']}">
								</td>
								<td><input type="text" name="dataMap['0062']" style="border:0px" size="3px" value="${dataMap['0062']}">
								</td>
								<td><input type="text" name="dataMap['0063']" style="border:0px" size="3px" value="${dataMap['0063']}">
								</td>
								<td><input type="text" name="dataMap['0064']" style="border:0px" size="3px" value="${dataMap['0064']}">
								</td>
								<td><input type="text" name="dataMap['0065']" style="border:0px" size="3px" value="${dataMap['0065']}">
								</td>
								<td><input type="text" name="dataMap['0066']" style="border:0px" size="3px" value="${dataMap['0066']}">
								</td>
								<td><input type="text" name="dataMap['0067']" style="border:0px" size="3px" value="${dataMap['0067']}">
								</td>
								<td><input type="text" name="dataMap['0068']" style="border:0px" size="3px" value="${dataMap['0068']}">
								</td>
								<td><input type="text" name="dataMap['0069']" style="border:0px" size="3px" value="${dataMap['0069']}">
								</td>
								<td><input type="text" name="dataMap['00610']" style="border:0px" size="3px" value="${dataMap['00610']}">
								</td>
								<td><input type="text" name="dataMap['00611']" style="border:0px" size="3px" value="${dataMap['00611']}">
								</td>
							</tr>
							<tr align="center">
								<td rowspan="3">普通高校本专科</td>
								<td>小计</td>
								<td>007</td>
								<td><input type="text" name="dataMap['0071']" style="border:0px" size="3px" value="${dataMap['0071']}">
								</td>
								<td><input type="text" name="dataMap['0072']" style="border:0px" size="3px" value="${dataMap['0072']}">
								</td>
								<td><input type="text" name="dataMap['0073']" style="border:0px" size="3px" value="${dataMap['0073']}">
								</td>
								<td><input type="text" name="dataMap['0074']" style="border:0px" size="3px" value="${dataMap['0074']}">
								</td>
								<td><input type="text" name="dataMap['0075']" style="border:0px" size="3px" value="${dataMap['0075']}">
								</td>
								<td><input type="text" name="dataMap['0076']" style="border:0px" size="3px" value="${dataMap['0076']}">
								</td>
								<td><input type="text" name="dataMap['0077']" style="border:0px" size="3px" value="${dataMap['0077']}">
								</td>
								<td><input type="text" name="dataMap['0078']" style="border:0px" size="3px" value="${dataMap['0078']}">
								</td>
								<td><input type="text" name="dataMap['0079']" style="border:0px" size="3px" value="${dataMap['0079']}">
								</td>
								<td><input type="text" name="dataMap['00710']" style="border:0px" size="3px" value="${dataMap['00710']}">
								</td>
								<td><input type="text" name="dataMap['00711']" style="border:0px" size="3px" value="${dataMap['00711']}">
								</td>
							</tr>
							<tr align="center">
								<td>本科</td>
								<td>008</td>
								<td><input type="text" name="dataMap['0081']" style="border:0px" size="3px" value="${dataMap['0081']}">
								</td>
								<td><input type="text" name="dataMap['0082']" style="border:0px" size="3px" value="${dataMap['0082']}">
								</td>
								<td><input type="text" name="dataMap['0083']" style="border:0px" size="3px" value="${dataMap['0083']}">
								</td>
								<td><input type="text" name="dataMap['0084']" style="border:0px" size="3px" value="${dataMap['0084']}">
								</td>
								<td><input type="text" name="dataMap['0085']" style="border:0px" size="3px" value="${dataMap['0085']}">
								</td>
								<td><input type="text" name="dataMap['0086']" style="border:0px" size="3px" value="${dataMap['0086']}">
								</td>
								<td><input type="text" name="dataMap['0087']" style="border:0px" size="3px" value="${dataMap['0087']}">
								</td>
								<td><input type="text" name="dataMap['0088']" style="border:0px" size="3px" value="${dataMap['0088']}">
								</td>
								<td><input type="text" name="dataMap['0089']" style="border:0px" size="3px" value="${dataMap['0089']}">
								</td>
								<td><input type="text" name="dataMap['00810']" style="border:0px" size="3px" value="${dataMap['00810']}">
								</td>
								<td><input type="text" name="dataMap['00811']" style="border:0px" size="3px" value="${dataMap['00811']}">
								</td>
							</tr>
							<tr align="center">
								<td>专科</td>
								<td>009</td>
					            <td><input type="text" name="dataMap['0091']" style="border:0px" size="3px" value="${dataMap['0091']}">
								</td>
								<td><input type="text" name="dataMap['0092']" style="border:0px" size="3px" value="${dataMap['0092']}">
								</td>
								<td><input type="text" name="dataMap['0093']" style="border:0px" size="3px" value="${dataMap['0093']}">
								</td>
								<td><input type="text" name="dataMap['0094']" style="border:0px" size="3px" value="${dataMap['0094']}">
								</td>
								<td><input type="text" name="dataMap['0095']" style="border:0px" size="3px" value="${dataMap['0095']}">
								</td>
								<td><input type="text" name="dataMap['0096']" style="border:0px" size="3px" value="${dataMap['0096']}">
								</td>
								<td><input type="text" name="dataMap['0097']" style="border:0px" size="3px" value="${dataMap['0097']}">
								</td>
								<td><input type="text" name="dataMap['0098']" style="border:0px" size="3px" value="${dataMap['0098']}">
								</td>
								<td><input type="text" name="dataMap['0099']" style="border:0px" size="3px" value="${dataMap['0099']}">
								</td>
								<td><input type="text" name="dataMap['00910']" style="border:0px" size="3px" value="${dataMap['00910']}">
								</td>
								<td><input type="text" name="dataMap['00911']" style="border:0px" size="3px" value="${dataMap['00911']}">
								</td>
							</tr>
							<tr align="center"0>
								<td rowspan="3">民办高校（含独立院校本专科）</td>
								<td>小计</td>
								<td>010</td>
					            <td><input type="text" name="dataMap['0101']" style="border:0px" size="3px" value="${dataMap['0101']}">
								</td>
								<td><input type="text" name="dataMap['0102']" style="border:0px" size="3px" value="${dataMap['0102']}">
								</td>
								<td><input type="text" name="dataMap['0103']" style="border:0px" size="3px" value="${dataMap['0103']}">
								</td>
								<td><input type="text" name="dataMap['0104']" style="border:0px" size="3px" value="${dataMap['0104']}">
								</td>
								<td><input type="text" name="dataMap['0105']" style="border:0px" size="3px" value="${dataMap['0105']}">
								</td>
								<td><input type="text" name="dataMap['0106']" style="border:0px" size="3px" value="${dataMap['0106']}">
								</td>
								<td><input type="text" name="dataMap['0107']" style="border:0px" size="3px" value="${dataMap['0107']}">
								</td>
								<td><input type="text" name="dataMap['0108']" style="border:0px" size="3px" value="${dataMap['0108']}">
								</td>
								<td><input type="text" name="dataMap['0109']" style="border:0px" size="3px" value="${dataMap['0109']}">
								</td>
								<td><input type="text" name="dataMap['01010']" style="border:0px" size="3px" value="${dataMap['01010']}">
								</td>
								<td><input type="text" name="dataMap['01011']" style="border:0px" size="3px" value="${dataMap['01011']}">
								</td>
							</tr>
							<tr align="center">
								<td>本科</td>
								<td>011</td>
						        <td><input type="text" name="dataMap['0111']" style="border:0px" size="3px" value="${dataMap['0111']}">
								</td>
								<td><input type="text" name="dataMap['0112']" style="border:0px" size="3px" value="${dataMap['0112']}">
								</td>
								<td><input type="text" name="dataMap['0113']" style="border:0px" size="3px" value="${dataMap['0113']}">
								</td>
								<td><input type="text" name="dataMap['0114']" style="border:0px" size="3px" value="${dataMap['0114']}">
								</td>
								<td><input type="text" name="dataMap['0115']" style="border:0px" size="3px" value="${dataMap['0115']}">
								</td>
								<td><input type="text" name="dataMap['0116']" style="border:0px" size="3px" value="${dataMap['0116']}">
								</td>
								<td><input type="text" name="dataMap['0117']" style="border:0px" size="3px" value="${dataMap['0117']}">
								</td>
								<td><input type="text" name="dataMap['0118']" style="border:0px" size="3px" value="${dataMap['0118']}">
								</td>
								<td><input type="text" name="dataMap['0119']" style="border:0px" size="3px" value="${dataMap['0119']}">
								</td>
								<td><input type="text" name="dataMap['01110']" style="border:0px" size="3px" value="${dataMap['01110']}">
								</td>
								<td><input type="text" name="dataMap['01111']" style="border:0px" size="3px" value="${dataMap['01111']}">
								</td>
							</tr>
							<tr align="center">
								<td>专科</td>
								<td>012</td>
					            <td><input type="text" name="dataMap['0121']" style="border:0px" size="3px" value="${dataMap['0121']}">
								</td>
								<td><input type="text" name="dataMap['0122']" style="border:0px" size="3px" value="${dataMap['0122']}">
								</td>
								<td><input type="text" name="dataMap['0123']" style="border:0px" size="3px" value="${dataMap['0123']}">
								</td>
								<td><input type="text" name="dataMap['0124']" style="border:0px" size="3px" value="${dataMap['0124']}">
								</td>
								<td><input type="text" name="dataMap['0125']" style="border:0px" size="3px" value="${dataMap['0125']}">
								</td>
								<td><input type="text" name="dataMap['0126']" style="border:0px" size="3px" value="${dataMap['0126']}">
								</td>
								<td><input type="text" name="dataMap['0127']" style="border:0px" size="3px" value="${dataMap['0127']}">
								</td>
								<td><input type="text" name="dataMap['0128']" style="border:0px" size="3px" value="${dataMap['0128']}">
								</td>
								<td><input type="text" name="dataMap['0129']" style="border:0px" size="3px" value="${dataMap['0129']}">
								</td>
								<td><input type="text" name="dataMap['01210']" style="border:0px" size="3px" value="${dataMap['01210']}">
								</td>
								<td><input type="text" name="dataMap['01211']" style="border:0px" size="3px" value="${dataMap['01211']}">
								</td>
							</tr>
							<tr>
								<td align="center">说明</td>
								<td align="left" colspan="14">1.本表行列关系如下：如，列关系：001=004+007+010，行关系：1=2+7；2=3+4;</td>
							</tr>
							<tr>
								<td></td>
								<td colspan="14">2.统计数据截至2017年6月30日。</td>
							</tr>
						</table>
					</div>
				</div>
			</div>
		</div>
	</form>

</body>
</html>