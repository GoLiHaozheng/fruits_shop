;
var i;
var time = 180;
var isCount = false;
var member_register_ops = {
	init : function() {
		this.initComponent();
		this.validateForm();
		this.eventBind();
	},
	initComponent : function() {		
		$("#select-address").append("<option value=''>请选择</option>");
		$.getJSON(basePath+"static/js/city/city.min.js", function(data) {
			$.each(data.citylist, function(i, prov) {
				if (prov.p != '国外') {
					$('#select-address').append(
							"<optgroup label='" + prov.p + "' ></optgroup>")
					$.each(data.citylist[i].c,
							function(i, city) {
								$('#select-address').append(
										"<option value='" + city.n + "' prov='"
												+ prov.p + "'>" + city.n
												+ "</option>");
							});
				}
			});
		});

	},
//	validateForm : function() {
//		return $(".formarea").validate();
//	},
//	getCode : function() {
//		isCount = true;
//		i = setInterval(function() {
//			$(".checkCode").html(time + ",秒后重新发送");
//			time--;
//			if (time < 0) {
//				i = window.clearInterval(i);
//				time = 180;
//				$.ajax({
//					url:'../member/invalidateMobileMsg',
//					method:'POST',
//					type:'text/json',
//					success:function(res){
//						console.log(res.msg);
//					}
//				})
//				$(".checkCode").html("获取手机校验码");
//				isCount = false;
//			}
//		}, 1000);
//	},
	eventBind : function() {
		var that = this;
		$("#input-register").click(
				function() {
					var $that = $(this);
					common_ops.btnDisable($that);
					if (that.valiDateForm().form()) {
						var password = $("#input-password").val();
						var confirmPassword = $("#input")
					}
				})
	}
	
}
$(function() {
	member_register_ops.init();
})