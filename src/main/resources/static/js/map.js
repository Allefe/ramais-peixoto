function initMap() {
        var map = new google.maps.Map(document.getElementById('map'), {
          zoom: 8,
          center: {lat: -34.397, lng: 150.644}
        });
        var geocoder = new google.maps.Geocoder();
		
        //chamo a função sem ter que clicar no bt
        geocodeAddress(geocoder, map);
        
        //chama da função ao clicar no botão
        /* document.getElementById('address').addEventListener('click', function() {
          geocodeAddress(geocoder, map);
         
        }); */
      }

      function geocodeAddress(geocoder, resultsMap) {
        var address = document.getElementById('address').value;
        geocoder.geocode({'address': address}, function(results, status) {
          if (status === 'OK') {
            resultsMap.setCenter(results[0].geometry.location);
            var marker = new google.maps.Marker({
              map: resultsMap,
              position: results[0].geometry.location
            });
          } else {
            alert('O Geocode não foi bem sucedido pelo seguinte motivo: ' + status);
          }
        });
      }