<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>日记类型列表</title>
    <style>
        * {
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

<h2>日记类型列表</h2>
<table border="1">
    <tr>
        <td>序号</td>
        <td>日记类型</td>
        <#--<td>用户ID</td>-->
        <td>操作</td>
    </tr>
    <#list noteTypeList as noteType>
        <tr>
            <td>${noteType_index+1}</td>
            <td>${noteType.typeName}</td>
            <#--<td>${noteType.userId}</td>-->
            <td>
                <a href="#">添加</a>
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