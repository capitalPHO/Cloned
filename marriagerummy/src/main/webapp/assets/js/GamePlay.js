var MarriageRummy = MarriageRummy || {};

// Ulities Name space
MarriageRummy.Utilities = MarriageRummy.Utilities || {};

// UIUtilites Namespace
MarriageRummy.Utilities.GameUtilities = MarriageRummy.Utilities.GameUtilities || {};

MarriageRummy.Utilities.GameUtilities.GameStarter = function()
{
   var self = this;	
   var curtop = 0;
   var curleft = 0;
   $(".card").each(function()
		   {
	           var left = $(this).position.left;
	           var top = $(this).position.top;
	           var classlist = $(this).attr("class").split(" ");
	           console.log($(this).attr("id"),left,top,classlist);
		   });
   
   $(".card").droppable(
		   {
			   activate:function(event,ui)
			   {
				   console.log("Active called " + $(this));
				   $(this).css("border","2px solid yellow");
			   },
			   drop:function(event,ui)
			   {
				   $(this).css("border","2px solid red");
			   }
		   });
   $(".card").on("dropactivate",function(event,ui)
		   {
	            console.log("drop activated");
		   });
   $(".card").draggable(
		   {
			   start: function(event,ui)
			   {
				   //$(this).css("transform","rotate(0deg)");
				 //  $(this).css("z-index","100");
				   console.log("Start Position",ui.position);
				   curtop=ui.position.top;
				   curleft=ui.position.left;
			   },
			   stop: function(event,ui)
			   {
				   console.log("Stop Position" , ui.position);
				   $(this).css("transform","");
				   $(this).css("left","");
				   $(this).css("top","");
				   $(this).css("z-index","");
			   }
			   
		   });
/*	
   $(".card").hover(function(){
	   $(this).addClass("animated pulse").one('webkitAnimationEnd mozAnimationEnd MSAnimationEnd oanimationend animationend', function(){
           $(this).removeClass("animated pulse");
	   });
   });*/
}();

MarriageRummy.Utilities.GameUtilities.Player = function()
{
	var self = this;
	
	self.getCards = function(url,formdata)
	{
		var token = $("meta[name='_csrf']").attr("content");
        var header = $("meta[name='_csrf_header']").attr("content");
		$.ajax({
			type : "POST",
			url : url,
			contentType : "application/json",
			data : JSON.stringify(formdata),
			consumes : "application/json",
			beforeSend: function (request) // This is to include CSRF token.
            {
                request.setRequestHeader(header, token);
            }, 
			success : function(data, textStatus, jqXHR) {
				renderCards(data);
			},
			error : function(data) {
				console.log("Failed to get data from server");
			}
			
		});
	};
	
	var renderCards = function(data)
	{
		for(var i=0;i<data.length;i++)
			{
			   var pos = data[i].id;
			   var divid = "#card"+pos;
			   var classname = data[i].flower +"-"+ data[i].displayValue;
			   $(divid).addClass(classname);
			}
	};


};

var player = new MarriageRummy.Utilities.GameUtilities.Player();
player.getCards("./assets/SampleJson/13CardSample.json","");


