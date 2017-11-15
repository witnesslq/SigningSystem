<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>用户管理</title>
<%@include file="/common/header.jsp"%>
<script type="text/javascript">
	function doEmportExcel() {
		document.forms[0].action="{basePath}all/all_doEmportXlsFive.action";
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
							<b></b><strong>填写表五</strong>
						</div>
					</div>
					<div class="search_art">
						<li style="float:left; margin-left:30px">
							计算过程：<input type="button" value="导出" class="s_button" onclick="doEmportExcel()" /></li>
					</div>

					<div class="t_list" style="margin:0px; border:0px none;">
						<table border="1" cellspacing="0" cellpadding="0" width="955px">
							<tr>
								<td colspan="9" align="center">2017年全国高校与党组织失去联系党员规范管理及组织处置情况汇总表</td>
							</tr>
							<tr>
								<td colspan="9">填报单位（盖章）：</td>
							</tr>
						<tr align="center">
								<td rowspan="2"></td>
								<td rowspan="2">编号</td>
								<td colspan="4">规范管理情况</td>
								<td colspan="3">组织处置情况</td> 
							</tr>
							<tr align="center">
								<td>纳入组织管理</td>
								<td>取消预备党员资格</td>
								<td>保留组织关系</td>
								<td>停止党籍</td>
								<td>限期改正</td>
								<td>退党除名</td>
								<td>自行脱党除名</td>
							</tr>
							<tr align="center">
								<td>甲</td>
								<td>乙</td>
								<td>1</td>
								<td>2</td>
								<td>3</td>
								<td>4</td>
								<td>5</td>
								<td>6</td>
								<td>7</td>
							</tr>
							<tr align="center">
								<td>总计</td>
								<td>01</td>
								<td><input id="011" type="text" name="dataMap['011']" style="border:0px" size="3px" value="${dataMap['011']}">
								</td>
								<td><input id="012" type="text" name="dataMap['012']" style="border:0px" size="3px" value="${dataMap['012']}">
								</td>
								<td><input id="013" type="text" name="dataMap['013']" style="border:0px" size="3px" value="${dataMap['013']}">
								</td>
								<td><input id="014" type="text" name="dataMap['014']" style="border:0px" size="3px" value="${dataMap['014']}">
								</td>
								<td><input id="015" type="text" name="dataMap['015']" style="border:0px" size="3px" value="${dataMap['015']}">
								</td>
								<td><input id="016" type="text" name="dataMap['016']" style="border:0px" size="3px" value="${dataMap['016']}">
								</td>
								<td><input id="017" type="text" name="dataMap['017']" style="border:0px" size="3px" value="${dataMap['017']}">
								</td>
							</tr>
							<tr align="center">
								<td>教职工（含解除劳动关系的）</td>
								<td>02</td>
								<td><input id="021" type="text" name="dataMap['021']" style="border:0px" size="3px" value="${dataMap['021']}">
								</td>
								<td><input id="022" type="text" name="dataMap['022']" style="border:0px" size="3px" value="${dataMap['022']}">
								</td>
								<td><input id="023" type="text" name="dataMap['023']" style="border:0px" size="3px" value="${dataMap['023']}">
								</td>
								<td><input id="024" type="text" name="dataMap['024']" style="border:0px" size="3px" value="${dataMap['024']}">
								</td>
								<td><input id="025" type="text" name="dataMap['025']" style="border:0px" size="3px" value="${dataMap['025']}">
								</td>
								<td><input id="026" type="text" name="dataMap['026']" style="border:0px" size="3px" value="${dataMap['026']}">
								</td>
								<td><input id="027" type="text" name="dataMap['027']" style="border:0px" size="3px" value="${dataMap['027']}">
								</td>
							</tr>
							<tr align="center">
								<td>离退休人员</td>
								<td>03</td>
								<td><input id="031" type="text" name="dataMap['031']" style="border:0px" size="3px" value="${dataMap['031']}">
								</td>
								<td><input id="032" type="text" name="dataMap['032']" style="border:0px" size="3px" value="${dataMap['032']}">
								</td>
								<td><input id="033" type="text" name="dataMap['033']" style="border:0px" size="3px" value="${dataMap['033']}">
								</td>
								<td><input id="034" type="text" name="dataMap['034']" style="border:0px" size="3px" value="${dataMap['034']}">
								</td>
								<td><input id="035" type="text" name="dataMap['035']" style="border:0px" size="3px" value="${dataMap['035']}">
								</td>
								<td><input id="036" type="text" name="dataMap['036']" style="border:0px" size="3px" value="${dataMap['036']}">
								</td>
								<td><input id="037" type="text" name="dataMap['037']" style="border:0px" size="3px" value="${dataMap['037']}">
								</td>
							</tr>
							<tr align="center">
								<td>高校毕业生</td>
								<td>04</td>
								<td><input id="041" type="text" name="dataMap['041']" style="border:0px" size="3px" value="${dataMap['041']}">
								</td>
								<td><input id="042" type="text" name="dataMap['042']" style="border:0px" size="3px" value="${dataMap['042']}">
								</td>
								<td><input id="043" type="text" name="dataMap['043']" style="border:0px" size="3px" value="${dataMap['043']}">
								</td>
								<td><input id="044" type="text" name="dataMap['044']" style="border:0px" size="3px" value="${dataMap['044']}">
								</td>
								<td><input id="045" type="text" name="dataMap['045']" style="border:0px" size="3px" value="${dataMap['045']}">
								</td>
								<td><input id="046" type="text" name="dataMap['046']" style="border:0px" size="3px" value="${dataMap['046']}">
								</td>
								<td><input id="047" type="text" name="dataMap['047']" style="border:0px" size="3px" value="${dataMap['047']}">
								</td>
							</tr>
							<tr align="center">
								<td>其他</td>
								<td>05</td>
								<td><input id="051" type="text" name="dataMap['051']" style="border:0px" size="3px" value="${dataMap['051']}">
								</td>
								<td><input id="052" type="text" name="dataMap['052']" style="border:0px" size="3px" value="${dataMap['052']}">
								</td>
								<td><input id="053" type="text" name="dataMap['053']" style="border:0px" size="3px" value="${dataMap['053']}">
								</td>
								<td><input id="054" type="text" name="dataMap['054']" style="border:0px" size="3px" value="${dataMap['054']}">
								</td>
								<td><input id="055" type="text" name="dataMap['055']" style="border:0px" size="3px" value="${dataMap['055']}">
								</td>
								<td><input id="056" type="text" name="dataMap['056']" style="border:0px" size="3px" value="${dataMap['056']}">
								</td>
								<td><input id="057" type="text" name="dataMap['057']" style="border:0px" size="3px" value="${dataMap['057']}">
								</td>
							</tr>
							<tr align="center">
								<td align="center">说明</td>
								<td align="left" colspan="8">说明： 1.本表行列关系如下：如，列关系：01=02+03+04+05；</td>
							</tr>
							<tr>
								<td></td>
								<td colspan="8">2.统计数据截至2017年6月30日。</td>
						</table>
					</div>
				</div>
			</div>
		</div>
	</form>

</body>
</html>