function myFunction() {
  var x = document.getElementById("tcse");
  if (x.style.display === "none") {
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }
}

// searchBar placeholder Animation

const placeholderTexts = [
  "Search Curd...",
  "Search Chocalate...",
  "Search Milk...",
  "Search Bread...",
  "Search Sugar...",
];

// Function to update the search bar placeholder
let currentIndex = 0;
const searchBar = document.getElementById("searchBar");

function updatePlaceholder() {
  searchBar.classList.add("slide-up");
  setTimeout(() => {
    searchBar.placeholder = placeholderTexts[currentIndex];
    searchBar.classList.remove("slide-up");
    currentIndex = (currentIndex + 1) % placeholderTexts.length;
  }, 500); // Wait for 500 milliseconds to finish the slide-up animation
}
updatePlaceholder();
let myInterval = setInterval(updatePlaceholder, 2000);


 function handleSearchFocus() {
   searchBar.classList.remove("slide-up");
   searchBar.placeholder = ""
clearInterval(myInterval);
  }

 function handleSearchBlur() {
   searchBar.classList.add("slide-up");
   updatePlaceholder();
   myInterval = setInterval(updatePlaceholder, 2000);
 }

 searchBar.addEventListener("click", handleSearchFocus);
 searchBar.addEventListener("blur", handleSearchBlur);
// Initial update to set the placeholder on page load



// Update the placeholder every 2 seconds (2000 milliseconds)
