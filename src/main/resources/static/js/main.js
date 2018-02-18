/**
 * 
 */
$(document).ready(function(){
	
	$('.table .eBtn').on('click', function(event){
		event.preventDefault();
		var href = $(this).attr('href');
	
		$.get(href, function(contato,status){
			$('.myformModal #id').val(contato.id);
			$('.myformModal #id').val(contato.id);
			$('.myformModal #id').val(contato.id);
		});
		
		$('. nomedoform #NomedoModal').modal();
	});
	
	
}); 