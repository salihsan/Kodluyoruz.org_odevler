function newElement() {
  let listele = document.querySelector(".list");
  let task = document.getElementById("task").value;
  let yeniLi = document.createElement("LI");
  let textNode = document.createTextNode(task);
  yeniLi.appendChild(textNode);
  list.appendChild(yeniLi);
  document.getElementById("task").value = "";

  var span = document.createElement("SPAN");
  span.classList.add(".spanstile");
  var txt = document.createTextNode("\u00D7");
  span.className = "close";
  span.appendChild(txt);
  yeniLi.appendChild(span);

  yeniLi.addEventListener("click", function () {
    yeniLi.style.textDecoration = "line-through";
    yeniLi.style.backgroundColor = "#276678";
    yeniLi.style.color = "white";

    list.addEventListener(
      "click",
      function (e) {
        if (e.target.tagName === "LI") {
          e.target.classList.toggle("checked");
        }
      },
      false
    );
  });

  document.documentElement("txt").click = function () {
    const list = document.querySelector(".list");
    list.removeChild(list.lastElementChild);
  };
}

// var myNodelist = document.getElementsByTagName("LI");
// var i;
// for (i = 0; i < myNodelist.length; i++) {
//   var span = document.createElement("SPAN");
//   var txt = document.createTextNode("\u00D7");
//   span.className = "close";
//   span.appendChild(txt);
//   myNodelist[i].appendChild(span);
// }

// var close = document.getElementsByClassName("close");
// var i;
// for (i = 0; i < close.length; i++) {
//   close[i].onclick = function () {
//     var div = this.parentElement;
//     div.style.display = "none";
//   };
// }

// var list = document.querySelector("ul");
// list.addEventListener(
//   "click",
//   function (ev) {
//     if (ev.target.tagName === "LI") {
//       ev.target.classList.toggle("checked");
//     }
//   },
//   false
// );

// function newElement() {
//   var li = document.createElement("li");
//   var inputValue = document.getElementById("task").value;
//   var t = document.createTextNode(inputValue);
//   li.appendChild(t);
//   if (inputValue === "" || inputValue.replace(/^\s+|\s+$/g, "").length == 0) {
//     $(".error").toast("show");
//   } else {
//     $(".success").toast("show");
//     document.getElementById("list").appendChild(li);
//   }
//   document.getElementById("task").value = "";

//   var span = document.createElement("SPAN");
//   var txt = document.createTextNode("\u00D7");
//   span.className = "close";
//   span.appendChild(txt);
//   li.appendChild(span);

//   for (i = 0; i < close.length; i++) {
//     close[i].onclick = function () {
//       var div = this.parentElement;
//       div.style.display = "none";
//     };
//   }
// }
