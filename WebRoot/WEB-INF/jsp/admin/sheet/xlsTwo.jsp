<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>用户管理</title>
<%@include file="/common/header.jsp"%>
<script type="text/javascript">
	//模版下载
	function doEmportExcel() {
		document.forms[0].action="{basePath}all/all_doEmportXlsTwo.action";
		document.forms[0].submit();
	}
	function doImportExcel() { 
		alert("请务必导入对应表格的数据");
		document.forms[0].action="{basePath}sheet/sheet_importTwoExcel.action";
		document.forms[0].submit();
	}
	//提交
	function doExportExcel(){
		confirm("确认提交吗？");
		document.forms[0].action="{basePath}sheet/sheet_doSubmitTwo.action";
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
							<b></b><strong>计算表二</strong>
						</div>
					</div>
					<div class="search_art">
						<li style="float:left; margin-left:30px">
计算过程：<input type="button" value="导出" class="s_button" onclick="doEmportExcel()" />						</li>
					</div>

					<div class="t_list" style="margin:0px; border:0px none;">
						<table border="1" cellspacing="0" cellpadding="0">
							<tr>
								<td colspan="22" align="center">2017年全国高校教职工党员队伍结构和党组织基本状况统计表</td>
							</tr>
							<tr>
								<td colspan="22">填报单位（盖章）：</td>
							</tr>
							<tr align="center">
								<td rowspan="3" colspan="2"></td>
								<td rowspan="3">列号</td>
								<td colspan="2">教职工数</td>
								<td colspan="16">专任教师党员队伍结构</td>
								<td rowspan="3">离退休人员党员总数</td>
							</tr>
							
							<tr align="center">
								<td rowspan="2">教职工总数</td>
								<td rowspan="2">其中：党员总数</td>
								<td rowspan="2">专任教师总数</td>
								<td rowspan="2">其中：35岁及以下青年教师数</td>
								<td colspan="4">专任教师党员数</td>
								<td colspan="4">非党教师申请入党情况</td>
								<td colspan="3">专任教师党员职称结构</td>
								<td colspan="3">专任教师党员学历结构</td>
							</tr>
							<tr align="center">
								<td>党员总数</td>
								<td>35岁及以下党员数</td>
								<td>当年发展党员数</td>
								<td>专任教师党员占专任教师比例％</td>
								<td>非党员数</td>
								<td>非党教师申请入党人员数</td>
								<td>入党积极分子数</td>
								<td>非党教师中申请入党人员比例％</td>
								<td>正高级</td>
								<td>副高级</td>
								<td>其他</td>
								<td>博士</td>
								<td>硕士</td>
								<td>其他</td>
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
								<td>14</td>
								<td>15</td>
								<td>16</td>
								<td>17</td>
								<td>18</td>
								<td>19</td>
							</tr>
							<tr align="center">
								<td colspan="2">总计</td>
								<td>01</td>
								<td><input type="text" name="dataMap['011']" style="border:0px" size="1px" value="${dataMap['011']}">
								</td>
								<td><input type="text" name="dataMap['012']" style="border:0px" size="1px" value="${dataMap['012']}">
								</td>
								<td><input type="text" name="dataMap['013']" style="border:0px" size="1px" value="${dataMap['013']}">
								</td>
								<td><input type="text" name="dataMap['014']" style="border:0px" size="1px" value="${dataMap['014']}">
								</td>
								<td><input type="text" name="dataMap['015']" style="border:0px" size="1px" value="${dataMap['015']}">
								</td>
								<td><input type="text" name="dataMap['016']" style="border:0px" size="1px" value="${dataMap['016']}">
								</td>
								<td><input type="text" name="dataMap['017']" style="border:0px" size="1px" value="${dataMap['017']}">
								</td>
								<td><input type="text" name="dataMap['018']" style="border:0px" size="1px" value="${dataMap['018']}">
								</td>
								<td><input type="text" name="dataMap['019']" style="border:0px" size="1px" value="${dataMap['019']}">
								</td>
								<td><input type="text" name="dataMap['0110']" style="border:0px" size="1px" value="${dataMap['0110']}">
								</td>
								<td><input type="text" name="dataMap['0111']" style="border:0px" size="1px" value="${dataMap['0111']}">
								</td>
								<td><input type="text" name="dataMap['0112']" style="border:0px" size="1px" value="${dataMap['0112']}">
								</td>
								<td><input type="text" name="dataMap['0113']" style="border:0px" size="1px" value="${dataMap['0113']}">
								</td>
								<td><input type="text" name="dataMap['0114']" style="border:0px" size="1px" value="${dataMap['0114']}">
								</td>
								<td><input type="text" name="dataMap['0115']" style="border:0px" size="1px" value="${dataMap['0115']}">
								</td>
								<td><input type="text" name="dataMap['0116']" style="border:0px" size="1px" value="${dataMap['0116']}">
								</td>
								<td><input type="text" name="dataMap['0117']" style="border:0px" size="1px" value="${dataMap['0117']}">
								</td>
								<td><input type="text" name="dataMap['0118']" style="border:0px" size="1px" value="${dataMap['0118']}">
								</td>
								<td><input type="text" name="dataMap['0119']" style="border:0px" size="1px" value="${dataMap['0119']}">
								</td>
							</tr>
							<tr align="center">
								<td colspan="2">其中少数民族数量</td>
								<td>02</td>
								<td><input type="text" name="dataMap['021']" style="border:0px" size="1px" value="${dataMap['021']}">
								</td>
								<td><input type="text" name="dataMap['022']" style="border:0px" size="1px" value="${dataMap['022']}">
								</td>
								<td><input type="text" name="dataMap['023']" style="border:0px" size="1px" value="${dataMap['023']}">
								</td>
								<td><input type="text" name="dataMap['024']" style="border:0px" size="1px" value="${dataMap['024']}">
								</td>
								<td><input type="text" name="dataMap['025']" style="border:0px" size="1px" value="${dataMap['025']}">
								</td>
								<td><input type="text" name="dataMap['026']" style="border:0px" size="1px" value="${dataMap['026']}">
								</td>
								<td><input type="text" name="dataMap['027']" style="border:0px" size="1px" value="${dataMap['027']}">
								</td>
								<td><input type="text" name="dataMap['028']" style="border:0px" size="1px" value="${dataMap['028']}">
								</td>
								<td><input type="text" name="dataMap['029']" style="border:0px" size="1px" value="${dataMap['029']}">
								</td>
								<td><input type="text" name="dataMap['0210']" style="border:0px" size="1px" value="${dataMap['0210']}">
								</td>
								<td><input type="text" name="dataMap['0211']" style="border:0px" size="1px" value="${dataMap['0211']}">
								</td>
								<td><input type="text" name="dataMap['0212']" style="border:0px" size="1px" value="${dataMap['0212']}">
								</td>
								<td><input type="text" name="dataMap['0213']" style="border:0px" size="1px" value="${dataMap['0213']}">
								</td>
								<td><input type="text" name="dataMap['0214']" style="border:0px" size="1px" value="${dataMap['0214']}">
								</td>
								<td><input type="text" name="dataMap['0215']" style="border:0px" size="1px" value="${dataMap['0215']}">
								</td>
								<td><input type="text" name="dataMap['0216']" style="border:0px" size="1px" value="${dataMap['0216']}">
								</td>
								<td><input type="text" name="dataMap['0217']" style="border:0px" size="1px" value="${dataMap['0217']}">
								</td>
								<td><input type="text" name="dataMap['0218']" style="border:0px" size="1px" value="${dataMap['0218']}">
								</td>
								<td><input type="text" name="dataMap['0219']" style="border:0px" size="1px" value="${dataMap['0219']}">
								</td>
							</tr>
							<tr align="center">
								<td colspan="2">其中女性数量</td>
								<td>03</td>
								<td><input type="text" name="dataMap['031']" style="border:0px" size="1px" value="${dataMap['031']}">
								</td>
								<td><input type="text" name="dataMap['032']" style="border:0px" size="1px" value="${dataMap['032']}">
								</td>
								<td><input type="text" name="dataMap['033']" style="border:0px" size="1px" value="${dataMap['033']}">
								</td>
								<td><input type="text" name="dataMap['034']" style="border:0px" size="1px" value="${dataMap['034']}">
								</td>
								<td><input type="text" name="dataMap['035']" style="border:0px" size="1px" value="${dataMap['035']}">
								</td>
								<td><input type="text" name="dataMap['036']" style="border:0px" size="1px" value="${dataMap['036']}">
								</td>
								<td><input type="text" name="dataMap['037']" style="border:0px" size="1px" value="${dataMap['037']}">
								</td>
								<td><input type="text" name="dataMap['038']" style="border:0px" size="1px" value="${dataMap['038']}">
								</td>
								<td><input type="text" name="dataMap['039']" style="border:0px" size="1px" value="${dataMap['039']}">
								</td>
								<td><input type="text" name="dataMap['0310']" style="border:0px" size="1px" value="${dataMap['0310']}">
								</td>
								<td><input type="text" name="dataMap['0311']" style="border:0px" size="1px" value="${dataMap['0311']}">
								</td>
								<td><input type="text" name="dataMap['0312']" style="border:0px" size="1px" value="${dataMap['0312']}">
								</td>
								<td><input type="text" name="dataMap['0313']" style="border:0px" size="1px" value="${dataMap['0313']}">
								</td>
								<td><input type="text" name="dataMap['0314']" style="border:0px" size="1px" value="${dataMap['0314']}">
								</td>
								<td><input type="text" name="dataMap['0315']" style="border:0px" size="1px" value="${dataMap['0315']}">
								</td>
								<td><input type="text" name="dataMap['0316']" style="border:0px" size="1px" value="${dataMap['0316']}">
								</td>
								<td><input type="text" name="dataMap['0317']" style="border:0px" size="1px" value="${dataMap['0317']}">
								</td>
								<td><input type="text" name="dataMap['0318']" style="border:0px" size="1px" value="${dataMap['0318']}">
								</td>
								<td><input type="text" name="dataMap['0319']" style="border:0px" size="1px" value="${dataMap['0319']}">
								</td>
							</tr>
							<tr align="center">
								<td rowspan="3">合计</td>
								<td>普通本科院校</td>
								<td>04</td>
								<td><input type="text" name="dataMap['041']" style="border:0px" size="1px" value="${dataMap['041']}">
								</td>
								<td><input type="text" name="dataMap['042']" style="border:0px" size="1px" value="${dataMap['042']}">
								</td>
								<td><input type="text" name="dataMap['043']" style="border:0px" size="1px" value="${dataMap['043']}">
								</td>
								<td><input type="text" name="dataMap['044']" style="border:0px" size="1px" value="${dataMap['044']}">
								</td>
								<td><input type="text" name="dataMap['045']" style="border:0px" size="1px" value="${dataMap['045']}">
								</td>
								<td><input type="text" name="dataMap['046']" style="border:0px" size="1px" value="${dataMap['046']}">
								</td>
								<td><input type="text" name="dataMap['047']" style="border:0px" size="1px" value="${dataMap['047']}">
								</td>
								<td><input type="text" name="dataMap['048']" style="border:0px" size="1px" value="${dataMap['048']}">
								</td>
								<td><input type="text" name="dataMap['049']" style="border:0px" size="1px" value="${dataMap['049']}">
								</td>
								<td><input type="text" name="dataMap['0410']" style="border:0px" size="1px" value="${dataMap['0410']}">
								</td>
								<td><input type="text" name="dataMap['0411']" style="border:0px" size="1px" value="${dataMap['0411']}">
								</td>
								<td><input type="text" name="dataMap['0412']" style="border:0px" size="1px" value="${dataMap['0412']}">
								</td>
								<td><input type="text" name="dataMap['0413']" style="border:0px" size="1px" value="${dataMap['0413']}">
								</td>
								<td><input type="text" name="dataMap['0414']" style="border:0px" size="1px" value="${dataMap['0414']}">
								</td>
								<td><input type="text" name="dataMap['0415']" style="border:0px" size="1px" value="${dataMap['0415']}">
								</td>
								<td><input type="text" name="dataMap['0416']" style="border:0px" size="1px" value="${dataMap['0416']}">
								</td>
								<td><input type="text" name="dataMap['0417']" style="border:0px" size="1px" value="${dataMap['0417']}">
								</td>
								<td><input type="text" name="dataMap['0418']" style="border:0px" size="1px" value="${dataMap['0418']}">
								</td>
								<td><input type="text" name="dataMap['0419']" style="border:0px" size="1px" value="${dataMap['0419']}">
								</td>
							</tr>
							<tr align="center">
								<td>专科院校（含职业技术学院）</td>
								<td>05</td>
								<td><input type="text" name="dataMap['051']" style="border:0px" size="1px" value="${dataMap['051']}">
								</td>
								<td><input type="text" name="dataMap['052']" style="border:0px" size="1px" value="${dataMap['052']}">
								</td>
								<td><input type="text" name="dataMap['053']" style="border:0px" size="1px" value="${dataMap['053']}">
								</td>
								<td><input type="text" name="dataMap['054']" style="border:0px" size="1px" value="${dataMap['054']}">
								</td>
								<td><input type="text" name="dataMap['055']" style="border:0px" size="1px" value="${dataMap['055']}">
								</td>
								<td><input type="text" name="dataMap['056']" style="border:0px" size="1px" value="${dataMap['056']}">
								</td>
								<td><input type="text" name="dataMap['057']" style="border:0px" size="1px" value="${dataMap['057']}">
								</td>
								<td><input type="text" name="dataMap['058']" style="border:0px" size="1px" value="${dataMap['058']}">
								</td>
								<td><input type="text" name="dataMap['059']" style="border:0px" size="1px" value="${dataMap['059']}">
								</td>
								<td><input type="text" name="dataMap['0510']" style="border:0px" size="1px" value="${dataMap['0510']}">
								</td>
								<td><input type="text" name="dataMap['0511']" style="border:0px" size="1px" value="${dataMap['0511']}">
								</td>
								<td><input type="text" name="dataMap['0512']" style="border:0px" size="1px" value="${dataMap['0512']}">
								</td>
								<td><input type="text" name="dataMap['0513']" style="border:0px" size="1px" value="${dataMap['0513']}">
								</td>
								<td><input type="text" name="dataMap['0514']" style="border:0px" size="1px" value="${dataMap['0514']}">
								</td>
								<td><input type="text" name="dataMap['0515']" style="border:0px" size="1px" value="${dataMap['0515']}">
								</td>
								<td><input type="text" name="dataMap['0516']" style="border:0px" size="1px" value="${dataMap['0516']}">
								</td>
								<td><input type="text" name="dataMap['0517']" style="border:0px" size="1px" value="${dataMap['0517']}">
								</td>
								<td><input type="text" name="dataMap['0518']" style="border:0px" size="1px" value="${dataMap['0518']}">
								</td>
								<td><input type="text" name="dataMap['0519']" style="border:0px" size="1px" value="${dataMap['0519']}">
								</td>
							</tr>
							<tr align="center">
								<td>民办高校（含独立学院）</td>
								<td>06</td>
								<td><input type="text" name="dataMap['061']" style="border:0px" size="1px" value="${dataMap['061']}">
								</td>
								<td><input type="text" name="dataMap['062']" style="border:0px" size="1px" value="${dataMap['062']}">
								</td>
								<td><input type="text" name="dataMap['063']" style="border:0px" size="1px" value="${dataMap['063']}">
								</td>
								<td><input type="text" name="dataMap['064']" style="border:0px" size="1px" value="${dataMap['064']}">
								</td>
								<td><input type="text" name="dataMap['065']" style="border:0px" size="1px" value="${dataMap['065']}">
								</td>
								<td><input type="text" name="dataMap['066']" style="border:0px" size="1px" value="${dataMap['066']}">
								</td>
								<td><input type="text" name="dataMap['067']" style="border:0px" size="1px" value="${dataMap['067']}">
								</td>
								<td><input type="text" name="dataMap['068']" style="border:0px" size="1px" value="${dataMap['068']}">
								</td>
								<td><input type="text" name="dataMap['069']" style="border:0px" size="1px" value="${dataMap['069']}">
								</td>
								<td><input type="text" name="dataMap['0610']" style="border:0px" size="1px" value="${dataMap['0610']}">
								</td>
								<td><input type="text" name="dataMap['0611']" style="border:0px" size="1px" value="${dataMap['0611']}">
								</td>
								<td><input type="text" name="dataMap['0612']" style="border:0px" size="1px" value="${dataMap['0612']}">
								</td>
								<td><input type="text" name="dataMap['0613']" style="border:0px" size="1px" value="${dataMap['0613']}">
								</td>
								<td><input type="text" name="dataMap['0614']" style="border:0px" size="1px" value="${dataMap['0614']}">
								</td>
								<td><input type="text" name="dataMap['0615']" style="border:0px" size="1px" value="${dataMap['0615']}">
								</td>
								<td><input type="text" name="dataMap['0616']" style="border:0px" size="1px" value="${dataMap['0616']}">
								</td>
								<td><input type="text" name="dataMap['0617']" style="border:0px" size="1px" value="${dataMap['0617']}">
								</td>
								<td><input type="text" name="dataMap['0618']" style="border:0px" size="1px" value="${dataMap['0618']}">
								</td>
								<td><input type="text" name="dataMap['0619']" style="border:0px" size="1px" value="${dataMap['0619']}">
								</td>
							</tr>
							<tr>
								<td align="center">说明</td>
								<td align="left" colspan="21">1.本表行列关系如下：如，列关系：01=04+05+06，行关系：3=5+9；5=13+14+15=16+17+18；</td>
							</tr>
							<tr>
								<td></td>
								<td colspan="21">2.统计数据截至2017年6月30日。</td>
							</tr>
						</table>
					</div>
				</div>
			</div>
		</div>
	</form>

</body>
</html>