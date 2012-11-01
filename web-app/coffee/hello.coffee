$ ->
	launchCount = 0
	$('#say-hello-button').click ->
		context = launchCount: ++launchCount
		template = Handlebars.templates['hello/modal']
		$('#hello-modal')
			.html(template(context))
			.modal 'show', keyboard: true