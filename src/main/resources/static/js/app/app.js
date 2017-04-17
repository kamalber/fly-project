var monApp=angular.module('monApp', ['ngRoute','ngStorage','chart.js']);
monApp.constant('urls', {
    BASE: 'http://localhost:8080/',
    USER_SERVICE_API : 'http://localhost:8080/api/user/'
});

monApp.config(['$routeProvider', function($routeProvider) {
  $routeProvider
     .when('/post', {templateUrl: 'views/post/index.html',
    	 controller  : 'Controller/index'})
     .when('/user', {
	    	 templateUrl: 'views/user/list.html',
	    	 controller:'UserController',
	    	 controllerAs:'ctrl',
	    	})
	 .when('/stat', {
	    	 templateUrl: 'views/statistics/stat.html',
	    	 controller:'StatsController'
	    		 controllerAs:'ctrl',
	    	})   		
     .otherwise({redirectTo: '/'});
}]);

