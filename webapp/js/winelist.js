(function(){

var app = angular.module('winelist',[]);
app.controller('wineListCtrl',function($scope,$http){
	$http({
		method:"GET",
		url:"http://localhost:8080/winevault/"
	}).then(function success(response){
		$scope.resp = response.data;
		$scope.status = response.status;
	}, function err(response){
		$scope.response = response.data;
	});
});

})();