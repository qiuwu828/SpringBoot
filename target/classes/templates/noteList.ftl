<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>日记列表</title>
    <style>
        *{
            font-family: 楷体;
        }
        table {
            min-width: 500px;
            min-height: 300px;
            text-align: center;
        }
    </style>
</head>
<body>
<#--引入头部-->
<#include "common/header.ftl">
<h2>日记列表</h2>
<table border="1">
    <tr>
        <td>序号</td>
        <td>日记标题</td>
        <#--<td style="width: 400px;">日记内容</td>-->
        <td>类型</td>
        <td>发布时间</td>
        <td>经度</td>
        <td>纬度</td>
        <td>操作</td>
    </tr>
    <#list noteList as note>
        <tr>
            <td>${note_index+1}</td>
            <td>${note.title}</td>
            <#--<td>${note.content}</td>-->
            <td>${note.typeName}</td>
            <td>${note.pubTime?string("yyyy-MM-dd HH:mm:ss")}</td>
            <td>${note.lon}</td>
            <td>${note.lat}</td>
            <td>
                <a href="#">查看</a>
                <a href="#">修改</a>
                <a href="#">删除</a>
            </td>
        </tr>
    </#list>
</table>

<#--引入头部-->
<#include "common/footer.ftl">
</body>
</html>