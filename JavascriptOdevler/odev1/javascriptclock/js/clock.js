function askName() {
  var adiniz = prompt("Adınız nedir?");
  document.getElementById("myName").innerText = adiniz;
}

function showTime() {
  var tarih = new Date();
  var h = tarih.getHours();
  var m = tarih.getMinutes();
  var s = tarih.getSeconds();
  var gun = tarih.getDay();

  switch (gun) {
    case 1:
      gun = "Pazartesi";
      break;
    case 2:
      gun = "Sali";
      break;
    case 3:
      gun = "Çarşamba";
      break;
    case 4:
      gun = "Perşembe";
      break;
    case 5:
      gun = "Cuma";
      break;
    case 6:
      gun = "Cumartesi";
      break;
    case 7:
      gun = "Pazar";
      break;
  }

  var time = h + ":" + m + ":" + s + " " + gun;
  document.getElementById("myClock").innerText = time;

  setTimeout(showTime, 1000);
}

askName();
showTime();


