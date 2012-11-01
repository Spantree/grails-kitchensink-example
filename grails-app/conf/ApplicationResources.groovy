modules = {
    application {
        resource url:'js/application.js'
    }

    customBootstrap {
    	dependsOn 'bootstrap'
		resource url: 'less/customBootstrap.less', attrs: [rel: "stylesheet/less", type:'css']
    }
}