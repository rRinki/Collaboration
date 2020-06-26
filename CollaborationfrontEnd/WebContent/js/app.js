/**
 * 
 */
var myApp=angular.module("frontApp",["ngRoute"]);
myApp.config(function($routeProvider)
		{
	$routeProvider.when("/",{templateUrl:"home.html"})
	.when("/aboutus",{templateUrl:"aboutus.html"})
	.when("/login",{templateUrl:"login.html"})
	.when("/contactus",{templateUrl:"contactus.html"});
	
		}
);