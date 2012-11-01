modules = {
    application {
        resource url:'js/application.js'
    }

    customBootstrap {
    	dependsOn 'bootstrap'
		resource url: 'less/customBootstrap.less', attrs: [rel: "stylesheet/less", type:'css']
    }

    hello {
    	dependsOn 'handlebars_runtime'
    	resource url: 'coffee/hello.coffee'
    	resource url: 'handlebars/hello/modal.handlebars', attrs: [type: 'js']
    }
}