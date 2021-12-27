// Kuvan lähde
var img = document.createElement("img");
img.src = "https://cdn.finqu.com/users/20127/images/product/21802019-1479-20-95552ad8568e8fcd_480_480.jpg" ;
// Piilottaa klikattaessa pop up ikkunan
function hidepopup(){
  var popup = document.getElementById("myPopup");
  popup.classList.toggle("hide");
}
var input = document.getElementById("haku");
input.addEventListener("keyup", function(event) 
{
    // Enteriä painettaessa nappi klikataan tämän kautta
    if (event.key === 13) 
    {
      event.preventDefault();
     document.getElementById("Nappi").click();
    }
});

// nappia tai enteriä painetttaessa kutsutaan tämä funktio
function munFunctio() 
{
  // otetaan teksti inputista
  var syote = document.getElementById("haku").value;
  //switch case toteuttaaa input kenttään laitetut komennot
  switch(syote)
  {
    case "google":
      var tekstikohta = document.getElementById("Toka");
     // luodaan elementti ja tehdään siitä linkki joka aukeaa uuteen välilehteen
      var a = document.createElement('a');  
      var linkki = document.createTextNode("Siirrytäänkö googleen?");
      a.appendChild(linkki);
      a.href = "https://www.google.com";
      tekstikohta.appendChild(a);
      a.setAttribute("target", "_blank");
      break;
    case "listaa":
      //tämän pitäisi listata komennot ja tehdä niistä klikattavia
      // yritin tehdä tätä vaikka kuinka kauan onclick eventeillä ja eventlistenereillä,
      // mutta en saaanut siitä millään klikattavaa ominaisuutta joten näillä mennään :)
      var pituus, teksti, i,hakeminen;
      hakeminen = document.getElementById("haku");
      var komennot = ["google", "listaa", "Heidi", "1", "soita", "tee popup", "vaihda", "funktio", "sdsd", "uusiks"]
      var tekstitanne = document.getElementById("Eka");
      pituus = komennot.length;
      teksti="<ul>";
      for (i = 0; i <pituus; i++){
        teksti += "<li>" + komennot[i]+ "</li>"
        
      }
      teksti += "</ul>";
      tekstitanne.innerHTML += teksti
      break;
    case "Heidi":
      // kirjoittamalla minun nimeni saat esille tämän kuvan
      var tekstikohta = document.getElementById("Toka");
      tekstikohta.appendChild(img);
      break;
    case (0< syote < 10000):
      //kirjoita numerot siihen asti mikä inputista tuleva numero on
      break;
    case "soita":
      // soittaa äänen kun tänne pääsee
      var audio = new Audio('https://interactive-examples.mdn.mozilla.net/media/cc0-audio/t-rex-roar.mp3');
      audio.play();
      break;
 
    case "tee popup":
      //tekee popup ikkunasta näkyvän
      var popup = document.getElementById("myPopup");
      popup.classList.toggle("show");
      break;
    case "vaihda":
      // vaihtaa taustan värin
      document.body.style.backgroundColor = "red";
      break;
    case "funktio":
      var tekstikohta = document.getElementById("Toka");
      console.log("Funktio toimii");
      //luodaan elementit ja annetaan sille arvo
      var uusinput =document.createElement("INPUT");
      var uusnappi =document.createElement("BUTTON");
      uusnappi.innerHTML = "Suorita";
      // elementit lisätään oikeaan kolumniin
      tekstikohta.appendChild(uusnappi);
      tekstikohta.appendChild(uusinput);
      uusnappi.onclick = function() {
      var uusvalue = uusinput.value;

        if(uusvalue.length == 0){
          // Jos syötettä ei ole annettu, pyytää koodi komentoa konsolissa
          console.log("Anna komento");
        }
        else if (uusvalue == "reload"){
          // reloadilla päivitetään sivu uudelleen
          location.reload();
         return false;

        }
        else{
          // Jos mikään edellisistä ehdoista ei täyty päästään tänne
          console.log("Kirjoitit: "+ uusvalue)
        }
        
      }
      break;
    case "uusiks":
      // lataa sivun uudelleen
      location.reload();
      return false;
      break;
    
    default:
      // jos tekstiä ei tunnisteta päästään tänne
     var tekstikohta = document.getElementById("Toka");
     var teksti = document.createTextNode("Komentoa ei tunnistettu");
     tekstikohta.appendChild(teksti);
      
    }
  }
  // ¯\_(ツ)_/¯ toivottavasti pääsee ees läpi