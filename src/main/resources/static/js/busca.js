/**
 * 
 */


$(document).ready(function() {
    var activeSystemClass = $('.list-group-item.active');

    //qualquer coisa que inserir na busca
    $('#system-search').keyup( function() {
       var that = this;
        // afeta todas as linhas da tabela do sistema
        var tableBody = $('.table table-striped tbody');
        var tableRowsClass = $('.table table-striped tbody tr');
        $('.search-sf').remove();
        tableRowsClass.each( function(i, val) {
        
            //Lower text for case insensitive
            var rowText = $(val).text().toLowerCase();
            var inputText = $(that).val().toLowerCase();
            if(inputText != '')
            {
                $('.search-query-sf').remove();
                tableBody.prepend('<tr class="search-query-sf"><td colspan="6"><strong>Buscando por: "'
                    + $(that).val()
                    + '"</strong></td></tr>');
            }
            else
            {
                $('.search-query-sf').remove();
            }

            if( rowText.indexOf( inputText ) == -1 )
            {
                //hide rows
                tableRowsClass.eq(i).hide();
                
            }
            else
            {
                $('.search-sf').remove();
                tableRowsClass.eq(i).show();
            }
        });
        //all tr elements are hidden
        if(tableRowsClass.children(':visible').length == 0)
        {
            tableBody.append('<tr class="search-sf"><td class="text-muted" colspan="6">Sem dados encontrados.</td></tr>');
        }
    });
});