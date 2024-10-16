<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>报表页面</title>
    <script src="${request.contextPath}/echarts/echarts.min.js"></script>
    <script src="${request.contextPath}/js/jquery-1.11.3.js"></script>
</head>
<body>

<#--引入头部-->
<#include "common/header.ftl">

<h2>报表页面</h2>
<!-- 为 ECharts 准备一个定义了宽高的 DOM -->
<div id="main" style="width: 900px;height:400px;"></div>

<div id="typeChart" style="width: 900px;height:500px;"></div>

<#--引入底部-->
<#include "common/footer.ftl">

<script type="text/javascript">
    $.get("/report/month", function (result) {
        MonthChart(result);
    });
    //构建柱状图
    function MonthChart(result) {
        var monthArray = result.monthArray;
        var dataArray = result.dataArray;

        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));
        // 指定图表的配置项和数据
        var option = {
            title: {
                text: '按照月份显示',
                subtext: '通过月份查询对应的云记数量',
                left: 'center'
            },
            //浮动框
            //tooltip: {},
//                legend: {
//                    data: ['日记']
//                },
            xAxis: {
                data: monthArray,
                axisLabel: {
                    inside: true, //显示在内部
                    textStyle: {
                        color: '#fff'
                    }
                },
                axisTick: {
                    show: false
                },
                axisLine: {
                    show: false
                },
                z: 10
            },
            yAxis: {},
            series: [
                {
//                        name: '日记',
                    type: 'bar', //柱状图
                    data: dataArray,
                    itemStyle: {
                        color: new echarts.graphic.LinearGradient(
                            0, 0, 0, 1,
                            [
                                {offset: 0, color: '#83bff6'},
                                {offset: 0.5, color: '#188df0'},
                                {offset: 1, color: '#188df0'}
                            ]
                        )
                    },
                    emphasis: {
                        itemStyle: {
                            color: new echarts.graphic.LinearGradient(
                                0, 0, 0, 1,
                                [
                                    {offset: 0, color: '#2378f7'},
                                    {offset: 0.7, color: '#2378f7'},
                                    {offset: 1, color: '#83bff6'}
                                ]
                            )
                        }
                    },
                }
            ]
        };
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    }

    $.get("/report/typeName", function (result) {
        TypeNameChart(result);
    });

    function TypeNameChart(result) {
        var monthArray = result.monthArray;
        var dataArray = result.dataArray;

        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('typeChart'));
        var arr = [];
        for (var i = 0; i < monthArray.length; i++) {
            arr.push({name: monthArray[i], value: dataArray[i]})
        }
        // 指定图表的配置项和数据
        option1 = {
            title: {
                text: '按照类型显示',
                subtext: '通过日记类型查询对应的云记数量',
                left: 'center'
            },
            //浮动框
            tooltip: {},
            series: [
                {
                    type: 'pie',
                    data: arr
                }
            ]
        };
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option1);
    }

</script>
</body>
</html>
