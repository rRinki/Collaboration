
angular
		.module('frontApp')
		.controller(
				'blogcontrol',
				function($scope,$location,$http) {
					var mydata = this;
					mydata.blog = {
						blog_Name : "" ,
						blog_Content: "" 
					};
					mydata.createUser= createUser;
					getUsers();
					function createUser() {
						$http
								.post(
										'http://localhost:8082/CollaborationMiddleWare/blog/addblog',
										mydata.blog)
								.then(function(response) {
									alert("Blog Added Successful");
									$location.path("/blog");
								}, function(errresponse) {
									alert("Blog not added ");
								});
					}
					function getUsers(){
						$http
						.get(
						'http://localhost:8082/CollaborationMiddleWare/blog/adminapproval')
						.then(function(response) {
							mydata.customers=null;
						}, function(errresponse) {
							mydata.customers=errresponse.data;
							console.log(mydata.customers);
						});
						
					}
})
