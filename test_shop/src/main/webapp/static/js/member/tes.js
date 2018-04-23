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
			$("#select-address").empty().append("<option value=''>请选择</option>");
			$.getJSON(basePath+"static/js/city/city.min.js",function(data){
				$.each(data.citylist,function(i,prov){
					if (prov.p!= '国外') {
						$('#select-address').append(
								"<optgroup label='" + prov.p + "'></optgroup>")
					}
				})
			})
		}
}