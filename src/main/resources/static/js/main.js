/**
 * 
 */
$(document).ready(function(){
	
	$('.table .eBtn').on('click', function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		
		$.get(href,function(pessoa, funcao,status){
			$('.myFormModal #id').val(pessoa.idPessoa);
			$('.myFormModal #nome').val(pessoa.nomePessoa);
			$('.myFormModal #funcao').val(pessoa.funcao);
			$('.myFormModal #ramal').val(pessoa.ramalPessoa);
			$('.myFormModal #email').val(pessoa.emailPessoa);
			
		});
		
		$('.myFormModal #edit').modal();
	});
	
	
});


