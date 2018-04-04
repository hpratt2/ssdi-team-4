var app = angular.module('test',[]);
app.controller('testCtrl', function($scope,$http){
	$http.get('rest/winelist').then(function(response){
		$scope.status = response.status;
		$scope.data = response.data;
	});
});