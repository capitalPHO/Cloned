/**
 * 
 */

var MarriageRummy = MarriageRummy || {};

// Ulities Name space
MarriageRummy.Utilities = MarriageRummy.Utilities || {};



//UIUtilites Namespace
MarriageRummy.Utilities.UIUtilities = MarriageRummy.Utilities.UIUtilities || {};


//@Class LoggedinPage
MarriageRummy.Utilities.UIUtilities.LoggedinPageonLoad = function()
{
	$(".shrinker").click(function(){
		var delay = 500;
		var sidebar = $(".sidebar");
		var sidebarshrinked=$(".sidebar-shrinked");
		if(sidebar.css("display") == "block")
			{
			   sidebar.hide();
			   sidebarshrinked.show("slide", { direction: "left" }, delay);
			   $(this).empty();
			   $(this).append('<i class="fa fa-angle-double-right"></i>');
			   
			}
		else
			{
				sidebarshrinked.hide();
				sidebar.show("slide", { direction: "left" }, delay);
				$(this).empty();
				$(this).append('<i class="fa fa-angle-double-left"></i>');
			}
		
	});
}();


//@Class dashboard page
MarriageRummy.Utilities.UIUtilities.charts = function()
{
	Chart.defaults.global.responsive = true;
	
	var options =
	{

	    ///Boolean - Whether grid lines are shown across the chart
	    scaleShowGridLines : true,

	    //String - Colour of the grid lines
	    scaleGridLineColor : "rgba(0,0,0,.05)",

	    //Number - Width of the grid lines
	    scaleGridLineWidth : 1,

	    //Boolean - Whether the line is curved between points
	    bezierCurve : true,

	    //Number - Tension of the bezier curve between points
	    bezierCurveTension : 0.4,

	    //Boolean - Whether to show a dot for each point
	    pointDot : true,

	    //Number - Radius of each point dot in pixels
	    pointDotRadius : 4,

	    //Number - Pixel width of point dot stroke
	    pointDotStrokeWidth : 1,

	    //Number - amount extra to add to the radius to cater for hit detection outside the drawn point
	    pointHitDetectionRadius : 20,

	    //Boolean - Whether to show a stroke for datasets
	    datasetStroke : true,

	    //Number - Pixel width of dataset stroke
	    datasetStrokeWidth : 2,

	    //Boolean - Whether to fill the dataset with a colour
	    datasetFill : true,

	    //String - A legend template
	    legendTemplate : "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].lineColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>"

	};
	
	startMoneyChart = function(contentdata)	
	{
		
		
		var data = {
			    labels: ["January", "February", "March", "April", "May", "June", "July"],
			    datasets: [
			        {
			            label: "My First dataset",
			            fillColor: "rgba(72, 153, 73,0.2)",
			            strokeColor: "rgba(72, 153, 73,1)",
			            pointColor: "rgba(72, 153, 73,1))",
			            pointStrokeColor: "#fff",
			            pointHighlightFill: "#fff",
			            pointHighlightStroke: "rgba(72, 153, 73,1)",
			            data: [65, 59, 80, 81, 56, 55, 40]
			        }
			    ]
			};
		var context = $("#moneyChart").get(0).getContext("2d");
		var myLineChart = new Chart(context).Line(data,options);
		myLineChart.resize();
	}();
	
	startWinRatioCharts = function()
	{
		var data = [
		            {
		                value: 300,
		                color:"#F7464A",
		                highlight: "#FF5A5E",
		                label: "7 Card Closed Joker"
		            },
		            {
		                value: 50,
		                color: "#46BFBD",
		                highlight: "#5AD3D1",
		                label: "7 Card Open Joker"
		            },
		            {
		                value: 100,
		                color: "#0DB45C",
		                highlight: "#FFC870",
		                label: "13 Card Closed Joker"
		            },
		            {
		                value: 100,
		                color: "#F3A234",
		                highlight: "#FFC870",
		                label: "13 Card open Joker"
		            },
		            {
		                value: 100,
		                color: "#83233A",
		                highlight: "#FFC870",
		                label: "21 Card marriage Joker"
		            }
		        ];
		var context = $("#winChart").get(0).getContext("2d");
		myDoughnutChart = new Chart(context).Doughnut(data,options);
	}();
	

}();