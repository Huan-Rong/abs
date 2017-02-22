<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>abs project</title>
    <!-- jQuery js -->
    <script src="script/jquery-1.6.2.min.js" type="text/javascript"></script>
    <!-- MiniUI -->
    <link href="script/miniui/themes/default/miniui.css" rel="stylesheet" type="text/css"/>
    <script src="script/miniui/miniui.js" type="text/javascript"></script>

    <style type="text/css">
        body {
            margin:0;padding:0;border:0;width:100%;height:100%;overflow:hidden;
        }
        .header {
            background:url("script/miniui/themes/default/images/panel/header.png") repeat-x 0 -1px;
        }
    </style>
</head>
<body>
<div id="layout1" class="mini-layout" style="width:100%;height:100%;">
    <div class="header" region="north" height="70" showSplit="false" showHeader="false">
        <h1 style="margin:0;padding:15px;cursor:default;font-family:微软雅黑,黑体,宋体;">智能分析平台</h1>
        <div style="position:absolute;top:18px;right:10px;">
            <a class="mini-button mini-button-iconTop" iconCls="icon-add" onclick="onClick" plain="true">快捷</a>
            <a class="mini-button mini-button-iconTop" iconCls="icon-edit" onclick="onClick"  plain="true" >首页</a>
            <a class="mini-button mini-button-iconTop" iconCls="icon-date" onclick="onClick"  plain="true" >消息</a>
            <a class="mini-button mini-button-iconTop" iconCls="icon-edit" onclick="onClick"  plain="true" >设置</a>
            <a class="mini-button mini-button-iconTop" iconCls="icon-close" onclick="onClick"  plain="true" >关闭</a>

        </div>
    </div>
    <div title="south" region="south" showSplit="false" showHeader="false" height="30">
        <div style="line-height:28px;text-align:center;cursor:default">Copyright © 广州洪森科技有限公司版权所有 </div>
    </div>
    <div title="center" region="center" bodyStyle="overflow:hidden;">
        <!--Splitter-->
        <div class="mini-splitter" style="width:100%;height:100%;" borderStyle="border:0;">
            <div size="180" maxSize="250" minSize="100" showCollapseButton="true">
                <!--OutlookTree-->
                <div id="leftTree" class="mini-outlooktree" url="outlooktree.txt" onnodeclick="onNodeSelect"
                     textField="text" idField="id" parentField="pid">
                </div>
            </div>
            <div showCollapseButton="false">
                <!--Tabs-->
                <div id="mainTabs" class="mini-tabs bg-toolbar" activeIndex="0" style="width:100%;height:100%;"
                     bodyStyle="border:0;background:white;">
                    <div title="首页" url="overview.html" ></div>
                </div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
    function onClick(e) {
        var text = this.getText();
        alert(text);
    }
</script>
</body>
</html>
